import java.util.Scanner;

public class ExampleSwitch {

	public static void main(String[] args) {
//		System.out.println("User! please enter one number");
//		Scanner c = new Scanner(System.in);
//		
//		
////		byte b = c.nextByte();
////		short s = c.nextShort();
////		double d = c.nextDouble();
////		float f = c.nextFloat();
////		long l = c.nextLong();
//		String s1 = c.next();
//		
//		
//		switch(s1) {
//		case "one": if(1>0)
//		{
//			System.out.println("1 is odd");
//		}
//		else {
//			System.out.println("ENTER str");
//		}
//			
//		switch(s1) {
//		case "one": System.out.println("One");
//			break;
//		
//		
////		case 2: System.out.println("Two");
////			break;
////		case 3: System.out.println("Three");
////			break;
////		case 4: 
////			System.out.println("Four");
////			break;
////		case 5: System.out.println("Five");
////			break;
//		default : System.out.println("Invalid Range value");
//		}
//		}
//		switch(s1) {
//		case "one": System.out.println("One");
//			break;
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Enter the grade");
		char a = scan.next().charAt(0);
		
		switch(a) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E': System.out.println("Pass");
			break;
//		case 6:
//		case 7:
//		case 8:
//		case 9:
//		case 10: System.out.println("Number is 6-10");
//			break;
		default : System.out.println("Fail");
		}
	}

}
