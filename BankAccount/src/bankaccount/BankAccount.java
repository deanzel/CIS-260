/*
Summary Info: Programming Assignment #4 - Bank Account balance testing
Programmer: Dean Choi
Date due: 6/21/16
Date completed: 6/23/16
*/
package bankaccount;

    /*
    Summary Info : java main console method that creates the Account objects
    Parameters : none.
    Return type : none.
    */
public class BankAccount {
    
    public static void main(String[] args) {
        //Testing Account constructor that takes in parameters of id, balance and interest
        Account newAccount = new Account("1122", 20000, 4.5);
        //Testing clone method
        Account clone = newAccount.clone();
        
        //Testing withdraw method
        newAccount.withdraw(2500);
        //Testing deposit method
        newAccount.deposit(3000);
        //Testing getBalance method and printing the value for the changed account
        double balance = newAccount.getBalance();
        System.out.printf("The new balance on this account is $%6.2f.\n", balance);
        //Testing getMonthlyInterest method and printing the value
        double monthlyInterest = newAccount.getMonthlyInterest();
        System.out.printf("The monthly interest accrued is $%4.2f per month.\n", monthlyInterest);
        
        //Testing toString method on the changed account
        String accountInfo = newAccount.toString();
        System.out.println(accountInfo);
        
        //Testing getBalance method on the cloned account and showing that it hasn't changed
        double cloneBalance = clone.getBalance();
        System.out.printf("\nThe cloned original balance is %6.2f.\n", cloneBalance);
        
        //Testing toString method on the cloned account and showing that it has all the first account's original values
        String clonedAccountInfo = clone.toString();
        System.out.println(clonedAccountInfo);
        
    }
}
