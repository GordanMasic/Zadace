package ba.bitcamp.singerice;

public class Song {
	
	public MusicPerformer author;
	public String songTittle;
	public int  songYear;
	public String songGenre;
	
	public Song(MusicPerformer name, String songTittle, int songYear,
			String songGenre) {
		super();
		this.author = name;
		this.songTittle = songTittle;
		this.songYear = songYear;
		this.songGenre = songGenre;
	}

	@Override
	public String toString() {
		String s = "";
		s += "\nAuthor: "+author.name+"\n";
		s += "Title: "+songTittle+"\n";
		s += "Year when performed: "+songYear+"\n";
		s += "Genre: "+songGenre+"\n";
		
		return s;
	}

		
	
}