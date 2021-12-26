package com.company;

public class Square {
    private double side;
    private double area;

    public Square(){
        setSide();
        computeArea();
    }

    public Square(double side){
        setSide(side);
        computeArea();

    }


    public void setSide(){
        this.side=1.0;
        computeArea();

    }

    public void setSide(double side){
        if(side>=0){
            this.side=side;
        }
        computeArea();

    }

    public double getSide(){
        return side;
    }

    private void computeArea(){
        area=Math.pow(side,2);
    }

    public void getArea(){
        System.out.println("Area of the square is: "+ area);

    }
}
