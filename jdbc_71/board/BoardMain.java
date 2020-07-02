package board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
			System.out.println("=== 게시물 프로그램 ===");
			System.out.println("1. 게시물 글쓰기");
			System.out.println("2. 게시물 리스트 조회");
			System.out.println("3. 조건별 게시물 조회");
			System.out.println("4. 프로그램 종료");
			System.out.println("번호 입력 : ");
			
			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();
			
			if(menu == 4) {
				System.out.println("게시판 프로그램 종료합니다. ... ㅜㅜ");
				System.exit(0);
			}
			else if(menu == 1) {
				/* 번호 == 게시물의 최대 큰 번호 + 1
				 * 제목 
				 * 내용
				 * 작성자
				 * 시간  == sysdate
				 * 암호
				 * 조회수 == 초기값 0
				 */
				
				BoardInsertVeiw insertview = new BoardInsertVeiw();
				insertview.input();
			}
			else if(menu == 2) {
				
			}
			else if(menu == 3) {
				
			}
		} //while

	} //main

} //class
