package board2;

import java.util.ArrayList;
import java.util.Scanner;

import board.BoardVO;

public class BoardListView {
	
		public void input() {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("페이지당 출력 게시물갯수 : ");
			int boardcount = scan.nextInt();
			//테이블 13개
			//페이지당 출력 게시물 3개
			BoardDAO dao = new BoardDAO();
//			int totalcount = dao.getBoardCount();
			
			int totalpage = new BoardDAO().getBoardCount();
			int totalpagenum = 0;
			if(totalpage % boardcount == 0) {
				totalpagenum = totalpage / boardcount;
			}
			else {
				totalpagenum = totalpage / boardcount + 1;
			}
			
			System.out.println("페이지 번호 : ");
			int pageum = scan.nextInt();
			
			//System.out.println(pageum + " " + boardcount);
			ArrayList<boardVO> list = dao.getBoardList(pageum, boardcount);
			
			for(boardVO vo : list) {
				System.out.println(vo);
				//(vo.getSeq() + ":" + vo.getTitle() + ":" + vo.getTime());
			}
			
			System.out.println("\n 상세조회할 게시물 입력 : ");
			int seq = scan.nextInt();
			boardVO one = dao.getDetailBoard(seq);
			System.out.println("번호 : " + one.getSeq());
			System.out.println("제목 : " + one.getTitle());
			System.out.println("내용 : " + one.getContents());
			System.out.println("작성자 : " + one.getWriter());
			System.out.println("암호 : " + one.getPassword());
			System.out.println("조회수 : " + one.getViewcount());
			//update     1.수정 2.삭제 하는 옵션 넣어본다
			//1,2 모두 글 암호 입력 : seq,password select sql
			// 암호 안맞다면 권한 없습니다 출력, 맞았다면 
			// 수정 : 제목 or 내용 or 작성자 수정 가능하게
			// 수정 항목 : '제목' 또는 '내용' 또는 '*'
			// 수정내용 : xxxx
			// seq, 수정항목, 수정 내용 update sql
			// 삭제 : seq 받아서 delete seq
			System.out.println("1.수정 2.삭제 : "); 
			int worknum = scan.nextInt();
			if(worknum != 1 && worknum != 2) { //다른 값 입력하면 return 하면서 원래 메뉴
				return;
			}
			else { //1,2 모두 경우 글 암호 입력
				System.out.println("글 암호 입력 : ");
				int password = scan.nextInt();
				boolean result = dao.checkPassword(/*번호, 입력글암호*/seq, password);
				if(result) { //글 암호가 맞으면
					if(worknum == 2) {
						dao.deleteBoard(seq);
					}
					else if(worknum == 1) {//수정
						System.out.println("수정항목 입력(제목 내용 * 중 하나 입력가능) : ");
						String column = scan.next();
						System.out.println("수정할 내용 내용 입력 : ");
						String value = scan.nextLine();
						dao.updateBoard(seq, column, value);
						// column 변수에 제목이 들어가면
						// update board set title = value 변수값
						// column 변숙밧에 내용이 들어가면
						// update board set contents = value 변수값'
						// column 변수값에 * 이 들어가면
						// update board set title = value , contents = value
					}
				} // result == true  인경우로 암호가 맞으면
				else {
					System.out.println("권한 없음");
					
				}
			}
			
			
			
			//boardVO one = dao.getDetailBoard(seq);
		}
		//게시물 리스트 :
		//contents : varchar2(4000);
}
