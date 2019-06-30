package repl.it;

import java.util.Arrays;

public class _177_mergeArrays {
	
	public static int[] mergR(int[] a,int[] b) {
		                        //3      + 3
	    int [] merged = new int [a.length+b.length];
	         //  0,1,2
	    for (int i=0; i<a.length; i++) {
	      merged [i] = a[i]; //0,1,2
	    }
	    
	     for (int i=0; i<b.length; i++) {
	      merged [a.length+i] = b[i];
	    }
	    
	    
	   return merged;
	    
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
		  int [] a={1,2,3};
		  int [] b={4,5,6};
		  System.out.println(Arrays.toString(mergR (a, b)));
		  
	  }

}
