import java.util.Scanner;

//Input 2 values:  start  and  finish, then display the numbers from start to finish

public class Exercitiu_9 {
    public static void main(String[] args){
        String number ;
        Scanner no1 = new Scanner ( System.in );
        System.out.println ( "What is the first number?" );
        int firstNo = no1.nextInt ();
        Scanner no2 = new Scanner ( System.in );
        System.out.println ( "What is the second number??" );
        int secondNo = no2.nextInt ();
        if (firstNo < secondNo && firstNo != secondNo) {
            while (firstNo <= secondNo) {
                number = String.valueOf ( firstNo ) + "; ";
                firstNo += 1;
                System.out.println ( number );
            }
        } else {
            while (firstNo >= secondNo) {
                number = String.valueOf ( firstNo ) + "; ";
                firstNo -= 1;
                System.out.println ( number );
            }

        }
    }
}

