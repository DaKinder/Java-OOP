package org.example;

/*
 * 1. Создать класс "Счет в банке" - Account.
 * У этого класса должно быть поле с текущим балансом на счете.
 * У этого класса должно быть 3 метода:
 * - (put) Пополнить счет - принимат положительное число, увеличивает текущий баланс
 * - (take) Вывести средства - принимат положительное число, уменьшает текущий баланс
 * - (getAmount) Показать баланс - ничего не принимает, возвращает текущий баланс (getter)
 *
 * 2. Создать несколько наследников.
 * - Кредитный счет (CreditAccount)
 * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
 * То есть, если снимаем 100 у.е., то снять нужно 101.
 * - Депозитный счет (DepositAccount) *
 * Особенность: нельзя снимать средства чаще, чем раз в месяц.
 * То есть, нужно завести поле с датой последнего снятия, и использовать его.
 * (Для дат лучше использовать LocalDate, пример в классе Dates в проекте урока)
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) throws Exception
    {
        LocalDate today = LocalDate.of(2023, Month.SEPTEMBER, 5);

        Account account1 = new Account("Mikhail", "Antonov", new BirthDate(1984,8,12), 500);
        CreditAccount account2 = new CreditAccount("Andrey", "Gorin", new BirthDate(2004,6,16), 1000);
        DepositAccount account3 = new DepositAccount("Ivan", "Suchkov", new BirthDate(1944, 1, 19), today, 700);
        //account1.take(-700);
        account3.take(-300);
    }
}