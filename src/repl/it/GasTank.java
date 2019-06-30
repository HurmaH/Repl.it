package repl.it;

public class GasTank {
	
	 //WRITE YOUR CODE HERE
	  
	  double amount =0;
	  double capacity;
	  
	  public GasTank (double d1) {
	    this.capacity = d1;
	  }
	  
	  public void addGas (double d2) {
	    this.amount += d2;
	    if (this.amount >this.capacity) {
	      this.amount = this.capacity;
	    }
	  }
	  
	  public void useGas (double d3) {
	    this.amount -= d3;
	    if (this.amount <0) {
	      this.amount = 0;
	    }
	  }
	  
	  public boolean isEmpty () {
	    return this.amount<0.1;
	  }
	  
	  public boolean isFull () {
	    return this.amount>capacity-0.1;
	  }
	  
	  public double getGasLevel (){
	    return this.amount;
	  }
	  
	  public double fillUp (){
	    return (this.capacity-this.amount);
	  }
	  
	  

}
