public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program sorts inputed numbers in order from the lowest to the highest
		
		int numA = 154;
		int numB = 1790;
		int numC = 234;
		int numD = 240;
		int free = 0;
		
		if (numA > numB){
			free = numA;
			numA = numB;
			numB= free;
		}
		
		if (numB > numC){
			free = numB;
			numB = numC;
			numC= free;
		}
		if (numC > numD){
			free = numC;
			numC = numD;
			numD= free;
		}
		if (numA > numB){
			free = numA;
			numA = numB;
			numB= free;
		}
		if (numB > numC){
			free = numB;
			numB = numC;
			numC= free;
		}
		if (numA > numB){
			free = numA;
			numA = numB;
			numB= free;
		}
		
		System.out.println(numA + " " + numB + " " + numC + " " + numD);
		
		

	}

}
