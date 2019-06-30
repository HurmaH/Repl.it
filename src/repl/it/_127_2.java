package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _127_2 {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    String[] words = str.split(", "); //[olive, fish, pursuit, old, warning, python, java, coffee, cat, ray]
	    String shortest = words[0];
	    
	    for(String s: words){ // given but it should be "words" instead of "shortest"
	      if(shortest.length()>s.length()){
	        shortest = s;
	      }
	    }
	    
	    //our code:
	    String newStr="";

	    for (String s: words) {
			if (s.length()==shortest.length() && !newStr.contains(s)) {
						newStr += s+", ";
			}
		}
		
	    String[] wordsNew = newStr.split(", ");
	    Arrays.sort(wordsNew);
	    System.out.println(Arrays.toString(wordsNew));
	    
	   
	  }

}
