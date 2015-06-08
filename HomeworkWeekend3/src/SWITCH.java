import java.util.Scanner;
public class SWITCH {
	
	//Program returns my schedule at BITCamp according to inputed time
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	       System.out.println("Input time of a day e.g 9 :");
        int h = input.nextInt();
       
        switch(h) {
           
            case 9:
            case 10:
            case 11:
            case 12:
            case 13: System.out.println("Predavanja");
                        break;
            case 14:
            case 15:
            case 16:
            case 17: System.out.println("Vjezbe");
                         break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1: System.out.println("Zadaæa");
                          break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: System.out.println("Spavanje");
                         break;
        }
        input.close();
	}

}
