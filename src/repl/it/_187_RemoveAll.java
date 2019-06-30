package repl.it;

import java.util.ArrayList;
import java.util.Arrays;

public class _187_RemoveAll {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

		removeAll(wordList,"hi");
	}
	
	public static void removeAll (ArrayList<String> wordList, String targetWord){
		   ArrayList <String> word= new ArrayList<>();
		    
		    for(String each: wordList){
		      
		      if(!each.equals(targetWord)){
		       word.add(each);
		      
		      }
		    }
		 System.out.println(word);
		
//		for(int i=0; i<wordList.size(); i++) {
//			if (wordList.get(i).equals(targetWord)) {
//				wordList.remove(i);
//		 i--;
//			}
//		}
//		
//		System.out.println(wordList);
		
//		ArrayList <String> newWords = new ArrayList <String>();
//		  
//		  for (int i=0; i<wordList.size(); i++) {
//		    if (!(wordList.get(i).equals(targetWord))){
//		      newWords.add(wordList.get(i));
//		    }
//		  }
//		  System.out.println(Arrays.toString(newWords.toArray()));
		  
   }  
}
