package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {

	//�ʵ��
	private String flavor;
	private int calory;
	
	//>��ǰ���� �̵��� HashMap �� �����Ҷ� Ű������ ǥ���� ���� !!
	
	
	//�����ں�
	public Snack() {}

	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

	//�޼ҵ��
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	//toString
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	
	//Set ���°� �ƴϸ� equals �� hashcode �������̵� ���ʿ�� ����. (�ߺ��� �񱳸� ���ؼ�)
	
	
	
	
	
	
}
