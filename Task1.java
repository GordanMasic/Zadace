public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program presents possibility to create a triangle with inputed
		// lengths of three edges
		
		int edgeA = 60;
		int edgeB = 50;
		int edgeC = 45;

		boolean triangle = ((edgeA + edgeB) > edgeC && (edgeA + edgeC) > edgeB && (edgeB + edgeC) > edgeA);
		/*
		 * To create a triangle, main condition is that sum of every two edges is
		 * greater than third edge
		 */

		System.out.println("Triangle? " + triangle);
	}

}
