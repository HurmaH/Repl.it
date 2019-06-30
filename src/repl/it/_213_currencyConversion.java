package repl.it;

public class _213_currencyConversion {
	
	 public static  double convertC(String[][] money,String[][] convertionRate) 
	  {
		 if (money[0][1].equals(convertionRate[0][1])) {
		     return (Double.parseDouble(money[0][1])*Double.parseDouble(convertionRate[0][1])+
	                 Double.parseDouble(money[1][1])*Double.parseDouble(convertionRate[1][1]));
		 }else {
			 return (Double.parseDouble(money[0][1])*Double.parseDouble(convertionRate[0][0])+
	                 Double.parseDouble(money[1][1])*Double.parseDouble(convertionRate[1][0]));
		 }
			 
	  
	  }
	  
	    public static void main(String[] args) 
	   {
	     
	     
	     
	     String[][] test_money =
	     {
	       {"mark","5"},
	       {"shekel","30.5"},
	     };
	     
	     String[][] test_convert=
	     {
	       {"mark","1"},
	       {"shekel","0.5"},
	     };
	     
	    
         double res = convertC(test_money,test_convert);
	     System.out.print(res);
	     
	   }

}
