package chap11;
import java.util.*;

import java.util.StringTokenizer;

/* 실행 결과: 
1. 이름: Arnold Alois Schwarzenegger
2. 이름 (대문자): ARNOLD SCHWARZENEGGER
3. 이니셜:  AAS
4. First Name은 arnold이다. (대소문자 구분; T/F):  false
5. First Name은 arnold이다. (대소문자 미구분; T/F):  true
6. Last Name Schwarzenegger의 index 번호 6~14까지 문자열 : zenegger
7. Last Name Schwarzenegger에서 negger 문자열의 위치 : 8 */

public class StringTest {
	  public static void main(String[] args) {
		String first = "Arnold";
		String middle = "Alois";
		String last = "Schwarzenegger";
		String initials;
		String firstInit, middleInit, lastInit;
		
		firstInit = first.toUpperCase();
		middleInit = middle.toUpperCase();
		lastInit = last.toUpperCase();
		initials = first.substring(0, 1) + middle.charAt(0) + last.charAt(0) ;

		System.out.print("1. 이름: ");
		System.out.println(first + " " + middle + " " + last);
		System.out.print("2. 이름 (대문자): ");
		System.out.println(firstInit + " " + lastInit);
		System.out.print("3. 이니셜:  ");
		System.out.println(initials);
				
		System.out.println("4. First Name은 arnold이다. (대소문자 구분; T/F):  " + first.equals("arnold"));
		System.out.println("5. First Name은 arnold이다. (대소문자 미구분; T/F):  " + first.equalsIgnoreCase("arnold"));
			
		System.out.println("6. Last Name " + last + "의 index 번호 6~14까지 문자열 : " +  last.substring(6));
		System.out.println("7. Last Name " + last + "에서 negger 문자열의 위치 : " + last.indexOf("negger"));	
		
		//split()
		String addr = "서울시--구로구:구로동;코오롱밸리/405호-임베디드과정";
		String[] detail = addr.split("--"); // 빈칸 = \\s(\\뒤에 붙이면 특수문자로 인식한다 그래서 \\. 이런식으로 .을 특수문자 취급하여 분리요소로 사용할 수 있다.)
		System.out.println("\ndetail의 분리 갯수 : " + detail.length + "\n");
		for(String one : detail) { // detail이 String 타입이니까 일치 시켜주고 detail의 배열 하나하나를 one이라 칭하고 이 수만큼 출력한다.
			System.out.println(one);
		} System.out.println();
		
		//자바는 java.lang 말고는 다른 패키지는 모두 import해야하는데 아래의 클래스가 그렇다
		//StringTokenizer()
		StringTokenizer st = new StringTokenizer(addr,"--:;/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		} //main end
	} //class end