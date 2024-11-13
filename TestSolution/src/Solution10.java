import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the range value");
		int a  = s.nextInt();
		if (a >= 30 && a<=300) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
