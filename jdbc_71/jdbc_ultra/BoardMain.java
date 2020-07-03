package board2;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		while(true) {
		System.out.println("==게시물 프고그램==");
		System.out.println("1. 게시물 글쓰기");
		System.out.println("2. 게시물리스트 조회");
		System.out.println("3. 조건별 게시물 조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("번호입력 : ");
		
		Scanner scan = new Scanner(System.in);
		
		int menu = scan.nextInt();
		
		if(menu == 4) {
			System.out.print("게시판 프로그램 종료합니다.");
			System.exit(0);
			}//메뉴 종료 블럭
		else if(menu == 1) {
			BoardInsertView insertview = new BoardInsertView();
			insertview.input();
			//번호 = 게시물 가장 큰 번호 + 1;
			//제목
			//내용
			//작성자
			//시간 = sysdate
			//암호
			//조회수 = 0
		}
		else if(menu == 2) {
			BoardListView view = new BoardListView();
			view.input();
			//페이지 번호
			//한페이당 게시물 갯수
		}
		else if(menu == 3) {
			
		}
		}//메뉴 무한루프 블럭
	}

}

abstract class View{
	abstract void input();
}