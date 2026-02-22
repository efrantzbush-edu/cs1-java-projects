/**
 * Find The Area of a Circle
 *
 * @author Erinn Frantz-Bush
 * @since Feb. 21st 2026
 */

import java.util.Scanner;

public class Circles01 {

    public static void main(String[] args) {

    // All the dirty work happens in the 'circleArea()' method;
    // let's call it here from the main method!

        circleArea();    

    }

    public static void circleArea() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius: ");
        double radius = scanner.nextDouble();

        System.out.println();

        // ========== INSERT YOUR CODE HERE ==========

        System.out.print("AREA = ");
        double area = (3.14 * Math.pow(radius, 2));
        System.out.println(area);
        //FOR ERINN -needed to println "area" to display calculations
        //original two lines of code were correct!






        // ===========================================        

  }

}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
    making sure the output lines were formatted correctly
    needing print("AREA = ") followed by println(area) to insure
    each output line was correct



2. What will you always remember (never forget) from this exercise?
    don't doubt your original code!



*/

