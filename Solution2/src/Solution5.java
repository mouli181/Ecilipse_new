import java.util.Scanner;

public class Solution5 {
	public void swapTwoNumbers()
	{
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the A value");
		int a = scan.nextInt();
		System.out.println("Enter the B value");
		int b = scan.nextInt();
		int c;
		System.out.println("before Swapping A is " + a);
		System.out.println("bfore Swapping B is " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping A is " + a);
		System.out.println("After Swapping B is " + b);
	}
}
