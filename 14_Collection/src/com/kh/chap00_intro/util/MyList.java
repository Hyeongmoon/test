package com.kh.chap00_intro.util;

import java.util.Arrays;

//마치 배열처럼 여러개의 데이터를 타입에 상관없이 저장할수 있게끔 구현
public class MyList {

	
	//필드부
	private Object[]arr; //자료형에 상관 없이 아무 데이터나 다 담을 수 있는 배열
	private int size; // arr 배열에 실제 담겨있는 데이터의 갯수
	
	//생성자부
	//기본생성자  - arr 배열을 10칸짜리로 할당, size 값도 0으로 셋팅
	public MyList() {
		arr = new Object[10];
		size = 0;
		
	}
	
	//매개변수생성자 - 전달받은 크기만큼 arr 배열을 length칸짜리로 할당, size 값은 0으로 셋팅
	public MyList(int length) {
		
		arr = new Object[length];
		size = 0;
	}
	
	
	//메소드부
	
	//add 메소드1 - 전달받은 item 을 arr 배열의 마지막 인덱스에 저장 
	//				단, 배열이 이미 다 차있다면 기존 arr 배열을 깊은복사하되,
	//				기존의 2배 사이즈로 복사후 마지막 인덱스에 저장.
	//				
	//				차곡 차곡 저장할경우,, count ++ 하면되는데 ,,,,
	//				중간에 불쑥 집어넣는 경우. ...(일단 차곡 차곡 넣을경우로 ,,,, ?)  
	
	public void add(Object item) {
		if(size==arr.length) { 
			arr = Arrays.copyOf(arr, arr.length*2);
		}
		arr[size]=item;
		size++;
	}
	
	//오버로딩
	//add 메소드2 - 전달받은 item 을 arr 배열의 index 번째 칸에 저장
	//				단, 배열이 이미 다 차있다면 기존 arr 배열을 깊은 복사하되,
	//				기존의 2배 사이즈로 복사 후 해당 인덱스에 저장
	//*해당 인덱스의 값부터 마지막 값까지 뒤로 한칸씩 밀어주는 작업 후 진행!!
	//
		
	public void add(int index,Object item) {
		//배열이 다 차있는 경우 - 2배 사이즈로 깊은 복사
		if(size==arr.length) {
			arr = Arrays.copyOf(arr, arr.length*2);
		}
		
		//index 메 item 을 대입하기 전에 index ~ 마지막 값까지
		//뒤로 한칸씩 땡기는 작업을 먼저 진행

		for(int i=size;i>index;i--) {      
			arr[i]=arr[i-1];
		}
		arr[index]=item;
		size++;
		
	}	
		
		
	
	//set 메소드 - 전달받은 index 번째 칸의 데이터를 전달받은 item 으로 변경
	//				단, index 는 현재 값이 있는 인덱스로 제시해야함!!
	public void set(int index, Object item) {
		if(index<size) {
			arr[index]=item;
		}
		
	}
	
	//get 메소드 - arr 배열로부터 전달받은 index 번째 데이터를 리턴
	public Object get(int index) {
		
		return arr[index];
	}
	
	//remove 메소드 - arr배열로부터 전달받은 index 번째 데이터를 삭제
	//*해당 데이터 삭제 후 뒤의 데이터를 앞으로 한칸씩 땡겨오는 작업까지 진행!!
	public void remove(int index) {
	
		for(int i = index; i<size-1;i++) {   //index 8 size9
			arr[i]=arr[i+1];				// 9번째/10개중 = 10번째.
		}
		arr[size-1]=null;
	
		size--;
	}
	
	//size 메소드 - arr 배열에 실제 담겨있는 데이터의 갯수를 리턴
	//*
	public int size() {
		return size;
	}
	
	//isEmpty메소드 - arr 배열에 담겨있는 데이터가 하나도 없다면 true 리턴
	//										하나라도 있다면 false 리턴
	public boolean isEmpty() {
		
		return (size==0)?true:false ;
	}
	
	//toString 메소드 오버라이딩 - arr 배열의 내용물을
	//							"[값,값,값,....] " 형식으로 문자열 리턴
	@Override
	public String toString() {
	
		//return Arrays.toString(arr);
		
		String str= "[";
		
		for(int i = 0; i<size; i++) {
			str+=arr[i];
			if(i!=size-1) {
				str+=", ";
			}
		}
		
		str+="]";
		
		return str;
		
	}
	
	
}
