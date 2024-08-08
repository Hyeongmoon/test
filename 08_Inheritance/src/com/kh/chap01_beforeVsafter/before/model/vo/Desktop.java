package com.kh.chap01_beforeVsafter.before.model.vo;

public class Desktop {

	
	//필드부
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne; //일체여부
	
	
	//생성자부
	public Desktop() {}
	public Desktop( String brand, 
					String pCode, 
					String pName, 
					int price, 
					boolean allInOne) {
		
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	//메소드부
	//setter
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	//getter
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	
	//boolean 타입의 필드에 대한 getter 메소드명은 getXxxx 가 아니고, isXxxx 로 짓는다. 
	public boolean isAllInOne() {
		return allInOne;
	}
	
	//information
	public String information() {
		return 
				brand + " " + pCode + " " + pName + " " + price + " " + allInOne ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//클래스



































