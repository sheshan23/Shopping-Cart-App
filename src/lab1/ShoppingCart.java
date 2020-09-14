package lab1;

/**
 * The ShoppingCart class includes the variables and methods used to store and view the items in the shopping cart 
 * @author sheshan
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
	
	List<Item> list = new ArrayList<Item>();		//ArrayList object is created and used for calling add() method of the list to store items in the cart  
	
	/**
	 * insert_inCart() method shows the operation of adding items to cart 
	 * @param item
	 */
	void insert_inCart(Item item)
	{
		list.add(item);
	}
	
	/**
	 * display_cart() method contains the functions which is sorting and displaying the list
	 */
	void display_cart()
	{
		System.out.println("\nItems in the Cart :");
		Collections.sort(list);		  /*As the Item class implements Comparable interface, list of the objects of the Item class are sorted automatically 
										by using Collections.sort() method and objects are sorted in the natural order of variable 'price' defined by 
										CompareTo method in Item class*/
		for(Item i1:list)					
		{  
			i1.display();								// to display the items added in the shopping cart, sorted by price
		}  
	}
}
