package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle{

	
	//필드부
	private int tire;
	
	
	
	
	//생성자부
	public Car() {}
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
		
	}
	
	//메서드부
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getTire() {
		return tire;
	}
	@Override
	public String information() {
		return super.information() + " " + tire;
	}
	@Override
	public void howToMove() {
		System.out.println("바퀴를 굴려 움직인다 .");
	}
}
