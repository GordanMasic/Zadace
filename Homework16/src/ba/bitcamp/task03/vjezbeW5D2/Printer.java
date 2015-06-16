package ba.bitcamp.task03.vjezbeW5D2;

public class Printer {

	@SuppressWarnings("unused")
	private String printerName;
	private int paper;
	private int ink;
	private int printedPaper;
	private static int totalPaper;

	/**
	 * Constructor for creating Printer objects with all parameters
	 * 
	 * @param printerName
	 *            name of printer
	 * @param paper
	 *            current paper status
	 * @param ink
	 *            current ink status
	 * @param printedPaper
	 *            how much paper is already printed
	 */
	public Printer(String printerName, int paper, int ink, int printedPaper) {
		this.printerName = printerName;
		this.paper = paper;
		this.ink = ink;
		this.printedPaper = printedPaper;
	}

	/**
	 * Constructor for creating Printer objects with only printer name
	 * 
	 * @param name
	 *            name of printer
	 */
	public Printer(String name) {
		this(name, 0, 0, 0);
	}

	/**
	 * Empty constructor
	 */
	public Printer() {
		this("Default", 0, 0, 0);
	}

	/**
	 * Checks does printer have ink
	 * 
	 * @return boolean
	 */
	public boolean hasInk() {
		if (ink < 2) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Checks does printer have paper
	 * 
	 * @return boolean
	 */
	public boolean hasPaper() {
		if (paper == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Returns how much paper has printer printed
	 * 
	 * @return number of printed papers
	 */
	public int getNumberOfPrintedPaper() {
		return printedPaper;
	}

	/**
	 * Filling printer with paper
	 * 
	 * @param p
	 *            number of papers
	 */
	public void addPaper(int p) {
		paper += p;
		if (paper > 100) {
			paper = 100;
		}
	}

	/**
	 * Filling printer with ink
	 */
	public void addMaxInk() {
		ink = 100;
	}

	/**
	 * Printing papers
	 * 
	 * @param num
	 *            of papers to print
	 */
	public void print(int num) {
		int counter = 0;
		while (counter < num) {
			if (paper > 0 && ink > 2) {
				
				paper--;
				ink -= 3;
				totalPaper++;
				counter++;
			}else{
				break;
			}
			
		}
		printedPaper = counter;
	}

	/**
	 * toString method
	 */
	public String toString() {

		String output;
		if (hasPaper() == true && hasInk() == true) {
			output = "Ready";
		} else if (hasPaper() == true && hasInk() == false) {
			output = "No ink";

		} else if (hasPaper() == false && hasInk() == true) {
			output = "No paper";
		} else {
			output = "No ink nor paper";
		}
		return output;
	}
	
	/**
	 * Checking how much has printer ever printed
	 * @return number of papers
	 */
	public static int getPrintedPaper(){
		return totalPaper;
	}
}
