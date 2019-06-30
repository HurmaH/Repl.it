package repl.it;

import java.util.Scanner;

public class _144 {
	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {

		        arr[i]=inp.nextInt();
		    }
		    
		    _144 s = new _144();
		    s.plus_minus(arr);// object created when 
		    
		    s.plus_minus(arr);
		    //plus_minus(arr);
		  }//end main
	
	public static void plus_minus(int [] arr){
		int countPos=0;
		int countNeg=0;
		int countZer=0;
		// {1, -3, 4, 5}
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>0) {
				countPos++;
			}else if (arr[i]<0) {
				countNeg--;
			}else{
				countZer++;
			}
		}//en of for loop
		
		System.out.println("positives:"+countPos+", negatives:"+countNeg+", zeros:"+countZer);
	}
	
	 

}
