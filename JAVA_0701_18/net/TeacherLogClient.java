package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TeacherLogClient {

	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.0.51" , 15000);
		System.out.println("[클라이언트] : 서버와의 연결 완료됨");
		String insa = "";
		byte[] insabyte = insa.getBytes();
		
		OutputStream o = s.getOutputStream();
		o.write(insabyte);
		
		s.close();

	}

}
