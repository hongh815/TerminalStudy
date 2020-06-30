package chap11;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest {
	public static void main(String[] args) {
		
		//sysdate 현재시각 가져오기
		
		//현재시각(1/1000초) 아주정밀한 시간을 측정하므로 주로 코드리뷰할때 사용한다. 내가 만든 코딩이 효율적인가하는 것.
		System.out.println(System.currentTimeMillis());  
				
		//현재시각 보기좋게
		Date now = new Date();
		System.out.println(now);
	
		//Date의 형식변경 년도4-월2-일2 시:분:초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss"); 
		/* MM : 월
		 * mm : 분
		 * HH : 24시간으로 표시
		 * hh : 12시간으로 표시
		 * E : 요일
		 */
		String nowstr = sdf.format(now);
		System.out.println(nowstr);
		
		//또 하나의 현재시각 가져오는 클래스 -- Calendar
		//abstract class A --> new 사용하지 못한다.
		//지역국가언어
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		String calstr = sdf.format(cal.getTime());
		System.out.println(calstr);
	
	}

}
