package com.kh.chap02_set.prar01_hashSet.model.vo;

import java.util.Objects;

public class Student {

	
//	�ʵ��
	private String name;    //�̸�
	private int age; 		//����
	private int score; 		//����
	
	
//	�����ں�
	public Student() {}


	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


//	�޼ҵ� 
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


//	Override �� HashCode �ڵ� �������̵� 
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
	
	
//	equals, hashCode �޼ҵ� �������̵�
//	equals  �������̵� - �ʵ� ������ �������� �����
	
	/*
	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student)obj;
		
//		�̸��� ��Ÿ���� name �ʵ尪�� ��ġ�ϴ°�?
//		this.name.equals(other.getName());
//		���̸� ��Ÿ���� age �ʵ尪�� ��ġ�ϴ°�?
//		this.age == other.age;
//		������ ��Ÿ���� score �ʵ尪�� ��ġ�ϴ°� ?
//		this.score == other.score;
		
		if((this.name.equals(other.name)) && (this.age == other.age) && (this.score == other.score)) {
			return true;
		}else {
			return false;
		}
	}
	
//	hashCode �޼ҵ� �������̵� - �ʵ� ������ �������� ������ȭ
	@Override
	public int hashCode() {

//		�̹� String Ŭ������ hashCode �� ���빰 �������� ������ȭ ���� !!
		
		return (name+age+score).hashCode();
		
	}
 	*/
	
}
