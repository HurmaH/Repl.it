package repl.it;

import java.util.Scanner;

public class _23_PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		  
		  int areaCode = scan.nextInt();
		  int localNumber = scan.nextInt();
		  
		  String phoneNumber = "("+areaCode+")-"+localNumber;
		  System.out.println("Calling number "+phoneNumber);
	  }
}
