package com.company;

public class Date {
    private int month;
    private int day;
    private int year;

public Date(int year,int month,int day){

    setDay(day);
    setMonth(year);
    setYear(month);
    System.out.println("The initial date is: "+month+"/"+day+"/"+year);
}

public void displayDate(){
     System.out.println("Date with new values is: "+month+"/"+day+"/"+year);
}

public void setMonth(int month){
    this.month=month;
}

public void setDay(int day){
    this.day=day;
}

public void setYear(int year){
    this.year=year;
    }

public int getMonth(){
    return month;
    }

    public int getYear(){
        return year;
    }
    public int getDay(){
        return day;
    }
}
