package repl.it;

public class _193_MethodPallindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome ("Nurses Run"));
	}
	
	public static boolean isPalindrome(String check) {
	    
	    check = check.toLowerCase().replace(" ","");
	    System.out.println(check);
	    String rev="";
	    for (int i=check.length()-1;i>=0; i--){
	      rev += check.charAt(i);
	    }
	    
	    return check.equals(rev);
	    
	  }

}
