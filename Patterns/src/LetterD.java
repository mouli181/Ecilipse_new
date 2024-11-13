
public class LetterD {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1;j<=10;j++) {
				if(j==1 || (i==1 || i==10) && j<=9 || j == 10 &&( i>=2 && i <=9)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
