package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _128_Arrays_MakeLast {
	public static void main(String[] args) {
		/*
		 * Given an int array, print a new array with double the length 
		 * where its last element is the same as the original array, 
		 * and all the other elements are 0. 
		 * The original array will be length 1 or more. 
		 * Note: by default, a new int array contains all 0's.
		 */
		
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			}
		//WRITE YOUR CODE HERE
			
		int [] nums2 = new int [2*nums.length];
		nums2 [nums2.length-1] = nums[nums.length-1];
		System.out.println(Arrays.toString(nums2));
	}

}
