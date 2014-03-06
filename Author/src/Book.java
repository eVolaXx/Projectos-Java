import java.util.Scanner;

public class Book {

    private String title;
    private Author author;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author author, double price) {
        this.title = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.title = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    public String toString() {
        return getName() + " by " + author;
    }
    public static Book inputBook(Scanner input) {
    	String title = null;
    	Author author = null;
    	double price = 0;
    	int amount = 0;
   
    	do {
    		System.out.println("Enter title:");
    		title = input.nextLine();
    	} while (title.equals(""));
    	author = Author.inputAuthor(input);
    	do {
    		System.out.println("price:");
    		price = input.nextDouble();
    	} while (price<0);
    	do {
    		System.out.println("stock:");
    		amount = input.nextInt();
    	} while (amount<0);
    	input.close();
    	return new Book(title,author,price,amount);
    }
}
    
    
    








    
    
    
    
    
    
    
