package repl.it;

import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		

		   Scanner scan = new Scanner (System.in);
		   String split;
		   int numOfPeople;
		   double checkAmount,   totalTip, totalPerPerson; 
		   double tipPercent =0.0;
		   double totalPay=0.0;
		   double tipPerPerson=0.0;
		   String serviceQuality, 
		   Stringand;
		   
		   
		   System.out.println ("Split: ");
		   split = scan.nextLine();
		   
		   System.out.println ("Number of people:");
		   numOfPeople = scan.nextInt();
		   
		   System.out.println ("Check amount:");
		   checkAmount = scan.nextDouble();
		   
		   System.out.println ("Service Quality:");
		   serviceQuality = scan.next();
		   
		   switch (serviceQuality) {
		     case "Poor":
		       tipPercent = 0.05;
		       break;
		       
		    case "Fair":
		       tipPercent = 0.10;
		       break;
		       
		    case "Good":
		       tipPercent = 0.15;
		       break;
		       
		    case "Great":
		       tipPercent = 0.20;
		       break;
		       
		    case "Excellent":
		       tipPercent = 0.25;
		       break;
		   }
		   
		   
		   totalTip = checkAmount*tipPercent;
		   totalPay = checkAmount+totalTip;
		   totalPerPerson=totalPay/numOfPeople;
		   tipPerPerson = totalTip/numOfPeople;
		   
		   String and ="&";
		   System.out.println("Number of people entered: ");
		   System.out.println("Total to pay: "+totalPay);
		   System.out.println("Total tip: " +totalTip);
		   System.out.println("Total per person: "+totalPerPerson);
		   System.out.println("Tip per person: "+tipPerPerson);
		   
	}

}
