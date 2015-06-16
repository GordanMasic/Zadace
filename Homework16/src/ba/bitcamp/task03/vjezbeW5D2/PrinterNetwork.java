package ba.bitcamp.task03.vjezbeW5D2;

public class PrinterNetwork {

	private Printer[] printers;

	/**
	 * Constructor for creating PrinterNetwork objects
	 * 
	 * @param printers
	 *            array of printers
	 */
	public PrinterNetwork(Printer[] printers) {
		this.printers = printers;
	}

	/**
	 * Coordinates printer network When first printer runs out of paper or ink
	 * second printer continues and so on
	 * 
	 * @param num
	 *            number of pages to print
	 */
	public void coordinatePrint(int num) {
		for (int i = 0; i < printers.length; i++) {
			printers[i].print(num);
			num -= printers[i].getNumberOfPrintedPaper();
		}
	}
}
