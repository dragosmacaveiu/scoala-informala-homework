import java.util.Scanner;

// Input the length of the side of a square, and display its area.  Produce an error message if the length is negative

public class Exercitiu_7 {
    public static void main(String[] args){
        Scanner dim = new Scanner ( System.in );
        System.out.println ("Input the length of square side?");
        int length =  dim.nextInt ();

        if (length > 0 ){
            int area = length * length;
            System.out.println (area);
        } else {
            System.out.println ("Error");
        }
    }
}
