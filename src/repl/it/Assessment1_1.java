package repl.it;

import java.util.Scanner;

public class Assessment1_1 {
	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
	    int num1 = s.nextInt();
	    int num2 = s.nextInt();
	    int num3 = s.nextInt();
	    //your code here

	  if (num1>num2 && num1>num3) {
	    System.out.println ("n1 is bigger");
	  }else if (num2>num1 && num2>num3) {
	    System.out.println ("n2 is bigger");
	  }else {
	    System.out.println ("n3 is bigger");
	  }

//		double weight = 0;
//	    double cal = 0;
//	    Scanner scan = new Scanner(System.in);
//	    System.out.println("Enter weight in pounds:");
//	    
//	    weight = scan.nextDouble();
//	    
//	    double wKG=weight/2.2;
//	    
//	    cal =  0.0175 * (10*30+8*30+360) * wKG;
//		System.out.println("Calories Burned: "+(int)cal);
//		
		
		//1.1Print Hashtag
			int k = 1;
      	for (int i=k; i<(k+49); i++ ) {
      		System.out.print("#");
      	}
		
		
		
		
	}

}
