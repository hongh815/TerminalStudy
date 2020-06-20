class Student {
	String name ;
	String id;
	String cal;
	int pay;
	int payPl;
	double payB;
}

public class StudentPay {
	public static void main(String [] args) {


		Student s = new Student();

		s.name = "김길동"; 
		s.id = "수습반";
		s.cal = "자바";


		if(s.cal.equals("자바")) {
			s.pay = 250000;
			s.payPl = 25000;
			s.payB = (s.pay + s.payPl)/0.35;}
		else if(s.cal == "JSP") {
			s.pay = 450000;
			s.payPl = 45000;
			s.payB = (s.pay + s.payPl)/0.25;}
		else if(s.cal == "프레임워크") {
			s.pay = 850000;
			s.payPl = 65000;
			s.payB = (s.pay + s.payPl)/0.55;} else System.out.println("과목이 잘못 입력되었습니다.");


		System.out.println("당신이 받으실 과목명은 " + s.cal + " 이며, 내실금액은 아래와 같습니다.\n 월납부액 : " + s.pay + "\n 월부과금 : " + s.payPl + "\n 환급액 : " + s.payB);




	}

}
