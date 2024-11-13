import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		char inputChar = s.next().charAt(0);

        if (Character.isDigit(inputChar)) {
            System.out.println("number");
            System.out.println("end");
        } else {
            System.out.println("end.");
        }

	}

}
