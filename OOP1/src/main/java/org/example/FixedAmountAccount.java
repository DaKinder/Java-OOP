package org.example;

public class FixedAmountAccount extends AbstractAccount{

    public FixedAmountAccount(String name, String surname, BirthDate birthDate, double amount) {
        super( name, surname, birthDate, amount );
    }

    @Override
    public void put(double amount) {
        Notifications.failedAddingFunds();
    }

    @Override
    public void take(double amount) {
        Notifications.failedWithdrawal();
    }
}
