package com.kh.chap01_beforeVsafter.before.run;

import com.kh.chap01_beforeVsafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVsafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main (String[] args) {
		
		
		//desktop 객체
		Desktop d = new Desktop("삼성", "d-01","게이밍데스크탑",2300000, true);
		
		//tv
		Tv t = new Tv("엘지", "t-01", "고오급벽걸이티비", 3500000, 100);
		
		//smartphone
		SmartPhone s = new SmartPhone("애플","s-01", "아이폰", 1230000, "SKT");
		
		System.out.println(d);
		System.out.println(t);
		System.out.println(s);
		//>주소값 출력
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		/*
		 * * 매 클래스마다 중복된 코드들을 일일이 기술해두게 되면
		 * 코드를 작성하는 과정에서 실수할 가능성도 있을 뿐만 아니라
		 * 수정과 같은 유지보수 시 매번 해당 코드를 일일이 찾앗 전부 다 수정해야하는 번거로움이 생김!!
		 * 
		 * *"상속"이라는 개념을 적용시켜서 매 클래스마다 중복된 필드, 메소드들을 
		 * 단 한버만 또 하나의 클래스(부모클래스)로 정의해둔 후 해당 클래스의 코드를 가져다 쓰는 형식으로 진행
		 */
	}
}
