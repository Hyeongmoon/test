package com.kh.chap02_set.prar01_hashSet.model.vo;

import java.util.Objects;

public class Student {

	
//	필드부
	private String name;    //이름
	private int age; 		//나이
	private int score; 		//점수
	
	
//	생성자부
	public Student() {}


	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


//	메소드 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}

//	toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}


//	Override 와 HashCode 자동 오보라이딩 
	@Override
	public int hashCode() {
		return Objects.hash(age, name, score);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && score == other.score;
	}
	
	
//	equals, hashCode 메소드 오버라이딩
//	equals  오버라이딩 - 필드 내용을 기준으로 동등비교
	
	/*
	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student)obj;
		
//		이름을 나타내는 name 필드값이 일치하는가?
//		this.name.equals(other.getName());
//		나이를 나타내는 age 필드값이 일치하는가?
//		this.age == other.age;
//		점수를 나타내는 score 필드값이 일치하는가 ?
//		this.score == other.score;
		
		if((this.name.equals(other.name)) && (this.age == other.age) && (this.score == other.score)) {
			return true;
		}else {
			return false;
		}
	}
	
//	hashCode 메소드 오버라이딩 - 필드 내용을 기준으로 십진수화
	@Override
	public int hashCode() {

//		이미 String 클래스의 hashCode 가 내용물 기준으로 십진수화 해줌 !!
		
		return (name+age+score).hashCode();
		
	}
 	*/
	
}
