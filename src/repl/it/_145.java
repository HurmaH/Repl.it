package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _145 {
	public static void main(String[] args) {
	   
	  //person("jon,doe,30");
		//splitting string : making String array from String
		String str= "abc def gh";   
		String [] strArr = str.split("");
		System.out.println(Arrays.toString(strArr));
		//String [] strArr ={abc, def, gh}
		
		Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	
	//person("jon,doe,30");
	//splitting string : making String array from String
	//String str= "abc def gh";   
	//String [] strArr = str.split(" ");
	//String [] strArr ={abc, def, gh}
	
	//person("jon,doe,30");jon|doe|30
	public static void person(String info){
		String [] person = info.split(","); //jon,doe,30
		
		System.out.println("person name: "+person[0]+" last name: "+person[1]+" age: ");
	}

}
