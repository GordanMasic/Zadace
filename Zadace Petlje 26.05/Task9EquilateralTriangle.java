import java.util.Scanner;

public class Task9EquilateralTriangle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input triangle's edge: ");
		int edge = in.nextInt();
		System.out.println();
		for (int i = 0; i < edge; i++){
			for (int j = 0; j < edge; j++){
				if ( edge - 1 > i + j){
					System.out.print(" ");
				}else {
					System.out.print("* ");
				}
			}System.out.println();
			
			
		}in.close();
	}

}
