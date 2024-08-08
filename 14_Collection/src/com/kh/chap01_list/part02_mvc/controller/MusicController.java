package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

//Controller : 사용자의 "요청"을 받아서 해당 기능 구현 관련 코드

public class MusicController {

	//전역 변수로 음악 정보를 담을수 있는 "저장소" 만들기
	
	private ArrayList<Music> list = new ArrayList<>();
	{
		//초기화블럭
		//해당 저장소에 들어갈 Music 객체를 add 하는 구문들 작성 
		list.add(new Music("Supernova","에스파"));
		list.add(new Music("AfterLike","아이브"));
		list.add(new Music("고민중독", "QWER"));
		list.add(new Music("SuperNatural","뉴진스"));
		
		
	}
	
	
	
	//1. 새로운 곡을 추가시키는 기능 메소드 
	public int insertMusic(String title, String artist) {
		int before = list.size();
		list.add(new Music(title,artist));
		int after = list.size();
		
		return after-before; //곡추가를 성공했는지 실패했는지 출력
	}
	
	
	//2. 전체 곡을 조회할수 있는 기능 메소드
	public ArrayList<Music> sellectMusicList() {
		return list; 
	}
	
	
	
	//3. 특정 곡을 검색할 수 있는 기능 메소드
	public ArrayList<Music> searchMusic(String keyword) {
		
		//검색 결과를 담아둘 ArrayList 생성
		ArrayList<Music> searched = new ArrayList<>();
		
		for(int i = 0 ; i<list.size();i++) {
			
			if(list.get(i).getTitle().contains(keyword)) {
				
//				System.out.println(list.get(i));
				
				searched.add(list.get(i));
				
			}
		}
		return searched;
		
	}
	
	
	public int deleteMusic(String title) {
		
		//삭제가 진행된 횟수를 담을 변수 생성
		int result = 0;
		
		for(int i =0; i<list.size();i++) {
			if(title.equals(list.get(i).getTitle())) {
				
				list.remove(i);
				i--; //뒤의 데이터가 앞으로 한칸씩 땡겨왔기 때문
				result++;
			}
		}
		return result;
		
		
	}
	
	public int updateMusic(String title, String upTitle, String artist) {
		int result = 0;
		
		for(int i=0; i<list.size();i++) {
			
			//방법 1
			/*
			if(title.equals(list.get(i).getTitle())) {
				
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(artist);
				result++;
			}
			*/
			
			//방법 2
			if(title.equals(list.get(i).getTitle())) {
				list.set(i,new Music(upTitle, artist));
				result++;
			}
		}
		
		return result;
	}
	
	
	
	
}






















