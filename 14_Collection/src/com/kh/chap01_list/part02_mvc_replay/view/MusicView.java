package com.kh.chap01_list.part02_mvc_replay.view;

import java.util.Scanner;

import com.kh.chap01_list.part02_mvc_replay.controller.MusicController;

public class MusicView {

	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		System.out.println(" -- ���ǰ��� ���α׷� -- ");
		
		System.out.println("1. ���߰�");
		System.out.println("2. ��ü��ȸ");
		System.out.println("3. �� �˻�");
		System.out.println("4. Ư�� �� ����");
		System.out.println("5. Ư�� �� ����");
		System.out.println("0. ���α׷� ����");
		
		int mainMenu = sc.nextInt();
		sc.nextLine();
		
		switch(mainMenu) {
		case 1: //1.�� �߰�
			addMusic();
			break;
		case 2: //2��ü��ȸ
//			selectMusicList();
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 0:
			
			break;
		default : 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	
	//1.�� ��ȸ
	public void addMusic() {
		System.out.println("������ �Է��ϼ��� :");
		String title = sc.nextLine();
		System.out.println("������ �Է��ϼ��� :");
		String artist = sc.nextLine();
		
		mc.addMusic(title,artist);
	}
	//2.��ü��ȸ
}
