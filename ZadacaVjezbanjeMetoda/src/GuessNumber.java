import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Declaration of max points that user can win by game
		int maxPoints = 5;

		// Declaration of points scored by game
		int pointsScoredGame = 0;

		// Declaration of sum of all scored points
		int sumPoints = 0;

		// Declaration of wins and loses counters
		int counterWins = 0;
		int counterLoses = 0;

		// Declaration of level chooser
		int level = 0;

		// Declaration of game continuer
		int continueGame = 0;

		do {

			// Declaration of number that represents imagined number that user
			// will try to guess
			int imaginedNum = (int) (Math.random() * 9 + 1);

			// System.out.println(imaginedNum);

			System.out
					.println("Try to guess a number! \n\nPlease first select level that you want "
							+ "to play \n\t1 - EASY level\n\t2 - NORMAL level\n\t3 - HARD level\n");

			// Checking if inputed level number is existing level. If inputed
			// number is not one of existing user can again select level.
			while (true) {
				try {
					// Choosing level of a game
					System.out.println("Please insert number of a level: ");
					level = in.nextInt();
					if (level != 1 && level != 2 && level != 3) {
						throw new InputMismatchException();
					}
					break;
				} catch (InputMismatchException ex) {
					System.out
							.println("Wrong input! Please input number of a level from 1 to 3!");
					in.nextLine();
				}
			}

			// Calling method choseLevel that enables user to play chosen level
			// of a game and returning points scored by game
			pointsScoredGame = choseLevel(level, imaginedNum, maxPoints);

			// Asking user does he want to play again. If the answer is yes he
			// needs to input 1. For printing result user need to input anything
			// except 1.
			System.out
					.println("\nIf you want to play again input 1! If not input anything except 1!");
			continueGame = in.nextInt();

			// Calculating points of all played games
			sumPoints += pointsScoredGame;

			if (pointsScoredGame == 0) {
				counterLoses++;
			} else {
				counterWins++;
			}

			// If user inputs 1 game continues
		} while (continueGame == 1);

		System.out
				.printf("You have won %d games and lost %d games and scored %d points!",
						counterWins, counterLoses, sumPoints);
		in.close();

	}

	/**
	 * Enables user to input number and compares inputed number with the random
	 * number that computer had selected.
	 * <p>
	 * If the user does not guess selected number in declared max times, user
	 * loses game.
	 * 
	 * @param level
	 *            Level that user chooses and that determines max times that
	 *            user can try and guess number.
	 * @param imaginedNum
	 *            Number that computer had randomly selected.
	 * @param pointsWon
	 *            Max points that user can score per game.
	 * @return Number of points that user had scored.
	 */
	public static int checkNumber(int level, int imaginedNum, int pointsWon) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		// Declaration of a number that user will input
		int guessNum = 0;

		// Declaration of a counter that will count the tries of user
		int counter = 0;

		do {

			// Checking if inputed value is numerical value. If not user can
			// again input number.
			while (true) {
				try {
					// Trying to guess number
					System.out.print("Input number from 1 to 9: ");
					guessNum = in.nextInt();
					break;
				} catch (InputMismatchException ex) {
					System.out
							.println("Wrong input! Please input number from 1 to 9!\n");
					in.nextLine();
				}
			}

			// Increasing counter for 1 every time user does not guess
			counter++;

			// If the number of tries is equal to the max allowed number of
			// tries user loses
			if (counter == level && imaginedNum != guessNum) {
				System.out.println("I am sorry! You have lost!");
				pointsWon = 0;
				break;
			}

			// If the inputed number is equal with selected number user wins
			if (imaginedNum == guessNum) {
				// Calculating scored points
				pointsWon -= counter - 1;
				System.out
						.printf("Congratulations! You have guess imagined number in %d times.\nYou have won %d points!",
								counter, pointsWon);
				break;
			}

			// If inputed number is higher than selected prints hint that
			// the selected number is lover
			if (guessNum > imaginedNum) {
				System.out
						.println("Imagined number is lower than your number. Try again!");

				// If inputed number is lover than selected prints hint that the
				// selected number is higher
			} else if (guessNum < imaginedNum) {
				System.out
						.println("Imagined number is higher than your number. Try again!");
			}

			// Loop will repeat until user guess selected number
		} while (imaginedNum != guessNum);

		return pointsWon;
	}

	/**
	 * Enables user to select level which he wants to play.
	 * <p>
	 * There is three levels, easy, normal and hard, and for every level user
	 * have different number of tries.
	 * 
	 * @param selectLevel
	 *            Selected level.
	 * @param imaginedNum
	 *            Number that computer had randomly selected.
	 * @param pointsWon
	 *            Score of points that user had scored.
	 * @return Max points that user can score per game.
	 */
	public static int choseLevel(int selectLevel, int imaginedNum, int pointsWon) {

		// Declaration of three levels, easy that gives user five tries, normal
		// that gives user three tries and hard that gives user one try.
		int levelEasy = 5;
		int levelNormal = 3;
		int levelHard = 1;

		// Declaration of variable that will collect scored points
		int pointsEarned = 0;

		// Creating level easy
		if (selectLevel == 1) {
			System.out.printf(
					"You have selected EASY level and you have %d times to try "
							+ "to guess a imagined number. Good luck!\n",
					levelEasy);

			// Calling method checkNumber that enables user to guess number
			pointsEarned = checkNumber(levelEasy, imaginedNum, pointsWon);

			// Creating level normal
		} else if (selectLevel == 2) {
			System.out.printf(
					"You have selected NORMAL level and you have %d times to try "
							+ "to guess a imagined number. Good luck!\n",
					levelNormal);

			// Calling method checkNumber that enables user to guess number
			pointsEarned = checkNumber(levelNormal, imaginedNum, pointsWon);

			// Creating level hard
		} else if (selectLevel == 3) {
			System.out.printf(
					"You have selected HARD level and you have %d times to try "
							+ "to guess a imagined number. Good luck!\n",
					levelHard);

			// Calling method checkNumber that enables user to guess number
			pointsEarned = checkNumber(levelHard, imaginedNum, pointsWon);
		}
		return pointsEarned;
	}

}
