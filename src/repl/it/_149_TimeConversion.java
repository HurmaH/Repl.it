package repl.it;

import java.util.Scanner;

public class _149_TimeConversion {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    timeConversion(scan.nextLine());
	  }
	  
	  public static void timeConversion(String s) {
	    /*
			 * Write your code here.
			 */
		  int num;
			 if (s.contains("AM")) {
			   System.out.println (s.substring(0,s.length()-2));
			 }
			 
			 else {
			   if (s.length() == 10) {
				  num = Integer.parseInt(s.substring(0,2)) + 12;
				  if (num==24){
			       System.out.println("00:00:00");
			      }else {
			       System.out.println(num+s.substring(2,s.length()-2));
			      } 
				  
			   }else {
				  num = Integer.parseInt(s.substring(0,1)) + 12; 
				  System.out.println(num+s.substring(1,s.length()-2));
			   }
			   
			   
			 }
	  }
}
