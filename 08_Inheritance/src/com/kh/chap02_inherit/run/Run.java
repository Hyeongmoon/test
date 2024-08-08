package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {

		
		//비행기, 자동차, 배의 정보를 객체로 나타내기
		Airplane a = new Airplane("보잉747",0.02,"여객기",8,5);
		Car c = new Car("베뉴", 12.5, "SUV", 4);
		Ship s = new Ship("낚시배",3, "어선", 1);
		
		
		System.out.println(a.information());
		System.out.println(c.information());
		System.out.println(s.information());
		
		
		a.howToMove();
		c.howToMove();
		s.howToMove();
		
		
		
		
	}

}
