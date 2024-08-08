package com.kh.chap00_intro.util;

import java.util.Arrays;

//��ġ �迭ó�� �������� �����͸� Ÿ�Կ� ������� �����Ҽ� �ְԲ� ����
public class MyList {

	
	//�ʵ��
	private Object[]arr; //�ڷ����� ��� ���� �ƹ� �����ͳ� �� ���� �� �ִ� �迭
	private int size; // arr �迭�� ���� ����ִ� �������� ����
	
	//�����ں�
	//�⺻������  - arr �迭�� 10ĭ¥���� �Ҵ�, size ���� 0���� ����
	public MyList() {
		arr = new Object[10];
		size = 0;
		
	}
	
	//�Ű����������� - ���޹��� ũ�⸸ŭ arr �迭�� lengthĭ¥���� �Ҵ�, size ���� 0���� ����
	public MyList(int length) {
		
		arr = new Object[length];
		size = 0;
	}
	
	
	//�޼ҵ��
	
	//add �޼ҵ�1 - ���޹��� item �� arr �迭�� ������ �ε����� ���� 
	//				��, �迭�� �̹� �� ���ִٸ� ���� arr �迭�� ���������ϵ�,
	//				������ 2�� ������� ������ ������ �ε����� ����.
	//				
	//				���� ���� �����Ұ��,, count ++ �ϸ�Ǵµ� ,,,,
	//				�߰��� �Ҿ� ����ִ� ���. ...(�ϴ� ���� ���� �������� ,,,, ?)  
	
	public void add(Object item) {
		if(size==arr.length) { 
			arr = Arrays.copyOf(arr, arr.length*2);
		}
		arr[size]=item;
		size++;
	}
	
	//�����ε�
	//add �޼ҵ�2 - ���޹��� item �� arr �迭�� index ��° ĭ�� ����
	//				��, �迭�� �̹� �� ���ִٸ� ���� arr �迭�� ���� �����ϵ�,
	//				������ 2�� ������� ���� �� �ش� �ε����� ����
	//*�ش� �ε����� ������ ������ ������ �ڷ� ��ĭ�� �о��ִ� �۾� �� ����!!
	//
		
	public void add(int index,Object item) {
		//�迭�� �� ���ִ� ��� - 2�� ������� ���� ����
		if(size==arr.length) {
			arr = Arrays.copyOf(arr, arr.length*2);
		}
		
		//index �� item �� �����ϱ� ���� index ~ ������ ������
		//�ڷ� ��ĭ�� ����� �۾��� ���� ����

		for(int i=size;i>index;i--) {      
			arr[i]=arr[i-1];
		}
		arr[index]=item;
		size++;
		
	}	
		
		
	
	//set �޼ҵ� - ���޹��� index ��° ĭ�� �����͸� ���޹��� item ���� ����
	//				��, index �� ���� ���� �ִ� �ε����� �����ؾ���!!
	public void set(int index, Object item) {
		if(index<size) {
			arr[index]=item;
		}
		
	}
	
	//get �޼ҵ� - arr �迭�κ��� ���޹��� index ��° �����͸� ����
	public Object get(int index) {
		
		return arr[index];
	}
	
	//remove �޼ҵ� - arr�迭�κ��� ���޹��� index ��° �����͸� ����
	//*�ش� ������ ���� �� ���� �����͸� ������ ��ĭ�� ���ܿ��� �۾����� ����!!
	public void remove(int index) {
	
		for(int i = index; i<size-1;i++) {   //index 8 size9
			arr[i]=arr[i+1];				// 9��°/10���� = 10��°.
		}
		arr[size-1]=null;
	
		size--;
	}
	
	//size �޼ҵ� - arr �迭�� ���� ����ִ� �������� ������ ����
	//*
	public int size() {
		return size;
	}
	
	//isEmpty�޼ҵ� - arr �迭�� ����ִ� �����Ͱ� �ϳ��� ���ٸ� true ����
	//										�ϳ��� �ִٸ� false ����
	public boolean isEmpty() {
		
		return (size==0)?true:false ;
	}
	
	//toString �޼ҵ� �������̵� - arr �迭�� ���빰��
	//							"[��,��,��,....] " �������� ���ڿ� ����
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
