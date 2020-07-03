package board;

public class BoardVO {//1개 레코드 표현=객체
	//변수 / 생성자 / 메소드 순서 없다
// 게시물 레코드 - 7개컬럼
	int seq;
	String title , contents, writer, time;
	int password, viewcount;
	//생성자 정의
	public BoardVO() {}
	public BoardVO(int seq, String title, String time) {
		this.seq = seq;
		this.title = title;
		this.time = time;
	}
     
	//toString 오버라이딩
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	@Override
	public String toString() {
		return seq + ":" + title + ":" + time;
	}
	
	
}
