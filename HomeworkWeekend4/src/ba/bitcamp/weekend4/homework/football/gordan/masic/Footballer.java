package ba.bitcamp.weekend4.homework.football.gordan.masic;

public class Footballer {

	public String playerName;
	public int yearOfBirth;
	public String position;

	//Constructor
	public Footballer(String playerName, int yearOfBirth, String position) {
		super();
		this.playerName = playerName;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}

	//toString method
	public String toString() {

		String s = "\n";
		s += "Player Name: " + playerName + "\n";
		s += "Born: " + yearOfBirth + "\n";
		s += "Position: " + position + "\n";
		
		return s;
	}

}
