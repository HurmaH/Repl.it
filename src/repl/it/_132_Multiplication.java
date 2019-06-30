package repl.it;

import java.util.Arrays;

public class _132_Multiplication {
	public static void main(String[] args) {
	    int [][] multiplicationTable = new int[10][10];
	    
	    //TODO: type your code below
	    
	    for (int rows = 1; rows<=10; rows++) {
	    	for (int cols =1; cols<=10; cols++) {
	    		multiplicationTable[rows-1][cols-1]=rows*cols;
	    	}
	    	
	    }
	    
	    //Do not modify below line it will be used to test your code. And 
	    //Can be used by you while developing your code
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
	}
}
