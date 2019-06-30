package repl.it;

import java.util.Scanner;

public class _100_GreenTicket {
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

		    int prize = 0;
		    int a = scan.nextInt();//a==b, a==c, a==d
		    int b = scan.nextInt();//b==c, b==d, b==a
		    int c = scan.nextInt();//c==d, c==a, c==b
		    int d = scan.nextInt();//d==a, d==b, d==c
		                           //a==b, a==c, a==d, b==c, b==d, c==d
		    
		    int maxSame=0;
		    int same=0;
		    int compare =1;
		    int last =20; 
		    
		    while(compare<last) {
		      
		    	same=0;
		      if (a==compare) {
		    	same++;
		      }
		      if (b==compare) {
		    	same++;
		      }
		      if (c==compare) {
		    	same++;
		      }
		      if (d==compare) {
		        same++;
		      }
		      
		      if(same>maxSame) {
		    	 maxSame=same;
		    	}
		      compare++;
		    }
		    System.out.println ((maxSame-1)*10);
		    
//		    for (int i=0; i<20; i++ ){
//		    	same=0;
//			      if (a==num) {
//			    	same++;
//			      }
//			      if (b==num) {
//			    	same++;
//			      }
//			      if (c==num) {
//			    	same++;
//			      }
//			      if (d==num) {
//			        same++;
//			      }
//			      
//			      if(maxSame>same) {
//			    	  same=maxSame;
//		    	
//		      }
		    
		      
  
		      
	}

}
