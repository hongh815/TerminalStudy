package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class LogServer {

	public static void main(String[] args) throws Exception {
		ServerSocket log = new ServerSocket(9999);
		System.out.println("[서버] : on");
		
		while(true) {
			
			Socket log_s = log.accept();
			System.out.println("[서버] : 연결됨");
			
			///////
			InputStream input_log_s = log_s.getInputStream();
			Scanner scan_log_s = new Scanner(input_log_s);
			String log_s_info = scan_log_s.next();
			System.out.println("[서버] : " + log_s_info + " 라는 정보 받음");
			
			/*///////
			 * 
			String info_server = "서버에서 온 정보";
			byte[] info_byte_server = info_server.getBytes();
			OutputStream out = log_s.getOutputStream();
			out.write(info_byte_server);
			
			*/
			
			log_s.close();
		}

	}

}
