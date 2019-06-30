package repl.it;

import java.util.ArrayList;

public class _186_ArrayList_CombineAll {
	public static void main(String[] args) {
		ArrayList <String> list1 = new ArrayList <String>();
		list1.add("Hurmik");
		list1.add("Hurmik");
		list1.add("Hurmik");
		list1.add("Hurmik");
		list1.add("Hurmik");
		list1.add("Hurmik");
		
		
		ArrayList <String> list2 = new ArrayList <String>();
		list2.add("Hurmik2");
		list2.add("Hurmik2");
		list2.add("Hurmik2");
		list2.add("Hurmik2");
		list2.add("Hurmik2");
		list2.add("Hurmik2");
		
		System.out.println(combineAl (list1,list2));
	}

	public static ArrayList <String> combineAl (ArrayList<String> wordList1, ArrayList<String> wordList2){

		ArrayList <String> combined = new ArrayList <String> ();
		combined.addAll(wordList1);
		combined.addAll(wordList2);
		return combined;
//		 for (String each:wordList2) {
//			    wordList1.add (each);
//		     }
//				 
//			 return wordList1;
			 
//     return wordList1.addAll(wordList2);//boolean
//		  ArrayList <String> newList = new ArrayList <>();			 
//		  for (String each:wordList1) {
//		    newList.add (each);
//		  }
//		  
//		  for (String each:wordList2) {
//		    newList.add (each);
//		  }
		 
//		 return newList; 
  } 
}
