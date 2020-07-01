package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LogClient {

	public static void main(String[] args) throws Exception {

		Socket log_s = new Socket("localhost", 9999);
		System.out.println("[클라이언트] : 서버와 연결");
		
		//////
		String info = "정보";
		byte[] info_byte = info.getBytes();
		
		OutputStream out = log_s.getOutputStream();
		out.write(info_byte);
		
		////////
		/*
		InputStream input_log_s = log_s.getInputStream();
		Scanner scan_log_s = new Scanner(input_log_s);
		String log_s_info = scan_log_s.next();
		System.out.println("[클라이언트] : " + log_s_info + " 라는 정보 받음");
		
		*/
		
		log_s.close();
	
	}

}
