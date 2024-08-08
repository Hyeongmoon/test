package com.kh.chap03_override.model.vo;

public class Book {

//�ʵ��
	
	private String title;
	private String author;
	private int price;
	
//�����ں�
	public Book() {}
	public Book(String title, String author, int price) {
		super(); //�������.
		this.title = title;
		this.author = author;
		this.price = price;
	}
//�޼ҵ��
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	/*
	//information
	public String information() {
		return title + " " + author + " " + price;
	}
	*/
	//information ����, toString �������̵��� �⺻���� ����. 
	
	
	
	
	
	/*
	//toString �޼ҵ� �������̵�
	@Override//�̰� �������̵��� �޼ҵ���
	public String toString() {
		return "title : " + title + ",author : " + author + ", price : " + price ; 
	}
	*/
	//toString �������̵��� ��Ŭ������ �ڵ��ϼ� ����
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	/*
	 * *�������̵�
	 * - ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ��������
	 * 	�ڵ带 �� �Ը���� ������ (���ۼ�) �ϴ� ��
	 * - �θ� �����ϰ� �ִ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴ� ��� �ǹ�
	 * - ȣ�� �� �����ǵ� �ڽĸ޼ҵ尡 �켱���� ����(���� ���ε�)
	 * 
	 * *�������̵� ���� ����
	 * 1. �θ�޼ҵ��� �޼ҵ� ��� ����
	 * 2. �Ű������� �ڷ���, ����, ������ ��� ����
	 * 3. ��ȯ�� ����
	 * 4.�Ű���������� ����
	 * 5.�θ�޼ҵ��� ���������ں��� ���ų� ���������� �� Ŀ�� ��
	 * > ��, �޼ҵ� ���Ǻ�(������) �� �״�� ����, �߰�ȣ ���� ������ �ڵ常 ������ �Ѵٰ� �����ص���!!
	 * >�Ծ��� ������ ������
	 * 	������ �Ϸ��� ��� �������� ��Ģ�� ���Ѿ��Ѵ�. 
	 * 
	 * *�����ε� vs �������̵�
	 * -�����ε�
	 * ����̶� ���� ���� ����
	 * ���� Ŭ���� �� ������ �̸����� �������� �޼ҵ带 ���� �� �ִ� ��Ģ
	 * -�������̵�
	 * ����̶� �����ִ� ����
	 * ��� ������ Ŭ�������� �޼ҵ带 ������ �� �� �ִ� ��Ģ
	 * 
	 * 
	 * *@Override (������̼� : Annotation)
	 * - ���� ���� ( �ᵵ �׸�, �Ƚᵵ �׸��� )
	 * - �� �޼ҵ尡 ���ζ��̵��� �޼ҵ����� �˷��ִ� ������ "�ּ�"���� �� 
	 * -������̼� ���� ���� ����? 
	 *  �������̵� �� �޼ҵ带 �߸� �������� ���(�Ǽ��Ұ��)
	 *  �����ν� (���� ���ٷ�) �˷��ֱ� ������ �ڵ带 �ٽ� �ѹ� ������ �� �ְ� �������ش�. 
	 * 
	 * 
	 * *VO �ڵ� �ۼ� ��
	 * 1.�ʵ�� ������ private ���� �켱 �ۼ�
	 * 2.�⺻������ �ۼ�
	 * 3.����ʵ忡 ���� �Ű����� ������ source
	 * 4. setter / getter �޼ҵ� �ۼ� source
	 * 5.toString �޼ҵ� "�������̵�" >
	 * > �۾�����
	 * 
	 */

	
	
}
