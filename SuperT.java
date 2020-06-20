class A {
	int da;
	A() {super();}
	A(String s) {
		super();
		System.out.println("A 생성자 호출");
		this.da = 100;
	}
} 

class B extends A {

	double db ;		

	B() {
		super("b");
		System.out.println("B 생성자 호출");
		this.da = 1000;
	}
}

public class SuperT {

	public static void main(String[] args) {

		//A a1 = new A("d");
		B b1 = new B();
	

		System.out.println(b1.da);
		System.out.println(b1.db);
	}
}

