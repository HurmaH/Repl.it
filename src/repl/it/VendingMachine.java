package repl.it;
import java.util.*;

public class VendingMachine{
  public static void main(String[] args) {
    //ENTER CODE HERE

	    Scanner scan = new Scanner (System.in);
	    
	    int itemPrice;
	    int quarters, dimes, nickels;
	    
	    System.out.println ("Enter price in cents");
	    itemPrice = scan.nextInt();
	    
	    quarters = (100-itemPrice)/25;
	    dimes = ((100-itemPrice)%25)/10;
	    nickels = (((100-itemPrice)%25)%10)/5;
	    
	  if (itemPrice<25 || itemPrice>100 || itemPrice % 5 != 0) {
	    System.out.println ("Invalid price!");
	  } else {
	    System.out.println ("Your change is "+quarters+" quarters, "
	                        +dimes+" dimes, and "+nickels+" nickels.");
	    }
  }
}
