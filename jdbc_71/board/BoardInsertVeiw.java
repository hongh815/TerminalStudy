package board;

import java.util.Scanner;

public class BoardInsertVeiw {
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String contents = scan.nextLine();
		System.out.println("작성자 : "); //member 테이블의 존재하는 id
		String writer = scan.nextLine();
		System.out.println("암호 : ");
		int password = scan.nextInt();
		
		BoardVO vo = new BoardVO(); //vo에 데이터 저장후 더 쉽게 보내기 위해 
		vo.setTitle(title);
		vo.setContents(contents);
		vo.setWriter(writer);
		vo.setPassword(password);
		
		BoardDAO dao = new BoardDAO();
		int insert = dao.insertBoard(vo); // vo 에 저장된 값 갯수 확인
		System.out.println(insert + " 개의 글쓰기가 완료되었습니다.!");
	
	
	
	}

}
