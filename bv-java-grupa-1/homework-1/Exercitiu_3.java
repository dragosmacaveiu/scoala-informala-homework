
import java.util.Scanner;

//Display the max digit from a number. Read the number from keyboard

public class Exercitiu_3 {
    public static void main(String[] args){
        int max = 0;
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter your number:" );
        int number= scanner.nextInt ();

        while (number > 0) {
            int r = number % 10;
            if (r > max) {
                max = r;
            }
            number = number / 10;
        }

        System.out.println(max);
    }
}
