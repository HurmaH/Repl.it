package _224_OOP17_Dog;
/*Write a class Dog that extends the Animal class. 
 * Define 2 instance variables for this class: breed (String) and humanYears (int).
 * Add a constructor that accepts three parameters. 
 * The value of the first is used to initialize the value of name, 
 * the value of the second is used to initialize age and 
 * the value of the third is used to initialize breed.
 * User super() to call parent constructor.
 * Override toString() method, so it will display Dog info as in the example below:

Name: name 
Breed: breed 
Age in calendar years: years 
Age in human years: humanYears

Also, implement getAgeInHumanYears method, so 
It will convert dogs age into humans age as follows:

if dogs age is less or equals to 2, multiple age by 11;
otherwise, human years is equals to: 22 + ((age-2) * 5);

Define an equals method for the Dog class that returns true 
if the dog’s name, age, and breed match the same variables 
for the other object that is being compared. 


*/

public class Dog extends Animal {
	
	String breed;
	int humanYears;
	
	public Dog ( String name, int age, String breed){
	    super(name, age);
	    this.breed=breed;
	  }
	  
	  public void setBreed(String breed){
	    this.breed=breed;
	  }
	  
	  public String getBreed(){
	    return breed;
	  }
	  
	  @Override
	public int getAgeInHumanYears() {
		
	    if (getAge()<=2){
	      this.humanYears = getAge()*11;
	    }else {
	    	this.humanYears= 22+((getAge()-2)*5);
	    }
	    
	    return humanYears; 
		
	} 
	  
	  @Override
	  public String toString(){
	    return "Name: "+getName() +"\n"+ 
	          "Breed: "+getBreed() +"\n"+
	          "Age in calendar years: "+getAge()+"\n"+
	          "Age in human years: "+getAgeInHumanYears();
	  }
	  
	
	  
	  public boolean equals (Dog dog) {
	    return (this.name).equals(dog.getName()) 
	    		&& this.age==dog.getAge() 
	    		&& (this.breed).equals(dog.getBreed());
	      
	    }

	

}
