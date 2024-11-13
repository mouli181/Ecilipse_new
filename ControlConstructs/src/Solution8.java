import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		System.out.println("User! Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num % 3 == 0 || num % 5 == 0 )
		{
			
			
			if(num % 5 == 0 && num % 7 == 0) {
				System.out.println("It is Multiple of 3 Or Multiple of 5 and divisible by 7");
			}
		}
		else {
			System.out.println("It is Not Multiple of 3 Or Multiple of 5 and divisible by 7");
		}
	}

}
