
public class DisneyChai {
	public static void getBill()
	{
		System.out.println("The bill is \u20B9 10");
	}
	public static void getBill(int quantity)
	{
		System.out.println("The bill is \u20B9 " + (10 * quantity) );
	}
	public static void getBill(String type1)
	{
		System.out.println("The bill for " + type1 +  " is \u20B9 20");
	}
	public static void getBill(int quantity, String type1)
	{
		System.out.println("The bill for " + quantity + "-" + type1 + " is \u20B9 " + (20 * quantity));
	}
	public static void getBill(String type1, String type2)
	{
		System.out.println("The bill for " + type1 +  " is \u20B9 20" + "," + "\nThe bill for " + type2 +  " is \u20B9 20");
	}

	public static void main(String[] args) {
		getBill();
		getBill(4);
		getBill("Masala chai");
		getBill(4,"Masala chai");
		getBill("Ginger chai","Masala Chai");

	}
	

}
