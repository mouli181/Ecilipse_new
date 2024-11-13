import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		System.out.println("Enter the Integer Number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("The square is " + findSquare(n));

	}
	public static int findSquare(int a) {
		return (a * a);
	}

}
