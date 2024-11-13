
public class Diamond {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1;j<=10;j++) {
				if(i+j==6 || i-j==4 || j-i==5 || i+j==16) {
					System.out.print("*");
				}
				else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
 
	}

}
