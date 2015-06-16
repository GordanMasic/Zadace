package ba.bitcamp.task03.vjezbeW5D2;

public class PrinterMain {

	public static void main(String[] args) {

		//New printer
		Printer p1 = new Printer("HP space shuttle");
		
		//Printer status
		System.out.println(p1);
		
		//Adding ink and paper
		p1.addMaxInk();
		p1.addPaper(10);
		
		//Printer status
		System.out.println();
		System.out.println(p1);
		System.out.println();
		
		//Printing 10 pages
		p1.print(10);
		//Checking how much has printer ever printed
		System.out.println(Printer.getPrintedPaper());

		//Printer status
		System.out.println(p1);
		
		//Adding paper
		p1.addPaper(50);

		//Printing 20 pages
		p1.print(20);
		
		//Checking how much has printer ever printed
		System.out.println(Printer.getPrintedPaper());
		System.out.println();
		//Checking how much pages printer has printed during last printing
		System.out.println(p1.getNumberOfPrintedPaper());
		
		//Adding ink and paper
		p1.addMaxInk();
		p1.addPaper(60);
		
		//New printer
		Printer p2 = new Printer("HP Mini Morris");
		p2.addMaxInk();
		
		//Adding ink and paper
		p2.addPaper(100);

		//Array of all printers
		Printer[] printers = new Printer[2];
		printers[0] = p1;
		printers[1] = p2;
		
		//Creating network of printers
		PrinterNetwork pn1 = new PrinterNetwork(printers);
		
		//Coordinate printing
		pn1.coordinatePrint(45);

		//checking how many pages printed every printer
		System.out.println("Printer 1: "+p1.getNumberOfPrintedPaper() + "\nPRinter 2: "
				+ p2.getNumberOfPrintedPaper());
	}

}
