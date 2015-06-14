package ba.bitcamp.singerice;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Crating music performers
		MusicPerformer m1 = new MusicPerformer("The Rolling Stones", true,
				1962, "Rock");
		MusicPerformer m2 = new MusicPerformer("The Beatles", true, 1960,
				"Rock");
		MusicPerformer m3 = new MusicPerformer("Bryan Adams", false, 1980,
				"Rock");
		MusicPerformer m4 = new MusicPerformer("Michael Jackson", false, 1971,
				"Pop");

		// Creating songs
		Song sRS1 = new Song(m1, "Satisfaction", 1965, "Rock");
		Song sRS2 = new Song(m1, "Paint it black", 1966, "Rock");

		Song sTB1 = new Song(m2, "Love me do", 1962, "Rock");
		Song sTB2 = new Song(m2, "Help!", 1965, "Rock");

		Song sBA1 = new Song(m3, "Straight from the hearh", 1983, "Rock");
		Song sBA2 = new Song(m3, "Please forgive me", 1993, "Rock");

		Song sMJ1 = new Song(m4, "Bille Jean", 1982, "Dance pop");
		Song sMJ2 = new Song(m4, "Bad", 1987, "Dance pop");

		// Creating array of songs and albums for every performer
		Song[] albumSongs1 = new Song[2];
		albumSongs1[0] = sRS1;
		albumSongs1[1] = sRS2;

		Album al1 = new Album("Satisfaction", m1, albumSongs1, "Rock");

		Song[] albumSongs2 = new Song[2];
		albumSongs2[0] = sTB1;
		albumSongs2[1] = sTB2;

		Album al2 = new Album("Help!", m2, albumSongs2, "Rock");

		Song[] albumSongs3 = new Song[2];
		albumSongs3[0] = sBA1;
		albumSongs3[1] = sBA2;

		Album al3 = new Album("So far so god", m3, albumSongs3, "Rock");

		Song[] albumSongs4 = new Song[2];
		albumSongs4[0] = sMJ1;
		albumSongs4[1] = sMJ2;

		Album al4 = new Album("Bad", m4, albumSongs4, "Pop");

		// Creating array of albums
		Album[] albums = new Album[4];
		albums[0] = al1;
		albums[1] = al2;
		albums[2] = al3;
		albums[3] = al4;

		// Creating an array of concert guests
		MusicPerformer[] concertGuests = new MusicPerformer[4];
		concertGuests[0] = m1;
		concertGuests[1] = m2;
		concertGuests[2] = m3;
		concertGuests[3] = m4;

		// Creating an array of songs that are going to be performed on concert
		Song[] concertSongList = new Song[5];
		concertSongList[0] = sRS1;
		concertSongList[1] = sRS2;
		concertSongList[2] = sTB1;
		concertSongList[3] = sBA1;
		concertSongList[4] = sMJ1;

		// Creating concert
		Concert bandAid = new Concert(concertGuests, concertSongList);

		//Calling methods
		System.out.println("Is it same author of song \"" + sRS1.songTittle
				+ "\" and \"" + sRS2.songTittle + "\"? "
				+ isSameAuthor(sRS1, sRS2));

		System.out.println("Is it same author of song \"" + sTB1.songTittle
				+ "\" and \"" + sRS1.songTittle + "\"? "
				+ isSameAuthor(sTB1, sRS1));

		System.out.println();
		System.out.println(m1);
		System.out.println();
		System.out.println(sRS1);
		System.out.println();
		System.out.println("Is song \"" + sRS1.songTittle
				+ "\" from solo author? " + isFromSoloAuthor(sRS1));
		System.out.println();
		Song olderSong = getOlderSong(sRS2, sMJ1);
		if (olderSong != null) {
			System.out.println("Which song is older? \n" + sRS2 + " or " + sMJ1
					+ " \n" + olderSong);
		} else {
			System.out.println("Which song is older? \n" + sRS2 + " or " + sMJ1
					+ " \nNiether");
		}

		System.out.println("Album " + al1.albumName + " whose genre is "
				+ al1.albumGenre);
		System.out.println("has " + countGenreNumber(al1, al1.albumGenre)
				+ " songs from that genre.");

		System.out.println("In which album is song " + sRS1.songTittle);
		printAlbumInformation(albums, sRS1);

		System.out.println(Arrays.toString(getNumberOfSongsPerAlbum(bandAid,
				albums)));

		System.out.println(getMaxNumberOfSongs(bandAid));
	}

	/**
	 *Checks out are two songs from the same author
	 * @param s1 first song	
	 * @param s2 seconf song
	 * @return boolean
	 */
	public static boolean isSameAuthor(Song s1, Song s2) {
		if (s1.author.name.equals(s2.author.name)) {
			return true;
		}
		return false;
	}

	/**
	 * Checks out is song from solo author
	 * @param s song
	 * @return boolean
	 */
	public static boolean isFromSoloAuthor(Song s) {
		if (s.author.isBand == true) {
			return false;
		}
		return true;
	}

	/**
	 * Checks out which of two songs is older
	 * @param s1 first song
	 * @param s2 second song
	 * @return song (<b>Song</b>)
	 */
	public static Song getOlderSong(Song s1, Song s2) {
		if (s1.songYear < s2.songYear) {
			return s1;
		} else if (s1.songYear > s2.songYear) {
			return s2;
		} else
			return null;
	}

	/**
	 * Counts how many songs of the certain genre are in some album
	 * @param a name of album
	 * @param genre name of genre
	 * @return number (<b>int</b>)
	 */
	public static int countGenreNumber(Album a, String genre) {
		int counter = 0;
		for (int i = 0; i < a.songsOnAlbum.length; i++) {
			if (a.songsOnAlbum[i].songGenre.equals(genre)) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Search for one song in array of different albums and prints 
	 * informations about album which contains that song
	 * @param a array of albums
	 * @param s song we you are looking for
	 */
	public static void printAlbumInformation(Album[] a, Song s) {
		Album al1 = null;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songsOnAlbum.length; j++) {
				if (s.songTittle.equals(a[i].songsOnAlbum[j].songTittle)) {
					al1 = a[i];
				}
			}
		}
		System.out.println(al1);
	}

	/**
	 * Returns array that contains number of songs each guest of concert has performed
	 * @param c concert you choose
	 * @param a array that contains albums from each performer
	 * @return array (<b>int[]</b>)
	 */
	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {
		int counter = 0;
		int[] songsNum = new int[c.concertGuests.length];
		for (int i = 0; i < c.concertGuests.length; i++) {
			counter = 0;
			for (int j = 0; j < c.concertSongList.length; j++) {
				for (int j2 = 0; j2 < a[i].songsOnAlbum.length; j2++) {
					if (c.concertSongList[j].songTittle
							.equals(a[i].songsOnAlbum[j2].songTittle)) {
						counter++;
					}
				}
				songsNum[i] = counter;
			}
		}
		return songsNum;
	}

	/**
	 * Returns highest number of songs that some guest of concert has performed
	 * @param c concert you choose
	 * @return number (<b>int</b>)
	 */
	public static int getMaxNumberOfSongs(Concert c) {
		int counter = 0;
		int max = 0;
		for (int i = 0; i < c.concertGuests.length; i++) {
			counter = 0;
			for (int j = 0; j < c.concertSongList.length; j++) {
				if (c.concertGuests[i].name
						.equals(c.concertSongList[j].author.name)) {
					counter++;
				}
			}
			if (counter > max) {
				max = counter;
			}
		}
		return max;
	}
}
