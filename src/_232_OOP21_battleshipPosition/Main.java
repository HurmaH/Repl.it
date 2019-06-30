package _232_OOP21_battleshipPosition;

public class Main {
	 public static void main(String[] args) {

		    String[][] br = new String[][]{
		      {"w","w","w","w"},
		      {"w","w","w","m"},
		      {"w","w","m","w"},
		      {"w","w","w","w"}
		      
		    };
		    position_manger pm = new position_manger(br);
		    S.o(pm.isValidPos(0,0,1,3));//true
		    S.o(pm.isValidPos(1,0,1,3));//false
		    S.o(pm.isValidPos(1,0,1,2));//true
		    
		    pm.placeShip(0,0,0,0);//place submarine(ss) from boardR[0][0] verticaly(0)
		    S.o(pm.boardR[0][0]);//s
		    S.o(pm.boardR[1][0]);//s
		    S.o(pm.boardR[2][0]);//w
		    pm.placeShip(0,1,0,1);//place mine(m) at boardR[0][1]
		    S.o(pm.boardR[0][1]);//m
		    S.o(pm.boardR[0][2]);//w
		    pm.placeShip(3,0,1,2);//place destroyer(dddd) at boardR[3][0] horizontally (1)
		    S.o(pm.boardR[3][0]);//d
		    S.o(pm.boardR[3][1]);//d
		    S.o(pm.boardR[3][2]);//d
		    S.o(pm.boardR[3][3]);//d
		    
		    /*//now the board looks like this:
		      {"s","m","w","w"},
		      {"s","w","w","m"},
		      {"w","w","m","w"},
		      {"d","d","d","d"}
		    */
		     
		    
		  }//end main

}
