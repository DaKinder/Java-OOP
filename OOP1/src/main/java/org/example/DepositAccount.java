package org.example;

import java.time.LocalDate;

import static org.example.Dates.checkForWithdrawing;

public class DepositAccount extends Account {
    final LocalDate accountOpeningDay;
    final LocalDate lastWithdrawal;

    public DepositAccount(String name, String surname, BirthDate birthDate, LocalDate accountOpeningDay, double amount) {
        super(name, surname, birthDate, amount);
        this.accountOpeningDay = this.lastWithdrawal = accountOpeningDay;
    }

    @Override
    public void take(double amount) {
        if (checkForWithdrawing(accountOpeningDay, lastWithdrawal)) {
            amount = Account.checkAmountSign(amount);
            if(amount > this.amount) {
                Notifications.notEnoughFunds(this.amount);
            }
            else this.amount -= amount;
        }
        else Notifications.wrongDate(lastWithdrawal);
    }
}
