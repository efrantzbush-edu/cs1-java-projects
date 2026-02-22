
// FILE NAME - MathFunctions.java


/**
 * TONS of Math Functions
 * 
 * @author Erinn Frantz-Bush
 * @since Feb. 21st 2026
 */

import java.util.Scanner;

public class MathFunctions {
    public static void main (String[] args) {

        mathFunctions();

    }

    public static void mathFunctions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numberOne = sc.nextInt();
        System.out.println("Enter another number:");
        int numberTwo = sc.nextInt();

        // -------------------- INSERT YOUR CODE HERE --------------------

        System.out.println();

        // FOR ERINN - remember to add "+" between each variable to string them together
        System.out.print("Sum of " + (int)numberOne + " and " + (int)numberTwo + ": ");
        int add = (numberOne+numberTwo);
        System.out.println(add);

        System.out.print("Difference of " + (int)numberOne + " and " + (int)numberTwo + ": ");
        int subtract = (numberOne-numberTwo);
        System.out.println(subtract);

        System.out.print("Product of " + (int)numberOne + " and " + (int)numberTwo + ": ");
        int multiply = (numberOne*numberTwo);
        System.out.println(multiply);

        System.out.print("Quotient of " + (int)numberOne + " and " + (int)numberTwo + ": ");
        int divide = (numberOne/numberTwo);
        System.out.println(divide);

        System.out.print("Modulo of " + (int)numberOne + " and " + (int)numberTwo + ": ");
        int mod = (numberOne%numberTwo);
        System.out.println(mod);



        //----------------------------------------------------------------
    }
}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
    remembering to add "+" between each variable to get
    a correct out put



2. What will you always remember (never forget) from this exercise?
    remembering to add "+" between each variable to get
    a correct output and remembering when to put print vs println



*/


