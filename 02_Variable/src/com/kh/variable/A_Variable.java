package com.kh.variable;
//패키지선언부,클래스풀네임
public class A_Variable {

	public void printSalary() {
		//변수사용전
		System.out.println("====변수사용전====");
		
		System.out.println("시급 : 9800 원");
		System.out.println("근무시간 : 주 6시간");
		System.out.println("근무일수 : 매달 5일");

		System.out.println("김갑생 : 9800*6*5원");
		System.out.println("김갑생 : "+9800*6*5+"원");
		System.out.println("홍길도 : "+(9800+6*5)+"원");
		

		System.out.println("====변수사용후====");
		
		int pay = 9960;
		int time = 6;
		int day = 5;
		
		System.out.println("시급: "+ pay + "원");
		System.out.println("근무시간 : "+ time + "시간");
		System.out.println("근무일수 : "+ day + "일");
		System.out.println("김갑생 : "+ pay*time*day + "원");
		System.out.println("홍길동 : "+ pay*time*day +"원");
		
		/*
		 * *변수를 사용하는 이유
		 * 1.변수는 우선적으로 값에 의미를 부여할 목적으로 사용(가독성이좋음)
		 * 2.단 한번 값을 잘 기록해두고 필요할 때마다 계속 꺼내서 사용(코드의 재사용성이 높아짐)
		 * 3.유지보수를 보다 쉽게 할수 있다.
		 */
		
	}	
	
	//변수의 선언 및 자료형 개념
	public void declareVariable() { //변수를 선언하다
		/*
		 * *변수의 선언
		 * 값을 기록해두기 위한 변수를 메모리 공간에 확보해 두겠다.
		*/
		
		//----자료형에 대한 개념-----
		//1.논리형(논리값 true/ false)
		boolean isTrue=true; //1byte 
		
		//2.숫자형
		//2_1.정수형
		byte bNum; //1byte (2^7 만큼, -128~127)
		short sNum; //2byte(-32만~32만)
		int iNum; //4byte ( -21억~21억)
		long lNum; //8byte(제일 큼)
		//2_2.실수형
		float fNum;//4byte (소수점 7자리)
		double dNum;//8byte (소수점 15자리)
		
		//3.문자형
		//문자값 : 글자 단 한개를 나타내는 값
		char ch; //(2byte)
		
		//---여기까지 기본자료형
		
		//4.문자열형
		//문자열값 : 글자들이 나열되어 있는 형태의 값
		String str; // (4byte) 얘만 참조자료형
		
		
		
		isTrue = true;
		
		bNum=1;
		sNum=2;
		iNum=4;
		lNum=8L;
		
		fNum=4.0f;
		dNum=10.51561;
		
		ch = 'A';
		str = "Hello";
		
		System.out.println(isTrue);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		
	}//declare 메소드 영역끝
	
	public void initVariable() {
		
		boolean isTrue = 3<5;
		
		byte bNum = 1;
		short sNum = 2;
		int iNum =4;
		long lNum = 8L;
		
		float fNum=4.0f;
		double dNum = 8.0;
		
		char ch='김';
		String str = "자바 공부중";
		
		System.out.println(isTrue);
	
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println(fNum);
		System.out.println(dNum);
		
		System.out.println(ch);
		System.out.println(str);
	}//initVariable 영역 끝
	
	//상수개념
	public void constant() {
		
		/*
		 * *상수
		 * 변하지 않는 고정적인 값을 담을 수 있는 공간
		 * 
		 * [표현법]
		 * final 자료형 상수명;
		 * 상수명 = 값;
		 * final 자료형 상수명 = 값;
		 */
		
		int age = 20; //변수
		System.out.println("나이 : "+age);
		age = 21;
		System.out.println("나이 : "+age);
		
		
		final int AGE = 22;
		System.out.println("나이 : "+AGE);
		//AGE = 23;
		
		
		
	}
	public void overflow() {
		byte bNum=127; //byte의 최댓값
		System.out.println("before :"+ bNum);//127
		
		bNum++;
		System.out.println("after :"+ bNum); //128? -128
	}
	
}
