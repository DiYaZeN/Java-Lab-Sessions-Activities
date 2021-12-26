package com.company;

public class Task_02 {

    public static void main(String[] args) {

        System.out.print("x");
        System.out.print("        ");
        System.out.println("x!");


        for(int i=1;i<6;i++){
            int fact=1;

            System.out.print(i);
            System.out.print("        ");

            for(int j=i;j>1;j--){
                fact=fact*j;
            }
            System.out.println(fact);
        }

    }
}
