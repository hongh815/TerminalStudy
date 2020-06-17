public class DayOne_2 {



	public static void main(String [] args) {



		int book = 54;
		int stu = 70;
	
		int d1 = book / stu;
		int d2 = book % stu;

		System.out.println(d2);


		String con = book > stu ? ("학생들이 각자 받을수 있는 책의 권수는 " + d1 + "권이고, 남은 책은 " + d2 + "권입니다.") : ("학생들 모두 책을 나눠가질만한 수량이 충분하지 못합니다. 죄송합니다.");

		System.out.println(con);
	}

}
