package Generic;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner ( System.in );
        Matrix<Double> myMatrixObject = new Matrix<> ( 5, 5.0 );



        System.out.println ( myMatrixObject );
        System.out.println ( myMatrixObject.getSum () );
        System.out.print ( "Please choose a line to calculate:" );
        int choice = scanner.nextInt ();
        System.out.println ( myMatrixObject.getLineSum ( choice ) );
        System.out.print ( "Please choose a diagonal to calculate:" );
        choice = scanner.nextInt ();
        System.out.println ( myMatrixObject.getDiagonalSum ( choice ) );

        myMatrixObject.replaceValue ();



        System.out.println ( myMatrixObject );

    }


}
