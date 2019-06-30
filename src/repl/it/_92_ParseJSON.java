package repl.it;

import java.util.Scanner;

public class _92_ParseJSON {
	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		
		System.out.println(json);
		int iFirst = json.indexOf("firstName");
		int iLast = json.indexOf("lastName");
		int iRole = json.indexOf("role");
		System.out.println(iFirst);
		System.out.println(iLast);
		System.out.println(iRole);
		
		String fName = json.substring(iFirst+13, iLast-4);
		String lName = json.substring(iLast+12, iRole-4);
		
		System.out.println ("First name: "+fName);
		System.out.println ( "Last name: "+lName);
	}

}
