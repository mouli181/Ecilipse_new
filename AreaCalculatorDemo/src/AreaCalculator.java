
class AreaCalculator {
	
	
	public static void calculateArea(float a)
	{
		System.out.println("The Area of Square is " + (a * a));
	}
	public static void calculateArea(double r)
	{
		System.out.println("The Area of Circle is " + (3.14 * r * r));
	}
	public static void calculateArea(int l, int w)
	{
		System.out.println("The Area of Rectangle is " + (l * w));
	}
	public static void calculateArea(double a, double b, double s)
	{
		System.out.println("The Surface Area of Pyramid is " + (3 * (a * b) + 3 * (b*s)));
	}
	public static void main(String[] args) {
		calculateArea(4f);
		calculateArea(10.2);
		calculateArea(20,10);
		calculateArea(2.5,1.5,1.0);
	}
}
