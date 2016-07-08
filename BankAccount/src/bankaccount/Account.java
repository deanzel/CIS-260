/*
Summary Info: Programming Assignment #4 - Account class
Programmer: Dean Choi
Date due: 6/21/16
Date completed: 6/23/16
*/
package bankaccount;

import java.util.Date;

public class Account {
    private String id = "0";                //Account id variable (chose String because that's what I was taught to use previously)
    private double balance = 0;             //Account balance variable
    private double annualInterestRate = 0;  //Account Annual Interest Rate variable as a percent (%)
    private Date dateCreated;               //Date created variable calling java.util.Date class
    
    //Accessor and mutator methods for all data fields
    public String getId() {return this.id; }
    public void setId(String id) {this.id = id; }
    
    public double getBalance() {return this.balance; }
    public void setBalance(double balance) {this.balance = balance; }
    
    public double getAnnualInterestRate() {return this.annualInterestRate; }
    public void setAnnualInterestRate(double annualInterestRate) {this.annualInterestRate = annualInterestRate; }
    
    public Date getDateCreated() {return this.dateCreated; }
    //Added a set method for the dateCreated (primarily for the clone method)
    //but set it as a private method so it can only be accessed by a method within the class itself
    private void setDateCreated(Date dateCreated) {this.dateCreated = dateCreated; }
    
    /*Summary: No argument constructor; all datafields set to default values; dateCreated set as current time
    Parameters: none
    Return: none
    */
    public Account() {
        this.dateCreated = new Date();
    }
    
    /*Summary: Constructor that accepts 3 parameters: Account ID#, Account Balance, and
    Annual Interest rate; dateCreated set as current time
    Parameters: one String and 2 doubles corresponding to id, balance, and annualInterestRate
    Return: none
    */
    public Account(String id, double balance, double interest){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = interest;
        this.dateCreated = new Date();
    }
    
    /*Summary: method that returns the monthly interest on the account based on the annualInterestRate
    Parameters: none
    Return: double value that is interest acrued that each month
    */
    public double getMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate/12;

        return balance * monthlyInterestRate/100;
    }
    
    /*Summary: method that withdraws a certain amount from the bank account
    Parameters: one double variable for the ammount to withdraw/subtract from the account
    Return: none
    */
    public void withdraw(double ammount) {
        balance -= ammount;
    
    }
    
    /*Summary: method that deposits a certain amount from the bank account
    Parameters: one double variable for the ammount to deposit/add to the account
    Return: none
    */
    public void deposit(double ammount) {
        balance += ammount;
    
    }
    
    /*Summary: method that clones the account at that time to a completely new and different Account class object.
    Parameters: none
    Return: Account object that has all the same data fields as the original account at that time
    */
    public Account clone(){
        Account newAccount = new Account();
        newAccount.setId(id);
        newAccount.setBalance(balance);
        newAccount.setAnnualInterestRate(annualInterestRate);
        newAccount.setDateCreated(dateCreated);
        return newAccount;
        
    }
    
    /*Summary: method that returns a single string that includes the ID#, Balance and date created of the account
    Parameters: none
    Return: one string variable that includes the Account's ID#, Balance and date created in the format below
    */
    public String toString(){
        return "ID#: " + id + "; balance of $" + String.format("%6.2f", balance) + "; created on " + dateCreated.toString();

    }
}
