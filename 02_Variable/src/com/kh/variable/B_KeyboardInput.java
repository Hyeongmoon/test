package com.kh.variable;
import java.util.Scanner;

//사용자가 키보드로 입력한 값을 변수에 기록하는 방법
public class B_KeyboardInput {

	public void inputTest1() {
		
		/*
		 * *Scanner
		 * 사용자로부터 정수, 실수, 문자열을 입력받을 수 있게끔 고안된 "클래스" (이름이 대문자로 시작함)
		 * >자바에서 기본적으로 제공되는 클래스
		 * java.util 패키지 내부에 존재함 
		 * 풀클래스명 java.util.Scanner
		 */
		
		//Scanner 클래스 내에 정의된 값을 키보드로 입력받는 메소드를 호출해서 사용할것
		
		//1.Scanner 클래스를 대변할 이름 생성하기 (new)
		Scanner sc = new Scanner(System.in);
		//>System.in 은 키보드로 입력받은 값을 바이트 단위로 읽어들이겠다 라는 뜻임
		
		//2. 그 대변할 이름을 가지고 메소드 호츨하기
		//sc.xxxxx();
		//>Scanner 클래스 내부의 유용한 메소드들을 쓰임새에 맞게 호출하면 됨
		
		//사용자의 인적사항 (이름, 나이, 키) 을 입력받아 출력하는 프로그램을 만들어보자
		
		//항상 입력받기 전에는 사용자의 입력을 제대로 유도하자
		System.out.print("당신의 이름은 무엇입니까 ?!?  -  ");
		
		//이름 : "김형문",
		//>문자열 String 타입
		
		//*사용자가 입력한 값을 문자열로 받아오는 메소드
		//next(),nextLine()
		
//		sc.next();
		//>호출 구문만 작성한다면 입력만 받고 그냥 끝나게 됨
		
		//변수 선언과 동시에 값을 입력받아서 바로 대입한다.
//		String name = sc.next();
		//> 사용자가 엔터를 입력하기 전까지 대기상태임
		
//		System.out.println(name);
		//>next(): 사용자가 입력한 값 중에서 공백 이전 까지만 입력을 받아준다.
		
		String name = sc.nextLine();
		//nextLine() : 개행 이전까지 모두 입력을 받는다.
		
		
		
		System.out.print("당신의 나이는 몇살입니까 ?!?  -  ");
		//사용자가 입력한 값을 정수 int로 받아오는 메소드
		//nextInt()
		int age = sc.nextInt();

		
		System.out.print("당신의 키는 몇 cm입니까 ?!?  -  ");
		double height = sc.nextDouble();
		
		
		System.out.println(name+"님의 나이는 "+age+"살이고, 키는 "+height+"cm 입니다." );
		
		//Scanner 메소드들은 변수 선언과 동시에 값을 입력받아
		//곧바로 대입하는 구조로 많이쓴다.
		
		
	}
	
