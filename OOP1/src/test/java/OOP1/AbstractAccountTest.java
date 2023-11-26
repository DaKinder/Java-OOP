package OOP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AbstractAccountTest {

    @Test
    void put() {
        Account client = new DepositAccount("Ivan", "Popov", new BirthDate( 2003, 10,19 ), 100  );
        Assertions.assertEquals(100, client.getAmount());
    }

    @Test
    void take() {
        Account client = new CreditAccount("Ivan", "Popov", new BirthDate( 2003, 10,19 ), 100  );
        client.take( 40 );
        Assertions.assertEquals(59.599999999999994, client.getAmount());
    }
}