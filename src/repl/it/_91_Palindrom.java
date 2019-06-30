package repl.it;

import java.util.Scanner;

public class _91_Palindrom {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in); 
	    String word = scan.nextLine();//Race car
	    word = word.toLowerCase().replace(" ", ""); //word = racecar
	    //WRITE YOUR CODE HERE
	    
	    String original = word;
	    String reverse = "";
	    
	    //racecar
	    //0123456
	    for (int i=word.length()-1; i>=0; i--) {
	    	reverse = reverse + word.charAt(i);  //racecar
	    }
	    
	    if (original.equals(reverse)) {
	    	System.out.println(true);
	    }else {
	    	System.out.println(false);
	    }
	}

}
