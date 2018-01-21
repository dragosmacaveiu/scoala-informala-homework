import java.util.Scanner;

/** This program calculates the max on 3 input numbers
 * The user will introduce 3 numbers from the keyboard and the program will return the max
 *
 */


public class MaxNumber {
    public static void main (String [] args) {
        int firstNo = firstNumber ();
        int secondNo = secondNumber ();

        if (firstNo == secondNo) {
            System.out.println ("The numbers are equal");
        } else if (getMax ( firstNo, secondNo )) {
                System.out.println ("First number: " + firstNo + " is greater then second number: " + secondNo);
            } else {
                System.out.println ("Second number: "+ secondNo + " is greater then first number: " + firstNo);
            }

        }

    public static boolean getMax( int x, int y){
            if (x > y){
                return true;
            }
            return false;

    }

    public static int firstNumber () {
        Scanner numbers =  new Scanner ( System.in );
        System.out.println ("Please insert your first numbers");
        int no1 = numbers.nextInt ();
        return no1;
    }

    public static int secondNumber () {
        Scanner numbers =  new Scanner ( System.in );
        System.out.println ("Please insert your second numbers");
        int no2 = numbers.nextInt ();
        return no2;
    }
}
