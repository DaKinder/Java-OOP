package OOP1;

import java.time.LocalDate;

public class DepositAccount extends AbstractAccount {
    final LocalDate accountOpeningDay;
    private LocalDate lastWithdrawal;

    public DepositAccount(String name, String surname, BirthDate birthDate, double amount) {
        super(name, surname, birthDate, amount);
        LocalDate today = LocalDate.now();
        this.accountOpeningDay = this.lastWithdrawal = today;
    }

    @Override
    public void take(double amount) {
        LocalDate today = LocalDate.now();
        if (Dates.checkForWithdrawing(accountOpeningDay, lastWithdrawal)) {
            super.take(amount);
            lastWithdrawal = today;
        } else Notifications.wrongDate(lastWithdrawal);
    }
}
