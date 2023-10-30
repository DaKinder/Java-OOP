package org.example;

public class CreditAmount extends AbstractAccount implements Account{
    CreditAmount(double amount) {super(amount);}

    @Override
    public void take(double amount) {}

    @Override
    public void put(double amount) {}

    @Override
    public double getAmount() {
        return 0;
    }
}
