package com.kh.variable;
import java.util.Scanner;

//����ڰ� Ű����� �Է��� ���� ������ ����ϴ� ���
public class B_KeyboardInput {

	public void inputTest1() {
		
		/*
		 * *Scanner
		 * ����ڷκ��� ����, �Ǽ�, ���ڿ��� �Է¹��� �� �ְԲ� ��ȵ� "Ŭ����" (�̸��� �빮�ڷ� ������)
		 * >�ڹٿ��� �⺻������ �����Ǵ� Ŭ����
		 * java.util ��Ű�� ���ο� ������ 
		 * ǮŬ������ java.util.Scanner
		 */
		
		//Scanner Ŭ���� ���� ���ǵ� ���� Ű����� �Է¹޴� �޼ҵ带 ȣ���ؼ� ����Ұ�
		
		//1.Scanner Ŭ������ �뺯�� �̸� �����ϱ� (new)
		Scanner sc = new Scanner(System.in);
		//>System.in �� Ű����� �Է¹��� ���� ����Ʈ ������ �о���̰ڴ� ��� ����
		
		//2. �� �뺯�� �̸��� ������ �޼ҵ� ȣ���ϱ�
		//sc.xxxxx();
		//>Scanner Ŭ���� ������ ������ �޼ҵ���� ���ӻ��� �°� ȣ���ϸ� ��
		
		//������� �������� (�̸�, ����, Ű) �� �Է¹޾� ����ϴ� ���α׷��� ������
		
		//�׻� �Է¹ޱ� ������ ������� �Է��� ����� ��������
		System.out.print("����� �̸��� �����Դϱ� ?!?  -  ");
		
		//�̸� : "������",
		//>���ڿ� String Ÿ��
		
		//*����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ�
		//next(),nextLine()
		
//		sc.next();
		//>ȣ�� ������ �ۼ��Ѵٸ� �Է¸� �ް� �׳� ������ ��
		
		//���� ����� ���ÿ� ���� �Է¹޾Ƽ� �ٷ� �����Ѵ�.
//		String name = sc.next();
		//> ����ڰ� ���͸� �Է��ϱ� ������ ��������
		
//		System.out.println(name);
		//>next(): ����ڰ� �Է��� �� �߿��� ���� ���� ������ �Է��� �޾��ش�.
		
		String name = sc.nextLine();
		//nextLine() : ���� �������� ��� �Է��� �޴´�.
		
		
		
		System.out.print("����� ���̴� ����Դϱ� ?!?  -  ");
		//����ڰ� �Է��� ���� ���� int�� �޾ƿ��� �޼ҵ�
		//nextInt()
		int age = sc.nextInt();

		
		System.out.print("����� Ű�� �� cm�Դϱ� ?!?  -  ");
		double height = sc.nextDouble();
		
		
		System.out.println(name+"���� ���̴� "+age+"���̰�, Ű�� "+height+"cm �Դϴ�." );
		
		//Scanner �޼ҵ���� ���� ����� ���ÿ� ���� �Է¹޾�
		//��ٷ� �����ϴ� ������ ���̾���.
		
		
	}
	
	//Ű����� ���� �Է¹��� �� ���� �߻��Ǵ� ����
	public void inputTest2() {
		
		//������� ��������(�̸�,����,�ּ�,Ű)�� �Է¹޾� ����ϴ� ���α׷�
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name=sc.nextLine(); 
		//�� ���� �������� ���۴� ������
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		//�� ���� �������� ���ۿ��� ���๮�� ��������
		
		//�� �������� ���� �ڵ�� �Ѿ�� ���� ���۸� �������.
		//>���۸� ����ִ� �޼ҵ� : nextLine();
		//������ �����ϴ� ������ �����ϰ� �׳� ȣ�⸸ ���ָ� ��
		
		sc.nextLine();
		//nextLine �� ������ �ޤ� �Է¿� �޼ҵ���� ��� �Է¸� �ް� ���� ������ ������ ������� ������, �׻� ���۸� ���� nextLine�� ���̾���.
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine(); 
		//���๮�ڰ� �����־�,����ڰ� ����Ű�� ģ�ɷ� �ν��ϰ� ���� �۾����� �Ѿ
		//�̽��߻� �Է¹��� �ʰ� �Ѿ����
		
		
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();//���๮��
		

		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("�ּ� : "+address);
		System.out.println("Ű : "+height);
	}
	
