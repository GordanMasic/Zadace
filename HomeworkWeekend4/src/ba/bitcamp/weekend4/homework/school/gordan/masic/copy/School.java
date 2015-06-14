package ba.bitcamp.weekend4.homework.school.gordan.masic.copy;

import java.util.Arrays;

public class School {

	public String schoolName;
	public Director nameDirector;
	public SchoolClass[] schoolClasses;
	
	//Constructor
	public School(String schoolName, Director nameDirector,
			SchoolClass[] schoolClasses) {
		super();
		this.schoolName = schoolName;
		this.nameDirector = nameDirector;
		this.schoolClasses = schoolClasses;
	}
	
	//toString method
	public String toString(){
		String s = "\n";
		s += "School name: "+schoolName + "\n";
		s+= "Director: "+nameDirector+"\n";
		s+= "Classes: "+ Arrays.toString(schoolClasses) +"\n";
		return s;
	}
	
}
