package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {

	
	/*
	 * *Client �� ���α׷� �帧
	 * 1. ��û�ϰ��� �ϴ� ������ ������ �����ϱ� (������ ����)
	 * 2. ������ ���� ��û�� ������ (socket ��ü�� ���������ν�)
	 * 3. ������ �� �Ǿ��ٸ� Socket ��ü�� ����� �����Ȱ�!!
	 * 4. ������ ����� �� �ִ� ����� ��Ʈ���� Socket ��ü�κ��� ���� 
	 * 5. ���� ��Ʈ���� �߰��Ͽ� ���� ����
	 * 6. ��Ʈ���� ���ؼ� ������ �ϰ� ����
	 * 7.��� ���� ����
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		System.out.println("***�������");
		Scanner sc =new Scanner(System.in);
		
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw =null;
		
		try {
			//1) ��û�ϰ��� �ϴ� ������ ���� (IP �ּ�, port ��ȣ) ����
			// - ��û�ϰ��� �ϴ� ������ IP �ּ� : 127.0.0.1 �Ǵ� localhost (������ IP : �ڱ� �ڽ���  IP �ּ�)
			// - ��û�ϰ��� �ϴ� ������ Port ��ȣ : 3000; �����ʿ��� ������ port
			
			String serverIp = "127.0.0.1"; // or localhost   : �� IP �ּ�
			int serverPort = 3000; //������ ��Ʈ ��ȣ
			
			//2)Socket ��ü ���� ( == �� ������ ���� ��û�� �����ڴ� )
			// > ������ �����Ұ��� ������ IP �ּ� �� Port ��ȣ�� �ѱ�鼭
			socket = new Socket(serverIp,serverPort); //����
			
			//3)������ ���� ��û �� ���� ��û�� �� �����Ǿ����� �˻�
			//> ������ �� �� ��� : Socket ��ü�� ����� ������
			//  ������ �� �ȵ� ��� : null ���� Socket ��ü�� ���.
			if(socket != null) {
				//>������ �ߵȰ��
				// ������ �ܰ� �̾��
				
				System.out.println("������ ���� ���� !");
				
				//4) ������ ����� �� �ִ� ����� ��Ʈ�� ����
				//5) ���� ��Ʈ���� �߰��Ͽ� ���� ����
				
				//-�Է¿� ��Ʈ��
				//socket.getInputStream()
				//+InputStreamReader ��ü (������ ȣȯ�뵵)
				//BufferedReader()
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				//-��¿� ��Ʈ��
				//socket.getOutputStream()
				//+ ������ ȣȯ�뵵�� ��ü�� �ʿ���� !! 
				//PrintWriter ��ü
				pw = new PrintWriter(socket.getOutputStream());
				
				//6) ��Ʈ���� ���� ������ �а� ����
				//> ���������� ���� �ݺ��� �ȿ��� �ۼ�
				while(true) {
					
					//6_1)������ �����͸� ���� ( ��������)
					System.out.print("�������� ���� ���� : ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					
					//6_2)���� ��Ʈ���� �����ִ� ������ ������ ��������
					pw.flush();
					
					//6_3)�����κ��� ���޵� ������ �б�
					String message = br.readLine();
					System.out.println("���� : "+ message);
					
					
				}
				
				
				
			}else {
				
				System.out.println("������ ���� ����!");
			}
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//7)��� ���� ���� (�ڿ� �ݳ�)
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
