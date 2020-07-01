package net;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TeacherLogServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(15000);
		System.out.println("[서버] : 연결");
		
		while(true) {
			Socket s = ss.accept();
			String client = s.getInetAddress().getHostAddress();
			new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 DD일 HH시 mm분 ss초");
			String time = sdf.format(System.currentTimeMillis());
			
			InputStream i = s.getInputStream();
			Scanner scan = new Scanner(i);
			
			//id : oracle-pw:4321\n;
			String idpw = scan.nextLine();
			String id = idpw.split(":|-|\n")[1];
			String pw = idpw.split(":|-|\n")[3];
			
			//현재 클래스 이름 가져오는 메소드 getClass()
			String classname = "LogServer";

			//log.txt 파일 저장
			FileWriter fw = new FileWriter("src/net/log.txt", true); //이전 기록 유지 true
			fw.write(client + " " + time + " " + id + " " + pw + " " + classname + "\n");
			fw.close();
			
		} //while end

	} // main end

}
