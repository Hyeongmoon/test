package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {

	
	/*
	 * *Client 측 프로그램 흐름
	 * 1. 요청하고자 하는 서버의 정보를 셋팅하기 (변수로 셋팅)
	 * 2. 서버에 연결 요청을 보내기 (socket 객체를 생성함으로써)
	 * 3. 수락이 잘 되었다면 Socket 객체가 제대로 생성된것!!
	 * 4. 서버와 통신할 수 있는 입출력 스트림을 Socket 객체로부터 얻어내기 
	 * 5. 보조 스트림을 추가하여 성능 개선
	 * 6. 스트림을 통해서 데이터 일고 쓰기
	 * 7.통신 종료 절차
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		System.out.println("***버디버디");
		Scanner sc =new Scanner(System.in);
		
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw =null;
		
		try {
			//1) 요청하고자 하는 서버의 정보 (IP 주소, port 번호) 셋팅
			// - 요청하고자 하는 서버의 IP 주소 : 127.0.0.1 또는 localhost (루프백 IP : 자기 자신의  IP 주소)
			// - 여청하고자 하는 서버의 Port 번호 : 3000; 서버쪽에서 설정한 port
			
			String serverIp = "127.0.0.1"; // or localhost   : 내 IP 주소
			int serverPort = 3000; //서버쪽 포트 번호
			
			//2)Socket 객체 생성 ( == 곧 서버로 연결 요청을 보내겠다 )
			// > 누구랑 연결할건지 상대방의 IP 주소 및 Port 번호를 넘기면서
			socket = new Socket(serverIp,serverPort); //수락
			
			//3)서버로 연결 요청 후 연결 요청이 잘 수락되었는지 검사
			//> 연결이 잘 될 경우 : Socket 객체가 제대로 생성됨
			//  연결이 잘 안된 경우 : null 값이 Socket 객체에 담김.
			if(socket != null) {
				//>연결이 잘된경우
				// 나머지 단계 이어쓰기
				
				System.out.println("서버와 연결 성공 !");
				
				//4) 서버와 통신할 수 있는 입출력 스트림 생성
				//5) 보조 스트림을 추가하여 성능 개선
				
				//-입력용 스트림
				//socket.getInputStream()
				//+InputStreamReader 객체 (사이즈 호환용도)
				//BufferedReader()
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				//-출력용 스트림
				//socket.getOutputStream()
				//+ 사이즈 호환용도의 객체가 필요없음 !! 
				//PrintWriter 객체
				pw = new PrintWriter(socket.getOutputStream());
				
				//6) 스트림을 통해 데이터 읽고 쓰기
				//> 마찬가지로 무한 반복문 안에서 작성
				while(true) {
					
					//6_1)서버로 데이터를 전달 ( 내보내기)
					System.out.print("서버에게 보낼 내용 : ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					
					//6_2)현제 스트림에 남아있는 데이터 강제로 내보내기
					pw.flush();
					
					//6_3)서버로부터 전달된 데이터 읽기
					String message = br.readLine();
					System.out.println("서버 : "+ message);
					
					
				}
				
				
				
			}else {
				
				System.out.println("서버와 연결 실패!");
			}
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//7)통신 종료 절차 (자원 반납)
			try {
				pw.close();
				br.close();
				pw.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
