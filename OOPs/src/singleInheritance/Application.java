package singleInheritance;

public class Application {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child s = new Child();
		System.out.println(s.getPmoney());
		System.out.println(s.cmoney);
		s.setPmoney(2000);
		System.out.println(s.getPmoney());
		System.out.println();
		
		
		System.out.println(p.getPmoney());
		//System.out.println(p.cmoney);
//		p.setPmoney(2000);
//		System.out.println(p.getPmoney());

	}

}
