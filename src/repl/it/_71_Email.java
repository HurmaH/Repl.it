package repl.it;

import java.util.Scanner;

public class _71_Email {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    int count = email.length();
		 
		 int a= email.indexOf("_");//4
		 int b= email.indexOf("@");//10
		 //viktoryakubovich@gmail.com
		if(email.contains("_")) {
			String firstName = email.substring(0 , a);
			String lastName = email.substring(a+1, b);
			String at = email.substring(b+1, count);

			System.out.println(lastName+"_"+firstName+"@"+at);
		}else{
			System.out.println(email);
		}
	    
//		int idxUnScore = email.indexOf('_');
//	    int idxAt = email.indexOf('@');
//	    
//	    if (email.contains("_")) {
//	      email = email.substring (idxUnScore+1,idxAt)+"_"
//	             +email.substring(0,idxUnScore)
//	             +email.substring(idxAt);
//	    }
//	    
//	    System.out.println(email);
//	    
//	    
//	    
//	    System.out.println ("First name: "+email.substring(0,1).toUpperCase()
//	                                      +email.substring(1,email.indexOf("_")));
//	    System.out.println ("Last name: "+email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()
//	                                     +email.substring(email.indexOf("_")+2,email.indexOf("@")));
//	    System.out.println ("Domain: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
//	    System.out.println ("Top-Level Domain: "+email.substring(email.indexOf(".")+1));
//	    
	}

}
