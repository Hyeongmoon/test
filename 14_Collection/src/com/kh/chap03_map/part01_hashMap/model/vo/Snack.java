package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {

	//필드부
	private String flavor;
	private int calory;
	
	//>제품명은 이따가 HashMap 에 저장할때 키값으로 표현할 예정 !!
	
	
	//생성자부
	public Snack() {}

	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

	//메소드부
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	//toString
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	
	//Set 쓰는거 아니면 equals 와 hashcode 오버라이딩 할필요는 없다. (중복값 비교를 위해서)
	
	
	
	
	
	
}
