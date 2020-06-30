package io;

import java.io.IOException;

public class KeyboardTest {

	public static void main(String[] args) {
		//키보드 입력 ; --> 문자 인코딩 숫자 0:48  A:65 a:97 가:?
	/*	try{
			int result = System.in.read();
			System.out.println(result);
		} catch(IOException e) {
			e.printStackTrace();
		}
*/ //하나 입력 받는 경우
		
		//엔터키 입력될 때까지 계속 입력 반복
		try {
			int result = 0;
			while( (result=System.in.read()) != -1/*엔터키 아스키코드 번호 = 13*/) {
				System.out.println((char)result);			//ctrl + z == -1, char == 문자를 단위로 그대로 출력
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//한글은 char로 출력 불가, char는 정수타입을 인식 못한다
	}

}
