package _227_OOP20_battleship;

public class Board {
	 private String[][] boardR;//board array
	  private boolean destroyed;
	  private String[] shipTypes = new String[]{"s","m","d","c"};
	  
	  public Board(String[][] br) {
	   this.boardR = br;
	  }//end constructor
	  	
	  
    public String[][] getBoardR(){return boardR;}
	
    
  	public boolean hit(int row,int column) {
  		
  		if (row>boardR.length-1 || column>boardR[row].length-1 ) {
  			return false;
  		}
  		for (String each : shipTypes) {
		   if (boardR[row][column].equals(each)) {
			   boardR[row][column]="h";
			   return true;
		   }else if(boardR[row][column].equals("w")) {
			   boardR[row][column]="~";
			   return false;
		   }
	   }
	   
	   return false;
	   
	  }//end hit
	  
	
	public boolean isDestroyed(){
		  for (int i=0; i<boardR.length; i++) {//rows
			  for (int j=0; j<boardR[i].length; j++) {//columns
				  for (String each : shipTypes) {     //shipTypes
					  if (boardR[i][j].equals(each)) {
						  return false;
					  }
				  }
			  }
		  }
	    
	    return true;
	    
	  }//end isDestroyed
	  
	

}
