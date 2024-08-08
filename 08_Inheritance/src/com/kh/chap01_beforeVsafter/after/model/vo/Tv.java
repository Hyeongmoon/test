package com.kh.chap01_beforeVsafter.after.model.vo;

//extends 확장하겠다. 
//>부모클래스의 코드를 갖고오고, + 내 코드를 추가 해서 쓸것이기 때문
public class Tv extends Product{
	
	
	//필드부
	private int inch;

	
	//생성자부 //오버로딩
	public Tv() {}
	public Tv(String brand, String pCode, String pName, int price, int inch	) {
		//super() 부모클래스의 기본생성자 호출
		super(brand,pCode,pName,price);
		this.inch = inch;
	}
	
	//메소드부
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	//information 메소드 오버라이딩
	public String information() {
		return super.information() + " " + inch;
	}
}
