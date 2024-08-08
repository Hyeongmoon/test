package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

//Controller : ������� "��û"�� �޾Ƽ� �ش� ��� ���� ���� �ڵ�

public class MusicController {

	//���� ������ ���� ������ ������ �ִ� "�����" �����
	
	private ArrayList<Music> list = new ArrayList<>();
	{
		//�ʱ�ȭ��
		//�ش� ����ҿ� �� Music ��ü�� add �ϴ� ������ �ۼ� 
		list.add(new Music("Supernova","������"));
		list.add(new Music("AfterLike","���̺�"));
		list.add(new Music("����ߵ�", "QWER"));
		list.add(new Music("SuperNatural","������"));
		
		
	}
	
	
	
	//1. ���ο� ���� �߰���Ű�� ��� �޼ҵ� 
	public int insertMusic(String title, String artist) {
		int before = list.size();
		list.add(new Music(title,artist));
		int after = list.size();
		
		return after-before; //���߰��� �����ߴ��� �����ߴ��� ���
	}
	
	
	//2. ��ü ���� ��ȸ�Ҽ� �ִ� ��� �޼ҵ�
	public ArrayList<Music> sellectMusicList() {
		return list; 
	}
	
	
	
	//3. Ư�� ���� �˻��� �� �ִ� ��� �޼ҵ�
	public ArrayList<Music> searchMusic(String keyword) {
		
		//�˻� ����� ��Ƶ� ArrayList ����
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
		
		//������ ����� Ƚ���� ���� ���� ����
		int result = 0;
		
		for(int i =0; i<list.size();i++) {
			if(title.equals(list.get(i).getTitle())) {
				
				list.remove(i);
				i--; //���� �����Ͱ� ������ ��ĭ�� ���ܿԱ� ����
				result++;
			}
		}
		return result;
		
		
	}
	
	public int updateMusic(String title, String upTitle, String artist) {
		int result = 0;
		
		for(int i=0; i<list.size();i++) {
			
			//��� 1
			/*
			if(title.equals(list.get(i).getTitle())) {
				
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(artist);
				result++;
			}
			*/
			
			//��� 2
			if(title.equals(list.get(i).getTitle())) {
				list.set(i,new Music(upTitle, artist));
				result++;
			}
		}
		
		return result;
	}
	
	
	
	
}






















