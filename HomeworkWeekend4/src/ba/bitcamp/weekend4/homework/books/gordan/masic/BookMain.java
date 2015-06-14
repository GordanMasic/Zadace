package ba.bitcamp.weekend4.homework.books.gordan.masic;

import java.util.Arrays;

public class BookMain {

	public static void main(String[] args) {

		// Creating books
		Book bFyodorMD1 = new Book("The idiot", 1969, "Philosophical novel",
				false);
		Book bFyodorMD2 = new Book("The brothers Karamazov", 1880,
				"Philosophical novel", true);
		Book bFyodorMD3 = new Book("Crime and punishment", 1866,
				"Philosophical novel", true);

		Book bMesaS1 = new Book("Fortress", 1969, "Psychological drama", true);
		Book bMesaS2 = new Book("Dervish and the death", 1968,
				"Psychological drama", true);
		Book bMesaS3 = new Book("Silences", 1961, "Drama", false);

		

		// Creating authors books
		Book[] dostoyevskyBooks = new Book[3];
		dostoyevskyBooks[0] = bFyodorMD1;
		dostoyevskyBooks[1] = bFyodorMD2;
		dostoyevskyBooks[2] = bFyodorMD3;

		Book[] mesaSBooks = new Book[3];
		mesaSBooks[0] = bMesaS1;
		mesaSBooks[1] = bMesaS2;
		mesaSBooks[2] = bMesaS3;

		

		// Creating authors
		Author dostoyevsky = new Author("Fyodor Mikhailovich Dostoyevsky",
				1821, dostoyevskyBooks);
		Author mesaS = new Author("Mesa Selimovic", 1910, mesaSBooks);

		

		// Creating array of authors
		Author[] listOfAuthors = new Author[2];
		listOfAuthors[0] = dostoyevsky;
		listOfAuthors[1] = mesaS;
		

		// Calling methods
		System.out.println("Author " + dostoyevsky.authorName + " has wrote "
				+ countBestsellingBooks(dostoyevsky) + " bestsellers.\n");

		int year1 = 1965;
		int year2 = 1970;
		System.out.println("How many books did " + mesaS.authorName
				+ " wrote between " + year1 + " and " + year2 + "?");
		System.out.println("He wrote "
				+ getNumberOfWrittenBooks(mesaS, year1, year2) + " books.\n");

		System.out.println("Who has the most bestsellers?");
		System.out.println("Answer is "
				+ Arrays.toString(getAuthorWithMostBestsellers(listOfAuthors)));
	}

	/**
	 * Returns number of bestselling books from wanted author
	 * 
	 * @param a
	 *            which author we want to check out
	 * @return number of bestsellers (<b>int</b>)
	 */
	public static int countBestsellingBooks(Author a) {
		int counter = 0;
		for (int i = 0; i < a.booksHeWrote.length; i++) {
			if (a.booksHeWrote[i].isBestseller == true) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Returns number of books from certain author written between certain years
	 * 
	 * @param a
	 *            name of author
	 * @param year1
	 *            lower year
	 * @param year2
	 *            higher year
	 * @return number of books (<b>int</b>)
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2) {
		int counter = 0;
		for (int i = 0; i < a.booksHeWrote.length; i++) {
			if (a.booksHeWrote[i].yearWhenPublished >= year1
					&& a.booksHeWrote[i].yearWhenPublished <= year2) {
				counter++;
			}

		}
		return counter;
	}

	/**
	 * Returns author/s with most bestsellers
	 * 
	 * @param authors
	 *            array of authors which we want to check out
	 * @return author/s (<b>Author[]</b>)
	 */
	public static Author[] getAuthorWithMostBestsellers(Author[] authors) {

		// Getting the number of most bestsellers
		int max = 0;
		int howManyAuthorsHasMostBestsellers = 0;
		for (int i = 0; i < authors.length; i++) {
			int counter = 0;
			for (int j = 0; j < authors[i].booksHeWrote.length; j++) {
				if (authors[i].booksHeWrote[j].isBestseller == true) {
					counter++;
				}
				if (counter > max) {
					max = counter;
				}
			}
		}

		// Getting the number of authors with most bestsellers
		for (int i = 0; i < authors.length; i++) {
			int counter = 0;
			for (int j = 0; j < authors[i].booksHeWrote.length; j++) {
				if (authors[i].booksHeWrote[j].isBestseller == true) {
					counter++;
					if (counter == max) {
						howManyAuthorsHasMostBestsellers++;
					}
				}

			}
		}

		// Getting an array with authors who have the most bestsellers
		Author[] a = new Author[howManyAuthorsHasMostBestsellers];
		int start = 0;
		for (int k = 0; k < a.length; k++) {
			for (int i = start; i < authors.length; i++) {
				int counter = 0;
				for (int j = 0; j < authors[i].booksHeWrote.length; j++) {
					if (authors[i].booksHeWrote[j].isBestseller == true) {
						counter++;
					}
				}if (counter == max) {
						a[k] = authors[i];
						start += 1;
						break;
				}
				

				
				
				
			}
		}

		return a;
	}
}
