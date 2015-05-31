
public class Task5 {

	
		
		public static int getNextOddNumber(int num){
			if (num % 2 == 0) {
				num = num + 1;
			} else 
				num = num +2;
			return num;
		}
		public static double getAreaOfCircle(int diameter) {
			double area = (diameter / 2.0) * (diameter / 2.0) * Math.PI; 
			return area;
		}
		public static boolean isInRange(int start, int finish, int n) {
			boolean numIsInRange = true;
			if (start < n  && n < finish) {
				numIsInRange = true;
			} else 
				numIsInRange = false;
			return numIsInRange;
		}

		public static void main(String[] args) {
			System.out.println("Next odd number is: ");
			System.out.println(getNextOddNumber(8));
			
			System.out.println("Area of circle is: ");
			System.out.println(getAreaOfCircle(5));
			
			System.out.println("NUmber is in range: ");
			System.out.println(isInRange(1, 5, 2));
			

	}

}
