package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _119_Arrays_DecimalToBinary {
	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8]; // 
	    
	    int idx=7;
	    int count =1;
	    
	    while (decimal >0) { 
	    	binary[idx] = decimal%2;
	    	decimal = decimal/2;
	    	idx--;
	    	count++;
	    }
	    
	    while (idx-count>=0) {
	    	binary[idx-count]=0;
	    	count++;
	    }
	    
	
	    System.out.println(Arrays.toString(binary));
	}
}  
