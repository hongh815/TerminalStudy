package board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardListView {
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("페이지당 출력 게시물갯수: ");
		int boardcount = scan.nextInt();
		// 테이블 총게시물 : 13개
		// 페이지당 출력 게시물개수 : 3개
		
		System.out.println("페이지번호(1~?): ");
		int pagenum = scan.nextInt();
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardVO> list =
		dao.getBoardList(pagenum, boardcount);
		//list 출력 
		for(BoardVO vo : list) {
			System.out.println(vo);
			//(vo.getSeq()+":"+vo.getTitle()+":"+vo.getTime());
		}
	
	}
}













//int total = new BoardDAO().getBoardCount();
//int totalpagenum = 0;
//if(total % boardcount == 0) {
//	totalpagenum = total / boardcount;
//}
//else {
//	totalpagenum = total / boardcount + 1;
//}
//System.out.println("1페이지부터 " + totalpagenum + "페이지까지 조회 가능");



//while(true) {
//System.out.println("\n상세조회 게시물 번호 : ");
//int seq = scan.nextInt();
//if(seq == -1) {break;}
//System.out.println(seq+"\n\n");
//}