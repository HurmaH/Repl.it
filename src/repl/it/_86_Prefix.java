package repl.it;

import java.util.Scanner;

public class _86_Prefix {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int n = scan.nextInt();
		    boolean appear=false;
		    int initial = 0;
		    
		    while (initial <str.length()-n){
		      initial+=n;
		      if (str.substring(0,n).equals(str.substring(initial,initial+n))){
		        appear=true;
		      }
		    }
		    
		    System.out.println(appear);
		
	}

}
