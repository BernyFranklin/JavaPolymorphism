/*
 * This is subclass Shirt of class Clothing
 * 
 */
package javapolymorphism;

// Start shirt
public class Shirt extends Clothing {
    // Private data members
    private String size;
    private static int shirtCount = 0;   // Keep track of shirts made
    
    // Getters
    public String getSize() { return size; }
    
    // Setters
    public String setSize(String size) {
        this.size = size;
        return this.size;
    }   // End of setSize
    
    // Constructors
    
    // Default
    Shirt() {
        shirtCount++;   // Keep track of how many shirts
    }   // End of defualt
    // 7 args
    Shirt(int itemID, String type, String brand, String size, 
          String color, double price, int inStock) {
        setItemID(itemID);     // Located in Item
        setType(type);         // Located in Clothing
        setBrand(brand);       // Located in Clothing
        setSize(size);
        setColor(color);       // Located in Clothing
        setPrice(price);       // Located in Item
        setInStock(inStock);   // Located in Item
        
        // Update count
        shirtCount++;
        
    }   // End of 7 args
    
    @Override
    public String toString() {
        return String.format ("%d %6.2f %s, by %s - %s", 
                getItemID(), getPrice(), getType(), getBrand(), getSize());
    }   // End of toString
    
}   // End of shirt
