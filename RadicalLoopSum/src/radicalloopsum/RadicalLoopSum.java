/*
Summary Info: Programming Assignment #2 - Problem 1
Programmer: Dean Choi
Date due: 6/13/16
Date completed: 6/13/16
*/
package radicalloopsum;

public class RadicalLoopSum {

    /*
    Summary Info : java main console method that calculates/prints the radical divor sum in the problem
    Parameters : String array args are passed into this main console method but no Reader input.
    Return type : void (no return)
    */
    public static void main(String[] args) {
        double sum = 0;         //double variable that is the sum of the various radical divisors
        
        for (int i = 1; i < 625; i++){
        //i is the integer loop count number that starts at 1 and will end at 624. 624 iterations of this loop.
        sum += 1/(Math.pow(i, 0.5) + Math.pow(i+1, 0.5));
        
        }
        
        System.out.println("The sum of the radical divisor for the loop is " + sum);
    }
}
