
public class Solution7 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			
			
			for(int j=1;j<=4;j++) {
				if(j==1 || i==2 || i==3 || j==4) {
					System.out.print("*");
				}
				else if(j==2 || j==3) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
