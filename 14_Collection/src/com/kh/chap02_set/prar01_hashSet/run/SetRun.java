package com.kh.chap02_set.prar01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.prar01_hashSet.model.vo.Student;

public class SetRun {

//	HashSet �����
	public static void main(String[] args) {

		
//		���׸�����X
//		HashSet ��ü ���� ����
		HashSet hs1 = new HashSet();
		
//		1.add(�߰��Ұ�)
		hs1.add("�ݰ����ϴ�.");
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���"));
		hs1.add(new String("������"));
		hs1.add(50);
		
		System.out.println(hs1); 	//[�ȳ��ϼ���, ������, �ݰ����ϴ�.] ���
//			����Ǵ� �������� ���� ����X , �ߺ� ���� X
//			���׸� ������ ������ ��� �ƹ� Ÿ���̳� �� ���� ����
			
		
//		2.size()
		System.out.println("hs1�� ũ�� : "+ hs1.size());
		
		
//		3. remove(�����Ұ�)  //�ε��� ���, ������  
		hs1.remove("������");
		
		System.out.println(hs1);	//[50, �ȳ��ϼ���, �ݰ����ϴ�.]
		
		
//		4. clear()
		hs1.clear();
		
		System.out.println(hs1);	// []
		
		System.out.println(hs1.size());		// 0
		
//		5. isEmpty()
		System.out.println(hs1.isEmpty());		//true
		
//		>set�迭 ���� ������ �޼ҵ���� ������, 
//		 ��κ� List �迭�� �޼ҵ� ������ ���� ����ϴ�.
//		 ��? Set, List �迭 ��� Collection �������̽� �迭 �ڽĵ��̱⶧��.
		
		System.out.println("-------------------------------------------------                                                           ");
		
		
//		���׸� ���� o 
		
		HashSet<Student> hs2 = new HashSet<>();
		
//		hs2.add("����"); // Student ��ü�� ���� �ִ�. 
		hs2.add(new Student("�̹�ȣ",37,100));
		hs2.add(new Student("�谩��",26,40));
		hs2.add(new Student("ȫ�浿",24,68));
		hs2.add(new Student("�̹�ȣ",37,100)); 	//�ߺ�
		
		
		System.out.println(hs2);
//		>���� ���� ���� X, �ߺ� ���� O		//set�迭�� �ߺ��ȵǴµ�?
//		 ���׸��� �����߱� ������ ���� Ÿ�Ը� ����� !!
		
//		��? �ߺ������� �Ǿ��°�?
//		>������ ��ü�� �Ǵ��� ���� �ʾƼ� �ߺ������!!
		
//		*HashSet �� ���� �߰��� ��
//		equals(), hashCode() �޼ҵ带 ����
//		������ �����Ͱ� �ִ��� ������ �˻� �� add ����
		
//		hashSet �� ��ü�� ������
//		���������� equals() �� �� - �ּҰ� �����(��Ʈ���� �������̵��Ǽ� �� ��)
//		+
//		���������� hashCode() ���� ��ġ�ϴ����� �� - �ּҰ� �����
//		>��, "�ּҰ�"�� �������� �ߺ��Ǻ��� �Ѵ� !!
		
//		��ü�� �� �ʵ尪�� ��ġ�ϸ�
//		������ ��ü�� �Ǻ��� �Ǽ� �ߺ������� �ȵǰԲ� �ϰ���� ���?
//		>equals(), hashCode() �޼ҵ带 �������̵� �ϱ�!!
		
//		���� Object Ŭ������ �޼ҵ�
//		 - equals() : �ּҰ� �����
//		 - hashCode() : �ּҰ��� 10������
		
//		�������̵� ( Student Ŭ�������� �޼ҵ� �������̵�)
//		 - equals() : ���빰 �����ȣ
//		 - hashCode() : ���빰�� ��������
		
//		>VO Ŭ���� �ۼ� ��
//		 �ش� VO Ÿ���� ��ü�� ������ HashSet �� ������ ���� �ִٸ�
//		 �ʵ尪�� �������� ����� �ϴ� equals �� �ʵ尪�� �������� �����ϴ� hashCode �޼ҵ带
//		 �������̵� �ؼ� ���� ���� ������
//			>���� HashSet �� ������ ���� ���ٸ�
//		 	 ���� �������̵� ���ص� �� !! (�ʼ��� �ƴ�)
		
		System.out.println("------------------------------");
		
//		Set �� ����ִ� �����Ϳ� "������" ���� �����ϰ��� �� �� ? 
		
//		set : ������ ��ü�� ����Ǿ� ���� ( ��, index ������ ����)
//		> �Ϲ� for �� ���Ұ�
		
//		1. ���� for �� ��� ���� (foreach��)
//		for(�������� : �¸�)
//		>���� ǥ���� ��𿡵� index �� ���� ����� ���� ������ ��밡��
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------00");
		
//		2.���� Set �� ����� �����͸� ArrayList �� �Ű��� �� 
//		1) �� ArrayList ��ü ���� �� addAll �޼ҵ带 Ȱ��
		
		
//		ArrayList<Student> list = new ArrayList<>();
//		list.addAll(hs2);
		
//		2) ArrayList ��ü ���� �� �Ű����� �����ڸ� �̿�
		ArrayList<Student> list = new ArrayList<>(hs2);
		//>ó������ �����Ͱ� �߰��� ä�� ��ü ����
		
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("-----------------------------------9999999");
		
		//3.hashSet Ŭ�������� �����ϴ� "Iterator" (�ݺ���)�� �̿� �ϴ� ���
	
		//3.1)hs2 �� ����ִ� ��ü���� Iterator (�ݺ���) �� �Ű� ���
		Iterator<Student> it =  hs2.iterator();
		// Iterator ��ü ������,  hs2�� ������ iterator() �޼ҵ带 �̿���, Iterator ���ڿ� �Ű� �����. 
		
		//3_2. Iterator (�ݺ���) �� ���ؼ� �ݺ� ������
		//> ���̻� �̾Ƴ� �����Ͱ� ���� �� ���� �ݺ� !!
		
		//Iterator ��ü���� �����ϴ� ���̻� ���� �����Ͱ� �ִ��� �˻����ִ� �޼ҵ�
		//> it.hasNext() : �̾Ƴ� �����Ͱ� ������ true / ������ false ��ȯ
		while(it.hasNext()==true) {
			
			//�̾Ƴ� �����Ͱ� �ִٸ�
			// >it.next() : �����͸� �̾��ִ� �޼ҵ�
			System.out.println(it.next());
		}
		
//		System.out.println(it.next());  //���� NoSearchElementException
		
		//*Iterator �� ���ۿ���
		// > String �� STringTokenizer �� ��� !!
		
		//* .iterator() �޼ҵ�
		//> List �迭�� Set �迭 ��� ����� �� �ִ� �޼ҵ�
		//  (Collection �迭������ ��� ����)
		//> Map �迭������ ��� �Ұ�
	}
	
	
	

}
