package board;

import java.util.Scanner;

public class BoardMain {

public static void main(String[] args) {
 while(true) {
 System.out.println("== 게시물 프로그램 ==");
 System.out.println("1. 게시물 글쓰기");
 System.out.println("2. 게시물리스트 조회");
 System.out.println("3. 조건별 게시물 조회");
 System.out.println("4. 프로그램 종료");
 System.out.println("번호 입력 : ");
 Scanner scan = new Scanner(System.in);
 int menu = scan.nextInt();
 if(menu == 4) {
	 System.out.println("게시판 프로그램 종료합니다");
	 System.exit(0);
 } else if(menu == 1) {
	 BoardInsertView insertview = new BoardInsertView();
	 insertview.input();
	 // 번호: 게시물가장큰번호+1 
	 // 제목 : ?
	 // 내용 : ?
	 // 작성자 : ?
	 // 시간 =sysdate
	 // 암호
	 // 조회수=0

	 
 } else if(menu == 2) {
	 BoardListView view = new BoardListView();
	 view.input(); 
	 // 페이지번호 : 
	 // 한페이지당 게시물갯수 : 
	 
 } else if(menu == 3) {
	 
 }
 }//while end
}//main end
}//class end



