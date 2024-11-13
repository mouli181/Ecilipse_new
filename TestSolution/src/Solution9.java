import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  the character");
		char ch = s.next().charAt(0);
		if(ch == 'A') {
			System.out.println("Upper case letter");
			System.out.println("end");
		}
		else if(ch == 'a') {
			System.out.println("Lower case letter");
		}

	}

}
