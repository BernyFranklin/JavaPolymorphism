/*
 * JavaPolymorphism Version#1.0
 * Frank Bernal
 * CIS 084 Java Programming
 * Input: Items selected for purchase
 * Output: Shopping cart list, total
 * 7 Apr 2022
 */

package javapolymorphism;

import java.util.Scanner;                  // Used to read keyboard input
import java.util.InputMismatchException;   // Used for bad input

// Start JavaPolymorphism
public class JavaPolymorphism {

    // Array for items in shopping cart
    private static Item[] shoppingCart = new Item[10];
    // Counter for total items in cart
    private static int shoppingCartCount = 0;
    
    // Array for inventory
    private static final Item[] ITEM_LIST = {
        new Book(1176, "ULYSSES", "James Joyce", 1918, 32.95, 16 ),
        new Shirt(2443, "T-Shirt", "Guess", "M", "Blue", 14.95, 23 ),
        new Pants(666, "Jorts", "Dad Jeans", 30, 32, "Blue", 29.95, 14 ),
    };   // End of ITEM_LIST
    
    // Start Main
    public static void main(String[] args) {
        // Create stdin object to use the keyboard
        for (int i=0; i < ITEM_LIST.length; i++){
        System.out.println(ITEM_LIST[i].toString());
        System.out.println();
        }
        
    }   // End main
    
}   // End JavaPolymorphism
