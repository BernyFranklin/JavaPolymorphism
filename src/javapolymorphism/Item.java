/*
 * This is the class Item
 * 
 */

package javapolymorphism;

// Start Item
public abstract class Item {
    
    // Protected variables to be accessed by children classes.
    protected int itemID;
    protected double price;
    protected int inStock;
    
    // Constructors
    Item(){}
    
    // Getters
    public int    getItemID()  { return itemID; }
    public double getPrice()   { return price; }
    public int    getInStock() { return inStock; }
    
    // Setters
    public int setItemID(int itemID) {
        this.itemID = itemID;
        return this.itemID;
    }   // End setItemID
    public double setPrice(double price) {
        this.price = price;
        return this.price;
    }   // End setPrice
    public int setInStock(int inStock) {
        this.inStock = inStock;
        return this.inStock;
    }   // End setInStock
    
}   // End Item
