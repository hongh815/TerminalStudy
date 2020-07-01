// 경로 입력했을때 디렉토리나 파일 정보 가져오는 클래스

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileClassTest {

public static void main(String[] args) throws IOException/*try를 넣기 귀찮을때 자바가 알아서 하라는 명령*/ {
// args[0] : run - ... 입력변수
// Scanner s = new Scanner();
	//a.txt   . c:/test 입력해보는 것
	Scanner s = new Scanner(System.in);
	System.out.println("파일명이나 디렉토리명을 입력하세요.\n");
	String input = s.nextLine(); //문장 하나 입력
	
	// input : 존재여부, 파일(총 크기, 경로 , 읽기쓰기 여부, 마지막 수정일자)
	// 디렉토리 (세부목록 출력)
	
	File f = new File(input);
	if(f.exists()) {
		if(f.isFile()) {//우리가 선언한 input에 입력된 이름으로 된 파일이 있는지 여부
			System.out.println("파일의 총 크기 = " + f.length() + " Byte");
			System.out.println("파일의 절대경로 = " + f.getCanonicalPath());
			System.out.println("파일읽기 = " + f.canRead());
			System.out.println("파일쓰기 = " + f.canWrite());
			
			long time = f.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD E HH:mm:ss");
			// ---> 1/1000 초로 표기되는 최종수정일자를 보기 좋게 바꿔주는 클래스
			String timeSdf = sdf.format(time); // 위의 크래스를 time에 적용
			System.out.println("최종수정일자 = " + timeSdf);
			
		}
		else {//파일형식에 그런 이름이 없다면 디렉토리일때
			System.out.println("디렉토리목록은 다음과 같습니다. ");
			String[] details = f.list(); // 디렉토리 f의 세부목록을 모두 갖기 위해 배열
			for(String one : details) { // 출력을 위한 for문
				System.out.println(one);
				
			}
		
		}
	}
	else {
		System.out.println(input + " 은(는) 존재하지 않습니다. ");
	}

}

}
