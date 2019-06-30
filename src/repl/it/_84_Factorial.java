package repl.it;

import java.util.Scanner;

public class _84_Factorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int num = 16;
	    int initial = 1;
	    int product = 1; 
	    
	    while (initial<=num) {
	      product *= initial;
	      initial++;
	    }
	    
	    System.out.println(product);
	}

}
