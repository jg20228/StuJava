package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MySocketClient {
	Socket socket;
	BufferedWriter bw;
	BufferedReader br;
	
	public MySocketClient() throws Exception {

		socket = new Socket("localhost",15000); //서버소켓의 accept()함수를 호출
		//socket = new Socket("192.168.0.75",15000);
		//PrintWriter - 
		//PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		//pw.write("안녕");
		//pw.close();
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String msg="";
		
		while((msg=br.readLine())!=null) {
			bw.write(msg+"\n"); // "\n" 줄바꿈
			bw.flush();
		}
		bw.close();
		br.close();
		socket.close();
	}

	public static void main(String[] args) {
		try {
			new MySocketClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
