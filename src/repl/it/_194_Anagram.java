package repl.it;

import java.util.Arrays;

public class _194_Anagram {
/*
 * isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.
each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive
Examples:
isAnagram("listen", "Silent") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("star", "rats") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("java", "cava") ==> false
 */
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("java", "jiva"));//false
		System.out.println(isAnagram("earth", "heart"));//true
	}
	
	 public static boolean isAnagram(String word1, String word2) {
		
		word1 =  word1.toLowerCase().replace(" ", "");
		word2 =  word2.toLowerCase().replace(" ", "");
		
		if (word1.length()!=word2.length()) {
			return false;
		}
		
		for (int i=0; i<word1.length(); i++) {
			if (!(word2.contains(word1.charAt(i)+""))) {
				return false;
			}
		}
		return true;
		
//		char [] word1Chars = word1.toLowerCase().toCharArray();
//		char [] word2Chars = word2.toLowerCase().toCharArray();
//		
//		Arrays.sort(word1Chars);
//		Arrays.sort(word2Chars);
//		
//		return Arrays.equals(word1Chars, word2Chars);
		    
	 }

}
