package ba.bitcamp.weekend4.homework.football.gordan.masic;

import java.util.Arrays;

public class FootballMain {

	public static void main(String[] args) {

		// Creating footballers
		Footballer f1 = new Footballer("Mladen Teofilovic", 1993, "Goalkeeper");
		Footballer f2 = new Footballer("Enver Memic", 1970, "Back");
		Footballer f3 = new Footballer("Nidal Salkic", 1991, "Back");
		Footballer f4 = new Footballer("Ajdin Brkic", 1994, "Back");
		Footballer f5 = new Footballer("Hajrudin Sehic", 1989, "Back");

		Footballer f6 = new Footballer("Kerim Dragolj", 1996, "Midfielder");
		Footballer f7 = new Footballer("Dinko Hodzic", 1985, "Midfielder");
		Footballer f8 = new Footballer("Ognjen Cetkovic", 1970, "Midfielder");

		Footballer f9 = new Footballer("Semir Sahman", 1993, "Forward");
		Footballer f10 = new Footballer("Zeljko Miljeviæ", 1988, "Forward");
		Footballer f11 = new Footballer("Adis Cehajic", 1985, "Forward");

		//Creating array of footballers
		Footballer[] bitcampPlayers = new Footballer[11];
		bitcampPlayers[0] = f1;
		bitcampPlayers[1] = f2;
		bitcampPlayers[2] = f3;
		bitcampPlayers[3] = f4;
		bitcampPlayers[4] = f5;
		bitcampPlayers[5] = f6;
		bitcampPlayers[6] = f7;
		bitcampPlayers[7] = f8;
		bitcampPlayers[8] = f9;
		bitcampPlayers[9] = f10;
		bitcampPlayers[10] = f11;

		//Creating team
		Team t1 = new Team("Bitcamp Javatars", bitcampPlayers);
		int year = 1993;

		//Calling methods
		int sameYear = countPlayers(t1, year);
		if (sameYear > 0) {
			System.out.println("In team \"" + t1.teamName + "\" there are "
					+ sameYear + " players born in " + year + "\n");
		} else {
			System.out.println("In team \"" + t1.teamName
					+ "\" there are no players born in " + year + "\n");
		}

		String positionWanted = "Back";
		System.out.println("There are " + countPlayers(t1, "Back")
				+ " players on position " + positionWanted + "\n");

		System.out.println("Youngest player/s int the team: \n\n"
				+ Arrays.toString(getYoungestPlayer(t1)) + "\n");

	}

	/**
	 * Returns number of players born at the same year
	 * 
	 * @param t
	 *            which team you want to check out
	 * @param year
	 *            which year you want to check out
	 * @return number of players
	 * 
	 */
	public static int countPlayers(Team t, int year) {

		int counter = 0;

		for (int i = 0; i < t.players.length; i++) {

			if (t.players[i].yearOfBirth == year) {
				counter++;
			}
		}

		return counter;
	}

	/**
	 * Returns number of players playing at the same position
	 * 
	 * @param t
	 *            which team you want to check out
	 * @param position
	 *            which position you want to check out
	 * @return number of players
	 * 
	 */
	public static int countPlayers(Team t, String position) {

		int counter = 0;

		for (int i = 0; i < t.players.length; i++) {

			if (t.players[i].position.equals(position)) {
				counter++;
			}
		}

		return counter;
	}

	/**
	 * Returns youngest player/s in the team
	 * 
	 * @param t
	 *            which team you want to check out
	 * @return array of youngest players
	 */
	public static Footballer[] getYoungestPlayer(Team t) {
		int maxYear = 0;
		int counter = 0;

		//Looking for highest year of birth
		for (int i = 0; i < t.players.length; i++) {

			if (t.players[i].yearOfBirth > maxYear) {
				maxYear = t.players[i].yearOfBirth;
			}
		}

		
		//Counting players with highest year of birth
		for (int i = 0; i < t.players.length; i++) {

			if (t.players[i].yearOfBirth == maxYear) {
				counter++;
			}
		}

		Footballer[] youngestPlayers = new Footballer[counter];

		
		//Making list of youngest players
		counter = 0;
		for (int i = 0; i < youngestPlayers.length; i++) {

			for (int j = counter; j < t.players.length; j++) {

				if (t.players[j].yearOfBirth == maxYear) {
					youngestPlayers[i] = t.players[j];
					counter += j + 1;
					break;
				}

			}

		}

		return youngestPlayers;

	}
}
