package ba.bitcamp.weekend4.homework.football.gordan.masic;

import java.util.Arrays;

public class Team {

	public String teamName;
	public Footballer[] players;

	//Constructor
	public Team(String teamName, Footballer[] players) {
		super();
		this.teamName = teamName;
		this.players = players;
	}

	//toString method
	public String toString() {

		String s = "\n";
		s += "Team name: " + teamName + "\n";
		s += "Players: " + Arrays.toString(players) + "\n";

		return s;
	}

}
