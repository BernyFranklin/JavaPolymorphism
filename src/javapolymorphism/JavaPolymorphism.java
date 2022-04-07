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
        new Book(1176, "ULYSSES"               , "James Joyce"        , 1918, 32.95, 16 ),
        new Book(1252, "THE GREAT GATSBY"      , "F. Scott Fitzgerald", 1925, 13.95, 30 ),
        new Book(1376, "BRAVE NEW WORLD"       , "Aldous Huxley"      , 1931, 14.95, 28 ),
        new Book(1463, "TO THE LIGHTHOUSE"     , "Virginia Woolf"     , 1927, 36.95, 19 ),
        new Book(1545, "THE SOUND AND THE FURY", "William Faulkner"   , 1929, 17.95, 11 ),
        new Book(1605, "CATCH-22"              , "Joseph Heller"      , 1961, 38.95, 25 ),
        new Book(1824, "THE DEATH OF THE HEART", "Elizabeth Bowen"    , 1938, 26.95, 44 ),
        new Book(1873, "DARKNESS AT NOON"      , "Arthur Koestler"    , 1940, 39.95, 6 ),
        new Book(1909, "THE GRAPES OF WRATH"   , "John Steinbeck"     , 1939, 12.95, 32 ),
        new Book(1945, "1984"                  , "George Orwell"      , 1949, 24.95, 24 ),
        new Shirt(2443, "T-Shirt"    , "Guess"       , "M" , "Blue"  , 14.95, 23 ),
        new Shirt(2867, "Dress Shirt", "Ralph Lauren", "M" , "White" , 39.95, 5 ),
        new Shirt(2868, "Dress Shirt", "Ralph Lauren", "L" , "White" , 39.95, 4 ),
        new Shirt(2869, "Dress Shirt", "Ralph Lauren", "XL", "White" , 39.95, 1 ),
        new Shirt(2905, "Blouse"     , "Versace"     , "S" , "Yellow", 44.95, 6 ),
        new Shirt(2923, "Tank Top"   , "Zoned Out"   , "XL", "White" , 15.45, 2 ),
        new Pants(3666, "Jorts"    , "Dad Jeans", 30, 32, "Blue" , 29.95, 14 ),
        new Pants(3989, "Jeans"    , "Revtown"  , 40, 40, "Gray" , 39.95, 20 ),
        new Pants(3089, "Slacks"   , "Docker"   , 32, 34, "Black", 39.95, 10 ),
        new Pants(3990, "Jeans"    , "Revtown"  , 31, 31, "Blue" , 27.95, 15 ),
        new Pants(3201, "Work Pant", "Dickies"  , 41, 34, "Black", 19.95, 19 ),
        new Pants(3202, "Work Pant", "Dickies"  , 34, 34, "Blue" , 19.95, 19 ),
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
