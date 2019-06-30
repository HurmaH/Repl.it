package repl.it;

public class _160_waterTax {
	
	public static void main(String[] args) {
		System.out.println(waterTax(150.5));
		
		System.out.println(waterTax(50));
		
		System.out.println(waterTax(55));
		
		System.out.println(waterTax(101));
	}
	
	public static double waterTax(double units)
	  {
		    
	    //your code here
	    
	  double bill;
	  
	  
	  if (units>150) {
		  bill=units * 0.90+100; 
	  }else if (units>100) {
		  bill=units * 0.90+50;
	  }else if (units>50) {
		  bill =units * 0.90;
	  }else {
		  bill = units * 0.60;
	  }
	  
//	  bill = (units>150) ? (units * 0.90+100):
//          (units>100) ? (units * 0.90+50) : 
//          (units>50)  ? (units * 0.90) : (units * 0.60);
	    
	   	    //end your code here
	    
	    
	    return bill;
	  }//end waterTax

	
	

}
