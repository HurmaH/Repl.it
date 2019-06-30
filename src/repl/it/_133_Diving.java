package repl.it;

import java.util.Scanner;

public class _133_Diving {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    float[] score = new float[7];
	    //WRITE YOUR CODE HERE
	     
	    for (int i=0; i<score.length; i++) {
	      System.out.println ("Enter score for judge "+(i+1)+":");
	      score [i] = input.nextFloat();	      
	    }
	    
	    float min = score[0];
	    float max = score[0];
	    float sum = 0;
	    
	    for (int i=0; i<score.length; i++) {
	    	if (score[i]<min) {
	    		min = score[i];
	    	}
	    	
	    	if (score[i]>max) {
	    		max = score[i];
	    	}
	    }
	    
	    for (int i=0; i<score.length; i++) {
	    	sum += score[i];
	    }
	    
	    System.out.println("Enter difficulty:");
	    float difficulty = input.nextFloat();
	    
	    sum =sum - max-min;
	    float total = (sum*difficulty);
	    
	    // FINAL OUTPUT
	    System.out.println("Total: "+total);
	}

}
