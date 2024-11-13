
public class Question1 {

	public static void main(String[] args) {
		for(int row=1;row<=3;row++) {
			for(int col=1;col<=9;col++) {
				if(col<=row) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			for(int j=4;j<=col;j++) {
					if(j<=col) {
					System.out.print("?");
				}
				else {
					System.out.print(" ");
				}
			}
			}
			
			System.out.println();
		}
	}

}
