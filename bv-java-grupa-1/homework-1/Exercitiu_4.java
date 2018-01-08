import java.util.Scanner;

//Check if a number is palindrom( e.g palindrom 1221, 34143)

public class Exercitiu_4 {
    public static void main (String[] args){

        int r = 0;
        Scanner scanner = new Scanner ( System.in );
        System.out.println ("Enter your number:");
        int number = scanner.nextInt ();
        int testNo = number;
        while (testNo > 0) {
            int d = testNo % 10;
            r = (r *10) + d;
            testNo = testNo / 10;
        }
        if (number == r){
            System.out.println ("The number is palindrom");
            } else {
            System.out.println ("The number is not palindrom");
        }

    }
}
