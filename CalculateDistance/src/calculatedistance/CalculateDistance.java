/*
Summary Info: Calculate the distance between two coordinate points.
Programmer: Dean Choi
Date due: 6/1/16
Date completed: 5/30/16
*/
package calculatedistance;

import java.util.Scanner;
        
public class CalculateDistance {
        /*
        Summary Info : java main console method that calculates the distance between two points
        Parameters : String array args are passed into this main console method
        Return type : void (no return)
        */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //instantiating a scanner object
        double x1;          //double variable for the coordinate value of x1
        double x2;          //double variable for the coordinate value of x2
        double y1;          //double variable for the coordinate value of y1
        double y2;          //double variable for the coordinate value of y2
        double distance;    //double variable for the calculated distance
        
        System.out.flush();
        System.out.println("This program calculates the distance between two points of "
                + "(x1,y1) and (x2, y2).");
        
        System.out.println("Please enter the value of x1: ");
        while (!input.hasNextDouble()){
            //start a while loop that will not break until the user enters the a correct double value for x1
            System.out.println("That is not a proper coordinate value. Please reenter the value of x1: ");
            input.next();
        }
        x1 = input.nextDouble();
        
        System.out.println("Please enter the value of y1: ");
        while (!input.hasNextDouble()){
            //start a while loop that will not break until the user enters the a correct double value for y1
            System.out.println("That is not a proper coordinate value. Please reenter the value of y1: ");
            input.next();
        }
        y1 = input.nextDouble();
        
        System.out.println("Please enter the value of x2: ");
        while (!input.hasNextDouble()){
            //start a while loop that will not break until the user enters the a correct double value for x2
            System.out.println("That is not a proper coordinate value. Please reenter the value of x2: ");
            input.next();
        }
        x2 = input.nextDouble();
        
        System.out.println("Please enter the value of y2: ");
        while (!input.hasNextDouble()){
            //start a while loop that will not break until the user enters the a correct double value for y2
            System.out.println("That is not a proper coordinate value. Please reenter the value of y2: ");
            input.next();
        }
        y2 = input.nextDouble();
        
        distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow(y2-y1, 2));
            //calculates the distance double variable using the coordinate double values of the two entered points
        
        System.out.println("The distance between point 1, (" + x1 + ", " + y1 + "), and point 2, ("
                + x2 + ", " + y2 + "), is: " + distance + ".");

    }
    
}
