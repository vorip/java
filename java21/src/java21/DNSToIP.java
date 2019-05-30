package java21;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSToIP {

	public static void main(String[] args) throws UnknownHostException {
		String dns = "www.naver.com";
		
		try {
			InetAddress address = InetAddress.getByName(dns);
			System.out.println(address);
			System.out.println("IP 주소 : "+address.getHostAddress());
		}catch(UnknownHostException e) {
			System.out.println("도메인네임이 존재하지 않습니다.");
			System.out.println("올바른 도메인 네임믈 입력해주세요");
		}
		
	}

}
