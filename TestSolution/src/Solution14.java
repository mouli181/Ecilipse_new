import java.util.Scanner;

public class Solution14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the Percentage");
		double a  = s.nextDouble();
		if(a >= 90 ) {
			System.out.println("For percentage of "+ a + "the grade is A");
		}
		else if(a>=80 && a<90) {
			System.out.println("For percentage of "+ a + "the grade is B");
		}
		else if(a>=70 && a<=79) {
			System.out.println("For percentage of "+ a + "the grade is C");
		}
		else {
			System.out.println("For percentage of "+ a + "the grade is D" );
		}
	}

}
