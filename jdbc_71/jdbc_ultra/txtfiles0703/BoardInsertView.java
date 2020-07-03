package board;

import java.util.Scanner;

public class BoardInsertView {
 public void input() {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("제목 : ");
	 String title = scan.nextLine();
	 System.out.println("내용 : ");
	 String contents = scan.nextLine();
	 System.out.println("작성자 : "); //member테이블 존재 id
	 String writer = scan.nextLine();
	 System.out.println("글암호 : "); 
	 int password = scan.nextInt();
	 BoardVO vo = new BoardVO();
	 vo.setTitle(title);
	 vo.setContents(contents);
	 vo.setWriter(writer);
	 vo.setPassword(password);
	 BoardDAO dao = new BoardDAO();
	 int insert = dao.insertBoard(vo);
	 System.out.println(insert + " 개의 글쓰기가 완료되었습니다.");
	 
 }
}
