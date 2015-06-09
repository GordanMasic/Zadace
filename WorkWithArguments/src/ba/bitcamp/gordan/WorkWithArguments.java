package ba.bitcamp.gordan;

import java.util.Scanner;

public class WorkWithArguments {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {

			System.out.println("Input some number: ");
			in.nextLine();

			if (in.nextLine().equals("") || in.nextLine().equals("0")) {
				break;
			}
			for (int i = 0; i < in.nextLine().length(); i++) {
				if (in.nextLine().charAt(i) == ',') {
					throw new NullPointerException("Use dot instead of comma!");
				}
			}

		}

		 try{
		 System.out.println("Your numbers are: ");
		 readArguments(args);
		
		 float product = productArguments(args);
		 System.out.printf("\n Product of inputed numbers is: %.2f \n",product);
		 }catch(NumberFormatException e){
		 System.out.println("Wrong input! Please try again: ");
		 }
		 }
		 public static void readArguments (String[] array){
		 float number = 0;
		
		 for (int i = 0; i < array.length; i++) {
		 number = Float.parseFloat(array[i]);
		
		 System.out.printf("%.2f ",number);
		 }
		
		 }
		
		 public static float productArguments(String[] array){
		
		 float product = 1;
		
		 for (int i = 0; i < array.length; i++) {
		 product *= Float.parseFloat(array[i]);
		 }
		 return product;
	}
}
