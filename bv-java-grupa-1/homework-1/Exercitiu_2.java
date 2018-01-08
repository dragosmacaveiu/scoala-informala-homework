import java.util.Scanner;

//Display the smallest number from a collections of number

public class Exercitiu_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner ( System.in );
        int[] numbers = new int[5];
        int i;
        int min = numbers[0];

        for (i=0; i<numbers.length; i++) {
            System.out.println ("Enter a number:");
            numbers[i]=scanner.nextInt();
            if (min < numbers[i])
               min = numbers[i];
        }

        System.out.println (min);

    }
}
