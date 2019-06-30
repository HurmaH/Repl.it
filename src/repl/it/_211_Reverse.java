package repl.it;

public class _211_Reverse {
	public static void main(String[] args) {
		//https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/
		
		String word = "---abmkl.o-";
		char [] wordArr = word.toCharArray();			
		int i = 0;
		int j = wordArr.length-1;
		while (i < j ) {
			if (!(Character.isAlphabetic(wordArr[i]))) {
				i++;
			}else if (!(Character.isAlphabetic(wordArr[j]))) {
				j--;
			}else {
					char temp = wordArr[i];
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
        System.out.println(word);
	}

}
