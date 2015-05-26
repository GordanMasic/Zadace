import java.util.Scanner;

public class Task1Rectangle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Input edge a: ");

		int edgeA = in.nextInt();

		System.out.println("Input edge b: ");

		int edgeB = in.nextInt();

		for (int i = 1; i <= edgeA; i++) {

			for (int j = 1; j <= edgeB; j++) {

				if (i == 1 && j == 1) {

					System.out.printf("+");

				} else if (i == 1 && j > 1 && j < edgeB) {

					System.out.printf("-");

				} else if (i == 1 && j == edgeB) {

					System.out.printf("+\n");

				} else if (i > 1 && i < edgeA && j == 1) {

					System.out.printf("|");

				} else if (i > 1 && i < edgeA && j == edgeB) {

					System.out.println("|");

				} else if (i == edgeA && j == 1) {

					System.out.printf("+");

				} else if (i > 1 && i < edgeA && j < edgeB) {

					System.out.printf(" ");

				} else if (i == edgeA && j > 1 && j < edgeB) {

					System.out.printf("-");

				} else if (i == edgeA && j == edgeB) {

					System.out.printf("+");

				}

			}

		}in.close();

	}

}
