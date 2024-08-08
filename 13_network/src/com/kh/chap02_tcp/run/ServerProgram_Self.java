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
		
		
		System.out.println(" *** ���� ���� ***");
		
		Scanner sc = new Scanner(System.in);
		
		int port = 2000;
		
		try {
			ServerSocket server = new ServerSocket(port);                          //ServerSocet
			
			System.out.println(" Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�. ......");
			
			Socket socket = server.accept();  										//Socket 
			
			System.out.println(socket.getInetAddress().getHostAddress()+"�� ������ ��û��");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
																			//BufferedReader
																			//InputStreamer(�ݱ�x)
			
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream());			//PrintWriter
			
			
			while(true) {
				
				String message = br.readLine();
				System.out.println("Ŭ���̾�Ʈ : " + message);
				
				
				System.out.print("Ŭ���̾�Ʈ���� ���� ���� : ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				
				
				pw.flush();
				
			}
			
			
			
		}catch(IOException e){
			
		}finally {
			
		}
		
		
		
		
		
		
		
		
	}
}
