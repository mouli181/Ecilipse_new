import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mark");
		int a = s.nextInt();
		int b = a/10;
		switch(b)
		{
		case 9 : System.out.println("Grade is A");
			break;
		case 8 : 
		case 7 : System.out.println("Grade is B");
			break;
		case 6 : 
		case 5 : System.out.println("Grade is C");
			break;
		case 4 : System.out.println("Grade is D");
			break;
		case 3 : 
		case 2 : 
		case 1 : 
		case 0 : System.out.println("Grade is F");
			break;
		default : System.out.println("Invalid mark");
		}
	}

}

