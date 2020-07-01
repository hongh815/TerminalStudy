package net;

import java.net.*;

public class IPTest {

public static void main(String[] args) throws Exception{
	System.out.println(InetAddress.getLocalHost() +"\n"); //제대로 된 문장에 에러가 나면 거의다 익셉션 문제다
	// 현재 내 컴퓨터의 ip 구하는 명령
	
	InetAddress[] ar = InetAddress.getAllByName("www.kitri.re.kr");
	for(InetAddress i : ar) {
		System.out.println(i.getHostAddress());
	}
	// 다음의 ip 정보를 구하는 명령
}

}
