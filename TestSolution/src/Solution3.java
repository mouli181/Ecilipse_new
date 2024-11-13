import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if(num % 2 == 0) {
			System.out.println("Even number");
			System.out.println("end");
		}
		else {
			System.out.println("Odd number");
			System.out.println("end");
		}
	}

}
