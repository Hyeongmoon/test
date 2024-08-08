package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

//View�� : ȭ���� ����ϴ� �ڵ常 �ۼ��� ��
//>��¹�, �Է¹� �� Ȱ�� !!
public class MusicView {

	private Scanner sc = new Scanner(System.in);
	
	private MusicController mc = new MusicController();
	
	//����ȭ�� : ���α׷� ���� �� ���� ó������ �������� ȭ��
	public void mainMenu() {
			
		
		//����ڰ� �����ϱ� ������ ���� ������ �ʵ��� ���� �ݺ�
		while(true) {
			
			System.out.println("~~~�Ҹ��ٴ�~~~");
			System.out.println("1. ���ο� �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("0. ���α׷� ����");
			
			System.out.println("------------------");
			
			System.out.print("�޴� �Է� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				insertMusic();
				
				break;
			case 2:
				sellectMusicList();
				
				break;
			case 3:	
				searchMusic();
				break;
			case 4:
				deleteMusic();
				break;
			case 5:
				updateMusic();
				break;
			case 0:
				//���α׷� ����
				System.out.println("���α׷��� �����մϴ�. �ȳ��� ������.");
				return;
			default:
				System.out.println("���� �޴��� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
			
			
		}
	} //mainMenu �޼ҵ� ���� ��
	
	//1.���ο� ���� �߰���ų�� �ִ� ȭ��
	public void insertMusic() {
		
		
		System.out.println("---�� �߰� ---");
		System.out.print(" ��� �Է� : ");
		String title = sc.nextLine();
		
		System.out.print(" ������ �Է� : ");
		String artist = sc.nextLine();
		
		//Controller �� ��� ��û
		
		
		int result = mc.insertMusic(title,artist);
		
		
		if(result>0) {
			System.out.println("���������� �߰� �Ǿ����ϴ�.");
		}else {
			System.out.println("�߰����� ���߽��ϴ�. ");
		}
		
	}//insertMusic()�޼ҵ� ��
		
	
	//2. ��ü ���� ��ȸ�� �� �ִ� ȭ��
	public void sellectMusicList() {
		
		System.out.println("---��ü �� ��ȸ ---");
		
		ArrayList<Music>list = mc.sellectMusicList();
		
		if(list.isEmpty()) {
			//����Ʈ�� ������� ���(�뷡�� �� �Ѱ ���� ���)
			
			System.out.println("���� �����ϴ� ���� �����ϴ�.");
			
		}else {
			//����Ʈ�� ������� ���� ��� ( �뷡�� �Ѱ� �̻� �����Ұ��)
			
			for(int i = 0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
		}
	}//sellectMusicList()
	
	public void searchMusic() {
		
		System.out.println(" ---�� �˻�----");
		
		System.out.print("�˻��� ��� Ű���� : ");
		String keyword = sc.nextLine();
		ArrayList<Music> searched =mc.searchMusic(keyword);
		
		if(searched.size()==0) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			System.out.println("�˻� ����� "+ searched.size()+"�Դϴ�.");
		
			for(Music e : searched) {
				System.out.println(e);
			}
			
		}
	}
	
	public void deleteMusic() {
		
		System.out.println("---�� ����-----");
		
		System.out.print("������ ��� : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		if(result>0) {
//			���� �����
			System.out.println("���������� ���� �Ǿ����ϴ�. ");
		}else {
//			������ ���� ã�� ����
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
		
	}//deleteMusic()�޼ҵ�
	
	
	public void updateMusic() {
		
		System.out.println("---�� ����---");
		
		//�������, ������ ���, ������ ������ �Է¹ޱ�
		System.out.print("������� : ");
		String title = sc.nextLine();
		
		System.out.println("������ ���");
		String upTitle = sc.nextLine();
		
		
		System.out.println("������ ������");
		String artist = sc.nextLine();
		
		int result=mc.updateMusic(title,upTitle,artist);
		if(result>0) {
			System.out.println(result+"�� ���� �Ϸ�");
		}else {
			System.out.println("������ ���� ã�� ���߽��ϴ�. ");
		}
		
	}
	
}
