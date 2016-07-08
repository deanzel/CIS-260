/*
Summary Info: Enter an integer between 0 and 1000 and calculate the sum of its digits.
Programmer: Dean Choi
Date due: 6/1/16
Date completed: 5/29/16
*/

package adddigits;

import java.util.Scanner;

public class AddDigits {
    
    public static void main(String[] args) {
        /*
        Summary Info : java main console method that calculates the sum of the individual digits of a number between 0 and 1000
        Parameters : String array args are passed into this main console method
        Return type : void (no return)
        */

        Scanner input = new Scanner(System.in); //instantiating a Scanner object
        boolean inRange = false;    //boolean variable for if the int is in the range of 0 and 1000
        int number = 0;             //int variable of the number that is read from the console, defaulted to 0 in this case
        int sum = 0;                //int variable of the sum of the individual digits of the "number" variable
        
        System.out.flush();
        System.out.println("This is a program that calculates the sum of all the digits in an integer "
                + "between 0 and 1000.\nPlease enter an integer between 0 and 1000: ");
        
        while (!input.hasNextInt() || !inRange){
            //start a while loop that will not break until the user enters the correct input being an integer between 0 and 1000
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number < 0){
                    System.out.println("That is an integer less than 0. Please reenter an integer between 0 and 1000: ");
                }
                else if (number > 1000) {
                    System.out.println("That is an integer greater than 1000. Please reenter an integer between 0 and 1000: ");
                }
                else {
                    inRange = true;
                    break;
                }
            }
            else {
                System.out.println("Not an integer. Please reenter an integer between 0 and 1000: ");
                input.next();
            }
        }
        
        for (int i = 0; i < 4; i++) {
            //for loop that will get the int value of each digit in this up to 4-digit int and then add them together
            int digit = (int) (number/(Math.pow(10, i)))%10;
            sum += digit;
        }
        
        System.out.println("The sum of the individual digits of " + number + " is " + sum + ".");

        }
        
}