	//키보드로 값을 입력받을 때 종종 발생되는 문제
	public void inputTest2() {
		
		//사용자의 인적사항(이름,나이,주소,키)을 입력받아 출력하는 프로그램
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.print("이름을 입력하세요 : ");
		String name=sc.nextLine(); 
		//이 시점 기준으로 버퍼는 깨끗함
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		//이 시점 기준으로 버퍼에는 개행문자 남아있음
		
		//이 시점에서 다음 코드로 넘어가기 전에 버퍼를 비워보자.
		//>버퍼를 비워주는 메소드 : nextLine();
		//변수에 대입하는 구문을 제외하고 그냥 호출만 해주면 됨
		
		sc.nextLine();
		//nextLine 을 제외한 달ㄴ 입력용 메소드들은 모두 입력만 받고 버퍼 공간을 깨끗이 비워주지 않으니, 항상 버퍼를 비우는 nextLine을 같이쓰자.
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine(); 
		//개행문자가 남아있어,사용자가 엔터키를 친걸로 인식하고 다음 작업으로 넘어감
		//이슈발생 입력받지 않고 넘어가버림
		
		
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();//개행문자
		

		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+address);
		System.out.println("키 : "+height);
	}
	
	//그 이외의 타입의 값을 입력받는 방법
	public void inputTest3() {
		
		/*
		 * *Scanner 클래스에서 제공하는 값을 입력받는 메소드들
		 * 문자열을 입력받을때 : next(), nextLine()
		 * 정수값을 입력받을때 : nextInt(), nextByte(), nextShort(), nextLong()
		 * 실수값을 입력받을때 : nextDouble(), nextFloat()
		 * 논리값을 입력받을때 : nextBoolean()
		 * 그럼 문자값을 입력받을 경우에는? nextChar() ? 없음
		 */
		
		/*
		 * *문자열의 index 개념
		 * index : 색인, 번호, 순번 이런 뜻
		 * 
		 * 예) "apple" 문자열의 인덱스
		 * 		01234
		 * >문자열에서 0부터 시작하는 각 글자의 자릿수
		 * 
		 * *문자열로부터 x 번째 인덱스의 글자만 추출해주는 메소드
		 * [표현법]
		 * 문자열변수명.charAt(인덱스값);
		 * 
		 * -주의할 점
		 * 만약 문자열의 글자수 보다 더 범위가 큰 인덱스 값을 제시한다면?
		 * StringIndexOutOfBoundsException 오류가 발생함
		 */
		
		
		
		//사용자의 인적사항 (이름, 성별, 나이, 키) 을 입력받아서 출력해보자.
		Scanner sc=new Scanner(System.in);
		
		System.out.print("-이름입력하세요 - ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요 (Male/Female): ");
//		char gender = sc.nextChar();
		//nextChar 라는 메소드는 존재 x
		char gender = sc.nextLine().charAt(0);
		//>우선 문자열을 입력받은 후 곧바로 0번재 글자만 추출한것
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("--출력--");
		System.out.println("이름 - "+ name);
		System.out.println("성별 - "+ gender);
		System.out.println("나이 - "+ age);
		System.out.println("키 - "+ height);
		
		
	}
	
	//charAt() 연습
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		//사용자로부터 세글자 이상의 문자열 입력받기
		System.out.print("세글자 이상의 문자열을 입력해보세요 : ");
		String str=sc.nextLine();
		//str로 부터 각각 첫번째, 두번째, 세번재 글자를 뽑아서 출력해보자.
		char str0=str.charAt(0);
		char str1=str.charAt(1);
		char str2=str.charAt(2);
		
		
		
		System.out.println(str0);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("첫번째"+str.charAt(0)); //변수 없이 바로 출력
		System.out.println("두번째"+str.charAt(1));
		System.out.println("세번째"+str.charAt(2));
	}
	
	public void inputTest5() {
		//두 정수를 키보드로 입력받아 각각 덧셈,뺄샘,곱셈, 나눗셈 결과를 출력하기
		
		/*
		 * 실행예시)
		 * 첫번째 정수 : 10
		 * 두번째 정수 : 2
		 * 덧셈결과는 12
		 * 뺄샘결과는 8
		 * 곱셈결과는 20
		 * 나눗셈결과는 5
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "첫번재 정수 : ");
		int num1 = sc.nextInt();
		
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		int result1 = num1+num2;
		int result2 = num1-num2;
		int result3 = num1*num2;
		int result4 = num1/num2;
		boolean result5 = num1>num2;
		
		
		System.out.println("----출력-----");
		System.out.println("덧셈결과 = "+result1);
		System.out.println("뺄셈결과 = "+result2);
		System.out.println("곱셈결과 = "+result3);
		System.out.println("나눗셈결과 = "+result4);
		
		System.out.println("불리안 a>b = "+result5);
		
		System.out.println(num1+num2+"덧셈결과");
		System.out.println(num1-num2+"뺄셈결과");
		System.out.println(num1*num2+"곱셈결과");
		System.out.println(num1/num2+"나눗셈결과");
		
	}
	
	
}
