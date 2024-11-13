import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		System.out.println("User! Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num % 3 == 0 && num % 5 == 0)
		{
			System.out.println("It is Multiple of 3 and 5");
		}
		else {
			System.out.println("It is Not multiple of 3 and 5");
		}

	}

}
