package lab1;

/**
 * This is the starting point of the program. It is the shopping cart UI where user can select the desire item and add it to the cart to buy.     
 * @author sheshan
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * The ShoppingCartApp class is the class containing the main method that initialize the program. 
 */
public class ShoppingCartApp {
	
/**
 * main() method is the very first method to run in the program
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p1,p2;				
		Item i1,i2,i3,i4,i5,i6;		
		
		ShoppingCart s1 = new ShoppingCart();		
		
		i1 = new Book(200,"core java","sheshan");
		i2 = new Book(300,"adv java","vinay");	
		i3 = new Book(150,"adv algo","sunny");
		i4 = new GiftCard(250,"30$ off","red");
		i5 = new GiftCard(100,"20$ off","green");
		i6 = new GiftCard(400,"350$ off","white");
		
		List<Item> ls= new ArrayList<Item>();
		ls.add(i1);
		ls.add(i2);
		ls.add(i3);
		ls.add(i4);
		ls.add(i5);
		ls.add(i6);
		
		Collections.sort(ls);		/*As the Item class implements Comparable interface, list of the objects of the Item class are sorted automatically 
										by using Collections.sort() method and objects are sorted in the natural order of variable 'price' defined by 
										CompareTo method in Item class*/
		
		System.out.println("Menu for Shoppinp"); 					
		System.out.println("1. Display Items and Add to Cart");
		System.out.println("2. Display Items in Shopping Cart");
		System.out.println("3. Exit");
		System.out.println("\nEnter Choice: ");
		
		Scanner s = new Scanner(System.in);
		p1= s.nextInt();										//user requested value
		
		while(p1!=3)
		{
			switch(p1)
			{
				case 1: System.out.println("\nList of Items(Sorted by Price) :");
						for(Item item:ls)
						{  
							item.display();						//method used to display items to user
						}  
						System.out.println("\nChoose item id to add in cart: or enter 0 to exit to main menu");
						p2= s.nextInt();
						while(p2!=0)
						{
							for(int i=0;i<Item.increment;i++)
							{
								if((ls.get(i).id)==p2)
								{
									s1.insert_inCart(ls.get(i));		//inserting items to cart using insert_inCart() method
									System.out.println("Item added");
									break;
								}
								else if(i==Item.increment-1)
								{
									System.out.println("Invalid Input");
								}
							}
							System.out.println("\nChoose another id or enter 0 to exit to main menu");
							p2=s.nextInt();
						}
						break;
						
				case 2: s1.display_cart(); 			// display cart items using display_cart() method
						break;
						
				default: System.out.println("Invalid Input");
			}
			System.out.println("\nMenu for Shoppinp");
			System.out.println("1. Display Items and Add to Cart");
			System.out.println("2. Display Items in Shopping Cart");
			System.out.println("3. Exit");
			System.out.println("\nEnter Choice: ");
			p1= s.nextInt();
		}
	System.out.println("Good Bye");					
	System.exit(0);								// system turn off
	}
}
