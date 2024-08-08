package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버용 프로그램
public class ServerProgram {

	/*
	 * * TCP (Transmission Control Protocol)
	 * -서버, 클라이언트 간의 1:1 소켓 통신
	 * -데이터를 교환하기에 앞서 서버, 클라이언트가 각각 연결되어있어야 함
	 *  (항상 서버가 먼저 실행되서 클라이언트의 요청을 기다릴 것)
	 * -신뢰성 있는 데이터를 전달 가능(연결 지향적임) 
	 * 
	 * *Socket 클래스
	 * -프로세스 간의 통신을 담당하는 기능이 정의되어있는 자바 클래스
	 * -Socket 프로그래밍을 위한 기반스트림인 
	 * InputStream / OutputStream 을 가지고 있음
	 * 
	 * *ServerSocket 클래스
	 * - 서버쪽 프로그램에서 추가로 필요한 객체 타입
	 * - 클라이언트 쪽에서 연결 요청이 들어왔을 때 그 연결 요청을
	 *   "수락(accept)" 해주는 용도
	 *   >연결 요청을 수락하게 되면 바로 Socket 객체를 얻어낼 수 있음 !!
	 *   
	 * * Server 측 프로그램 흐름
	 * 1. Server 측 프로그램에서 사용할 Port 번호 지정하기. 
	 * 2. ServerSocket 객체 생성(Port 번호를 넘기면서)
	 * 3. 클라이어트로부터 접속 요청이 올 때 까지 "대기"상태
	 * 4. 연결 요청이 오면 요청 수락(accept) 후
	 *    서버 측 Socket 객체가 생성됨 
	 * 5. 클라이언트와 통신할 수 있는 입출력 스트림 객체 생성
	 * 6. 보조 스트림을 추가하여 성능 개선
	 * 7. 스트림을 통해 데이터 읽고 쓰기
	 * 8. 통신 종료 절차(스트림 close, 소켓 close) 
	 *    
	 */
	public static void main(String[] args) {

		System.out.println("*** 버디버디 ***");
		
		Scanner sc = new Scanner(System.in);
		
		//지역벼수 이슈를 해결하기 위해 자원 변수들을 선언 후 null로 초기화
		
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		//1)서버프로그램에서 사용할 포트번호 먼저 지정
		int port = 3000;
		
		try {
			//2)포트번호를 넘기면서 ServerSocket 객체 생성 (포트 결합,Bind)
			server = new ServerSocket(port);
			
			//3)클라이언트로부터 접속 요청이 올 때 까지 대기 상태
			System.out.println("클라이어트의 요청을 기다리고 있습니다...");
			
			//4) 연결 요청이 들어오면 요청 수락(accept) 후 
			//   곧바로 Socket 객체가 생성됨
			//> 연결요청을 수락해주는 메소드 : accept() 메소드 이용
			//  (ServerSocket 객체에서 제공)
			socket = server.accept();
			
			//누구랑 연결되었는지 출력해보기
			//>Socket 객체의 메소드를 통해서 누구와 연결되었는지 알아낼 수 있음
			// socket.getInetAddress().getHostAddress()
			System.out.println(socket.getInetAddress().getHostAddress()+"가 연결을 요청함");
			
			//5) 클라이언트와 통신할 수 있는 입출력 스트림 객체 생성
			//> Socket 객체에서 제공하는 스트림 이용
			
			//6)보조스트림을 추가하여 성능 개선
			
			//- 입력용 스트림
			// 클라이언트가 전달한 메세지 내용을 읽어들이기 위한 스트림
			//기반스트림 : InputStram객체 (socket.getInputStream())
			//+ 사이즈를 중간에서 호환해주는 객체(보조스트림으로 취급)
			//   >InputStreamReader 객체 (호환용 보조스트림 객체)
			//보조스티림 : BufferedReader 객체
			// > 방향은 같으나, 통로의 사이즈가 다름!! (원칙상 겨합 불가능)
			//   중간에서 사이즈를 호환해주는 보조스트림 객체를 하나 더 붙일 것!!
			//   즉, 기반스트림에 보조스트림을 2개 붙이겠다.
			
			//BufferedReader br=new BufferedReader(사이즈호환용보조(기반));
			//    보조2짜리                                 호환용보조               기반 1짜리
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// - 출력용 스트림
			//클라이언트에게 메세지를 저달(내보내기) 위한 스트림
			
			//기반 스트림 : OutputStream 객체 (1) (socket.getOutputSream())
			//+
			//보조 스트림 : PrintWriter 객체 (2)
			//>통로의 방향은 같으나 통로의 사이즈가 다름 !! (원칙상 결합 불가)
			
			// OutputStreamWriter 객체 : 중간에서 사이즈 호환해주는 객체
			// 가 존재하기는 하지만, PrintWriter 의 경우 하도 많이 쓰이다 보니
			// 굳이 OutputStreamWriter 객체 필요없이, 곧바로 
			// 1byte 짜리 기반스트림과 결합해서 쓸수 있도록 구현 되어있음 !!
			
			pw = new PrintWriter(socket.getOutputStream());
			
			//7) 스트림을 통해 데이터 읽고 쓰기
			//> 채팅 프로그램은 지속적으로 메세지가 주고 받아져야함!!
			//  무한 반복문 안에서 읽고 쓰는 구문을 작성하기
			
			while(true) {
				
				//7_1) 클라이언트로부터 전달된 메세지 읽어들이기
				//> BufferedReader로 읽기
				String message = br.readLine();
				System.out.println("클라이언트 : "+message);
				
				//7_2) 반대로 클라이언트에게 메세지 전달
				//>PrintWriter 로 내보내기
				System.out.println("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				//한줄 단위로 내보내는 메소드 
				
				//7_3) 현재 스트림에 남아있는 데이터를 강제로 내보내는 메소드
				pw.flush();
				//>오늘은 무한반복문 안에서 계속 데이터를 내보내야 하기 때문에 호출 !!
			}
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//8)통신 종료 절차 (자원 반납)
				//> 생성된 순서의 역순으로 반납하기 !!
				
				pw.close();
				br.close();
				socket.close();
				server.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
