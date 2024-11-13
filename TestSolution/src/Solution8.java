import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the salary");
		int a  = s.nextInt();
		if (a <= 700000) {
			System.out.println("Income is 700000 or less");
			System.out.println("No tax required");
		}
		else {
			System.out.println("Income is greater then 700000.tax must be paid");
		}
	}

}
