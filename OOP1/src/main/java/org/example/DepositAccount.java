package org.example;

import java.time.LocalDate;

import static org.example.Dates.checkForWithdrawing;

public class DepositAccount extends AbstractAccount implements ClientAccount {
    final LocalDate accountOpeningDay;
    final LocalDate lastWithdrawal;

    public DepositAccount(String name, String surname, BirthDate birthDate, double amount) {
        super(name, surname, birthDate, amount);
        LocalDate today = LocalDate.now();
        this.accountOpeningDay = this.lastWithdrawal = today;
    }

    @Override
    public void take(double amount) {
        if (checkForWithdrawing(accountOpeningDay, lastWithdrawal)) {
            amount = AbstractAccount.checkAmountSign(amount);
            if(amount > this.amount) {
                Notifications.notEnoughFunds(this.amount);
            }
            else this.amount -= amount;
        }
        else Notifications.wrongDate(lastWithdrawal);
    }
}
