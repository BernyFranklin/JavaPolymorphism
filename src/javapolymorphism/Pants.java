/*
 * This is subclass Pants to class Clothing
 * 
 */

package javapolymorphism;

// Start pants
public class Pants extends Clothing {
    // Private to data members
    private int length;
    private int waist;
    private static int pantsCount = 0;   // Keep track of pants made
    
    // Getters
    public int getLength() { return length; }
    public int getWaist()  { return waist; }
    
    // Setters
    public int setLength(int length) {
        if (length < 0) {
            this.length = 0;
            System.out.println ("Negative length not allowed...");
        }   // End of negative
        else
            this.length = length;
        return this.length;
    }   // End of setLength
    public int setWaist(int waist) {
        if (waist < 0) {
            this.waist = 0;
            System.out.println ("Negative waist not allowed...");
        }   // end of negative
        else
            this.waist = waist;
        return this.waist;
    }   // End of setWaist
    
    // Constructors
    
    // Default
    Pants() {
        pantsCount++;   // Keep track of how many pants
    }   // End of default
    
    // 8 args
    Pants(int itemID, String type, String brand, int length, 
          int waist, String color, double price, int inStock) {
        setItemID(itemID);     // Located in Item
        setType(type);         // Located in Clothing
        setBrand(brand);       // Located in Clothing
        setLength(length);
        setWaist(waist);
        setColor(color);       // Located in Clothing
        setPrice(price);       // Located in Item
        setInStock(inStock);   // Located in Item
        
        pantsCount++;          // Keep track of how many pants
        
    }   // End of 8 args
    
    @Override
    public String toString() {
        return String.format ("%d %6.2f %s, by %s - %d x %d",
            getItemID(), getPrice(), getType(), 
            getBrand(), getWaist(), getLength());
    }   // End of toString
    
}   // End pants
