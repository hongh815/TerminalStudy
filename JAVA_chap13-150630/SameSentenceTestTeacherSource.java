package chap15;

import java.util.ArrayList;
import java.util.List;

class SameSentence{
	String[] compare(List<String> list1, List<String> list2){
		int size1 = list1.size();
		int size2 = list2.size();
		
		if(size1 > size2) {
			List<String> list3 = list1;
			list1 = list2;
			list2 = list3;
		}
		//===== list1 작은 사이즈
		
		String[] result = new String[10];
		//lisrt1, list2 매개변수 저장 문자열 내용을 index별 비교하여
        //같은 내용을 가졌을 경우 index의 문자열을 result 배열 저장
        //구현하시오.
        //ArrayList 비교 같은 문자열 -->String[] 변환

		
		List<String> equallist = 
				new ArrayList<String>();
		
		for(int i = 0; i <list1.size(); i++) {
			if(list1.get(i).equals(list2.get(i))) {
				equallist.add(list1.get(i));
			}
		}
		
		result = new String[equallist.size()];//배열길이 재조정
		equallist.toArray(result);// List -> 배열 복사 
		
		//result 내용 출력
		//for(String s : result) {
		//	System.out.println(s);
		//}
		return result;
	}
//	String[] compare(List<String> list1, List<String> list2){
//		int size1 = list1.size();
//		int size2 = list2.size();
//		
//		if(size1 > size2) {
//			List<String> list3 = list1;
//			list1 = list2;
//			list2 = list3;
//		}
//		//===== list1 작은 사이즈
//		
//		String[] result = new String[10];
//		//lisrt1, list2 매개변수 저장 문자열 내용을 index별 비교하여
//        //같은 내용을 가졌을 경우 index의 문자열을 result 배열 저장
//        //구현하시오.
//        //ArrayList 비교 같은 문자열 -->String[] 변환
//
//		//두개 리스트 비교해서 같은 문자열 가진 경우수
//		int cnt = 0;
//		for(int i = 0; i <list1.size(); i++) {
//			if(list1.get(i).equals(list2.get(i))) {
//				cnt++;
//			}
//		}
//		
//		//result 배열 크기 조정
//		result = new String[cnt];
//		
//		//result 배열 동일 문자열 저장
//		int index = 0;
//		for(int i = 0; i <list1.size(); i++) {
//			if(list1.get(i).equals(list2.get(i))) {
//				result[index++] = list1.get(i);
//			}
//		}
//		
//		//result 내용 출력
//		//for(String s : result) {
//		//	System.out.println(s);
//		//}
//		return result;
//	}
}
public class SameSentenceTest{
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("자바는 객체지향 언어입니다");
	list1.add("우리는 키트리에서 자바를 배우는 중입니다");
	list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
	list1.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("자바는 객체지향 언어입니다");
	list2.add("우리는 kitri에서 자바를 배우는 중입니다");
	list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
	list2.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
	
	ArrayList<String> list3 = new ArrayList<String>();
	list3.add("자바는 객체지향 언어입니다");
	list3.add("우리는 kitri에서 자바를 배우는 중입니다");
	list3.add("오늘은 콜렉션 프레임워크를 배우죠! ");
	
	SameSentence ss = new SameSentence();
	String[] r1 = ss.compare(list1, list2);
	System.out.println("======================");
	for(String s  : r1) {
		System.out.println(s);
	}
//list1, list2(size 동일) 에서 같은 내용 출력하도록 구현 추가
//2개 문자열 결과	

	String[] r2 = ss.compare(list1, list3);
	System.out.println("======================");
	for(String s  : r2) {
		System.out.println(s);
	}
//list3(작은 size) 의 갯수만큼만 같은 내용 출력하도록 구현 추가	
//1개 문자열 결과
	
}
}
