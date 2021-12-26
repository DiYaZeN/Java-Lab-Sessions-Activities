package com.company;

public class SquareTest {
    public static void main(String[] args) {

        Square square=new Square();
        square.getArea();

        Square square1=new Square(5);
        square1.getArea();

        square1.setSide(25);
        square1.getArea();


    }
}
