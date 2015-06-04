
public class Task3 {

	/**
	 * Method checks if there is any number in inputed string
	 * @param inString
	 * @return
	 */
	public static boolean hasNumbers(String inString){
		
		int c = 0;
		
		for (int i = 0 ;i< inString.length();i++){
			c = inString.charAt(i);			//Every number character is number from 
			switch(c){						//48 to 57 in ASCII code
			case 48:						
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56: 
			case 57:
				return true;
				
			}
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(hasNumbers("Parametri")); //Calling method
	}

}
