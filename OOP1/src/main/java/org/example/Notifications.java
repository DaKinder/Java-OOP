package org.example;

import java.time.LocalDate;

public class Notifications {
    public static void notEnoughFunds(double amount){
        System.out.printf("Недостаточно средств, у вас на балансе всего - %.2fр.\n", amount );
    }
    public static void wrongDate(LocalDate lastWithdrawal){
        System.out.println("Невозможно снять средства, дата послоеднего снятия - " + lastWithdrawal);
    }
    public static void failedWithdrawal(){
        System.out.println("Не удалось снять средства!");
    }
    public static void failedAddingFunds(){
        System.out.println("Не удалось поплнить счёт!");
    }
}
