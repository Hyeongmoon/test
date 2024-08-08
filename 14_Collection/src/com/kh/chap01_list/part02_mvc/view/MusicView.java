package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

//View단 : 화면을 담당하는 코드만 작성할 것
//>출력문, 입력문 을 활욜 !!
public class MusicView {

	private Scanner sc = new Scanner(System.in);
	
	private MusicController mc = new MusicController();
	
	//메인화면 : 프로그램 실행 시 제일 처음으로 보여지는 화면
	public void mainMenu() {
			
		
		//사용자가 종료하기 전까지 절대 끝나지 않도록 무한 반복
		while(true) {
			
			System.out.println("~~~소리바다~~~");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("------------------");
			
			System.out.print("메뉴 입력 : ");
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
				//프로그램 종료
				System.out.println("프로그램을 종료합니다. 안녕히 가세요.");
				return;
			default:
				System.out.println("없는 메뉴를 입력했습니다. 다시 입력해주세요.");
			}
			
			
			
		}
	} //mainMenu 메소드 영역 끝
	
	//1.새로운 곡을 추가시킬수 있는 화면
	public void insertMusic() {
		
		
		System.out.println("---곡 추가 ---");
		System.out.print(" 곡명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print(" 가수명 입력 : ");
		String artist = sc.nextLine();
		
		//Controller 로 기능 요청
		
		
		int result = mc.insertMusic(title,artist);
		
		
		if(result>0) {
			System.out.println("성공적으로 추가 되었습니다.");
		}else {
			System.out.println("추가하지 못했습니다. ");
		}
		
	}//insertMusic()메소드 끝
		
	
	//2. 전체 곡을 조회할 수 있는 화면
	public void sellectMusicList() {
		
		System.out.println("---전체 곡 조회 ---");
		
		ArrayList<Music>list = mc.sellectMusicList();
		
		if(list.isEmpty()) {
			//리스트가 비어있을 경우(노래가 단 한곡도 없을 경우)
			
			System.out.println("현재 존재하는 곡이 없습니다.");
			
		}else {
			//리스트가 비어있지 않을 경우 ( 노래가 한곡 이상 존재할경우)
			
			for(int i = 0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
		}
	}//sellectMusicList()
	
	public void searchMusic() {
		
		System.out.println(" ---곡 검색----");
		
		System.out.print("검색할 곡명 키워드 : ");
		String keyword = sc.nextLine();
		ArrayList<Music> searched =mc.searchMusic(keyword);
		
		if(searched.size()==0) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("검색 결과는 "+ searched.size()+"입니다.");
		
			for(Music e : searched) {
				System.out.println(e);
			}
			
		}
	}
	
	public void deleteMusic() {
		
		System.out.println("---곡 삭제-----");
		
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		if(result>0) {
//			삭제 진행됨
			System.out.println("성공적으로 삭제 되었습니다. ");
		}else {
//			삭제할 곡을 찾지 못합
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		
	}//deleteMusic()메소드
	
	
	public void updateMusic() {
		
		System.out.println("---곡 수정---");
		
		//기존곡명, 수정할 곡명, 수정할 가수명 입력받기
		System.out.print("기존곡명 : ");
		String title = sc.nextLine();
		
		System.out.println("수정할 곡명");
		String upTitle = sc.nextLine();
		
		
		System.out.println("수정할 가수명");
		String artist = sc.nextLine();
		
		int result=mc.updateMusic(title,upTitle,artist);
		if(result>0) {
			System.out.println(result+"곡 수정 완료");
		}else {
			System.out.println("수정할 곡을 찾지 못했습니다. ");
		}
		
	}
	
}
