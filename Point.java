package com.company;

public class Point {

    private double x;
    private double y;

    public Point(double xCod,double yCod){
        x=xCod;
        y=yCod;
    }
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String toString()
 {
       return String.format( "( %.1f, %.1f )", getX(), getY() );
 }
}
