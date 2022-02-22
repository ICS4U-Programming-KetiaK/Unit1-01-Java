import java.util.Scanner;

/**
* Created a program that asks the user for the
* length of logs and display the amount of logs
* the truck can carry.
*
* @throws IllegalStateException when error occurs
*/
public class LoggingCompany {
    /**
    * Declaring constants.
    */
    private static final int MAX_WEIGHT = 1100;
    /**
     * Declaring constants.
     */
    private static final int KG_PER_LOG = 20;
    /**
     * Display results to the console.
     *
     * @param args passed in
     */

    public static void main(String[]args) {
        final Scanner sc = new Scanner(System.in);
        // get input from user
        System.out.print("Enter the length of the logs(0.25,0.5,1)(m): ");
        // reads the user input
        final String lengthOfLogsString = sc.nextLine();
        // parse user input from string to float
        final float lengthOfLogsFloat = Float.parseFloat(lengthOfLogsString);
        // calculate the amount of logs the truck carries
        final float amountOfLogs = MAX_WEIGHT / KG_PER_LOG / lengthOfLogsFloat;
        // convert result into an int
        final int amountOfLogsInt = (int) amountOfLogs;
        // Display the result to the console
        System.out.println("The amount of logs the truck can"
                           + "carry is " + amountOfLogsInt);
    }
}
