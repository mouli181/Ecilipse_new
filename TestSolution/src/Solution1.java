import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  the character");
		char ch = s.next().charAt(0);
		if (Character.isUpperCase(ch)) {
			   System.out.println("Character is in Uppercase!");
			}else {
			   System.out.println("Character is in Lowercase!");
			}

	}

}
