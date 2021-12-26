package com.company;

public class Main {

    public static void main(String[] args) {

        //Quadrilateral
        Quadrilateral quadrilateral =
               new Quadrilateral( 1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4 );
        System.out.printf(quadrilateral.getCoordinatesAsString("quadrilateral")) ;

        //Trapezoid
        Trapezoid trapezoid=new Trapezoid( 0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0 );
        System.out.printf(trapezoid.printStatements()) ;

        //Parallelogram
        Parallelogram parallelogram =
                new Parallelogram( 5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0 );
        System.out.printf(parallelogram.printStatements()) ;

        //Rectangle
        Rectangle2 rectangle =
               new Rectangle2( 17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0 );
        System.out.printf(rectangle.printStatements()) ;

        //Square
        Square2 square=
                 new Square2( 4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0 );
        System.out.printf(square.printStatements()) ;














//        for(int i=1;i<9;i++){
//            if(i%2==0){
//                System.out.print(" ");
//            }
//            for(int j=1;j<9;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}
