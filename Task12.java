
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program calculates volume of a ball and returns
		// whether that ball has good quality or not
		
		double radius = 0.9;
		double volumeLowerBound = 5.7133;
		double volumeHigherBound = 6.3147;
		
		
		double volume = (4 / 3 * radius * radius * radius * Math.PI);
		 
		if (volume > volumeLowerBound && volume < volumeHigherBound){
			System.out.printf("Ball volume is %.2f and the ball has a good quality!", volume);
		}else{
			System.out.printf("Ball volume is %.2f and the ball has a bad quality!", volume);
		}

	}

}
