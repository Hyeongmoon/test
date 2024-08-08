package com.kh.chap02_inherit.model.vo;

public class Vehicle {

	//필드부
	private String name;
	private double mileage;
	private String kind;
	
	
	//생성자부
	
	public Vehicle() {	}
	public Vehicle(String name, double mileage, String kind) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}

	
	
	
	
	//메서드부
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	//information
	public String information() {
		return name + " " + mileage + " " + kind;
	}
	//탈것이라면 움직이는 해우이를 하므로 이걸 메소드로 표현해보자
	public void howToMove() {
		System.out.println("그냥 움직인다.");
	}
	
}
