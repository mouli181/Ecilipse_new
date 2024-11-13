
public class vertical {

	public static void main(String[] args) {
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=3;col++) {
				if(row<=3) {
				System.out.print("*");
			}}
	
			
			for(int col=4;col<=row;col++) {
				System.out.print("?");
			}
			System.out.println();
			
			
		}
//		for(int row=1;row<=3;row++) {
//			for(int col=1;col<=row;col++) {
//			System.out.print("?");
//		}
//			System.out.println();
//		}

	}

}
