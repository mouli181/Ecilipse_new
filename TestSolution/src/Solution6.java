import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User enter the number");
		int num  = s.nextInt();
		if(num%3==0 ) {
			System.out.println("Divisible by 3");
			System.out.println("end");
		}
		else {
			System.out.println("Not divisible by 3");
		}

	}

}
