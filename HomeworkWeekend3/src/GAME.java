import java.util.Arrays;
import java.util.Scanner;

public class GAME {

	//This program is a very simple but interesting game
	
	public static void main(String[] args) {
		System.out.println("Your array is: ");
		int[] randArray = getIntArray(5);
		System.out.println(Arrays.toString(randArray));
		System.out.println("Your array has all elements equal to zero! "
				+ hasAllZeroes(randArray));
		System.out.println("Now you can play game:");
		Scanner in = new Scanner(System.in);
		long timeStart = System.currentTimeMillis() / 1000; 
		while(hasAllZeroes(randArray) != true){
		System.out.println("Input index number: ");
		int num = in.nextInt();
		System.out.println(Arrays.toString(arrayToZero(randArray,num)));
		}
		System.out.println("You got it! Excellent! You are very clever!");
		long timeEnd = System.currentTimeMillis()/1000;
		long timePlayed = timeEnd - timeStart;
		System.out.println("You have played for "+timePlayed+" seconds");
		in.close();

	}

	//METHOD#1 GETS RANDOM NUMBERS FROM 0 TO 4 AS ELEMENTS OF ARRAY
	public static int[] getIntArray(int num) {
		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 4);
		}
		return array;
	}
	//METHOD#2 CHEKS IF THERE ARE ALL ZEROES AS ELEMENTS OF ARRAY
	public static boolean hasAllZeroes(int[] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				counter++;
			}
		}
		if (counter == array.length) {

			return true;
		} else {

			return false;
		}
	}
	//METHOD#3 IS ACTUALY A GAME. YOU HAVE TO REDUCE ALL THE ELEMENTS OF AN ARRAY
	//TO ZERO BY INPUTING INDEX OF THE ELEMENT
	//DIFFERENT INDEX HAS A DIFFERENT INFLUENCE ON ARRAY
	public static int[] arrayToZero(int[] array, int num) {
		try {
			if (num > array.length - 1) {
				throw new IndexOutOfBoundsException();
			} else {
				switch (num) {
				case 0:
					switch (array[1]) {
					case 0:
						break;
					case 1:
						array[1] += 3;
						break;
					case 2:
						array[1] += 2;
						break;
					case 3:
						array[1] += 1;
						break;
					case 4:
						break;
					}
					if (array[0]>0){
					array[0] -= 1;}
					break;
				case 1:
					switch (array[2]) {
					case 0:
						break;
					case 1:
						array[2] -= 1;
						break;
					case 2:
						array[2] -= 1;
						break;
					case 3:
						array[2] -= 1;
						break;
					case 4:
						array[2] -= 1;
						break;
					}
					switch (array[0]) {
					case 0:
						break;
					case 1:
						array[0] -= 1;
						break;
					case 2:
						array[0] -= 1;
						break;
					case 3:
						array[0] -= 1;
						break;
					case 4:
						array[0] -= 1;
						break;
					}
					if (array[1]>0){
						array[1] -= 1;}
						break;
				case 2:
					switch (array[3]) {
					case 0:
						break;
					case 1:
						array[3] += 2;
						break;
					case 2:
						array[3] += 2;
						break;
					case 3:
						array[3] += 1;
						break;
					case 4:
						break;
					}
					switch (array[1]) {
					case 0:
						break;
					case 1:
						array[1] += 2;
						break;
					case 2:
						array[1] += 2;
						break;
					case 3:
						array[1] += 1;
						break;
					case 4:
						break;
					}
					if (array[2]>0){
						array[2] -= 1;}
						break;
				case 3:
					switch (array[2]) {
					case 0:
						break;
					case 1:
						array[2] -= 1;
						break;
					case 2:
						array[2] -= 2;
						break;
					case 3:
						array[2] -= 3;
						break;
					case 4:
						array[2] -= 3;
						break;
					}
					switch (array[4]) {
					case 0:
						break;
					case 1:
						array[4] -= 1;
						break;
					case 2:
						array[4] -= 2;
						break;
					case 3:
						array[4] -= 3;
						break;
					case 4:
						array[4] -= 3;
						break;
					}
					if (array[3]>0){
						array[3] -= 1;}
						break;
				case 4:
					switch (array[3]) {
					case 0:
						break;
					case 1:
						array[3] += 3;
						break;
					case 2:
						array[3] += 2;
						break;
					case 3:
						array[3] += 1;
						break;
					case 4:
						break;
					}
					if (array[4]>0){
						array[4] -= 1;}
						break;
				}

			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Input index from 0 to 3");
		}
		return array;
	}
}
