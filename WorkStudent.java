

public class WorkStudent implements Worker, Student {

	String name = "실습";
	void print(){
		System.out.println(Worker.name + ", " + Student.name + ", " + name);
	}



	@Override
	public void work() {
		System.out.println("실습조교가 일하다.");

	}

	@Override
	public void study() {
		System.out.println("실습조교가 공부하다.");
	}

	@Override
	public void lunch() {
		System.out.println("실습조교가 점심을 먹다.");
	}


}
