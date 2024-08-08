package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OvrerideRun {

	public static void main(String[] args) {

		//모든 클래스는 Objext 클래스의 후손이다. 
		//즉, 최상위 클래스는 항상 Object 
		//> Object 클래스에 정의된 메소드들은 다 가져다 쓸 수 있음!!
		//> Object 클래스에 정의된 메소드가 맘에 안든다면
		// 오버라이딩을 통해 재정의 ( 재작성 ) 가능
		
		
		Book bk = new Book("두잇자바프로그래밍", "박은종",25000);
		
		
		System.out.println(bk); //주소값
		System.out.println(bk.toString()); //주소값
		//> bk 를 그냥 출력했을때랑, bk.toString() 으로 출력했을때랑
		//출력 결과가 완전히 동일하게 나오는 상황
		
		
		//*출력문 안에 참조자료형 변수명을 제시해서 출력하고자 할 때 
		// 해당 참조자료형타입의 풀클래스명 + "@" + 16진수형태의 주소값
		//형식이 항상 출력되었었음 !!
		// > 내부적으로 JVM 이 자동으로 .toString() 메소드를 항상 호출해줬기 때문
		
		//Object 클래스에 정의된 toSting 메소드
		//>해당 타입의 풀클래스명 + "@" + 16진수형태 주소값
		// 하나의 문자열로 내보내주는 메소드
		
		// - 자식클래스인 Book 클래스에서 toString 메소드를 재정의
		// (오버라이딩)
		// 해당 객체의 모든 필드값들을 하나의 문자열로 합쳐서 돌려주는 식으로 재정의를 하겠다. 
		
		//bk를 출력했을때
		//toString 오버라이딩 전 : 주소값
		//	       오버라이딩 후 : 필드값
	}

}
