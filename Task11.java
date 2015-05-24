public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program calculates arrival of the plain based on 
		// start time and duration of flight

		int hourUp = 23;
		int minUp = 35;
		int minFlight = 150;

		int hourDown = minFlight / 60 + hourUp;
		int minDown = minFlight % 60 + minUp;

		hourDown += (minDown / 60);
		minDown = (minDown % 60);

		if (hourDown >= 24) {

				hourDown -= 24;
				System.out.printf("Flight started at %d h and %d min \n", hourUp, minUp);
				System.out.printf("Flight duration %d minutes \n", minFlight);
				System.out.printf("Flight ends at %d h and %d min \n", hourDown, minDown);
			
		} else {

			System.out.printf("Flight started at %d h and %d min \n", hourUp, minUp);
			System.out.printf("Flight duration %d minutes \n", minFlight);
			System.out.printf("Flight ends at %d h and %d min \n", hourDown, minDown);
		}

	}

}