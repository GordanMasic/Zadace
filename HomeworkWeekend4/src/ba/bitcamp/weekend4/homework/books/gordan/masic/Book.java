package ba.bitcamp.weekend4.homework.books.gordan.masic;

public class Book {

	public String nameOfBook;
	public int yearWhenPublished;
	public String bookGenre;
	public boolean isBestseller;

	// Constructor
	public Book(String nameOfBook, int yearWhenPublished, String bookGenre,
			boolean isBestseller) {
		super();
		this.nameOfBook = nameOfBook;
		this.yearWhenPublished = yearWhenPublished;
		this.bookGenre = bookGenre;
		this.isBestseller = isBestseller;
	}

	// toString method
	public String toString() {

		String s = "\n";

		s += "Name of book: " + nameOfBook + "\n";
		s += "Published : " + yearWhenPublished + "\n";
		s += "Genre: " + bookGenre + "\n";
		s += "Bestseller: " + isBestseller + "\n";

		return s;
	}

}
