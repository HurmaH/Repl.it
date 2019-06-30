package repl.it;

public class _166_UniqueString {
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    
	    String strUniq="";
	    
	    for (int i=0; i<str.length(); i++) {       //Loop through each letter of string
	      if (!strUniq.contains(str.charAt(i)+"")) { //checks if strUniq does not contain that char, as .contains is string method char concatenated with empty string
	    	  strUniq += str.charAt(i);              //then added to strUniq 
	      }
	    }
	    
	    return strUniq;                              //return String
	  }

}
