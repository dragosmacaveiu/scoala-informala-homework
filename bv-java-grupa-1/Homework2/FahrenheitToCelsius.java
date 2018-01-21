import java.util.Scanner;

/** This program has a method that converts Fahrenheit to Celsius
 *
 * User must insert a body temperature and the program will convert Fahrenheit deg to Celsius deg, if the temperature
 * is above 37 deg Celsius, then the program will display a message with: "You are ill"
 *
 */

public class FahrenheitToCelsius {

    public static void main (String [] args){

        double fahr = getTemp (); // call fucntion getTemp
        double temp = fahrToCelsius ( fahr ); // store the temp in Celsius deg

        /** verify if the temp is ok for body temperature, if is lower then 35 deg, will display a message
         * were it will say that you are dead. If the body temp is between 35 and 37 it will just display a message
         * with: your body temperature is x. If the temp is higher then 37 deg, it will display a message: You are ill,
         * you have x degree Celsius
         */
        if (temp < 35){
            System.out.println ( "Sorry!!! You are dead! Your body temperature in Celsius is: "+ temp );
        } else if (temp <= 37 ) {
            System.out.println ("Your body temperature in Celsius degrees is: " + temp );
        } else {
            System.out.println ("You are ill! You have " + temp + " degree Celsius");
        }

    }
      // Method that will convert Fahrenheit to Celsius
    public static double fahrToCelsius (double x){
    double cels = (x - 32 ) / 1.8;
    return cels;
    }

    // Method that you ask for the body temp in Fahrenheit and return the value
    public static double getTemp(){
        Scanner temp = new Scanner ( System.in );
        System.out.println ("Please insert your temperature: ");
        double farh = temp.nextInt ();
        return farh;
    }
}
