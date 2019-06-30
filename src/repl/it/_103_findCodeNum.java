package repl.it;

import java.util.Scanner;

public class _103_findCodeNum {
	public static void main(String[] args) {
		  int count = 0;
		    Scanner scan = new Scanner(System.in);
		    String  str = scan.nextLine();
		    String target = "";
		    int strLen = str.length();
		    
		    for (char c='a'; c<='z'; c++) {
		      target="co"+c+"e";
		      int tgLen = target.length();
		      for (int i=0; i<strLen-tgLen; i++) {
		        if (str.substring(i,i+tgLen).equals(target)) {
		        count++;
		      }
		     }
		    }
		    
		    System.out.println(count);
	}
}
