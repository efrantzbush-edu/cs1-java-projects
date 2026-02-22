
// FILE NAME - TriangleArea.java

/**
 * Description
 * 
 * @author Erinn Frantz-Bush
 * @since Feb. 15th 2026
 */




import java.util.Scanner; // You can ignore this line - we haven't covered this yet.

public class TriangleArea {

    public static void main (String[] args) {

        findArea(); // this method gets numbers from the user and outputs the area of the triangle

    }

    // this method gets numbers from the user, calculates the area of the triangle, and outputs it
    public static void findArea() {

        // Instantiate a Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for height and store the input in the variable 'height'
        System.out.println("Enter the height:");
        int height = scanner.nextInt();

        // Prompt the user for the base and store the input in the variable 'base'        
        System.out.println("Enter the base:");
        int base = scanner.nextInt();

        ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////

        /*      
        height = 10;
        base = 5;
        * FOR ERINN - adding these two assignment statements overrides user input
        * The scanner does this process for you, ** the values ARE NOT NEEDED **
        */

        double area = (height * base / 2); 
        System.out.println("The area of the triangle is " + area);

        /*
         * FOR ERINN - "double area = (height * base / 2)" IS NEEDED to define the
         * mathematical formula needed to calculate the area of the triangle.
         * Triangle Area Formula = 1/2 x base x height
         */

            /*
             * FOR PROFESSOR DIXON!!!
             * All notes labeled "FOR ERINN" are the result of asking ChatGPT
             * for help on why my original code didn't work.
             * Code lines in the comments were/were not apart of original code.
             */


        ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    /////////////////////// 
    }


}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
the hardest part of this lab was understanding the assignement statements were not
needed to run the program; the scanner covered these. any help i recieved is commented
out labeled either "FOR ERINN" or "FOR PROFESSOR DIXON"



2. What will you always remember (never forget) from this exercise?
run the existing code first before making any adjustments - this will help me
understand what else I need to add. by not running the code first I made things
far more confusing for myself



*/

