/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticeq;

import java.util.Scanner;

/**
 *
 * @author deanchoi
 */
public class QuadraticEq {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program calculates the roots of a quadratic "
                + "formula where ax^2 + bx + c = 0.");
        System.out.println("Enter the value for a: ");
        double a = input.nextDouble();
        
        System.out.println("Enter the value for b: ");
        double b = input.nextDouble();
        
        System.out.println("Enter the value for c: ");
        double c = input.nextDouble();
        
        double discriminant = Math.pow(b,2) - 4*a*c;
        
        if (discriminant > 0) {
            double root1 = (-b + Math.pow(discriminant, 0.5))/(2*a);
            double root2 = (-b - Math.pow(discriminant, 0.5))/(2*a);
            System.out.println("This quadratic has 2 roots.");
            System.out.println("r1 = " + root1);
            System.out.println("r2 = " + root2);
            return;
        }
        
        if (discriminant == 0){
            double root = (-b + Math.pow(discriminant, 0.5))/(2*a);
            System.out.println("This quadratic has only 1 root.");
            System.out.println("root = " + root);
            return;
        }
        
        if (discriminant < 0){
            System.out.println("This quadratic has no root solutions because its "
                    + "discriminant is negative.");
            return;
        }
        
        
    }
    
}
