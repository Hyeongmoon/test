package com.kh.chap01_beforeVsafter.after.model.vo;

//extends Ȯ���ϰڴ�. 
//>�θ�Ŭ������ �ڵ带 �������, + �� �ڵ带 �߰� �ؼ� �����̱� ����
public class Tv extends Product{
	
	
	//�ʵ��
	private int inch;

	
	//�����ں� //�����ε�
	public Tv() {}
	public Tv(String brand, String pCode, String pName, int price, int inch	) {
		//super() �θ�Ŭ������ �⺻������ ȣ��
		super(brand,pCode,pName,price);
		this.inch = inch;
	}
	
	//�޼ҵ��
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	//information �޼ҵ� �������̵�
	public String information() {
		return super.information() + " " + inch;
	}
}
