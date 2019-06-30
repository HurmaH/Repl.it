package repl.it;

import java.util.Scanner;

public class _73_BuildARoute {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 String start = scan.next();
		 String end = scan.next();
		 
		 if(start.equals(end)) {
			 System.out.println("start/end(start or end variable!) found");
		 }
		 switch (start) {
		 case "A" :
			 switch (end) {
			 case "B":
				 System.out.println("right: B found");
				 break;
			 case "C":
				 System.out.println("right > down: C found");
				 break;
			 case "D":
				 System.out.println("right > down > left: D found");
				 break;
			 }
			 break;
		 
		 case "B" :
			 switch (end) {
			 case "C":
				 System.out.println("down: C found");
				 break;
			 case "D":
				 System.out.println("down > left: D found");
				 break;
			 case "A":
				 System.out.println("down > left > up: A found");
				 break;
			 }
			 break;
		
		 case "C":
			 switch (end) {
			 case "D":
				 System.out.println("left: D found");
				 break;
			 case "A":
				 System.out.println("left > up: A found");
				 break;
			 case "B":
				 System.out.println("left > up > right: B found");
				 break;
			 }
			 break;
		
		 case "D":
			 switch (end) {
			 case "A":
				 System.out.println("up: A found");
				 break;
			 case "B":
				 System.out.println("up > right: B found");
				 break;
			 case "C":
				 System.out.println("up > right > left: C found");
				 break;
			 }
			 break;
		}
		    
		    
	}

}
