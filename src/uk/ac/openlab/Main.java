package uk.ac.openlab;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //declare some variables
        String s = "hello stoopid";
	    int i = 1;
	    boolean b = false;
	    float f = (float) 1.2;
	    double d = 1.234343434;
	    Date now = new Date();


	    // and print them to screen
        System.out.println(s);
        System.out.println(i);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
        System.out.println(now);

        // change the value of some variables
        s = "new string!";
        i = i+1; // adding one to i
        i += 1; // adding one to i
        i++;
        // You can do exactly the same with -

        //  new value of i
        System.out.println(i);

        //modify the value of double - d
        d = d + 2.3;

        // print out d
        System.out.println(d);

        double d2 = d+i; // the int is being cast to a double and the output is a double
        System.out.println(d2);

        //adding to a date
        Date tomorrow = new Date(now.getTime()+(1000*60*60*24) ); // miliseconds * seconds *minutes * hours
        System.out.println(tomorrow);

        // making a new date based on Alex's requirements
        Date alexDate = new Date(now.getTime()+(1000*60*60*74 + 1000*60*7));
        System.out.println(alexDate);

        //Alex date version
        // Define constants
        int SECONDS = 1000;
        int MINUTES = 60 * SECONDS;
        int HOURS = 60 * MINUTES;
        int DAYS = 24 * HOURS;

        // declare a new variable Alexdate2
        Date alexDate2 = new Date(now.getTime()+ (12 * SECONDS + 37 * MINUTES + 12 * HOURS + 6 * DAYS));
        System.out.println(alexDate2);
    }
}
