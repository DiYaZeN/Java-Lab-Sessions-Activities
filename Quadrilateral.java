package com.company;

import java.awt.*;
import java.util.Scanner;

public class Quadrilateral {

    private Point corner1 ;
    private Point corner2 ;
    private Point corner3 ;
    private Point corner4 ;



    public Quadrilateral(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4) {
        this.corner1 =new Point(x1,y1);
        this.corner2 =new Point(x2,y2) ;
        this.corner3 =new Point(x3,y3);
        this.corner4 =new Point(x4,y4);
    }

    public Point getCorner1(){
        return corner1;
    }
    public Point getCorner2(){
        return corner2;
    }

    public Point getCorner3(){
        return corner3;
    }

    public Point getCorner4(){
        return corner4;
    }


    public String getCoordinatesAsString(String item)
    {
       return String.format( "Coordinates of %s are : \n%s,%s,%s,%s  " ,item,corner1, corner2, corner3, corner4 );
    }

}
