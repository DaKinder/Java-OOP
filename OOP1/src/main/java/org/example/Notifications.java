package org.example;

import java.time.LocalDate;

public class Notifications {
    public static void notEnoughFunds(double amount){
        System.out.printf("Недостаточно средств, у вас на балансе всего - %.2fр.\n", amount );
    }
    public static void wrongDate(LocalDate lastWithdrawal){
        System.out.println("Невозможно снять средства, дата послоеднего снятия - " + lastWithdrawal);
    }
}
