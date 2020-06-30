package chap15;
//SET을 이용하는 방법과 set으로 중복되지 않는 로또 번호 만들
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		//순서 상관없이 6개의 로또 번호 저장 1 ~ 45 사이의 정수
		
		
		HashSet<Integer> lottoset = new HashSet<Integer>();
		
		while(true) {
			int random = (int)(Math.random()*45)+1;
			System.out.println("난수 생성 : " + random);
			lottoset.add(random);
			if(lottoset.size() == 6) break;
			// lottoset에 6개의 난수를 넣고 이때 set의 특성상 중복되는 숫자는 무시된다. 그랬을때 사이즈가 6이되면 멈춤
		}
		
		for(Integer i : lottoset) {
			System.out.println("로또셋 : " + i);
		}
		
/*		set.add(100);
		set.add(2);
		set.add(14);
		set.add(2444);
		System.out.println(set.size());
		
		for(Object o : set) {
			System.out.println(o);
		}
*/		

	}

}
