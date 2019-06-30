package repl.it;

import java.util.ArrayList;

public class _198_AddArrayList {

	public static void main(String[] args) {
		
		 ArrayList<Boolean> test = new ArrayList<>();
	        test.add(false);
	        test.add(true);
	        test.add(true);

	        repeatAL(test);
	}
	
	public static void repeatAL(ArrayList<Boolean> b){
		
//		  n.addAll(boo);
//		  n.addAll(boo);
		b.addAll(b);

	
		}
}
