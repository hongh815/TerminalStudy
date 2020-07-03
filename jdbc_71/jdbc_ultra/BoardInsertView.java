package board2;

import java.util.Scanner;

public class BoardInsertView {
	public void input() {
		//글을 써야하는 내용들을 입력한다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제목 : ");
		String title = scan.nextLine();
		
		System.out.println("내용 : ");
		String contents = scan.nextLine();
		
		System.out.println("작성자 : "); // member table 에 있는 사람만
		String writer = scan.nextLine();
		
		System.out.println("암호 : ");
		int password = scan.nextInt();
		
		boardVO vo = new boardVO();
		vo.setTime(title);
		vo.setContents(contents);
		vo.setWriter(writer);
		vo.setPassword(password);
		
		BoardDAO dao = new BoardDAO();
		int insert = dao.insertBoard(vo);
		System.out.println(insert + " 개의 행 삽입");
	}
}
