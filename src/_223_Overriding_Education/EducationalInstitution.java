package _223_Overriding_Education;

public class EducationalInstitution{
	  int duration;
	  
	  public EducationalInstitution (int duration) {
	    this.duration = duration;
	  }
	  
	  public String graduationRequirements () {
	    return duration+" years of study";
	  }
	}
