package repl.it;

import java.util.Scanner;

public class _83_Party {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String guest="";
		String anotherGuest="";
	    String ans="";
	    
	          
	     do {
	      System.out.println("Please enter guest name:");
	      anotherGuest=input.next();
	      
	      guest += anotherGuest+", ";
	      
	      System.out.println("Do you want to enter new guest name:");
	      ans = input.next();
	      
	      	    
	     }while(ans.equals("yes"));
	    
	   
	    System.out.println ("Guest's list: "+guest.substring(0,guest.length()-2));
		
	}

}
