import java.util.Scanner;

public class Solution12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the number");
		int num  = s.nextInt();
		if(num%2==0 ) {
			System.out.println("Divisible by 2");
			System.out.println("end");
		}
		else {
			System.out.println("end ");
		}

	}

}
