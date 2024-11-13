
public class Solution5 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.println("*");
				if(j==2 || j==3) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
