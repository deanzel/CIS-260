/*
Summary Info: Programming Assignment #2 - Problem 2
Programmer: Dean Choi
Date due: 6/13/16
Date completed: 6/13/16
*/
package salescomissionsalary;

public class SalesComissionSalary {

    /*
    Summary Info : java main console method that calculates/prints the minimum sales you need to have to
    generate $30,000 in a year based upon a $5000 base salary.
    Parameters : String array args are passed into this main console method but no Reader input.
    Return type : void (no return)
    */
    public static void main(String[] args) {
        
        final double GOAL = 30000;      //constant vaiable of the Goal Salary
        double salesamount = 0;         //variable of the Amount ($) in sales needed to achieve the GOAL Salary
        final double BASE = 5000;       //constant variable of the Base salary
        
        //The following if statements calculates the salesamount needed for your GOAL salary based upon your BASE salary
        if (GOAL <= (BASE + 400)){
        salesamount = (GOAL - BASE)/0.08;
        }
        else if (GOAL <= (BASE + 900) && GOAL > (BASE + 400)){
        salesamount = (GOAL - (BASE + 400))/0.1 + 5000;
        }
        else if (GOAL > (BASE + 900)){
        salesamount = (GOAL - (BASE + 900))/0.12 + 10000;
        }
        
        System.out.printf("\nIn order to earn $%6.2f a year with a starting base salary of $%6.2f,"
                + " you must generate a minimum of $%6.2f in sales.\n", GOAL, BASE, salesamount);
    }
}
