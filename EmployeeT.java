class Employee {

	int id;
	String name;
	double pay;

	void printField() {
		System.out.println("사번=" + id + ", 이름=" + name + ",급여=" + pay); 
	}

}

class Manager extends Employee {

//상위 클래스 내용만 재정의 == 오버라이드

	String job;
	String title;

	@Override
	void printField() { 
		super.printField();
		System.out.println("직종= " + job + ",직급= "+ title );
	}

	void test() {
		String name = "test";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}

public class EmployeeT{
	public static void main(String [] args) {



		Employee e1 = new Employee();
		e1.id = 01;
		e1.name = "김아무개";
		e1.pay = 458922;


		Manager m = new Manager();
		m.name = "아무일도 없엇다~~";
		m.pay = 28293;

		m.test();
		m.printField();
	}	

}

