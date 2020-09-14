package lab1;

/**
 * The Item class is the abstract class that implements the Comparable interface.
 * @author sheshan
 * @version 1.0
 */
public abstract class Item implements Comparable<Item>{

	static int increment=0;		//Used as a counter of id
	int id;						//Unique identification of items 
	int price;					//Price of the items
	
	/**
	 * Class constructor used for increasing counter
	 */
	Item()
	{
		increment+=1;
		id=increment;
	}
	
	/**
	 * Abstract method of the class for displaying items
	 */
	abstract void display();
	
	/**
	 * compareTo() method of the Comparable interface is used to compare the current object with the specified object  
	 * if current object > specified object, returns positive value  
	 * if current object < specified object, returns negative value
	 * if current object = specified object, returns zero
	 * @param item
	 */
	public int compareTo(Item item)
	{
		if(price==item.price)
			return 0;
		else if(price>item.price)
			return 1;
		else 
			return -1;
	}
}
