package repl.it;

import java.util.Scanner;

public class _97_PrintLetters {
	  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    char c;
	    for (int i=start; i<=end; i++) {
	      System.out.print (c=(char)i);
	    }
	}

}
