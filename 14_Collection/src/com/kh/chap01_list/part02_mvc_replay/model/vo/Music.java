package com.kh.chap01_list.part02_mvc_replay.model.vo;

public class Music {

	//필드부
	private String title;
	private String artist;
	
	//생성자
	public Music() {}
	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	
	//메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
	
	
	
	
}
