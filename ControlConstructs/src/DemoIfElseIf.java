import java.util.Scanner;

public class DemoIfElseIf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Enter The Number-1 value");
		int a = s.nextInt();
		System.out.println("User! Enter The Number-2 value");
		int b = s.nextInt();
		System.out.println("User! Enter The Character value");
		char ch = s.next().charAt(0);
		
		if (ch == '+')
		{
			System.out.println("The Addition of Two Numbers is " + (a+b));
		}
		else if (ch == '-')
		{
			System.out.println("The Subtraction of Two Numbers is " + (a-b));
		}
		else if (ch == '*')
		{
			System.out.println("The Multile of Two Numbers is " + (a*b));
		}
		else if (ch == '/')
		{
			System.out.println("The Devision of Two Numbers is " + (a/b));
		}
		else if (ch == '%')
		{
			System.out.println("The Remainder of Two Numbers is " + (a%b));
		}
		else
		{
			System.out.println("Invalid Operator");
		}
		System.out.println("End");
	}
	
}
