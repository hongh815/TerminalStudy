

class Test{

	int i;
	double j;

	final static String nation = "대한민국";

	Test() { }
}

public class TestFinal{
	public static void main(String[] args) {


		Test t = new Test();


		t.i = 55;
		t.j = 23.234;


		System.out.println(t.nation);
	}


}
