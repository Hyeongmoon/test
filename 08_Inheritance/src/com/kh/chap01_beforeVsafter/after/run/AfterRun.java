package com.kh.chap01_beforeVsafter.after.run;

import com.kh.chap01_beforeVsafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVsafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.after.model.vo.Tv;

public class AfterRun {

	
	public static void main(String[]args) {
		/*
		Desktop d = new Desktop();
		d.setBrand("삼성");
		d.setpCode("d-01");
		d.setpName("게이밍데스크탑");
		d.setPrice(1000000);
		d.setAllInOne(true);
		*/
		
		
		Desktop d = new Desktop("삼성", "d -01", "게이밍 데스크탑", 200000, true);
		
		System.out.println(d.information());
		
		
		Tv t = new Tv("엘지","t-01","고오급벽결이 티비",3500000,100);
		
		SmartPhone s =new SmartPhone("애플","s-01","아이폰",1230000,"SKT");
		
		
		System.out.println(t.information());
		
		System.out.println(s.information());
		
		//>실행하고자 하는 메소드가 자식클래스에 재정의가 되었다면 그 재정의된 메소드가 호출됨
		//> 재정의된 메소드가 없다면 부모클래스의 원본 메소드가 호출됨!!
		
		/*
		 * *상속
		 * 매 클래스마다 중복된 코드 (필드, 메소드)들을 
		 * "부모클래스"에 공통코드로 묶어두고, (단 한번만 정의해두고), 해당 클래스의 코드를 가져다 쓰는 개념
		 * 즉, 코드를 물려받겠다. 
		 * 
		 * *상속의 장점
		 * -보다 적은 양의 코드로 새로운 클래스들을 매번 작성 가능
		 * -중복된 코드를 공통적으로 관리하기 때문에 새로운 코드를 추가하거나 수정할때 용이함.
		 * =>프로그램의 "생상성"과 "유지보수"에 크게 기여
		 * 
		 * *상속의 특징
		 *  - 클래스간의 상속은 "다중상속"이 불가능하다.
		 *  즉, "단일 상속"만 가능하다.
		 *   (부모클래스는 최대 한개만 둘 수 있다.)
		 * 왜 > ? 부모클래스가 여러개일 경우, 필드명 또는 메소드명이 중보고디면 누구의 것을 가져다 써야할지 헷갈리기 때문
		 * 
		 * 	-명시되어있지는 않지만, 모든 클래스는 Object 라는 클래스의 후손이다.
		 * 내가 만든 클래스든, 남이 만들어준 클래스든 자바의 모든 클래스에게 해당되는 특징임
		 * >Object 클래스에 있는 메소드 및 필드들을 가져다 쓸 수 있다.
		 * >Object 클래스에 있는 메소드가 마음에 안든다면 오버라이딩을 통해 내 입맛대로 재정의가 가능하다.
		 *
		 * *Object 클래스
		 * 자바 프로그래밍에서 모든 객체에 대해 공통적으로 필요한 유용한 메소드들이
		 * 정의되이있는 "최상위 클래스"
		 * 
		 */
		
		System.out.println(d.hashCode());
		System.out.println(t.hashCode());
		System.out.println(s.hashCode());
		//>해시코드값
		// 객체명.hashCode(); 
		// > 사실 hashCode 메소드도 Object 클래스에 정의된 메소드임
		// 그동안 그냥 호출해서 사용 가능했던 이유는 Object 가 모든 클래스의 부모(조상) 클래스이기 때문
		
		
	}//메인메소드
}

















