package com.company;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(1,1);

        while(true){
            Scanner scanner=new Scanner(System.in);

            System.out.println("1. Set Length");
            System.out.println("2. Set Width");
            System.out.println("3. Exit");

            System.out.print("Choice : ");
            int choice=scanner.nextInt();

            if (choice==3){
                break;
            }

            switch(choice){
                case 1:
                    System.out.print("Length: ");
                    rectangle.setLength(scanner.nextFloat());
                    break;
                case 2:
                    System.out.print("Width: ");
                    rectangle.setWidth(scanner.nextFloat());
                    break;

            }

            rectangle.CalculatePerimeter();
            rectangle.CalculateArea();


        }

    }
}
