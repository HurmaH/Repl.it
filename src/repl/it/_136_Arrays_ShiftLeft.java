package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _136_Arrays_ShiftLeft {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    
	    //WRITE YOUR CODE HERE
	    int [] tempArr = new int [size]; //new Array with size of old
	    	    
	    for ( int i=0; i<size-1; i++) {  
	      tempArr [i] = nums [i+1];
	    }
	    
	    tempArr[size-1]=nums[0];
	    System.out.println(Arrays.toString(tempArr));
	}

}
