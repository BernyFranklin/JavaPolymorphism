/*
 * This is subclass Book of class Item
 * 
 */
package javapolymorphism;

// Start Book
public class Book extends Item {
    
    // Private data members
    private static final double MAX_BOOK_PRICE = 100.00;   // Keep price lowish
    private String title;
    private String author;
    private int date;
    private static int bookCount = 0;   // Keep track of how many books created
    
    // Default constructor
    Book () {
        bookCount++;   // Keep track of total books
    };   // End of default
    
    // Constructor with 5 args
    Book(int itemID, String title, String author, 
         int date  , double price, int inStock) {
        setItemID(itemID);     // Code in class Item
        setTitle(title);
        setAuthor(author);
        setDate(date);
        setPrice(price);       // Code in class Item
        setInStock(inStock);   // Code in class Item
        
        // Update counter
        bookCount++;
        
    }   // End of 5 args
    
    // Getters
    public String getTitle ()        { return title; }
    public String getAuthor ()       { return author; }
    public int    getDate()          { return date; }
    public static int getBookCount() { return bookCount; }
    
    // Setters
    public String setTitle(String t)  {title = t; return title; }
    public String setAuthor(String a) {author = a; return author; }
    public int    setDate(int d)      {date = d; return date; }
    
    @Override
    public double setPrice(double price) {
        if (price < 0) {
            this.price = 0.00;
            System.out.println ("Negative price not allowed...");
        }   // End of negative
        else if (price > MAX_BOOK_PRICE) {
            this.price = MAX_BOOK_PRICE;
            System.out.println ("Price is higher than maximum price...");
        }   // End of too high
        else   // Price valid
            this.price = price;
        
        return this.price;
    }   // End of setPrice()
    
    @Override
    public String toString() {
        return String.format ("%d %6.2f %s, by %s", 
                getItemID(), getPrice(), getTitle(), getAuthor());
    }   // End of toString()
};   // End of Book
