package chap11;

public class PatternTest {
//[구성요소]{반복횟수}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String phone = "02-1234-5678";
//		String phone = "010:1234-5678";
//		String phone = "010-12-5678";
//		String phone = "010;1234-5678";
		String phone = "011-1234-5678";
//		String phone = "02-일234-5678";
		//String pattern1 = "010-[0-9]{3,4}-[0-9]{4}";
		String pattern1 = "(010|011)-[0-9]{3,4}-[0-9]{4}";
		boolean result1 = phone.matches(pattern1);
		System.out.println(result1);
		
		
		
		//이메일양식 체크 : //숫자와영문자들 8-10자리
						//@ 영
						//문자들최대10자리
						// \\.
						//com이나net
		//email 변수값
		String email = "java0101@kitri.com";
		String pattern2 = "[0-9a-z]{8,10}@[a-z]{1,10}\\.(com|net)";
		boolean result2 = email.matches(pattern2);
		System.out.println(result2);
		if(result2 == false) {
			System.out.println("이메일은 영소문자와 숫자를 조합으로 한 8자리에서 10자리 사이의 조합으로만 등록이 가능합니다.");
		} else System.out.println("안녕하세요 " + email + "님,");
		
	
	}

}
