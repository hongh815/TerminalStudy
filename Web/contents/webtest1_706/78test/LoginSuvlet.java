package test;
// 클라이언트가 요청한 데이터를 불러오는 파일 서블렛 파일

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginSuvlet") // url 에서 서블릿 이름으로 쓰겟다는 의미 form 의 action에 이걸 쓰자
public class LoginSuvlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// id, pw input 태그 입력값 전송받는 것
		String id = request.getParameter("id"); //나에게서 선언되었던 id 읽어와라
		String pw = request.getParameter("pw");
	
		//db select - (id와 pw가 있는지 조회)
		//클라이언트 브라우저에 id : xxx password : xxxx 정상적으로 로그인 완료 라고 출력
		
		// sql도 java에서 입력시 String 으로 다 처리하듯이 html파일도 그렇게 한다
		String html = "<h1>아이디 : " + id + " 암호 : " + pw
				+ " 정상적으로 로그인 완료</h1>";
		System.out.println(html);
		
		//브라우저로 응답을 할때 한글 텍스트 오류 나는 부분을 수정해서 전세계 모든 언어 호환으로 변경
		response.setContentType("text/html;charset=utf-8");
		
		//서블릿이 실행한 결과를 브라우저로 츨력 == 요청브라우저로 응답
		PrintWriter out = response.getWriter();
		out.print(html);
	
	}
}
