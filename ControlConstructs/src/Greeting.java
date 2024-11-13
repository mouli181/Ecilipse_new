import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        double a  = s.nextDouble();
	         if(a>=00.00 && a<=11.59){
	             System.out.println("Greeting: Good Morning");
	         }
	         else if(a>=12.00 && a<=17.59){
	             System.out.println("Greeting: Good Afternoon");
	         }
	         else if(a>=18.00 && a<=23.59){
	             System.out.println("Greeting: Good Evening");
	         }

	}

}
