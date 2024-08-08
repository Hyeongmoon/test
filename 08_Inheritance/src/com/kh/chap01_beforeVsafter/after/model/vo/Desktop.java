package com.kh.chap01_beforeVsafter.after.model.vo;

//			�ڽ�Ŭ����      �θ�Ŭ����
//  		�ļ�Ŭ����		����Ŭ����
//			����Ŭ����		����Ŭ����
//			����Ŭ����		����Ŭ����

	
public class Desktop extends Product {
	//>��ӹ޴� ���� �ʵ� 4��, �޼ҵ� 9���� ����ó�� ���� �ִ�. 
	
	//�ʵ��
	
	
	private boolean allInOne;
	
	
	//�����ں�
	public Desktop() {	}
	
	public Desktop(String brand,
					String pCode,
					String pName,
					int price,
					boolean allInOne) {
		//brand, pCode, pName, price,
		//allInOne
		//�ʵ忡 �Ű����� ���� ���� ���� �ʱ�ȭ
		
		//this. : �ڱ� �ڽ��� �ּҰ��� ��� �ִ�.
		//super. : �ش� �θ�ü�� �ּҰ��� ����ִ�.
		//>�ڽİ�ü�� super. ���� �θ�Ϳ� ���� �����ϴ�.
		//>��, �����ϰ��� �ϴ°� private �� ���� ���� ������ �Ұ��ϴ�.
		
		//>�θ�Ŭ������ Product �� �ִ� �ʵ���
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		//�ȉ´�. not visible
		
		//�ذ���1. 
		//�θ�Ŭ������ �ʵ带 �ڽı����� ���� �����ϰԲ� ���� ������ ��¦�� Ǯ���ִ� ���
		//�׸��� �����ϴ����
		/*
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		 */ 
		
		
		//�ذ���2. 
		//�θ�Ŭ������ �ִ� public ������������ setter �޼ҵ���� Ȱ���ϱ�
		/*
		this.setBrand(brand);
		this.setpCode(pCode);
		this.setpName(pName);
		this.setPrice(price);
		*/
		
		//�ذ���3
		//�θ�Ŭ������ �����ڸ� ȣ���ϱ� this()������
		//this(brand,pCode, pName, price);
		//>�θ�Ŭ������ �����ڴ� super();
		super(brand,pCode, pName, price);
		
		this.allInOne = allInOne;
	}
	
	//�޼ҵ��
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	//information
	//>�θ�Ŭ������ �̹� �������� ���¿��� �ڽ�Ŭ�������� ������ ���·� �ٽ� ������ ���ϤǤ�
	//�ڵ� ���빰�� ���ƾ��� ��Ȳ == " �������̵�"
	public String information() {
		/*
		return super.getBrand() + " " + super.getpCode() + " " + super.getpName() + " " + super.getPrice() + " " +allInOne;
		*/
		
		return super.information() + " " + allInOne;
	}
	
}
