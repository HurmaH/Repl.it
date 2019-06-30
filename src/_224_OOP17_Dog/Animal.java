package _224_OOP17_Dog;
/*
 * Write an abstract class Animal that contains 2 instance variables: 
 * name and age. 
   Provide getters and setters for these variables. 
   Add an abstract method getAgeInHumanYears() that returns int.
   Define 2 args constructor that initializes instance variables.
 */
public abstract class Animal {
	 String name;
	  int age;
	  
	  public Animal ( String name, int age){
	    this.name=name;
	    this.age=age;
	  }
	  
	  public void setName(String name){
	    this.name=name;
	  }
	  
	  public String getName(){
	    return name;
	  }
	  
	  public void setAge(int age){
	    this.age=age;
	  }
	  
	  public int getAge(){
	    return age;
	  }
	  
	  public abstract int getAgeInHumanYears();

}
