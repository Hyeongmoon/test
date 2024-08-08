package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram_Self {

	public static void main (String [] args) {
		
		
		System.out.println(" *** 버디 버디 ***");
		
		Scanner sc = new Scanner(System.in);
		
		int port = 2000;
		
		try {
			ServerSocket server = new ServerSocket(port);                          //ServerSocet
			
			System.out.println(" 클라이언트의 요청을 기다리고 있습니다. ......");
			
			Socket socket = server.accept();  										//Socket 
			
			System.out.println(socket.getInetAddress().getHostAddress()+"가 연결을 요청함");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
																			//BufferedReader
																			//InputStreamer(닫기x)
			
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream());			//PrintWriter
			
			
			while(true) {
				
				String message = br.readLine();
				System.out.println("클라이언트 : " + message);
				
				
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				
				
				pw.flush();
				
			}
			
			
			
		}catch(IOException e){
			
		}finally {
			
		}
		
		
		
		
		
		
		
		
	}
}
