
public class Number {

	public static void main(String[] args) {
		int number = 1;
        
        System.out.println("Triangle Number Pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
	}

}
