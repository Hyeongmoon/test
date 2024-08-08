package com.kh.chap01_list.part02_mvc_replay.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc_replay.model.vo.Music;

public class MusicController {

	ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("노래1","가수1"));
		list.add(new Music("노래2","가수2"));
		list.add(new Music("노래3","가수3"));
		list.add(new Music("노래4","가수4"));
		
		
	}
	
//	1.곡추가
	public void addMusic(String title,String artist) {
		list.add(new Music(title,artist));
	}
	
	
	
	
	
	
}
