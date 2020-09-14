package lab1;

/**
 * The Book class extends the Item class and inherits the properties of the super class with required modification 
 * @author sheshan
 * @version 1.0
 */
public class Book extends Item{
	
	String author_name;		//Varaible stores the author name of the book
	String title;			//Variable stores the title of the book
	
	/**
	 * Constructer of the class used to assign the values of the price, title and author name
	 * @param price
	 * @param title
	 * @param author_name
	 */
	Book(int price, String title, String author_name)
	{
		this.price = price;
		this.title = title;
		this.author_name = author_name;
	}
	
	/**
	 * display() method used to display the details of the book 
	 */
	void display()
	{
		System.out.println("\nBook :");
		System.out.println("Id\t\t\tPrice\t\t\tTitle\t\t\tAuthor_Name");
		System.out.println(id+"\t\t\t"+price+"\t\t\t"+title+"\t\t\t"+author_name);
	}
}
