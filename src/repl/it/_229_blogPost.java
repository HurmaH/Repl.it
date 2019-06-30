package repl.it;

import java.util.ArrayList;

public class _229_blogPost {
	public String blogDb(ArrayList<String[]> r,String id)  {
	    int i = Integer.parseInt(id);
	         
	    return r.get(i-1)[1]+"\n"+r.get(i-1)[2];
	   
	  }
	  
	  public static void main(String[] args) {
		  _229_blogPost m = new _229_blogPost();
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"1","title 1","content"});
	    arr.add(new String[]{"2","title 2","content"});
	    arr.add(new String[]{"3","title 3","content3"});

	    String post = m.blogDb(arr,"3");
	    System.out.print(post);
	    //should output:
	    //title 3 
	    //content3
	   
	    
	  }//end main

}
