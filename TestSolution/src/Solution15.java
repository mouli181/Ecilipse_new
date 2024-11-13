import java.util.Scanner;

public class Solution15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the Time");
		double a  = s.nextDouble();
		if(a >= 00.00 && a <=11.59 ) {
			System.out.println("Good Morning");
		}
		else if(a>=12.00 && a<=17.59) {
			System.out.println("Good Afternnon");
		}
		else if(a>=18.00 && a<=23.59) {
			System.out.println("Good Evening");
		}
	}

}


