
public class Task4 {

	/**
	 * Program returns percentage of your success on exam
	 * Inputed parameters are score and max score
	 * @param score
	 * @param max
	 * @return
	 */
	public static double getPercentage(int score, int max){
		return (double)score /(double)max*100;
	}
	public static void main(String[] args) {
		System.out.println(getPercentage(2,6)+"%");

	}

}
