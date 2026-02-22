
// FILE NAME - ConvertCF01.java

// Insert yer comments here!
/**
 * Converting celsius to fahrenheit
 * 
 * @author Erinn Frantz-Bush
 * @since Feb. 16th 2026
 */

import java.util.Scanner;

public class ConvertCF01 {

  public static void main (String[] args) {

    // This line of code will get a number from the user
    // You do not have to worry about this code yet!

    // Create a Scanner so user input can be read
    Scanner scanner = new Scanner(System.in);

    // Prompt user for a temperature
    System.out.println("Enter a temperature in Celsius:");

    // Read in a number and store it in 'tempNumber'
    int celsius = scanner.nextInt();

    ///////////////////////    INSERT YOUR CODE BELOW THE LINE    ///////////////////////

    double formula = (celsius * 9.0/5 + 32);
    System.out.println(celsius + " degrees Celsius is " + formula + " degrees Fahrenheit.");

    /*
     * FOR ERINN - println is needed to advance to a new line after output
     * adding .0 after 9 ensures propper formatting for decimals later (noted by ChatGPT)
     * also, learn how to spell Fahrenheit.
     */


    ///////////////////////    INSERT YOUR CODE ABOVE THE LINE    ///////////////////////  


  }

}


