package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _148 {
	//method input: add_to_r(new int{1,5,77,8}  ,2)

//	outputs (int array):
//	[1, 5, 77, 8, 2]
	//Array is fixed size
	
	 public static void add_to_r(int[] r,int n) 
		{//create new array with one more position.
		 //r = {1, 5, 7, 9}
		 //rNew= {0, 0, 0, 0, 0}
		 
		 int [] rNew = new int [r.length+1];
		     // index 0, 1, 2, 3 
		 for (int i=0; i<r.length; i++) {
			 rNew[i] = r[i];
		 }
		//rNew= {1, 5, 7, 9, 0}
		//index :0, 1, 2, 3, 4
		//length:1, 2 ,3, 4, 5
		 
		 rNew[rNew.length-1] = n;
		 System.out.println(Arrays.toString(rNew));
		 
		 
		
     }
	  
	 
	  public static void main(String[] args) {
//	    Scanner inp = new Scanner(System.in);
//	    int size = inp.nextInt(),n = inp.nextInt();
//	    int[] arr = new int[size];
//	    for(int i=0 ;i<=size-1;i++)//0,1, 2, 3
//	    {
//	        arr[i]=inp.nextInt();
//	    }
	    
	    int [] arr = {1,5,77,8};
	    int n = 5;
	    add_to_r(arr, n);// {1, 5, 77, 8, 5}
	    
	    //arr[0]=7;
	    //arr[1]=9;
	    //arr[2]=1;
	    //arr[3]=5;
	    
	     add_to_r(arr, n);
	     //add_to_r(new int{1,5,77,8}  ,2);
	   
	    
	  }

}
