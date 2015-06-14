package ba.bitcamp.weekend4.homework.books.gordan.masic;

import java.util.Arrays;

public class Author {

	public String authorName;
	public int yearOfBirth;
	public Book[] booksHeWrote;

	// Constructor
	public Author(String authorName, int yearOfBirth, Book[] booksHeWrote) {
		super();
		this.authorName = authorName;
		this.yearOfBirth = yearOfBirth;
		this.booksHeWrote = booksHeWrote;
	}

	// toString method
	public String toString() {

		String s = "\n";

		s += "Author name: " + authorName + "\n";
		s += "Born: " + yearOfBirth + "\n";
		s += "Books he wrote: " + Arrays.toString(booksHeWrote) + "\n";

		return s;
	}
}
