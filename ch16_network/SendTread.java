package ch16_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendTread extends Thread { // 요청 보낼때 쓰는
	private Socket soc;
	private String name;

	public SendTread(Socket soc, String name) {
		super();
		this.soc = soc;
		this.name = name;
	}

	@Override
	public void run() {
		// 키보드 입력을 -> 소켓에 데이터로 전송
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			PrintWriter writer = new PrintWriter(soc.getOutputStream());
			// 닉네임 전송
			writer.println(name);
			writer.flush();
			while (true) {
				System.out.println("입력");
				String msg = reader.readLine();
				// 세팅종료
				if (msg == null || msg.equals("")) {
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (soc != null)
				try {
					soc.close();
				} catch (IOException e) {
				}
		}
	}
}
