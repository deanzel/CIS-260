/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windchill;

import java.util.Scanner;
        
public class WindChill {

    
    public static void main(String[] args) {
        double windchill = 0;
        double tempout = 0;
        double windspeed = 0;
        boolean temprange = false;
        boolean windrange = false;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program calculates the Wind-Chill Index depending on the "
                + "temperature outside (Ta) and the wind speed (v).\nIt cannot be used for wind "
                + "speeds below 2 mph or temperatures below -58°F or above 41°F.");
        
        System.out.println("\nPlease enter the temperature ouside (°F) in that is not below -58°F or above 41°F:");
        while (!input.hasNextDouble() || !temprange){
            if (input.hasNextDouble()) {
                tempout = input.nextDouble();
                if (tempout < -58.0){
                    System.out.println("That temperature is below -58°F. Please reenter the temperature ouside that is not below -58°F or above 41°F: ");
                }
                else if (tempout > 41) {
                    System.out.println("That temperature is above 41°F. Please reenter the temperature ouside that is not below -58°F or above 41°F: ");
                }
                else {
                    temprange = true;
                    break;
                }
            }
            else {
                System.out.println("Not a correct input. Please reenter the temperature ouside that is not below -58°F or above 41°F: ");
                input.next();
            }
        }
        
        System.out.println("\nPlease enter the wind speed (in mph) that is not below 2mph: ");
        while (!input.hasNextDouble() || !windrange){
            if (input.hasNextDouble()) {
                windspeed = input.nextDouble();
                if (windspeed < 2 && windspeed > 0){
                    System.out.println("That wind speed is lower than 2 mph. Please reenter the wind speed (in mph) that is not below 2mph: ");
                }
                else if (windspeed < 0) {
                    System.out.println("The wind speed can't be negative. Please reenter the wind speed (in mph) that is not below 2mph: ");
                }
                else {
                    windrange = true;
                    break;
                }
            }
            else {
                System.out.println("Not a correct input. Please enter the wind speed (in mph) that is not below 2mph: ");
                input.next();
            }
        }
        
        if (temprange && windrange) {
            windchill = 35.74 + 0.6215 * tempout - 35.75 * Math.pow(windspeed, 0.16) + 0.4275 * tempout * Math.pow(windspeed, 0.16);
            
            System.out.printf("\nThe wind chill index is %f6", windchill);
        }
        
    }
    
}
