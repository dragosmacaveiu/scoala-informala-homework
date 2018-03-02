package Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix<E extends Number> {

    private List<List<E>> myMatrix; //Declaring a generic type 2 dimension List
    Scanner scanner = new Scanner ( System.in );  // Take input from the keyboard

    public Matrix(int size, E initialValue) {   // Constructor

        this.myMatrix = new ArrayList<> (); // Initializing the list

        for (int i = 0; i < size; i++) {
            myMatrix.add ( new ArrayList<E> () );   // Adding a list for every index from the first list

            for (int j = 0; j < size; j++) {
                myMatrix.get ( i ).add ( initialValue );
            }

        }
    }

    // Getter

    public List<List<E>> getMyMatrix() {
        return myMatrix;
    }

    // Setter

    public void setMyMatrix(List<List<E>> myMatrix) {
        this.myMatrix = myMatrix;
    }



    @Override
    public String toString() {
        String number = "";
        for (int i = 0; i < myMatrix.size (); i++) {
            for (int j = 0; j < myMatrix.size (); j++) {
                number += myMatrix.get ( i ).get ( j ) + " ";
            }
            number += "\n        ";
        }
        return "Matrix size: " + myMatrix.size () + "\n" +
                "Matrix: " + number;


    }

    // Calculate the sum of the entire matrix

    public Double getSum() {
        Double sum = 0.0;
        for (int i = 0; i < myMatrix.size (); i++) {
            for (int j = 0; j < myMatrix.size (); j++) {
                sum += myMatrix.get ( i ).get ( j ).doubleValue ();
            }
        }
        return sum;
    }

    // Calculate the sum for line

    public Double getLineSum(int lineNumber) {
        Double sum = 0.0;
        if (lineNumber < 0 && lineNumber > myMatrix.size ()) {
            throw new IllegalArgumentException ( "You have to choose a number between 1 and " + myMatrix.size () );
        }
        for (int i = 0; i < myMatrix.size (); i++) {
            sum += myMatrix.get ( lineNumber ).get ( i ).doubleValue ();
        }
        return sum;
    }

    /** Calculate the sum for one diagonal. The user is ask for a number, 1 or 2, this way will chose witch of the
        diagonals to calculate
     **/

    public Double getDiagonalSum(int diagNumber) {
        Double sum = 0.0;
        if (diagNumber == 1) {
            for (int i = 0; i < myMatrix.size (); i++) {
                sum += myMatrix.get ( i ).get ( i ).doubleValue ();
            }
        } else if (diagNumber == 2) {
            for (int i = myMatrix.size () - 1, j = 0; i >= 0; i--, j++) {
                sum += myMatrix.get ( i ).get ( j ).doubleValue ();
            }
        } else {
            throw new IllegalArgumentException ( "You have to choose a number between 1 and 2" );
        }
        return sum;
    }

    /** This methode will replace a value from **/

    public void addValue(int i, int j, E value) {
        myMatrix.get ( i ).set ( j, value );
    }
/** This methode will replace multiple values from the Matrix, until the user choose to exit this methode*/

    public void replaceValue() {
        boolean exit = false;
        int column = 0;
        int row = 0;
        Double value = 0.0;
        while (!exit) {
            System.out.println ( "Please change a number from the matrix" );
            System.out.print ( "Select column between 0 and " + (myMatrix.size () - 1) + ": " );

            column = Integer.parseInt ( scanner.nextLine () );
            if (column < 0 || column > myMatrix.size ()) {
                throw new IllegalArgumentException ( "Please select a number between 0 and " + myMatrix.size () );
            }

            System.out.print ( "Select row between 0 and "+ (myMatrix.get ( column ).size () -1) +": " );

            row = Integer.parseInt ( scanner.nextLine () );
            if (row <0 && row > myMatrix.get ( column ).size () ) {
                System.out.println ( "You have to select a number between 0 and " + myMatrix.get ( column ).size () );
            }
            System.out.print ( "Insert a value: " );
            try {
                value = Double.parseDouble ( scanner.nextLine () );
            } catch (NumberFormatException e) {
                System.out.println ( "The value must be a number" );
            }
            addValue ( column, row, (E) value );
            System.out.println (myMatrix.get ( column ).get ( row ));

            System.out.println ( "Do you what to change another number? (1 - yes /2- no )" );
            Integer choise = scanner.nextInt ();
            scanner.skip ( "((?<!(?>\\R))\\s)*" );
            if (choise == 1) {
                exit = false;

            } else if (choise == 2) {
                exit = true;
            } else {
                throw new IllegalArgumentException ( "You must select 1 or 2 " );
            }

        }
    }
}




