package singleInheritance;

import java.util.Scanner;

class Bank{
	String bname;
	String acname;
	String actype;
	
	public Bank(String bname,String acname, String actype){
		this.bname = bname;
		this.acname = acname;
		this.actype = actype;
	}
	void display() {
		System.out.println("The details are");
		System.out.println("Bank Name: " + bname);
		System.out.println("Account Name: " + acname);
		System.out.println("Account type: " + actype);
		System.out.println("The bank account created suceesfully");
	}
}
	
class SBI extends Bank{
	SBI(String bname,String acname, String actype) {
		super(bname,acname,actype);
	}
}
class ICICI extends Bank{
	ICICI(String bname, String acname, String actype) {
		super(bname,acname,actype);
	}
}

class HDFC extends Bank{
	HDFC(String bname,String acname, String actype) {
		super(bname,acname,actype);
	}
}

public class BankApplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String bname = s.nextLine();
		String acname = s.nextLine();
		String actype = s.nextLine();
		
		SBI s1 = new SBI(bname, acname, actype);
		s1.display();
		
		

	}

}
