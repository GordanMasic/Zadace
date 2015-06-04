
public class Task5 {
	
	/**
	 * Program returns all numbers from string 
	 * @param s
	 * @return
	 */
	public static String getNumbersOnly(String s){
	
	String numbers="";
	for (int i = 0;i < s.length();i++){
		switch(s.charAt(i)){
		case 48:
		case 49:
		case 50:					//Every number character has number in 
		case 51:					//from 48 to 57 in ASCII table 
		case 52:
		case 53:
		case 54:
		case 55:
		case 56: 
		case 57:
			numbers+=s.charAt(i);
			break;
		}
	}
	if(numbers == ""){
		return "0";					//Returns zero if there is no number
	}
	return numbers;
	
	}
	
	public static void main(String[] args) {
		
	System.out.println(getNumbersOnly("d K. "));	//Calling method
	}

}
