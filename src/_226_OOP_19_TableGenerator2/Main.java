package _226_OOP_19_TableGenerator2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		PrimeNumbersTable p = new PrimeNumbersTable();
		System.out.println(p.isPrime(2));//true

		System.out.println(Arrays.toString(p.generateTable(100, 5)));//[101, 103, 107, 109, 113]
		System.out.println(p.checkTable(2, new int[]{2, 7, 11}));//false
		
	}

}
