package repl.it;

import java.util.Scanner;

public class _137_2DdiogonalDifference {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//	    int[][] matrix0 = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
//	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
//	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
//	                            };
	     int matrix [][]= {{11,7,4},{1,5,7},{10,1,-12}};
	    
	    int result = 0;
	    int leftToRight = matrix[0][0]+matrix[1][1]+matrix[2][2];
	    System.out.println(leftToRight);
	    int rightToLeft = matrix[0][2]+matrix[1][1]+matrix[2][0];
	    System.out.println(rightToLeft);
	    result = leftToRight-rightToLeft;
	    System.out.println(result);
	    // FINAL PRINT
	    System.out.println(Math.abs(result));
		
		
	}

}
