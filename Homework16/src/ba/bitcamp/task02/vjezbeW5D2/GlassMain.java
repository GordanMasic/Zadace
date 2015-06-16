package ba.bitcamp.task02.vjezbeW5D2;

public class GlassMain {

	public static void main(String[] args) {
		
		//New glass
		Glass g1 = new Glass(0.33);
		
		//Filling glass
		g1.addDrink("Beer", 0.33);
		System.out.println(g1);
		System.out.println();
		
		//Drinking all out
		g1.emptyGlass();
		System.out.println();
		System.out.println(g1);
		System.out.println();
		

	}

}
