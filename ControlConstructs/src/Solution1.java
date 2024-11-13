import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println("Enetr the Gender");
		Scanner scan = new Scanner(System.in);
		char gender =  scan.next().charAt(0);  
		
		if(gender == 'm' || gender == 'M')
		{
			System.out.println("Male");
		}
		if(gender == 'f' || gender == 'F')
		{
			System.out.println("Female");
		}
	}

}
