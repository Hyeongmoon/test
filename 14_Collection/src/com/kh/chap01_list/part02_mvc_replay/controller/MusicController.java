package com.kh.chap01_list.part02_mvc_replay.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc_replay.model.vo.Music;

public class MusicController {

	ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("�뷡1","����1"));
		list.add(new Music("�뷡2","����2"));
		list.add(new Music("�뷡3","����3"));
		list.add(new Music("�뷡4","����4"));
		
		
	}
	
//	1.���߰�
	public void addMusic(String title,String artist) {
		list.add(new Music(title,artist));
	}
	
	
	
	
	
	
}
