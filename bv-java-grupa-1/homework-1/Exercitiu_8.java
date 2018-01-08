import java.util.Scanner;

//Input 3 numbers, and display the biggest.

public class Exercitiu_8 {
    public static void main(String[] args){
        Scanner no1 = new Scanner ( System.in );
        System.out.println ("What is the first number?");
        int firstNo =  no1.nextInt ();
        Scanner no2 = new Scanner ( System.in );
        System.out.println ("What is the second number??");
        int secondNo = no2.nextInt ();
        Scanner no3 = new Scanner ( System.in );
        System.out.println ("What is the second number??");
        int thirdNo = no3.nextInt ();
        if (firstNo > secondNo && firstNo > thirdNo){
            System.out.println ("First number is the biggest");
        } else if( secondNo > thirdNo) {
            System.out.println ("Second number is the biggest");
        } else {
            System.out.println ("Third number is the biggest");
        }
    }
}
