package repl.it;

import java.util.ArrayList;

public class _212_deliveryPizza {
	public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) 
	  {
	    // (3,3,1,2,6 / 3)
	    int allDelivery=0;
	    for (int i=0; i<deliveries.size(); i++) {
	    	allDelivery += deliveries.get(i);	 	    	
	    }
	    
	    if (allDelivery % max_fuel >0) {
	    	return allDelivery / max_fuel +1;
	    } else {
	    	return allDelivery / max_fuel;
	    }
	    
	    
	  }
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<Integer>  arr = new ArrayList<>();
	    arr.add(3);
	    arr.add(3);
	    arr.add(1);
	    arr.add(2);
	    arr.add(6);
	    int times = refuel_times(arr,3);
	    System.out.print(times);//should output 5
	   
	    
	  }//end main

}
