package repl.it;

import java.util.Scanner;

public class _108_Tringle {
	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str ="";
		
		
		for (i=0; i<n; i++ ) {
		  for (j=0; j<=i; j++) {
			  
			  System.out.print("* ");
			  
		  }
		  System.out.println();
		}
		
		
		
	}

}
