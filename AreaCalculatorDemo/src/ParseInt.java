import java.util.Scanner;

public class ParseInt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		int num = Integer.parseInt(str);
		System.out.println("Num = " + num);
		System.out.println(num+6);

	}

}
