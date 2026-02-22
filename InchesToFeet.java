// FILE NAME - InchesToFeet.java

// Who are you? What is the date? What does this program do? Enquiring minds want to know!
/**
 * Convert inches to feet
 * 
 * @author Erinn Frantz-Bush
 * @since Feb. 15th 2026
 */
import java.util.Scanner;

public class InchesToFeet {
    public static void main(String[] args) {

        // All the dirty work happens in the 'convert()' method;
        // let's call it here from the main method!
        convert();      

    }

    // this method asks the user for total inches and outputs the conversion to feet and inches
   public static void convert() {

       // Create a new Scanner to read in input from user
      Scanner scanner = new Scanner(System.in);

      // Prompt the user and then store their input in 'totalInches'
      System.out.println("Enter the number of inches:");
      int totalInches = scanner.nextInt();

      // Convert to feet and inches. 
       // ex. if totalInches is 38, the output would be: 38 inches is 3 feet, and 2 inches

      ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////

      int feet = totalInches / 12;
      int inches = totalInches % 12;
      System.out.println(totalInches + " inches is " + feet + " feet, and " + inches + " inches");







      ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    ///////////////////////

      scanner.close();   

   }

}
