package _232_OOP21_battleshipPosition;

public class position_manger {

	  public String[][] boardR;//board array

	  private String[] shipTypes = new String[]{"ss","m","dddd","ccc"};
	  
	  
	  
	public position_manger(String[][] br){
	     boardR = br;
	  
	  }//end constructor
	  
	  public boolean placeShip(int row,int column,int dir,int shipT){
	      int len = shipTypes[shipT].length();
		  if (!isValidPos(row, column, dir, len)) {
	    	  return false;
	      }
	      
	      if (dir==1) {
	    	  int j=0;
	    	  for (int i=column; i<=column+len && j<len; i++) {
	    		  boardR[row][i]=shipTypes[shipT].substring(j, j+1);
	    		  j++;
	    	  } 
	     }
	      
	      if (dir==0) {
	    	  int j=0;
	    	  for (int i=row; i<=row+len && j<len; i++) {
	    		  boardR[i][column]=shipTypes[shipT].substring(j, j+1);
	    		  j++;
	    	  } 
	      }
	      
	      return true;
	     
	    
	  }//end place_ship
	  
	  public boolean isValidPos(int row,int column,int dir,int len){
		  String currentPos = "";

			if (len > boardR.length - row - 1 && dir == 0) {
				return false;
			}
			if (len > boardR[0].length - column - 1 && dir == 1) {
				return false;
			}

			for (int i = 0; i <= len; i++) {

				if (dir == 0) {
					currentPos = boardR[row + i][column];
				} // end if

				if (dir == 1) {
					currentPos = boardR[row][column + i];
				} // end if
				if (!currentPos.equals("w")) {
					return false;
				}
			} // end for
			return true;
	  }//end isValidPos
	  
	  
}
