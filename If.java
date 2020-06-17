public class If{


	public static void main(String [] args) {


		String name = "누구시죠..?";

		int kor = 90,  mat = 80, eng = 99;

		int sum = kor + mat + eng;
		int avg = sum / 3;
		System.out.println("당신의 국어점수는 : " + kor + "\n당신의 수학점수는 : " + mat + "\n당신의 영어점수는 : " + eng);
		System.out.println(name + " \n당신의 총합점수는 :" + sum + " \n당신의 평균점수는 :" + avg);
		if(avg > 90) {

			System.out.println("당신은 A");
		} else if(avg > 80) System.out.println("당신은 B");
		else if(avg > 70) System.out.println("당신은 C");
		else if(avg > 60) System.out.println("당신은 D");
		else System.out.println("니는 낙제야");

	}
}

