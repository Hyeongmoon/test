package com.kh.chap01_beforeVsafter.after.run;

import com.kh.chap01_beforeVsafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVsafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.after.model.vo.Tv;

public class AfterRun {

	
	public static void main(String[]args) {
		/*
		Desktop d = new Desktop();
		d.setBrand("�Ｚ");
		d.setpCode("d-01");
		d.setpName("���ֵ̹���ũž");
		d.setPrice(1000000);
		d.setAllInOne(true);
		*/
		
		
		Desktop d = new Desktop("�Ｚ", "d -01", "���̹� ����ũž", 200000, true);
		
		System.out.println(d.information());
		
		
		Tv t = new Tv("����","t-01","����޺����� Ƽ��",3500000,100);
		
		SmartPhone s =new SmartPhone("����","s-01","������",1230000,"SKT");
		
		
		System.out.println(t.information());
		
		System.out.println(s.information());
		
		//>�����ϰ��� �ϴ� �޼ҵ尡 �ڽ�Ŭ������ �����ǰ� �Ǿ��ٸ� �� �����ǵ� �޼ҵ尡 ȣ���
		//> �����ǵ� �޼ҵ尡 ���ٸ� �θ�Ŭ������ ���� �޼ҵ尡 ȣ���!!
		
		/*
		 * *���
		 * �� Ŭ�������� �ߺ��� �ڵ� (�ʵ�, �޼ҵ�)���� 
		 * "�θ�Ŭ����"�� �����ڵ�� ����ΰ�, (�� �ѹ��� �����صΰ�), �ش� Ŭ������ �ڵ带 ������ ���� ����
		 * ��, �ڵ带 �����ްڴ�. 
		 * 
		 * *����� ����
		 * -���� ���� ���� �ڵ�� ���ο� Ŭ�������� �Ź� �ۼ� ����
		 * -�ߺ��� �ڵ带 ���������� �����ϱ� ������ ���ο� �ڵ带 �߰��ϰų� �����Ҷ� ������.
		 * =>���α׷��� "����"�� "��������"�� ũ�� �⿩
		 * 
		 * *����� Ư¡
		 *  - Ŭ�������� ����� "���߻��"�� �Ұ����ϴ�.
		 *  ��, "���� ���"�� �����ϴ�.
		 *   (�θ�Ŭ������ �ִ� �Ѱ��� �� �� �ִ�.)
		 * �� > ? �θ�Ŭ������ �������� ���, �ʵ�� �Ǵ� �޼ҵ���� �ߺ����� ������ ���� ������ ������� �򰥸��� ����
		 * 
		 * 	-��õǾ������� ������, ��� Ŭ������ Object ��� Ŭ������ �ļ��̴�.
		 * ���� ���� Ŭ������, ���� ������� Ŭ������ �ڹ��� ��� Ŭ�������� �ش�Ǵ� Ư¡��
		 * >Object Ŭ������ �ִ� �޼ҵ� �� �ʵ���� ������ �� �� �ִ�.
		 * >Object Ŭ������ �ִ� �޼ҵ尡 ������ �ȵ�ٸ� �������̵��� ���� �� �Ը���� �����ǰ� �����ϴ�.
		 *
		 * *Object Ŭ����
		 * �ڹ� ���α׷��ֿ��� ��� ��ü�� ���� ���������� �ʿ��� ������ �޼ҵ����
		 * ���ǵ����ִ� "�ֻ��� Ŭ����"
		 * 
		 */
		
		System.out.println(d.hashCode());
		System.out.println(t.hashCode());
		System.out.println(s.hashCode());
		//>�ؽ��ڵ尪
		// ��ü��.hashCode(); 
		// > ��� hashCode �޼ҵ嵵 Object Ŭ������ ���ǵ� �޼ҵ���
		// �׵��� �׳� ȣ���ؼ� ��� �����ߴ� ������ Object �� ��� Ŭ������ �θ�(����) Ŭ�����̱� ����
		
		
	}//���θ޼ҵ�
}

















