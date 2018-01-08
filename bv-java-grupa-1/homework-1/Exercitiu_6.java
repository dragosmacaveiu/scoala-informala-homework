import java.util.Scanner;

//Input the dimensions of a rectangle and display area and perimeter

public class Exercitiu_6 {
    public static void main(String[] args){
        Scanner dimL = new Scanner ( System.in );
        System.out.println ("What is the length of the rectangle?");
        int length =  dimL.nextInt ();
        Scanner diml = new Scanner ( System.in );
        System.out.println ("What is the length of the rectangle?");
        int width = diml.nextInt ();
        if (length != 0 && width != 0){
            int area = length * width;
            int perimeter = 2*length + 2*width;
            System.out.println (area);
            System.out.println (perimeter);
        } else {
            System.out.println ("Error");
        }
    }
}
