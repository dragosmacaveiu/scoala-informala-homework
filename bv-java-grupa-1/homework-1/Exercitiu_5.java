import java.util.Scanner;

//Display all the prime numbers lower than a given number

public class Exercitiu_5 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner ( System.in );
        System.out.println ("Enter your number here:");
        int number = scanner.nextInt ();

        StringBuilder primeNo = new StringBuilder ();
        boolean isPrime = true;

        for (int i = 2; i <= number; i++){
            for (int j = 2; j <= i; j++) {
                if (i !=  j && i % j == 0){
                    isPrime =  false;
                    break;
                }
            }
            if (isPrime){
                primeNo.append ( i ).append ( "; " );
            }
            isPrime = true;
        }

        System.out.println (primeNo);



    }
}
