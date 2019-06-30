package repl.it;

import java.util.Scanner;

public class _74 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	    message= "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}" ;
	    phoneNumber = "From Number:[202-123-3456].";
	    System.out.println ("Sender: "+message.substring(message.indexOf("<")+1,message.indexOf(">")));
	    System.out.println ("Phone Number: " +message.substring(message.indexOf("[")+1,message.indexOf("]")));
	    System.out.println ("Message body: "+ message.substring(message.indexOf("{")+1,message.indexOf("}")));
	
	   
	    		
	}

}
