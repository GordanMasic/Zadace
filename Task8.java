public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program calculates distance between the origin and 
		// dot whose coordinates we chose
		
		int coordX = 8;
		int coordY = 6;
		int coordZ = 11;

		double distance = (double) Math
				.sqrt((coordX * coordX + coordY * coordY + coordZ * coordZ));
		System.out.println("Distance between your dot and O(0,0,0) is: "
				+ distance);

	}

}
