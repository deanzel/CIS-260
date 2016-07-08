/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double weight = 0;
        double height = 0;
        double bmi = 0;
        boolean wrange = false;
        boolean hrange = false;
        
        System.out.println("This program calculates your BMI and obessity level "
                + "for a person above 20 years old from your height and weight.");
        
        System.out.println("Please enter your weight in pounds: ");
        while (!input.hasNextDouble() || !wrange){
            if (input.hasNextDouble()){
                weight = input.nextDouble();
                if (weight < 0) {
                    System.out.println("Your weight must be greater than 0. Please reenter your weight in pounds: ");
                }
                else {
                    wrange = true;
                    break;
                }
            }
            else {
            System.out.println("That is not a proper weight value. Please reenter your weight in pounds: ");
            input.next();
            }
        }
        
        System.out.println("Please enter your height in inches: ");
        while (!input.hasNextDouble() || !hrange){
            if (input.hasNextDouble()){
                height = input.nextDouble();
                if (height < 0) {
                    System.out.println("Your height must be greater than 0. Please reenter your height in inches: ");
                }
                else {
                    wrange = true;
                    break;
                }
            }
            else {
            System.out.println("That is not a proper height value. Please reenter your height in inches: ");
            input.next();
            }
        }
        
        bmi = weight * 0.45359237 / Math.pow(height * 0.0254, 2);
        
        if (bmi < 18.5){
            System.out.printf("\nYou are underweight with a BMI of %6f.", bmi);
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.printf("\nYou are of normal weight with a BMI of %6f.", bmi);
        }
        else if (bmi >= 25 && bmi < 30){
            System.out.printf("\nYou are overweight with a BMI of %6f.", bmi);
        }
        else {
            System.out.printf("\nYou are obese with a BMI of %6f.", bmi);
        }
    }
    
}
