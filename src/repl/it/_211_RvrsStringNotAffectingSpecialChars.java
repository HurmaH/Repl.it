package repl.it;

public class _211_RvrsStringNotAffectingSpecialChars {
	
	public static String reverseLetters(String word){
		//TODO
		
//		1) Let input string be 'str[]' and length of string be 'n'
//	    2) l = 0, r = n-1
//	   3) While l is smaller than r, do following
//	    a) If str[l] is not an alphabetic character, do l++
//	    b) Else If str[r] is not an alphabetic character, do r--
//	    c) Else swap str[l] and str[r]
		
		
		String [] wordArr = word.split("");			
		String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int i = 0;
		int j = wordArr.length-1;
		while (i < j ) {
			if (!(abc.contains(wordArr[i]))) {
				i++;
			}else if (!(abc.contains(wordArr[i]))) {
				j--;
			}else {
					String temp = wordArr[i];
					wordArr[i] = wordArr[j];
					wordArr[j] = temp;
					i++;
					j--;
			}
		}
			
		
		word="";
		for (int k=0; k<wordArr.length; k++) {
			word += wordArr [k];
		}
		return word;
		
	}
	
	public static void main(String[] args) {
	    
	    String result = reverseLetters("..zxcv..d");
	    System.out.println(result);
	    
	    String result2 = reverseLetters("---abmkl.o-");
	    System.out.println(result2);	    
	    String result3 = reverseLetters("---abmkl.o-");
	    System.out.println(result3); //false
	  }

}
