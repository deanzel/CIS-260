/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbn10;

import java.util.Scanner;

public class ISBN10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 9 digit ISBN: ");
        
        String isbn = input.next();
        
        if (isbn.length() != 9){
            System.out.println("The length of the integer string is not 9");
            return;
        }
        else {
            int number = Integer.parseInt(isbn);
        }
        System.out.println("The ISBN is " + isbn + ".");
        
    }
    
}
