package org.example;

public class CreditAccount extends AbstractAccount implements ClientAccount {

    private double commissionPercent = 1.0;

    public CreditAccount(String name, String surname, BirthDate birthdayDate, double amount) {
        super(name, surname, birthdayDate, amount);
    }

    public double getCommissionPercent(){return commissionPercent;}
    public void setCommissionPercent(double commissionPercent) throws Exception {
        if (commissionPercent>= 0){this.commissionPercent = commissionPercent;}
        else throw new RuntimeException();
    }

    @Override
    public void take(double amount) {
        super.amount = getAmount() - amount - (amount * commissionPercent / 100);
    }
}
