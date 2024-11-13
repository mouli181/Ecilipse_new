import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		System.out.println("User! Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num % 2 == 0 || num % 3 == 0)
		{
			System.out.println("It is Divisible by 2 or 3");
		}
		else {
			System.out.println("It is Not divisible by 2 or 3");
		}

	}

}
