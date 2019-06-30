package repl.it;

import java.util.Scanner;

public class _90_ParseHTML {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    
	    if (html.contains("<html>")) {
	      int id = html.indexOf("id");
	      int firstQuote = html.indexOf('"', id);
	      int secondQuote = html.indexOf('"', firstQuote+1);
	        System.out.println(html.substring(firstQuote+1,secondQuote));
	    }else {
	      System.out.println("Invalid input!");
	    }
	    
	    
	}

}
