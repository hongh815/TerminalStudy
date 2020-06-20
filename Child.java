class Parent{

	int x=10;
	void ma() { System.out.println(x); }
	void mp() { System.out.println("Parent"); }

}


class Child2 extends Parent {

	int x=100;
	void ma() { System.out.println(x); }
	void mc() { System.out.println("Child"); }

}

public class Child {
	public static void main(String [] args) {


		Parent p1 = new Parent();
		Child2 c2 = new Child2();
		Parent p2 = new Child2();
	
		//	Child2 c3 = (Child2) new Parent(); 차일드2의 상위클래스인 페어런트에는 차일드2 타입이 
		//	들어있지 않으므로 오류가 뜨게 된다.
	
		System.out.println(p1.x);
		p1.ma();
		p1.mp();
	System.out.println();

		System.out.println(c2.x);
		c2.ma();
		c2.mc();
	System.out.println();

		System.out.println(p2.x);
		p2.ma();
	System.out.println();

//		System.out.println(c3.x);
//		c3.ma();
//		p2.mp();



	}

}
