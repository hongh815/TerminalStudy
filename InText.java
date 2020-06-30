import java.io.IOException;
import java.util.*;

public class InText{
public static void main(String[] args){


	System.out.print("===== 메뉴=====\n1.파일저장 \n2.파일조회\n3.DB연결\n4.DB연결해제\n5.종료\n");

	try{
		int result = 0;
		while( (result = System.in.read()) != -1) {					if(result == 49) {
				System.out.println("파일을 저장합니다.");			
			}
			else if(result == 50) {
				System.out.println("파일을 조회합니다.");
			}
			else if(result == 51) {
				System.out.println("DB 연결합니다.");
			}
			else if(result == 52) {
				System.out.println("DB 연결해제.");
			} 
			else if(result == 53){
				System.out.println("종료.");
				break;
			}
			if(result==49||result==50||result==51||result==52||result==53) {
				System.out.print("===== 메뉴=====\n1.파일저장 \n2.파일조회\n3.DB연결\n4.DB연결해제\n5.종료\n");
			}
			
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	
}
}
