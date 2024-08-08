package com.kh.chap01_beforeVsafter.after.model.vo;


//>클래스 다이어그램에서는 자식 클래스가 부모클래스를 찌르는 방향의 화살표로 표현
public class SmartPhone extends Product{
	
	//필드부
	private String mobileAgency;
	//생성자부
	public SmartPhone() {}
	
	public SmartPhone(  String brand, 
						String pCode, 
						String pName, 
						int price, 
						String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency=mobileAgency;
	}
	
	
	
	//메서드부
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {
		return super.information() + " " + mobileAgency;
	}

}
