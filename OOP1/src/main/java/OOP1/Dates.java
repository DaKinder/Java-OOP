package OOP1;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Dates {
    public static boolean checkForWithdrawing(LocalDate accountOpeningDay, LocalDate lastWithdrawal){
        LocalDate today = LocalDate.now();
        LocalDate monthAgo = today.minus(1, ChronoUnit.MONTHS);

        if(monthAgo.isAfter(lastWithdrawal)){return true;}
        else if (monthAgo.isAfter(accountOpeningDay)){return true;}
        else return false;
    }
}
