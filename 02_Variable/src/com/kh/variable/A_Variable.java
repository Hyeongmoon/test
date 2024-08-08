package com.kh.variable;
//��Ű�������,Ŭ����Ǯ����
public class A_Variable {

	public void printSalary() {
		//���������
		System.out.println("====���������====");
		
		System.out.println("�ñ� : 9800 ��");
		System.out.println("�ٹ��ð� : �� 6�ð�");
		System.out.println("�ٹ��ϼ� : �Ŵ� 5��");

		System.out.println("�谩�� : 9800*6*5��");
		System.out.println("�谩�� : "+9800*6*5+"��");
		System.out.println("ȫ�浵 : "+(9800+6*5)+"��");
		

		System.out.println("====���������====");
		
		int pay = 9960;
		int time = 6;
		int day = 5;
		
		System.out.println("�ñ�: "+ pay + "��");
		System.out.println("�ٹ��ð� : "+ time + "�ð�");
		System.out.println("�ٹ��ϼ� : "+ day + "��");
		System.out.println("�谩�� : "+ pay*time*day + "��");
		System.out.println("ȫ�浿 : "+ pay*time*day +"��");
		
		/*
		 * *������ ����ϴ� ����
		 * 1.������ �켱������ ���� �ǹ̸� �ο��� �������� ���(������������)
		 * 2.�� �ѹ� ���� �� ����صΰ� �ʿ��� ������ ��� ������ ���(�ڵ��� ���뼺�� ������)
		 * 3.���������� ���� ���� �Ҽ� �ִ�.
		 */
		
	}	
	
	//������ ���� �� �ڷ��� ����
	public void declareVariable() { //������ �����ϴ�
		/*
		 * *������ ����
		 * ���� ����صα� ���� ������ �޸� ������ Ȯ���� �ΰڴ�.
		*/
		
		//----�ڷ����� ���� ����-----
		//1.����(���� true/ false)
		boolean isTrue=true; //1byte 
		
		//2.������
		//2_1.������
		byte bNum; //1byte (2^7 ��ŭ, -128~127)
		short sNum; //2byte(-32��~32��)
		int iNum; //4byte ( -21��~21��)
		long lNum; //8byte(���� ŭ)
		//2_2.�Ǽ���
		float fNum;//4byte (�Ҽ��� 7�ڸ�)
		double dNum;//8byte (�Ҽ��� 15�ڸ�)
		
		//3.������
		//���ڰ� : ���� �� �Ѱ��� ��Ÿ���� ��
		char ch; //(2byte)
		
		//---������� �⺻�ڷ���
		
		//4.���ڿ���
		//���ڿ��� : ���ڵ��� �����Ǿ� �ִ� ������ ��
		String str; // (4byte) �길 �����ڷ���
		
		
		
		isTrue = true;
		
		bNum=1;
		sNum=2;
		iNum=4;
		lNum=8L;
		
		fNum=4.0f;
		dNum=10.51561;
		
		ch = 'A';
		str = "Hello";
		
		System.out.println(isTrue);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		
	}//declare �޼ҵ� ������
	
	public void initVariable() {
		
		boolean isTrue = 3<5;
		
		byte bNum = 1;
		short sNum = 2;
		int iNum =4;
		long lNum = 8L;
		
		float fNum=4.0f;
		double dNum = 8.0;
		
		char ch='��';
		String str = "�ڹ� ������";
		
		System.out.println(isTrue);
	
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println(fNum);
		System.out.println(dNum);
		
		System.out.println(ch);
		System.out.println(str);
	}//initVariable ���� ��
	
	//�������
	public void constant() {
		
		/*
		 * *���
		 * ������ �ʴ� �������� ���� ���� �� �ִ� ����
		 * 
		 * [ǥ����]
		 * final �ڷ��� �����;
		 * ����� = ��;
		 * final �ڷ��� ����� = ��;
		 */
		
		int age = 20; //����
		System.out.println("���� : "+age);
		age = 21;
		System.out.println("���� : "+age);
		
		
		final int AGE = 22;
		System.out.println("���� : "+AGE);
		//AGE = 23;
		
		
		
	}
	public void overflow() {
		byte bNum=127; //byte�� �ִ�
		System.out.println("before :"+ bNum);//127
		
		bNum++;
		System.out.println("after :"+ bNum); //128? -128
	}
	
}
