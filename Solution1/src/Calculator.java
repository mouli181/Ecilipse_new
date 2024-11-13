import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the A value");
		int a = scan.nextInt();
		System.out.println("Enter the B value");
		int b = scan.nextInt();
		int add_result=add(a,b);
		int sub_result=sub(a,b);
		int mul_result=mul(a,b);
		int div_result=div(a,b);
		int rem_result=rem(a,b);
		System.out.println("Addition of Two Numbers is " + add_result);
		System.out.println("Suntraction of Two Numbers is " + sub_result);
		System.out.println("Multiplication of Two Numbers is " + mul_result);
		System.out.println("Devision of Two Numbers is " + div_result);
		System.out.println("Remainder of Two Numbers is " + rem_result);
		scan.close();
		
	}
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int mul(int a, int b)
	{
		return a*b;
	}
	public static int div(int a, int b)
	{
		return a/b;
	}
	public static int rem(int a, int b)
	{
		return a%b;
	}
	}
	