package repl.it;

import java.util.Arrays;

public class assessment {
	
	//public   static   void  Main(String[  ]  args)  {                }
	 //public  static  void   main ( String[   ]    arr )  {                  }
	 //public  void  main  ( String( ) args ) {                 }
	 
	 //static void  main ( String[ ]    args)   {            } 
	
	public static void main(String[] args) {
		//
		boolean   bValue =  9 > 10  && 10 > 9; 

		System.out.println( bValue ); 
		
		long  num  =   9L;
		float  num1  =  9F;
		
		double  num2  =  9L;
		
		//byte  num3 = 9B;
		
		int  num4 =  '9';
		
		 int[ ]  arr = { 1,  2,  3,  4,  5 };

         arr[0]  = arr[ arr.length-1];

        arr[ arr.length-1]  = arr[0];

        System.out.println( Arrays.toString( arr) );
        
        
        String str = new String("Java");
        String str1 = "Java";
        // insert code here .  Line1
        //String str2 = str1;
        //String str2 = new String(str1);
        //String str2 = "java";
        String str2 = "Java";
        System.out.print(str1 == str2);
		
	}
}
