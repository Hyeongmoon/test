package com.kh.chap02_set.prar01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.prar01_hashSet.model.vo.Student;

public class SetRun {

//	HashSet 사용방법
	public static void main(String[] args) {

		
//		제네릭설정X
//		HashSet 객체 먼저 생성
		HashSet hs1 = new HashSet();
		
//		1.add(추가할값)
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		hs1.add(50);
		
		System.out.println(hs1); 	//[안녕하세요, 여러분, 반갑습니다.] 출력
//			저장되는 데이터의 순서 유지X , 중복 저장 X
//			제네릭 설정을 안했을 경우 아무 타입이나 다 저장 가능
			
		
//		2.size()
		System.out.println("hs1의 크기 : "+ hs1.size());
		
		
//		3. remove(삭제할값)  //인덱스 대신, 값으로  
		hs1.remove("여러분");
		
		System.out.println(hs1);	//[50, 안녕하세요, 반갑습니다.]
		
		
//		4. clear()
		hs1.clear();
		
		System.out.println(hs1);	// []
		
		System.out.println(hs1.size());		// 0
		
//		5. isEmpty()
		System.out.println(hs1.isEmpty());		//true
		
//		>set계열 또한 유용한 메소드들이 많지만, 
//		 대부분 List 계열과 메소드 사용법이 거의 비슷하다.
//		 왜? Set, List 계열 모두 Collection 인터페이스 계열 자식들이기때문.
		
		System.out.println("-------------------------------------------------                                                           ");
		
		
//		제네릭 설정 o 
		
		HashSet<Student> hs2 = new HashSet<>();
		
//		hs2.add("시작"); // Student 객체만 들어갈수 있다. 
		hs2.add(new Student("이민호",37,100));
		hs2.add(new Student("김갑생",26,40));
		hs2.add(new Student("홍길동",24,68));
		hs2.add(new Student("이민호",37,100)); 	//중복
		
		
		System.out.println(hs2);
//		>저장 순서 유지 X, 중복 저장 O		//set계열은 중복안되는데?
//		 제네릭을 설정했기 때문에 같은 타입만 저장됨 !!
		
//		왜? 중복저장이 되었는가?
//		>동일한 객체로 판단이 되지 않아서 중복저장됨!!
		
//		*HashSet 은 값이 추가될 때
//		equals(), hashCode() 메소드를 통해
//		동일한 데이터가 있는지 없는지 검사 후 add 해줌
		
//		hashSet 에 객체를 담을때
//		내부적으로 equals() 로 비교 - 주소값 동등비교(스트링만 오버라이딩되서 값 비교)
//		+
//		내부적으로 hashCode() 값이 일치하는지도 비교 - 주소값 동등비교
//		>즉, "주소값"을 기준으로 중복판별을 한다 !!
		
//		객체의 각 필드값이 일치하면
//		동일한 객체로 판별이 되서 중복저장이 안되게끔 하고싶을 경우?
//		>equals(), hashCode() 메소드를 오버라이딩 하기!!
		
//		기존 Object 클래스의 메소드
//		 - equals() : 주소값 동등비교
//		 - hashCode() : 주소값을 10진수로
		
//		오버라이딩 ( Student 클래스에서 메소드 오버라이딩)
//		 - equals() : 내용물 동등비교호
//		 - hashCode() : 내용물을 십진수로
		
//		>VO 클래스 작성 시
//		 해당 VO 타입의 객체를 가지고 HashSet 에 저장할 일이 있다면
//		 필드값을 기준으로 동등비교 하는 equals 와 필드값을 기준으로 동작하는 hashCode 메소드를
//		 오버라이딩 해서 쓰는 것을 권장함
//			>만약 HashSet 에 저장할 일이 없다면
//		 	 굳이 오버라이딩 안해도 됨 !! (필수는 아님)
		
		System.out.println("------------------------------");
		
//		Set 에 들어있는 데이터에 "순차적" 으로 접근하고자 할 때 ? 
		
//		set : 무작위 객체가 저장되어 있음 ( 즉, index 개념이 없음)
//		> 일반 for 문 사용불가
		
//		1. 향상된 for 문 사용 가능 (foreach문)
//		for(변수선언문 : 셋명)
//		>구문 표현법 어디에도 index 에 대한 언급이 없기 때문에 사용가능
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------00");
		
//		2.기존 Set 에 저장된 데이터를 ArrayList 로 옮겨준 후 
//		1) 빈 ArrayList 객체 생성 후 addAll 메소드를 활용
		
		
//		ArrayList<Student> list = new ArrayList<>();
//		list.addAll(hs2);
		
//		2) ArrayList 객체 생성 시 매개변수 생성자를 이용
		ArrayList<Student> list = new ArrayList<>(hs2);
		//>처음부터 데이터가 추가된 채로 객체 생성
		
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("-----------------------------------9999999");
		
		//3.hashSet 클래스에서 제공하는 "Iterator" (반복자)를 이용 하는 방법
	
		//3.1)hs2 에 담겨있는 객체들을 Iterator (반복자) 에 옮겨 닮기
		Iterator<Student> it =  hs2.iterator();
		// Iterator 객체 생성후,  hs2의 값들을 iterator() 메소드를 이용해, Iterator 상자에 옮겨 닮느낟. 
		
		//3_2. Iterator (반복자) 를 통해서 반복 돌리기
		//> 더이상 뽑아낼 데이터가 없을 때 가지 반복 !!
		
		//Iterator 객체에서 제공하는 더이상 뽑을 데이터가 있는지 검사해주는 메소드
		//> it.hasNext() : 뽑아낼 데이터가 있으면 true / 없으면 false 반환
		while(it.hasNext()==true) {
			
			//뽑아낼 데이터가 있다면
			// >it.next() : 데이터를 뽑아주는 메소드
			System.out.println(it.next());
		}
		
//		System.out.println(it.next());  //오류 NoSearchElementException
		
		//*Iterator 의 동작원리
		// > String 의 STringTokenizer 와 비슷 !!
		
		//* .iterator() 메소드
		//> List 계열과 Set 계열 모두 사용할 수 있는 메소드
		//  (Collection 계열에서는 사용 가능)
		//> Map 계열에서는 사용 불가
	}
	
	
	

}
