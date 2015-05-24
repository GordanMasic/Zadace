
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program discovers if the inputed 
		//number is solution of inputed cubic equation
		
		int a = 1;
		int b = -5;
		int c = -2;
		int d = 24;
		int x = -2;
		
		if(a*x*x*x+b*x*x+c*x+d==0){
			System.out.println("Inputed number is solution. \n");
		}
		else
			System.out.println("Inputed number is not solution. \n");

	}

}
