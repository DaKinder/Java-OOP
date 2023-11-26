package OOP1;

public class  AbstractAccount implements Account {
    private String name;
    private String surname;
    private BirthDate birthDate;
    protected double amount;
    int employeeId;
    public String getName(){return name;}
    public String getSurname(){return surname;}
    public BirthDate getBirthDate(){return birthDate;}
    public double getAmount(){return amount;}

    public AbstractAccount(int employeeId){ this.employeeId = employeeId;}
    public AbstractAccount(String name, String surname, BirthDate birthDate, double amount) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.amount = amount;
    }
    public static double checkAmountSign(double amount){
        if(amount < 0){amount *= -1;}
        return amount;
    }
    public void printInfo()
    {
        System.out.printf("%s %s %s %.2f\n", name, surname, birthDate, amount);
    }
    public void put(double amount) {
        amount = checkAmountSign(amount);
        this.amount += amount;
    }
    public void take(double amount){
        amount = checkAmountSign(amount);
        if(amount > this.amount){Notifications.notEnoughFunds(this.amount);}
        else this.amount -= amount;
    }
}
