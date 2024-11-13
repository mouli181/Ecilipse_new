package singleInheritance;
class Pizza {
	//Constructor
	public Pizza() {
		System.out.println("Making a basic pizza");
	}
}
class PepperoniPizza extends Pizza{
	// Constructor 
	public PepperoniPizza() {
		System.out.println("Adding pepperoni on top");
	}
}
public class TestPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PepperoniPizza pizza = new PepperoniPizza();
		

	}

}
 