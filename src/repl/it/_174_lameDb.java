package repl.it;

import java.util.ArrayList;
import java.util.Arrays;

public class _174_lameDb {
	
	public static String lameDb(String db, String op,String id,String data)
	  {
	    String returns="";
	    ArrayList <String> dbList = new ArrayList <> (Arrays.asList(db.split("#")));
	    
	    if (op.equals("add")) {
	    	dbList.add(id+data);
	    }else if (op.equals("edit")) {
	    	dbList.set(Integer.parseInt(id)-1, id+data);
	    }else if (op.equals("delete")) {
	    	dbList.remove(Integer.parseInt(id)-1);
	    }
	    
	    for(int i=0; i<dbList.size(); i++) {
	    	returns += "#"+dbList.get(i);
	    }

	    return returns.substring(1);
	  }//end lameDb
	  
	  
	   public static void main(String[] args) 
	   {
	    
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
	   }

}
