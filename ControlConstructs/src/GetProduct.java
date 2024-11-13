import java.util.Scanner;

public class GetProduct {
	public static String getProductName(String productCode) {

        switch(productCode) {

            case "P1":

                return "Chips";

            case "P2":

                return "Coke";

            case "P3":

                return "Candy";

            default:

                return "Product Not Found";

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String productCode = scanner.nextLine();

        String productName = getProductName(productCode);

        System.out.println(productName);

    }
}
