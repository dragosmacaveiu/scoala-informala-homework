package main;

import java.util.Scanner;

public class GetMax {

    public static void main(String[] args) {
        Scanner numbers = new Scanner ( System.in );
        System.out.println ( "Please enter three numbers:" );
        Integer no1 = numbers.nextInt ();
        Integer no2 = numbers.nextInt ();
        Integer no3 = numbers.nextInt ();

        Integer result = getMax ( no1, no2 );
        if (result == no3) {
            System.out.println ( "The numbers are equals" );
        } else
            System.out.println ( "The biggest number is " + getMax ( result, no3 ) );
    }

    public static Integer getMax(Integer x, Integer y) {
        if (x == y) {
            return x;
        } else if (x == null) {
            return y;
        } else if (y == null) {
            return x;
        } else if (x== null && y==null){
            return null;
        } else if (x > y) {
            return x;
        }
        return y;
    }
}
