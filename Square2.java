package com.company;

public class Square2 extends Quadrilateral {
    private double height;

    public Square2(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double getHeight(){
        if(getCorner1().getY()==getCorner2().getY()){
            return Math.abs(getCorner2().getY()-getCorner3().getY());
        }
        else{
            return Math.abs(getCorner1().getY()-getCorner2().getY());
        }
    }

    public double getSumOfTwoSides(){
        if(getCorner1().getY()==getCorner2().getY()){
            return Math.abs(getCorner2().getX()-getCorner1().getX())+
                    Math.abs(getCorner3().getX()-getCorner4().getX()) ;
        }
        else{
            return Math.abs(getCorner1().getX()-getCorner4().getX())+
                    Math.abs(getCorner3().getX()-getCorner2().getX()) ;
        }
    }

    public double getArea(){
        return 0.5*getSumOfTwoSides()*getHeight();
    }


    public String printStatements(){
        return String.format("\n\n"+getCoordinatesAsString("Square")+"\nHeight is : "+getHeight()+ "\nArea is : "+getArea());
    }
}
