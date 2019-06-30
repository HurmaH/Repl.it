package repl.it;

import java.util.ArrayList;

public class _190_AppendPositiveNum {
	public static void main(String[] args)
	{
		
	}
	//create your method below
	
	public static ArrayList<Integer> appendPosSum(ArrayList list){

		 ArrayList<Integer> x=new ArrayList<>();
		   
		  int sum=0;
		  for(int i =0;i<list.size();i++){
			  if((int)list.get(i)>0){
				  x.add((int)list.get(i));
				  sum=sum+(int)list.get(i);
		 }  
		}
		  x.add(sum);
		  return x; 
		  
	}

}
