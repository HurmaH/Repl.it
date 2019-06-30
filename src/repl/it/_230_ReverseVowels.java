package repl.it;

public class _230_ReverseVowels{
	public static void main(String[] args) {
		System.out.println(reverseVowels("hell[o wo]rld"));
	}
	
	public static String reverseVowels(String str) {
		char [] strArr = str.toCharArray() ;
		String vowel= "aeiou";
		int j=strArr.length-1;
		
		for(int i=0; i<j; i++) {
			if (vowel.contains(strArr[i]+"")) {
				while (!vowel.contains(strArr[j]+"")) {
					j--;
				}
		     //swap
		    char temp = strArr[i];
			strArr[i]=strArr[j];
			strArr[j]=temp;
			j--;
			}
		}
		
		String strNew="";
		for(int k=0; k<strArr.length; k++) {
			strNew += strArr[k];
		}
		
		return strNew;
		
	}

}
