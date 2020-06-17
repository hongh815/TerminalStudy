public class DayOne_3 {


	public static void main(String [] args) {



		int time = 10000;
		int hour = 10000 / 3600;
		int min = (10000%3600) / 60;
		int sec = (10000%3600)%60 ;

		System.out.println(time + "초는" +" "+ hour +  " 시간 " + min + " 분 " + sec + " 초입니다.");
	}
}
