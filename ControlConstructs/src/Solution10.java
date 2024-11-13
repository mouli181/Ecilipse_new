import java.util.Scanner;

public class Solution10 { 
	public static void main(String[] args) 
	{ 
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter a number: "); 
		int num=scan.nextInt(); 
		if(num%3==0||num%5==0||num%7==0) 
		{ 
			if(num%3==0&&num%5==0&&num%7==0) 
			{ 
				System.out.println("The number is divisible by both 3, 5 and 7"); 
			} 
			else if(num%3==0&&num%5==0) 
			{ 
				System.out.println("the number is divisible by Three and five"); 
			} 
			else if(num%5==0&&num%7==0) 
			{ 
				System.out.println("The number is divisible by five and seven"); 
			} 
			else if(num%3==0&&num%7==0) 
			{ 
				System.out.println("The number is divible by three and seven");
			} 
			else if(num%3==0) 
			{ 
				System.out.println("the number is divisible by three"); 
			} 
			else if(num%5==0) 
			{ 
				System.out.println("the number is divisible by five"); 
			} 
			else if(num%7==0) 
			{ 
				System.out.println("the number is divisible by seven"); 
			} 
		} 
	} 
}
