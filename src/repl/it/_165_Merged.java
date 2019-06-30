package repl.it;

public class _165_Merged {
	public static void main(String[] args) {
		String newStr = mergeStrings(("hurmijj"), ("hello"));
		System.out.println(newStr);
	}

	public static String mergeStrings(String one, String two) {
	  
	    String merged="";
	    int i=0;
	    int j=0;
	    for (; i<one.length() && j<two.length(); i++, j++) {
	      merged += one.charAt(i)+""+two.charAt(j);
	    }
	    
	    return merged+one.substring(i)+two.substring(j);
	    
	}  

}
