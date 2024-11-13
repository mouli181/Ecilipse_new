import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Gender");
		char ch = s.next().charAt(0);
		if(ch == 'M') {
			System.out.println("Male");
		}
		if(ch == 'F') {
			System.out.println("Female");
		}
	}

}
