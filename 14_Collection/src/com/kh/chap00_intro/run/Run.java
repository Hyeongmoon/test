package com.kh.chap00_intro.run;

import com.kh.chap00_intro.util.MyList;

public class Run {

	public static void main(String[] args) {

		
		MyList ml = new MyList();
		
	
		
		System.out.println(ml);
		System.out.println("size : "+ ml.size());
		System.out.println("empty : " + ml.isEmpty());
		
		ml.add("안녕하세요");
		ml.add("1");
		ml.add(9.875);
		ml.add("hihi");
		
		System.out.println(ml);
		System.out.println("size : "+ml.size());
		System.out.println("isEmpty : "+ml.isEmpty());
		
		System.out.println("=====================");
		
		ml.add(2,"잘가~~~");
		System.out.println(ml);
		System.out.println("size : "+ml.size());
		
		ml.set(0, "안녕히 가세요");
		System.out.println(ml);
		
		ml.remove(2);
		System.out.println(ml);
		System.out.println("size : "+ml.size());
		
		
		System.out.println(ml.get(4));
		
		for(int i=0 ;i>ml.size();i++) {
			System.out.println(i+"번 인덱스의 값 : "+ml.get(i));
		}
	}
}
