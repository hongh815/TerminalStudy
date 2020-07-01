package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {//1개의 서버
	public static void main(String[] args) throws Exception {
	
		//1. port 번호 설정 서버소켓 생성(9999)
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("[서버] : 시작됨");
		
		while(true) {
			//2. 클라이언트 대기 4. 접속허용
			Socket s = ss.accept();
			String client = s.getInetAddress().getHostAddress();
			System.out.println("[서버] : " + client + " 컴퓨터 연결 허용됨");
			
			//6. 클라이언트 전송한 데이터(byte[]) 입력  -- 보낸쪽에서 byte[]이니까 그렇게 받는다
			InputStream i = s.getInputStream();
			
			//방법1
			//byte[] imsi = new byte[200];
			//i.read(imsi); //소켓으로부터 입력받은 데이터를 imsi에 배열 저장한다.
			// byte[] --> String 변환
			//String imsistr = new String(imsi);
			
			//방법2
			Scanner scan = new Scanner(i);
			String imsistr = scan.next();
			System.out.println("[서버] : " + imsistr + "이라는 메세지를 클라이언트로부터 받음");
			
			//7. 서비스 수행 결과 출력
			String reply = "임베디드 과정 수료!!!";
			//String < -- > byte[]  변환
			byte[] replybyte = reply.getBytes();
			//5. 서비스 필요 데이터 출력 (인사 메세지)
			OutputStream o = s.getOutputStream();
			o.write(replybyte);
					
			//10. 4번 접속 해제
			s.close();
		}
	}
}
