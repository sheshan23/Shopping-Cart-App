package lab1;

/**
 * The GiftCard class extends the Item class and inherits the properties of the super class with required modification
 * @author sheshan
 * @version 1.0
 */
public class GiftCard extends Item{

	String description;		//Varaible stores the description of the giftcard
	String colour;			//Variable stores the colour of the giftcard
	
	/**
	 * Constructer of the class used to assign the values of the price, description and colour
	 * @param price
	 * @param description
	 * @param colour
	 */
	GiftCard(int price, String description, String colour)
	{
		this.price = price;
		this.description = description;
		this.colour = colour;
	}
	
	/**
	 * display() method used to display the details of the giftcard  
	 */
	void display()
	{
		System.out.println("\nGiftCard :");
		System.out.println("Id\t\t\tPrice\t\t\tDescription\t\t\tColour");
		System.out.println(id+"\t\t\t"+price+"\t\t\t"+description+"\t\t\t"+colour);
	}
}
