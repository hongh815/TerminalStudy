package chap11;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObject o1 = new MyObject("자바");
		MyObject o2 = new MyObject("자바");
		/*if(키보드입력문자 = q) {
			System.exit(0);
		}   시스템을 q 누르면 종료하는 함수*/
		System.out.println(System.currentTimeMillis()); // 1000분의 1초 출력
		System.out.println(o1/*toString() 자동 호출*/);
		
		"java".charAt(0); // j 출력
		"java".indexOf("j"); // j의ㅇ 위치 0 출력
		"java".length(); // java의 문자 갯수 = 4
		"자바".replace("바", "vA"); // 바가 보이면 뒤에 vA로 바꿔라
		"자바프로그래밍".substring(3,5); //3번 인덱스부터 5번 인덱스까지의 로그 496p참조
		
		//java.lang.Object@15db9742
		//객체클래스타입@객체주소 16진수값
		//"자바" 출력하고싶다 --> 
		System.out.println(o1.toString());
		System.out.println(o2);
		System.out.println(o2.toString());
		
		if(o1.equals(o2)) {
			// 두개의 참조변수가 참조하는 heap영역의 주소값 동일한지 판단해줌
			// 메소드 overriding 동등성 비교 대상 변경가능
			// o2라는 매개변수 타입이 MyObject 타입이고 이때 전달되는 매개변수의 문자열이 동일하면 true
			System.out.println("o1.equals(o2) 참");
		}
		if(o1 == o2) {
			// 참조변수가 참조하는 메모리 heap영역에 주소값이 동일한지 판단해줌
			// 동등비교연산자 overriding 불가
			System.out.println("o1 == o2  참");
		}
		//System.out.println(System.currentTimeMillis());
	}

} // ObjectTest end

class MyObject /*extends Object 가 숨어있다*/{
	String msg;
	public MyObject(String msg) {
		this.msg = msg;
	}
	// toString() overriding
	@Override
	public String toString() {// 16진수의 주소값으로 나오는 것을 "자바" 출력하게 하기 위한 것
		return msg;
	}
	@Override
	//obj <--- o2(MyObject객체)
	public boolean equals(Object obj/*obj는 Object 타입이다*/) { //equals메소드는 불리언값을 출력으로 하기 때문에 불리언 타입을 넣는다.
		
		// 매개변수 타입이 마이오브젝트 타입이고 전달 문자열 동일하면 true
		if(obj instanceof MyObject) {
			return toString().equals(obj.toString());
		} else return false; //MyObject 타입이 아니면 출력
	}
}