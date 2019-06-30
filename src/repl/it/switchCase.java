package repl.it;
import java.util.Scanner;

public class switchCase {
  
	public static void main(String[] args) {
    
	  //DO NOT CHANGE
    char response = 'a';
    //WRITE YOUR CODE HERE 
    System.out.println ("Enter command:");
    Scanner scan = new Scanner (System.in);
    
    
    response = scan.next().charAt(0);

		switch (response) 
		{
		  case 'y': 
		    System.out.println("Your request is being processed"); 
		    break;
		  case 'n':
		    System.out.println("Thank you anyway for your consideration"); 
		    break;
		  case 'h':
		    System.out.println("Sorry, no help is currently available"); 
		    break;
		  default:
		    System.out.println("Sorry, no help is currently available"); 
		    break;
		 }
  }
}
