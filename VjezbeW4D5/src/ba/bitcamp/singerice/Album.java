package ba.bitcamp.singerice;

import java.util.Arrays;

public class Album {
	
	public String albumName;
	public MusicPerformer performer;
	public Song[] songsOnAlbum;
	public String albumGenre;
	
	
	public Album(String albumName, MusicPerformer performer,
			Song[] songsOnAlbum, String albumGenre) {
		super();
		this.albumName = albumName;
		this.performer = performer;
		this.songsOnAlbum = songsOnAlbum;
		this.albumGenre = albumGenre;
	}
	
	public String toString(){
		String s = "";
		s += "\n Album: "+albumName+"\n";
		s += "Performer: "+performer.name+"\n";
		s += "Songs: "+Arrays.toString(songsOnAlbum)+"\n";
		s += "Genre: "+albumGenre+"\n";
		
		return s;
	}
	
	
}
