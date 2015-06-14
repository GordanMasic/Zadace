package ba.bitcamp.singerice;

import java.util.Arrays;

public class Concert {

	public MusicPerformer[] concertGuests;
	public Song[] concertSongList;
	
	//Constructor
	public Concert(MusicPerformer[] concertGuests, Song[] concertSongList) {
		super();
		this.concertGuests = concertGuests;
		this.concertSongList = concertSongList;
	}
	
	//toString method
	public String toStrinng(){
		
		String s = "\n";
		
		s+="Guests: " + Arrays.toString(concertGuests) + "\n";
		s+="List of songs: " + Arrays.toString(concertSongList) + "\n";
		
		return s;
	}
	
}
