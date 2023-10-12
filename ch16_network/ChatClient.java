package ch16_network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	public static void main(String[] args) {
			Socket soc;
			try {
				soc = new Socket("192.168.0.22",9000);
				System.out.println("접속성공!!!");
				System.out.println(soc.getRemoteSocketAddress());//ip add port 정보
				String nm = "gg";
				if(args.length>0) {
					nm=args[0];
				}
				//데이터 송수신
				SendTread send =new SendTread(soc, nm);
				ReceiveThread receive =new ReceiveThread(soc);
				send.start();
				receive.start();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		
	}

}
