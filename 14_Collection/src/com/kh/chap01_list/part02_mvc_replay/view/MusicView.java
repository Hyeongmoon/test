package com.kh.chap01_list.part02_mvc_replay.view;

import java.util.Scanner;

import com.kh.chap01_list.part02_mvc_replay.controller.MusicController;

public class MusicView {

	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		System.out.println(" -- 음악관리 프로그램 -- ");
		
		System.out.println("1. 곡추가");
		System.out.println("2. 전체조회");
		System.out.println("3. 곡 검색");
		System.out.println("4. 특정 곡 삭제");
		System.out.println("5. 특정 곡 수정");
		System.out.println("0. 프로그램 종료");
		
		int mainMenu = sc.nextInt();
		sc.nextLine();
		
		switch(mainMenu) {
		case 1: //1.곡 추가
			addMusic();
			break;
		case 2: //2전체조회
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
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	
	//1.곡 조회
	public void addMusic() {
		System.out.println("제목을 입력하세요 :");
		String title = sc.nextLine();
		System.out.println("가수명 입력하세요 :");
		String artist = sc.nextLine();
		
		mc.addMusic(title,artist);
	}
	//2.전체조회
}
