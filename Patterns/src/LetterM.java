
public class LetterM {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1;j<=10;j++) {
				if(j==1 || j==10 || (j==2 || j==9) && i==2 || (j==3 || j==8) && i==3 || (j==4 || j==7)&& i==4 || i==5 && j==5) {
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
