import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		System.out.println("User! Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num % 4 == 0 && num % 3 == 0)
		{
			System.out.println("It is Multiple of 4 and divisible by 3");
		}
		else {
			System.out.println("It is Not Multiple of 4 and divisible by 3");
		}

	}

}
