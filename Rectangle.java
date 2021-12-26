package com.company;

public class Rectangle {
    private float length=1;
    private float width=1;

    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }

    public void CalculateArea(){
        System.out.println("Area : "+(width*length));
    }

    public void CalculatePerimeter(){
        System.out.println("Perimeter : "+((width*2)+(length*2)));
    }

    public void setLength(float length){
        if(length>=0.0 && width<20.0)
            this.length=length;
        else
            System.out.println("Enter a valid length");

    }
    public void setWidth(float width){
        if(width>=0.0 && width<20.0)
            this.width=width;
        else
            System.out.println("Enter a valid width");
    }
    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
}
