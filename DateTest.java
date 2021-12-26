package com.company;

public class DateTest {
    public static void main(String[] args) {

        var date1=new Date(2004,4,7);

        date1.setYear(2003);
        date1.setDay(11);
        date1.setMonth(1);

        date1.displayDate();
    }
}
