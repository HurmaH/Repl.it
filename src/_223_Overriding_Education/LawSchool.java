package _223_Overriding_Education;

public class LawSchool extends EducationalInstitution{
	  
	  public LawSchool (){
	    super(3);
	  }
	  
	  @Override
	  public String graduationRequirements () {
	    return super.graduationRequirements()+" and passing the bar";
	  }
	  
	}
