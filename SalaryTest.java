class Employee{
	int id;
	String name;
	int salary;
	int vonus;
	int sum;

	int sumSalary(int salary, int vonus) {	
		this.sum = salary + vonus;
		return sum;
	}
	Employee() {super();}
	Employee(int id, String name, int salary, int vonus) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.vonus = vonus;
		this.sum = sumSalary(salary, vonus);
		System.out.format("\n사번: %d\n이름: %s\n본봉 : %d\n총급여: %d\n",id, name, salary, sum);
	}
}

class Manager extends Employee {
	int managerVonus;
	
//	@Override
	int sumSalary(int salary, int vonus, int managerVonus) {
		this.sum = salary + vonus + managerVonus;
		return sum;
	}
	Manager(int id, String name, int salary, int vonus, int managerVonus) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.vonus = vonus;
		this.managerVonus = managerVonus;
		this.sum = sumSalary(salary, vonus, managerVonus);
		System.out.format("\n사번: %d\n이름: %s\n본봉 : %d\n총급여: %d\n",id, name, salary, sum);
	}

}
class Engineer extends Employee{
	int qualifyVonus;
	int techVonus;

//	@Override
	int sumSalary(int salary, int vonus, int qualifyVonus, int techVonus) {
		this.sum = salary + vonus + qualifyVonus + techVonus;
		return sum;
	}
	Engineer(int id, String name, int salary, int vonus, int qualifyVonus, int techVonus) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.vonus = vonus;
		this.qualifyVonus = qualifyVonus;
		this.techVonus = techVonus;
		this.sum = sumSalary(salary, vonus, qualifyVonus, techVonus);
		System.out.format("\n사번: %d\n이름: %s\n본봉 : %d\n총급여: %d\n",id, name, salary, sum);
	}
	
}
class Secretary extends Employee{
	int secretaryVonus;
//	@Override
	int sumSalary(int salary, int vonus, int secretaryVonus) {
		this.sum = salary + vonus + secretaryVonus;
		return sum;
	}
	Secretary(int id, String name, int salary, int vonus, int secretaryVonus) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.vonus = vonus;
		this.secretaryVonus = secretaryVonus;
		this.sum = sumSalary(salary, vonus, secretaryVonus);
		System.out.format("\n사번: %d\n이름: %s\n본봉 : %d\n총급여: %d\n",id, name, salary, sum);
	}
}
	
public class SalaryTest {
	public static void main(String[] args){
		Employee e [] = new Employee[4];
		e[0] = new Employee(1000,"김사원",35000,5000);
		e[1] = new Manager(2000,"이간부",50000,5000,14000);
		e[2] = new Secretary(3000,"최비서",30000,1200,7000);
		e[3] = new Engineer(4000,"박기술", 60000,8000,15900,24000);


	}
}
