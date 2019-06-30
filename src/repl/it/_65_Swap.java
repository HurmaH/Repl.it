package repl.it;

import java.util.Scanner;

public class _65_Swap {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    //WRITE YOUR CODE HERE
    
    System.out.print(word.charAt(word.length()-1)+word.substring(1,word.length()-1)+word.charAt(word.length()-1));
	}

}
