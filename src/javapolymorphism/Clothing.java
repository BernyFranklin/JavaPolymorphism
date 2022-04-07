/*
 * This is subclass Clothing of class Item
 * 
 */
package javapolymorphism;

// Start clothing
public class Clothing extends Item {
    // Pribvate data members
    private String type;
    private String brand;
    private String color;
    
    // Getters
    public String getType()  { return type; }
    public String getBrand() { return brand; }
    public String getColor() { return color; }
    
    // Setters
    public String setType(String type) {
        this.type = type;
        return this.type;
    }   // End of setType
    public String setBrand(String brand) {
        this.brand = brand;
        return this.brand;
    }   // End of setBrand
    public String setColor(String color) {
        this.color = color;
        return this.color;
    }   // End of setColor
    
    // Constructors
    
    // Default
    Clothing() {}
    // 3 args
    Clothing(String type, String brand, String color) {
        setType(type);
        setBrand(brand);
        setColor(color);
    }   // End of 3 args
    
}   // End of clothing
