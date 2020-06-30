package io;
//한글 및 정수타입 수를 받아서 산술까지 하게 하는 IO
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 2개를 입력하면 덧셈결과를 출력합니다.");
		Scanner key = new Scanner(System.in);
		// 100 200 입력 --> 49 48 48 공백 50 48 48
		int first = key.nextInt();
		int second = key.nextInt();
		System.out.println(first + second);
		System.out.println("한글 포함 문자열을 입력하세요");
		//String <-- key의 공백 이전까지의 문자열 출력
		key.nextLine(); // 100 200 치고 엔터 치면 그 라인에 대한 끝맺음으로 인식해서 이렇게 공백을 넘기는 nextLine 추가10
		String third = key.nextLine();
		System.out.println(third);
		
		//한줄 전체 = nextLine

	}

}
