package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _127_ArraysPrintShortestWord2 {
	public static void main(String[] args) {

		    Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    	   
		    	    
		    String[] strArr=str.split(", ");
		    String shortest = "";
				
			int sL = strArr[0].length();

		    for (int i = 0; i <= strArr.length-1; i++) {
					if ( sL> strArr[i].length() ) {
						sL = strArr[i].length();
					}
			}
		    
		    for (int j=0; j<strArr.length; j++) {
						if (strArr[j].length()==sL && !shortest.contains(strArr[j])) {
							shortest =shortest+strArr[j]+", ";
						}
			}
			
		    System.out.println(Arrays.toString(shortest.split(", ")));
		       
//		    
//		    String [] arr = str.split (", ");
//		    String [] shortArr;
//		    String strShort = arr[0];
//		    String strShort2 ="";
//		    
//		    for (int i=0; i<arr.length; i++) { //to find length of smallest word
//		          if (arr[i].length()<strShort.length()) {
//		        	  strShort=arr[i];
//		     }
//		    }
//		   		     
//		    for (int i=0; i<arr.length; i++) {  //finidng equal length and add to string
//		          if (arr[i].length()==strShort.length() && !(strShort2.contains(arr[i]))) {
//		        	  strShort2 += arr[i]+", ";
//		          }
//		    }
//		    //System.out.println(shortStr);
//		    shortArr = strShort2.split(", ");
//		    
//		    Arrays.sort(shortArr);//sorting
//	
//		    System.out.println(Arrays.toString(shortArr));
//		    
		
	}
}
