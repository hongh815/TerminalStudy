public class InterfaceTest {

	public static void main(String [] args) {
		



		WorkStudent ws = new WorkStudent();
		ws.work();
		ws.study();
		ws.lunch();
	
		Student s = new WorkStudent();
		s.lunch();
		s.study();

		System.out.println(Worker.name);
		System.out.println(Student.name);
		System.out.println(s.name);
		WorkStudent ws2 = new WorkStudent();
		
		System.out.println(Worker.name);


	}

}	
