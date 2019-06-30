package repl.it;

import java.util.Scanner;

public class _131_Arrays2DMatch {
	public static void main(String[] args) {
/*
 * Like in a match 3 game but not.

You get a 2d array and you need to find how many two matches there are.
and return the number(int) of matches you found.

For example : 1 and 2 are not a match, 2 and 2 are a match.
a match in this case is two numbers in a row that are equal .

for example:
 */
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++) {
	      for(int j=0 ;j<=cols-1;j++) {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rwos
	    
	    //your code here
	    
	    int matches = 0;
			
	    for(int i=0 ;i<rows-1;i++) { //looping through rows
		    int count =0;  
	    	for(int j=0 ;j<arr[i].length;j++) {//looping through each element of throug
		    	  for (	int e=0; e<arr[i].length; e++) {//looping through same to compare
		    		  if (arr[i][j] == arr[i][e] ) {
		    			  count ++;
		    		  }
		    		  if (count>=3) { 
		    			  matches++;
		    		  }
		    	  }
		      }//end for cols
		    }//end for rwos	
		
	    
	    
	    System.out.print("matches: "+matches);
	}

}
