/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgtolb;

/**
 *
 * @author deanchoi
 */
public class KgToLb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        double lb;
        System.out.printf("%s\t%s", "Kilograms", "Pounds");
        
        while (i < 200){
            lb = i * 2.2;
            System.out.printf("\n%d\t\t%6.2f", i, lb);
            i += 2;
        }
    }
    
}
