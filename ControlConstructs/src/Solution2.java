import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		System.out.println("User! Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("It is Multiple of 2");
		}
		else {
			System.out.println("It is Not multiple of Two");
		}
	}

}
