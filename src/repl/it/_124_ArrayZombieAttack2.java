package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _124_ArrayZombieAttack2 {
	 public static void main(String[] args) {
//		 Scanner input = new Scanner(System.in);
//		 int[] inhabitants = new int[8];
//		 for(int i=0; i<inhabitants.length; i++) {
//		      inhabitants[i] = input.nextInt();
//		 }
		 
		 int[] inhabitants = {3,6,0,4,3,2,7,0};
//		 int[] inhabitants = {10,0,20,4,0,1,6,0};
		 //TODO. Write you code below this line.
		 
		 int sum=0;
		 int day = 0;
		 int checkZero = 0;
		 int len = inhabitants.length;
		 // 6 0 7 0 8 0 9 0 
		 // 3 0 3 0 4 0 4 0
		 do {
			boolean [] isDivided = new boolean [len];
			
			System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
		  				
			sum =0;
			for (int i=0; i<len; i++) {//to divide each element
		   		
				if (i==0 && inhabitants[i]==0) {      //checking value of element and position idx=0
					checkZero=inhabitants[i+1];
					inhabitants[i+1] /=2;
					isDivided [i+1]=true;
					if (inhabitants[i+1]==0 && checkZero>0) { i++; }
				}
				else if (i==len-1 && inhabitants[i]==0 ) {//idx=len-1
					if (isDivided[i-1] == false) {
						inhabitants[i-1] /=2;
					}
				}
				else if (inhabitants[i]==0) { // 1<=idx<=len-1
					checkZero=inhabitants[i+1];
					if (isDivided[i-1] == false) {
						inhabitants[i-1] /=2;
					}
					inhabitants[i+1] /=2;
					isDivided [i+1]=true;
					if (inhabitants[i+1]==0 && checkZero>0) { i++; }
				}				
		   }
			
			day++; //increase day end of the do while loop
			
			for (int i=0; i<len; i++) {
				sum+=inhabitants[i];   //find sum of each element after each loop				
			}
			
			if (sum == 0) {
				System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
			}
			
		 }while (sum !=0);
		 
		 System.out.println("---- EXTINCT ----");
	 }
}