	//�� �̿��� Ÿ���� ���� �Է¹޴� ���
	public void inputTest3() {
		
		/*
		 * *Scanner Ŭ�������� �����ϴ� ���� �Է¹޴� �޼ҵ��
		 * ���ڿ��� �Է¹����� : next(), nextLine()
		 * �������� �Է¹����� : nextInt(), nextByte(), nextShort(), nextLong()
		 * �Ǽ����� �Է¹����� : nextDouble(), nextFloat()
		 * ������ �Է¹����� : nextBoolean()
		 * �׷� ���ڰ��� �Է¹��� ��쿡��? nextChar() ? ����
		 */
		
		/*
		 * *���ڿ��� index ����
		 * index : ����, ��ȣ, ���� �̷� ��
		 * 
		 * ��) "apple" ���ڿ��� �ε���
		 * 		01234
		 * >���ڿ����� 0���� �����ϴ� �� ������ �ڸ���
		 * 
		 * *���ڿ��κ��� x ��° �ε����� ���ڸ� �������ִ� �޼ҵ�
		 * [ǥ����]
		 * ���ڿ�������.charAt(�ε�����);
		 * 
		 * -������ ��
		 * ���� ���ڿ��� ���ڼ� ���� �� ������ ū �ε��� ���� �����Ѵٸ�?
		 * StringIndexOutOfBoundsException ������ �߻���
		 */
		
		
		
		//������� �������� (�̸�, ����, ����, Ű) �� �Է¹޾Ƽ� ����غ���.
		Scanner sc=new Scanner(System.in);
		
		System.out.print("-�̸��Է��ϼ��� - ");
		String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ��� (Male/Female): ");
//		char gender = sc.nextChar();
		//nextChar ��� �޼ҵ�� ���� x
		char gender = sc.nextLine().charAt(0);
		//>�켱 ���ڿ��� �Է¹��� �� ��ٷ� 0���� ���ڸ� �����Ѱ�
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("--���--");
		System.out.println("�̸� - "+ name);
		System.out.println("���� - "+ gender);
		System.out.println("���� - "+ age);
		System.out.println("Ű - "+ height);
		
		
	}
	
	//charAt() ����
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		//����ڷκ��� ������ �̻��� ���ڿ� �Է¹ޱ�
		System.out.print("������ �̻��� ���ڿ��� �Է��غ����� : ");
		String str=sc.nextLine();
		//str�� ���� ���� ù��°, �ι�°, ������ ���ڸ� �̾Ƽ� ����غ���.
		char str0=str.charAt(0);
		char str1=str.charAt(1);
		char str2=str.charAt(2);
		
		
		
		System.out.println(str0);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("ù��°"+str.charAt(0)); //���� ���� �ٷ� ���
		System.out.println("�ι�°"+str.charAt(1));
		System.out.println("����°"+str.charAt(2));
	}
	
	public void inputTest5() {
		//�� ������ Ű����� �Է¹޾� ���� ����,����,����, ������ ����� ����ϱ�
		
		/*
		 * ���࿹��)
		 * ù��° ���� : 10
		 * �ι�° ���� : 2
		 * ��������� 12
		 * ��������� 8
		 * ��������� 20
		 * ����������� 5
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "ù���� ���� : ");
		int num1 = sc.nextInt();
		
		
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		int result1 = num1+num2;
		int result2 = num1-num2;
		int result3 = num1*num2;
		int result4 = num1/num2;
		boolean result5 = num1>num2;
		
		
		System.out.println("----���-----");
		System.out.println("������� = "+result1);
		System.out.println("������� = "+result2);
		System.out.println("������� = "+result3);
		System.out.println("��������� = "+result4);
		
		System.out.println("�Ҹ��� a>b = "+result5);
		
		System.out.println(num1+num2+"�������");
		System.out.println(num1-num2+"�������");
		System.out.println(num1*num2+"�������");
		System.out.println(num1/num2+"���������");
		
	}
	
	
}
