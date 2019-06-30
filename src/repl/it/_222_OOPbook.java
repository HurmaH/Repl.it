package repl.it;

public class _222_OOPbook {
	
	public static void main(String[] args) {
//		addChapter ("Hello", 20);
//		addChapter ("How are you", 30);
//		addChapter ("Bye", 70);
	}
	String title;
	  String author; 
	  String tableOfContents="";
	  static int nextPage =1  ;
	  
	  public _222_OOPbook (String title, String author ) {
	    this.title= title;
	    this.author = author;
	  }
	  
	  public void  addChapter (String chapterTitle, int page) {
		    tableOfContents += "\n"+chapterTitle+"..."+nextPage;
		    nextPage += page;
	    
	  }
	  
	  public int getPages(){
	    return nextPage-1;
	  }
	  
	  public String getTableOfContents (){
	    return tableOfContents;
	  }
	  
	  public String toString(){
	    return title+"\n"+author;
	  }

}
