//0715
package com.kh.variable;
//풀클래스명 

//printf 구문(출력 메소드)
public class D_Printf {

	/*
	 * *출력 메소드
	 * System.out.print(출력하고자하는값"문자열"or'문자'or 100 or 10.0 or true);//문자열만 " 문자는 ' 정수실수는 따옴표 없이\
	 * -단순히 값을 출력만 해줌
	 * 
	 * System.out.println(출력하고자하는값);
	 * -해당 값을 출력 후 "줄바꿈(개행)" 까지 해줌
	 * 	(ln : line 의 약자)
	 * 
	 * System.out.printf("%형식",출력하고자 하는값)	
	 * -형식에 맞춰서 값들을 출력해주는 역할, 출력 후 줄바꿈 X
	 *  (f : format 의 약자)
	 *  -문자열 안에 그 값이 들어갈 자리를 아래와 같은 형식으로 잡아줘야함
	 *  %d : 정수 (대시멀의약자)
	 *  %f : 실수 
	 *  %c : 문자
	 *  %s : 문자열
	 */
	
	public void printfTest() {
		
		//정수테스트 byte,short,int,long 다 포함
		System.out.println("====정수테스트");
		int iNum1 = 10;
		int iNum2 = 20;
		
		//"iNum1 : xx, iNum2 : xx" 을 출력해보기
		//1.println 사용
		System.out.printf("iNum1 : " + iNum1 + " iNum2 : "+iNum2+"\n");
		//2.printf 사용
		System.out.printf("iNum1 : %d iNum2 : %d\n",iNum1,iNum2);
		//>줄바꿈 기능은 없음 !
		
		//"10+20=30" 을 출력해보기
		//1.println 사용
		System.out.println(iNum1+"+"+iNum2+"="+(iNum1+iNum2));

		//2.printf 사용
		System.out.printf("%d+%d=%d\n",iNum1,iNum2,iNum1+iNum2);
		
		//%d에 대한 옵셔
		System.out.printf("%d\n", iNum1);    // `10`
		System.out.printf("%5d\n", iNum1);	 // `   10`
		System.out.printf("%-5d\n", iNum1);  // `10   `
		//> %5d : 5칸의 공간 중 오른쪽 정렬
		
		
		//실수 테스트
		System.out.println("===실수테스트");
		double dNum = 4.27546789;
		
		//"dNum:xx.xxxx" 을 출력해보기
		//1.println 사용
		System.out.println("dNum : "+dNum); //dNum : 4.27546789
		//2.printf 사용
		System.out.printf("dNum : %f\n",dNum);//dNum : 4.275468 *반올림됨
		//> %f : 소수점 아래 7번째 자리에서 반올림 되어, 소숫점 아래 6번째 자리까지만 출력되는꼴
		
		// %f 에 대한 옵션
		System.out.printf("dNum : %.4f\n", dNum); //4.2755 (4.27546789) 반올림해서 4째자리까지 표현
		
		
		//문자와 문자열 테스트
		System.out.println("===문자와 문자열 테스트");
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n",ch,str);
		
		//%c, %s 에 대한 옵션
		System.out.printf("%C %S\n", ch,str);
		//>%C,%S : 영어 알파벳일 경우 모두 대문자로 변경해서 출력
		
		/*
		 * *printf
		 * 포맷(형식) 단 한번 제시로 간편하게 여러 값들을 출력가능
		 * 단, 지정한 포맷의 갯수와 종류, 뒤에오는 변수의 갯수와 종류, 순서가 다 맞아 떨어져야 한다. 
		 */
		
	}
	
}
