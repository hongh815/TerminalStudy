package chap15;
import java.util.*;

public class PhoneMapTest {

	public static void main(String[] args) {
		HashMap<String, String[]> phonemap = new HashMap<String, String[]>();	
		
	//3사람
		String[] first = {"010-454-4744","02-151-4521", "031-445-4161"};//처음 배열 생성시 값을 저장하는 방법
		String[] second = {"010-4522-4744","02-451-4525"};//배열생성 - 값저장
		String[] third = {"010-454-4744","hongh815@gmail.com"};
		
		phonemap.put("신용권", first);
		phonemap.put("박기슬", second);
		phonemap.put("한강기", third);
		
		System.out.println("저장인원수 = " + phonemap.size());
		
		//phonemap.put("신용권", new String[3]);//새로운 String 타입 배열만 선언된 상태로 수정된다.
		//System.out.println(phonemap.size());
		String[] search = phonemap.get("신용권");// 특정한 key값의 value값을 갖고오라는 명령어
		for(String one : search) {
			System.out.println(one);
			
		}
		//phonemap 모든 데이터의 키와 값 조회 (키값 중복 ㄴㄴ)
		Set<String> names = phonemap.keySet(); //해당 set의 모든 값을  불러온다
		for(String name : names) {
			
			String[] onenum = phonemap.get(name); // 우리가 원하는 모양으로 보기좋게 가져온다.
			for(String num : onenum) {
				System.out.println(name+ ":" + num);
		}
		
		
	}

	}
}

// ArrayList : 순서, 중복 o
// Set, Map