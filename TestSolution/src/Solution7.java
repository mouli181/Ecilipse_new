import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the number1");
		int a  = s.nextInt();
		System.out.println("User enter the number2");
		int b  = s.nextInt();
		if (a == b) {
			System.out.println("The given shape is a square");
		}
		else {
			System.out.println("The given shape is not sqaure");
		}
	}

}
