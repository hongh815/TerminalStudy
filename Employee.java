class ES {

	int number ;
	String name;
	double salary;
	String deptName;
}

public class Employee {
	public static void main(String [] args) {

		ES e1 = new ES();
		System.out.println(e1);

		e1.number = 35;
		e1.name = "김길동";
		e1.salary = 25000039.33;
		e1.deptName = "환경부";
		System.out.println("번호" + e1.number + " 이름=" + e1.name + " 급여=" + e1.salary + " 부서=" + e1.deptName);


	}
}
