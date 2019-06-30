package repl.it;

import java.util.Scanner;

public class _153_CheckNumberPalindrome {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
	}
		  
     public static void isPalindrome(int num){
	 //WRITE YOUR CODE HERE
    	 int original = num;
    	 int reversed = 0;
    	 while (num>0) {
    		 
    		 reversed = reversed*10+num%10;
    		 num /=10;
    	 }
		 
    	 System.out.println((original==reversed) ? true:false);
		    
	}

}
