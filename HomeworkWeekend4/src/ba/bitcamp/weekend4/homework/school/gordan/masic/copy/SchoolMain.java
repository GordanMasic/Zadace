package ba.bitcamp.weekend4.homework.school.gordan.masic.copy;

public class SchoolMain {

	public static void main(String[] args) {

		//Creating classes
		SchoolClass s1firstA = new SchoolClass("Ia", 30);
		SchoolClass s1firstB = new SchoolClass("Ib", 25);
		SchoolClass s1firstC = new SchoolClass("Ic", 24);
		SchoolClass s1firstD = new SchoolClass("Id", 26);
		SchoolClass s1secondA = new SchoolClass("IIa", 26);
		SchoolClass s1secondB = new SchoolClass("IIb", 27);
		SchoolClass s1secondC = new SchoolClass("IIc", 30);
		SchoolClass s1secondD = new SchoolClass("IId", 30);
		SchoolClass s1thirdA = new SchoolClass("IIIa", 24);
		SchoolClass s1thirdB = new SchoolClass("IIIb", 30);
		SchoolClass s1thirdC = new SchoolClass("IIIc", 25);
		SchoolClass s1thirdD = new SchoolClass("IIId", 33);
		SchoolClass s1fourthA = new SchoolClass("IVa", 21);
		SchoolClass s1fourthB = new SchoolClass("IVb", 24);
		SchoolClass s1fourthC = new SchoolClass("IVc", 29);
		SchoolClass s1fourthD = new SchoolClass("IVd", 25);

		SchoolClass s2firstA = new SchoolClass("Ia", 30);
		SchoolClass s2firstB = new SchoolClass("Ib", 25);
		SchoolClass s2firstC = new SchoolClass("Ic", 24);
		SchoolClass s2firstD = new SchoolClass("Id", 26);
		SchoolClass s2secondA = new SchoolClass("IIa", 26);
		SchoolClass s2secondB = new SchoolClass("IIb", 27);
		SchoolClass s2secondC = new SchoolClass("IIc", 29);
		SchoolClass s2secondD = new SchoolClass("IId", 30);
		SchoolClass s2thirdA = new SchoolClass("IIIa", 24);
		SchoolClass s2thirdB = new SchoolClass("IIIb", 30);
		SchoolClass s2thirdC = new SchoolClass("IIIc", 25);
		SchoolClass s2thirdD = new SchoolClass("IIId", 33);
		SchoolClass s2fourthA = new SchoolClass("IVa", 21);
		SchoolClass s2fourthB = new SchoolClass("IVb", 24);
		SchoolClass s2fourthC = new SchoolClass("IVc", 29);
		SchoolClass s2fourthD = new SchoolClass("IVd", 25);

		//Creating directors
		Director s1AdisC = new Director("Adis Cehajic", 1985);
		Director s2AmraS = new Director("Amra Sabic", 1989);

		//Creating arrays of classes
		SchoolClass[] allSchoolOneClasses = new SchoolClass[] { s1firstA,
				s1firstB, s1firstC, s1firstD, s1secondA, s1secondB, s1secondC,
				s1secondD, s1thirdA, s1thirdB, s1thirdC, s1thirdD, s1fourthA,
				s1fourthB, s1fourthC, s1fourthD };

		
		SchoolClass[] allSchoolTwoClasses = new SchoolClass[] { s2firstA,
				s2firstB, s2firstC, s2firstD, s2secondA, s2secondB, s2secondC,
				s2secondD, s2thirdA, s2thirdB, s2thirdC, s2thirdD, s2fourthA,
				s2fourthB, s2fourthC, s2fourthD };

		//Creating schools
		School firstElectro = new School("Electrotechnical school Nikola Tesla", s1AdisC, allSchoolOneClasses);
		School firstGym = new School("Gymnasium Mesa Selimovic", s2AmraS, allSchoolTwoClasses);
		
		//Creating array of schools
		School[] schools = new School[]{firstElectro,firstGym};
		
		
		//Calling methods
		System.out.println("Which class in school \""+ firstGym.schoolName+"\" has the most students?");
		System.out.println("It is "+getNameOfClassWithTheMostStudents(firstGym)+"\n");
		
		System.out.println("Which school has the youngest director?");
		System.out.println("It is "+getSchoolWithYoungestDirector(schools));
		
		System.out.println("Which school has more students?");
		System.out.println("It is school: \n \"" + getNameOfSchoolWithMoreStudents(firstElectro, firstGym)+"\"" );
	}
	/**
	 * Returns name of the class with the most students in it
	 * @param s school we are checking out
	 * @return name of class (<b>String</b>)
	 */
	public static String getNameOfClassWithTheMostStudents(School s){
		
		int max = 0;
		for (int i = 0; i < s.schoolClasses.length; i++) {
			if(max < s.schoolClasses[i].numberOfStudents ){
				max = s.schoolClasses[i].numberOfStudents;
			}
		}
		
		for (int i = 0; i < s.schoolClasses.length; i++) {
			if(s.schoolClasses[i].numberOfStudents == max){
				return s.schoolClasses[i].className;
			}
		}
		return null;
	}
	
	/**
	 * Returns school with youngest director
	 * @param schools array of schools
	 * @return school (<b>School</b>)
	 */
	public static School getSchoolWithYoungestDirector(School[] schools){
		int min = 0;
		for (int i = 0; i < schools.length; i++) {
			if(schools[i].nameDirector.yearOfBirth > min){
				min = schools[i].nameDirector.yearOfBirth;	
			}
		}
		
		for (int i = 0; i < schools.length; i++) {
			if(schools[i].nameDirector.yearOfBirth == min){
				return schools[i];	
			}
		}
		
		return null;
	}
	/**
	 * Returns name of school with more students
	 * @param s1 first school
	 * @param s2 second school
	 * @return name (<b>String</b>)
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2){
		int numOfStudents1= 0;
		int numOfStudents2= 0;
		
		for (int i = 0; i < s1.schoolClasses.length; i++) {
			numOfStudents1 += s1.schoolClasses[i].numberOfStudents;
		}
		
		for (int i = 0; i < s2.schoolClasses.length; i++) {
			numOfStudents2 += s2.schoolClasses[i].numberOfStudents;
		}
		
		if(numOfStudents1>numOfStudents2){
			return s1.schoolName;
		}else if(numOfStudents2>numOfStudents1){
			return s2.schoolName;
		}else{
			return "They have same number of students";
		}
	}
}
