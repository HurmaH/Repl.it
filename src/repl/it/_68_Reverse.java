package repl.it;

import java.util.Scanner;

public class _68_Reverse {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    String rev = "";
	    if (word.length()>5) {
	      System.out.print("Too long!");
	    } else if (word.length()<5) {
	      System.out.print("Too short!");
	    } else {
	      for (int i=word.length()-1; i>=0; i--) {
	        rev += word.charAt(i);
	      }
	    }
	    
	    System.out.print(rev);
	}

}
