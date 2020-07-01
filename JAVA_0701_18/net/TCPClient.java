package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		//3. 서버(ip, port) 접속
		Socket s = new Socket("192.168.0.51", 9999); //선생님의 ip접속
		System.out.println("[클라이언트] : 서버와의 연결 완료됨");
		//String < -- > byte[]  변환
		String insa = "안녕 서버야";
		byte[] insabyte = insa.getBytes();
		
		
		//5. 서비스 필요 데이터 출력 (인사 메세지)
		OutputStream o = s.getOutputStream();
		o.write(insabyte);
		
		//8. 서버에서 전송한 결과를 입력
		InputStream i = s.getInputStream();
		
		//방법1
		//byte[] imsi = new byte[200];
		//i.read(imsi); //소켓으로부터 입력받은 데이터를 imsi에 배열 저장한다.
		// byte[] --> String 변환
		//String imsistr = new String(imsi);
		
		//방법2
		Scanner scan = new Scanner(i);
		String imsistr = scan.next();
		System.out.println("[클라이언트] : " + imsistr + "이라는 응답을 서버로부터 받음");
		
		//9. 3번 접속 해제
		s.close();


	}
}
