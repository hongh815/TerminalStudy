//파일을 입력받고 출력하는 클래스

package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyTest {
public static void main(String[] args) {
	//args[0] 파일입력
	//args[1] 파일출력
	try {
//		File f = new File(args[0]);
//		if(f.exists()) {
//			
//				----> args[0] 에 들어갈 파일명이 존재하는지 안하는지 보고 에러를 줄여준다 이안에서 하면		
//		}
		
		FileReader fr = new FileReader(args[0]);
		FileWriter fw = new FileWriter(args[1], true);
		int result = 0;
		while((result = fr.read()) != -1) {
			fw.write(result);
			// 임시 버퍼에 저장해서 나중에 한번에 파일 저장한다 그래서 close가 없으면 임시저장만 된다. 
			// 그래서 close를 없앤후 출력한 d.txt에는 아무것도 출력안된다
		}
		fw.close();
		fr.close();
		
	}catch(FileNotFoundException e) {
		System.out.println(args[0] + " 파일이 존재하지 않습니다.");
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		//반드시 수행해야 하는 문장은 여기에 쓴다.
		
	}
	
	// catch가 두개 이상이라면 합칠수 있다. 
	// 그러나 상위익셉션과 하위익셉션에서 상위를 항상 먼저 쓴다. 
	// 또는 그냥 모든 익셉션을 포함하는 Exception만 입력
}
}
