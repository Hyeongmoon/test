package com.kh.chap01_beforeVsafter.after.model.vo;

//			자식클래스      부모클래스
//  		후손클래스		조상클래스
//			하위클래스		상위클래스
//			서브클래스		슈퍼클래스

	
public class Desktop extends Product {
	//>상속받는 순간 필드 4개, 메소드 9개를 내꺼처럼 쓸수 있다. 
	
	//필드부
	
	
	private boolean allInOne;
	
	
	//생성자부
	public Desktop() {	}
	
	public Desktop(String brand,
					String pCode,
					String pName,
					int price,
					boolean allInOne) {
		//brand, pCode, pName, price,
		//allInOne
		//필드에 매개변수 인자 값을 각각 초기화
		
		//this. : 자기 자신의 주소값을 담고 있다.
		//super. : 해당 부모객체의 주소값을 담고있다.
		//>자식객체는 super. 으로 부모것에 접근 가능하다.
		//>단, 접근하고자 하는게 private 일 경우는 직접 접근이 불가하다.
		
		//>부모클래스인 Product 에 있는 필드임
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		//안됀다. not visible
		
		//해결방법1. 
		//부모클래스의 필드를 자식까지는 접근 가능하게끔 접근 제한을 살짝만 풀어주는 방법
		//그리고 원래하던대로
		/*
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		 */ 
		
		
		//해결방법2. 
		//부모클새스에 있는 public 접근제한자인 setter 메소드들을 활용하기
		/*
		this.setBrand(brand);
		this.setpCode(pCode);
		this.setpName(pName);
		this.setPrice(price);
		*/
		
		//해결방법3
		//부모클래스의 생성자를 호출하기 this()생성자
		//this(brand,pCode, pName, price);
		//>부모클래스의 생성자는 super();
		super(brand,pCode, pName, price);
		
		this.allInOne = allInOne;
	}
	
	//메소드부
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	//information
	//>부모클래스로 이미 물려받은 상태에서 자식클래스에서 동일한 형태로 다시 정의한 상하ㅗㅇ
	//코드 내용물만 갈아엎은 상황 == " 오버라이딩"
	public String information() {
		/*
		return super.getBrand() + " " + super.getpCode() + " " + super.getpName() + " " + super.getPrice() + " " +allInOne;
		*/
		
		return super.information() + " " + allInOne;
	}
	
}
