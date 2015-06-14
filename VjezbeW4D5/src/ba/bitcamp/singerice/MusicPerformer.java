package ba.bitcamp.singerice;

public class MusicPerformer {

	public String name;
	public boolean isBand;
	int yearEstablished;
	public String genre;

	public MusicPerformer(String name, boolean isBand, int yearEstablished,
			String genre) {
		super();
		this.name = name;
		this.isBand = isBand;
		this.yearEstablished = yearEstablished;
		this.genre = genre;
	}

	@Override
	public String toString() {
		String s = "";
		s += "Name: "+name+"\n";
		s += "Band: "+isBand+"\n";
		s += "Year when formed: "+yearEstablished+"\n";
		s += "Genre: "+genre+"\n";
		
		return s;
	}

}
