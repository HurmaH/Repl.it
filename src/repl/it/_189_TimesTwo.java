package repl.it;

import java.util.ArrayList;

public class _189_TimesTwo {
	
	public static void main(String[] args)
	{
		
	}
	//create your method below
	
	public static void timesTwo (ArrayList<Integer> nums) {
	  for (int i=0; i<nums.size(); i++){
	    nums.set(i, nums.get(i)*2);
	  }
	}

}
