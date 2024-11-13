import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		if(a>0)
		{
			System.out.println("Positive");
		}
		if(a % 2 == 0)
		{
			System.out.println("Even Number");
		}

	}

}
