import java.util.Scanner;

public class TimeValidation {
    public static void main (String args[]){

        int hour = readHours ();
        int minute =  readMinute ();

        if (validateHourMinute ( hour, minute)){
            System.out.println ("The time is: " + hour + ":" + minute );
        }else {
            System.out.println ("Incorrect time");
        }

    }

    public static boolean validateHourMinute (int h, int m){
        if ( (h >=0 && h<=24) && (m >= 0 && m <=60) ){
            return true;
        }
        return false;

    }

    public static int readHours (){
        Scanner hours = new Scanner ( System.in );
        System.out.println ("Please insert the hour:");
        int hh = hours.nextInt ();
        return hh;

    }

    public static int readMinute(){
        Scanner minute = new Scanner ( System.in );
        System.out.println ( "Please insert the minutes:" );
        int mm = minute.nextInt ();
        return mm;
    }
}
