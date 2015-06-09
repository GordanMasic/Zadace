package ba.bitcamp.gordan;

public class GetMin {

	public static void main(String[] args) {

		
		try {
			
			// minimum is set as first element of args array
			int min = Integer.parseInt(args[0]);
			
			// loop finds out which is lowest element in args array
			for (int i = 0; i < args.length; i++) {
				if (min > Integer.parseInt(args[i])) {
					min = Integer.parseInt(args[i]);
				}
			}
			
			System.out.println("Minimal number is: " + min);
		
		} catch (NumberFormatException e) {
			System.out.println("Please input some numbers in to array!");
		
		} catch (IndexOutOfBoundsException e){
			System.out.println("Please input some numbers in to array!");
		}

	}
}
