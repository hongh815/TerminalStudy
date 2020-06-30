package chap15;
import java.util.*;
//갯수는 미정인데 계속 배열처럼 리스트에 저장하고싶다면 !! ArrayList!
class Employee {
	int i ;
	String name;
	double j;
	
	public Employee(int i, String name, double j) {
		this.i = i;
		this.name =name;
		this.j = j;
	}

	@Override
	public String toString() {
		return i + ":" + name + ":" + j;
	}
}

public class ArrayListTest {

	public static void main(String[] args) {
		//"java" 100 3.14 Employee객체
		
		ArrayList<Employee>
				/*어레이리스트에 밑에 있는 java나 그런값 다 금지시키고 Employee 클래스 값만 넣게 하는것*/ 
		list = new ArrayList<Employee>(5);
		//list.add("java");
		//list.add(100);
		//list.add(3.14);
		
		Employee e1 = new Employee(100, "김한국", 78000.55);
		list.add(e1);
		Employee e2 = new Employee(100, "김한", 11000.55);
		list.add(e2);
		Employee e3 = new Employee(100, "김국", 72420.55);
		list.add(e3);
		// c(add) r(get) u(set) d(remove)
		//list.remove(1); 100삭제
		//list.set(1, "새값");
		list.add(e3);
		

		System.out.println("현재까지의 데이터 저장 갯수 : " + list.size());
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.	get(i).name);
		}

		for(/*반복중 1개의 대상*/Object/*String 뿐 아니라 int값 double값 또는 모든 클래스의 값을 넣을때 */ one : list) {
			System.out.println(one);
		}
	
		//Employee 객체일때 name 변수 출력
		//if(list.get)
	
	}

}
		