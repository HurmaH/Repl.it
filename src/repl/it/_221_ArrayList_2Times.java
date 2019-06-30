package repl.it;

import java.util.ArrayList;
import java.util.Arrays;

public class _221_ArrayList_2Times {
	public static void main(String[] args) {                      //0 1 2 3-->0 1 2 3 4 5 6 7
		ArrayList<Integer> newList =new ArrayList <>( Arrays.asList(1,3,5,7));
		System.out.println(twoTimes(newList));
	}
	
	//create your method below
	public static ArrayList<Integer> twoTimes (ArrayList <Integer> list) {
		  
		 ArrayList<Integer> newList = new ArrayList <Integer>(list);
		 //newList.addAll(list);
		 for (int i=1, j=0; i<list.size()*2; i+=2, j++) {
			 newList.add(i,list.get(j));
		 }
		  
		  return newList;
		}

}
