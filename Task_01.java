package com.company;

public class Task_01 {

    public static void main(String[] args) {

        for(int i=1;i<9;i++){
            if(i%2==0){
                System.out.print(" ");
            }
            for(int j=1;j<9;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
