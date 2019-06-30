package repl.it;

import java.util.Scanner;

public class _87_CountJava {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    
	    int initial = 0;
	    int count = 0;
	    
	    while(initial<=word.length()-4){
	      if (word.substring (initial,initial+4).equals ("java")) {
	        count++;
	      }
	      initial++;
	    }
	    
	    System.out.println (count);
	    
	}

}
