/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author Saleron
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word, reverse;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please type in something: ");
        word = input.nextLine();
        
        reverse = new StringBuffer(word).reverse().toString();
        
        System.out.println("After reverse: " + reverse);
    }
    
}
