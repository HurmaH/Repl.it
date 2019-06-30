package repl.it;

public class _167_CoverMe {
	 public static void main(String[] args) {
		    System.out.println(coverString("Certified Wooden Spoon", "o") ) ; //java [me]thods
		  }
		  
		  public static String coverString(String main, String coverME) {
		    
		    if (main.contains(coverME)) {
		    	return main.replaceAll(coverME, "["+coverME+"]");
		    }else {
		    	return "["+main+"]";
		    }
		    
		    
		  }

}
