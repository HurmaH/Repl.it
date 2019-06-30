package repl.it;
//https://www.geeksforgeeks.org/java-program-count-occurrences-character/
/*
 * Write a method countLetters that can count letters in a given string and return a new string in the given format:
number of letters + letter

For example:
input: countLetters("aaabbcccc");
output: "3a2b4c" 
Because, there are 3 a's, 2 b's and 4 c's
 */
public class _231_CountOccurance {
	public static void main(String[] args) {
		System.out.println(countLetters("aaabbcccc"));
	}
	
	public static String countLetters(String str){
	    //aaabbcccc
		String [] strArr = str.split("");
	    String output="";
	    int count=1;
	    
	    for (int i=1; i<strArr.length; i++) {
	    	if(strArr[i-1].equals(strArr[i])) {
	    		count++;
	    	}else {
	    		output +=count+strArr[i-1];
	    		count=1;
	    	}
	    	
	    	if (i==strArr.length-1) {
	    		output +=count+strArr[i-1];
	    	}
	    }
	    
	    return output;
	  }

}
