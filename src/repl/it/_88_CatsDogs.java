package repl.it;

import java.util.Scanner;

public class _88_CatsDogs {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    
	    int initial=0;
	                                    //012345
	    while (initial<=word.length()-3){//catdog
	      
	      if (word.substring(initial,initial+3).equals("dog")){
	        countOfDogs++;
	      }else if (word.substring(initial,initial+3).equals("cat")){
	        countOfCats++;
	      }
	      
	      initial++;
	    }
	    System.out.println(countOfDogs==countOfCats);
	    
	    scan.close();
	}

}
