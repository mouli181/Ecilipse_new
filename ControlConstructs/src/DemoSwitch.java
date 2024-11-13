import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! please Enter a Number-1");
		int a = s.nextInt();
		System.out.println("User! please Enter a Number-2");
		int b= s.nextInt();
		System.out.println("User! Enter The Operator");
		char ch = s.next().charAt(0);
		
		switch(ch)
		{
		
		case '+' : System.out.println(a+b);
		break;
		case '-' : System.out.println(a-b);
		break;
		case '*' : System.out.println(a*b);
		break;
		case '/' : System.out.println(a/b);
		break;
		case '%' : System.out.println(a%b);
		break;
		default : System.out.println("Invalid Operation");
		}
		System.out.println("End");
	}

}
