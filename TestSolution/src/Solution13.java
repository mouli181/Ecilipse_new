import java.util.Scanner;

public class Solution13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the number");
		int a  = s.nextInt();
		if (a >=1) {
			System.out.println("Positive");
		}
		else if(a<0) {
			System.out.println("Negative");
		}

	}

}
