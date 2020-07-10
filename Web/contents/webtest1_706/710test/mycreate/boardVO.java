package vo;
//게시물 레코드 - 7개 컬럼
public class boardVO { //1개의 레코드 표현해주는 것이다.
	int seq;
	String title, contents, writer, time;
	int password, viewcount;

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

	public boardVO(int seq, String title, String time) {
		super();
		this.seq = seq;
		this.title = title;
		this.time = time;
	}
	
	public boardVO() {
		
	};
	
	@Override
	public String toString() {
		return seq + ":" + title + ":" + time;
	}
	public boardVO(int seq, String title, String contents, String writer, String time, int password, int viewcount) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.time = time;
		this.password = password;
		this.viewcount = viewcount;
	}
	public boardVO(String title) {
		super();
		this.title = title;
	}
	public boardVO(String title, String contents) {
		super();
		this.title = title;
		this.contents = contents;
	}
	
	
}
