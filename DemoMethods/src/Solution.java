
class Solution {
	public static void add(int a) {
		System.out.println("The Result is " + a);
	}
	public static void add(int a, int b) {
		System.out.println("?");
		System.out.println("The Result is " + (a+b));
	}
	public static void add(double a, double b) {
		System.out.println("The Result is " + (a+b));
	}
	public static void add(int a, double b) {
		System.out.println("The Result is " + (a+b));
	}
	public static void add(double a, int b) {
		System.out.println("The Result is " + (a+b));
	}
	public static void add(float a,int b) {
		System.out.println("???");
		System.out.println("The Result is " + (a+b));
	
	}
//	public static void add(float a,int b) {
//		System.out.println("???");
//		System.out.println("The Result is " + (a+b));
//	
//	}
//	public static void add(int a,int b) {
//		System.out.println("?");
//			System.out.println("The Result is " + (a+b));
//		
//		}
	

	public static void main(String[] args) {
		add(10);
		add(10,40);
		add(20.5,30.5);
		add(30,20.5);
		add(50.5,10);
		add(10.5f,20.5);
		add(10.5f,(int)29.5);
		add((int)25.5,(int)24.6);
	}

}
