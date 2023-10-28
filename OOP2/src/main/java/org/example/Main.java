package org.example;

/**
 * Модифицируем пример, описанный в предыдущем домашнем задании (со счетами).
 *
 * 1. Класс Account превратить в интерфейс с методами:
 * # double getAmount() - получение текущего баланса
 * # void put(double amount) - пополнить счет
 * # void take(double amount) - снять средства со счета
 *
 * 2. Создать базовый абстрактный класс AbstractAccount, в котором будет общая часть:
 * # поле с балансом
 * # конструктор, который принимает начальное значение баланса
 * # реализация всех методов
 *
 * 3. Добавить еще один класс FixedAmountAccount с особенностью: методы put, take НЕ изменяют баланс.
 *
 * 4.* Класс AbstractAccount можно реализовать хитрее. Пример ниже.
 */

public class Main {
    public static void main(String[] args) {


        //System.out.println(account.getAmount());
    }
}