package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle{
	
	//필드부
	private int tire;
	private int wing;
	
	//생성자부
	public Airplane() {}
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	//메소드부
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	public int getTire() {
		return tire;
	}
	public int wing() {
		return wing;
	}
	@Override
	public String information() {
		return super.information() + " " + tire + " " + wing;
	}
	@Override
	public void howToMove() {
		System.out.println("바퀴를 굴러 움직이다가 날아갑니다. ");
	}
	
	
	//setter
	//getter
	//information
	
	
}
