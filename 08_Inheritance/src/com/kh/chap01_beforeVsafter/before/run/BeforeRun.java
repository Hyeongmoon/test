package com.kh.chap01_beforeVsafter.before.run;

import com.kh.chap01_beforeVsafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVsafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main (String[] args) {
		
		
		//desktop ��ü
		Desktop d = new Desktop("�Ｚ", "d-01","���ֵ̹���ũž",2300000, true);
		
		//tv
		Tv t = new Tv("����", "t-01", "����޺�����Ƽ��", 3500000, 100);
		
		//smartphone
		SmartPhone s = new SmartPhone("����","s-01", "������", 1230000, "SKT");
		
		System.out.println(d);
		System.out.println(t);
		System.out.println(s);
		//>�ּҰ� ���
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		/*
		 * * �� Ŭ�������� �ߺ��� �ڵ���� ������ ����صΰ� �Ǹ�
		 * �ڵ带 �ۼ��ϴ� �������� �Ǽ��� ���ɼ��� ���� �Ӹ� �ƴ϶�
		 * ������ ���� �������� �� �Ź� �ش� �ڵ带 ������ ã�� ���� �� �����ؾ��ϴ� ���ŷο��� ����!!
		 * 
		 * *"���"�̶�� ������ ������Ѽ� �� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ���� 
		 * �� �ѹ��� �� �ϳ��� Ŭ����(�θ�Ŭ����)�� �����ص� �� �ش� Ŭ������ �ڵ带 ������ ���� �������� ����
		 */
	}
}
