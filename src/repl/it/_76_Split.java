package repl.it;

import java.util.Scanner;

public class _76_Split {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    
	    int lastIdx= sentence.length()-1;
	    
	    while (lastIdx>=0) {
	    	System.out.print(sentence.charAt(lastIdx)+"");
	    	lastIdx--;
	    }
	    
	    
	}

}
