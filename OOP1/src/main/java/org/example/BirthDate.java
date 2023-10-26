package org.example;

public class BirthDate {
    private int year;
    private int month;
    private int day;

    public BirthDate(int year, int month, int day){

        this.year = year;
        this.month = month;
        this.day = day;

    }

    @Override
    public String toString() {return String.format("%d.%d.%d", year, month, day);}
}
