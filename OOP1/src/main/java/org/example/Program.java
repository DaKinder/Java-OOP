package org.example;

/*
 * 1. Создать класс "Счет в банке" - Account.
 * У этого класса должно быть поле с текущим балансом на счете.
 * У этого класса должно быть 3 метода:
 * - (put) Пополнить счет - принимат положительное число, увеличивает текущий баланс
 * - (take) Вывести средства - принимат положительное число, уменьшает текущий баланс
 * - (getAmount) Показать баланс - ничего не принимает, возвращает текущий баланс (getter)
 *
 * 2. Создать несколько наследников.
 * - Кредитный счет (CreditAccount)
 * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
 * То есть, если снимаем 100 у.е., то снять нужно 101.
 * - Депозитный счет (DepositAccount) *
 * Особенность: нельзя снимать средства чаще, чем раз в месяц.
 * То есть, нужно завести поле с датой последнего снятия, и использовать его.
 * (Для дат лучше использовать LocalDate, пример в классе Dates в проекте урока)
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void employeeSwitch(){
        System.out.println("Добро пожаловать в программу сотрудника банка!");
        System.out.print("Выберете пункт меню: ");
        System.out.println("1 - Просмотреть информацию о клиенте");
        System.out.println("2 - Добавить клиента");
        System.out.println("3 - Изменить размер комиссии");

        Scanner input = new Scanner( System.in );
        int choose  =  input.nextInt();

        switch (choose){
            case 1 :
                System.out.print("Введите ID клиента: ");
                Scanner idInput = new Scanner( System.in );
                System.out.println("Клиент успешно найден!");
            case 2 : ClientAccount clientAccount = new AbstractAccount(
        }
    }
    public static void clientSwitch(){

    }
    public void creditClientAdder(){
        Scanner clientData = new Scanner( System.in );
        System.out.print("Введите имя клиента: ");
        String name = clientData.next();
        System.out.print("Введите фамилию клиента: ");
        String surname = clientData.next();
        System.out.println("Введите дату рождения.");
        System.out.print("Число: ");
        final int DAY = clientData.nextInt();
        System.out.print("Месяц: ");
        final int MONTH = clientData.nextInt();
        System.out.print("Год: ");
        final int YEAR = clientData.nextInt();

        ClientAccount client = new CreditAccount( String name, String surname, new BirthDate(YEAR, MONTH, DAY),  )
    }

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner( System.in );
        System.out.println("---Банк Россия---");

        System.out.print("Введите ваше ID: ");
        int idNumber = console.nextInt();
        System.out.print("Введите пароль: ");
        String password = console.next();

        boolean access = Employee.checkAccount(idNumber, password);
        if(access){employeeSwitch();}
        else clientSwitch();

        System.out.println();

            

    }

}