package _227_OOP20_battleship;

public class Main {
	public static void main(String[] args) {

	    String[][] br = new String[][]{
	      {"~","w","w"},
	      {"w","h","h"},
	      {"~","w","m"}
	      
	    };
	    Board b = new Board(br);
	    S.o(b.isDestroyed());//false
	    S.o(b.hit(2,2));//true
	    S.o(b.isDestroyed());//true
	    S.o(b.hit(3,1));//false
	    S.o(b.hit(0,3));//false
	    
	    String[][] brc = b.getBoardR();
	    S.o(brc[0][1]);//w water
	    S.o(b.hit(0,1));//false(hit water)
	    S.o(brc[0][1]);//~ miss
	    
	  }//end main

}
