//0715
package com.kh.variable;
//ǮŬ������ 

//printf ����(��� �޼ҵ�)
public class D_Printf {

	/*
	 * *��� �޼ҵ�
	 * System.out.print(����ϰ����ϴ°�"���ڿ�"or'����'or 100 or 10.0 or true);//���ڿ��� " ���ڴ� ' �����Ǽ��� ����ǥ ����\
	 * -�ܼ��� ���� ��¸� ����
	 * 
	 * System.out.println(����ϰ����ϴ°�);
	 * -�ش� ���� ��� �� "�ٹٲ�(����)" ���� ����
	 * 	(ln : line �� ����)
	 * 
	 * System.out.printf("%����",����ϰ��� �ϴ°�)	
	 * -���Ŀ� ���缭 ������ ������ִ� ����, ��� �� �ٹٲ� X
	 *  (f : format �� ����)
	 *  -���ڿ� �ȿ� �� ���� �� �ڸ��� �Ʒ��� ���� �������� ��������
	 *  %d : ���� (��ø��Ǿ���)
	 *  %f : �Ǽ� 
	 *  %c : ����
	 *  %s : ���ڿ�
	 */
	
	public void printfTest() {
		
		//�����׽�Ʈ byte,short,int,long �� ����
		System.out.println("====�����׽�Ʈ");
		int iNum1 = 10;
		int iNum2 = 20;
		
		//"iNum1 : xx, iNum2 : xx" �� ����غ���
		//1.println ���
		System.out.printf("iNum1 : " + iNum1 + " iNum2 : "+iNum2+"\n");
		//2.printf ���
		System.out.printf("iNum1 : %d iNum2 : %d\n",iNum1,iNum2);
		//>�ٹٲ� ����� ���� !
		
		//"10+20=30" �� ����غ���
		//1.println ���
		System.out.println(iNum1+"+"+iNum2+"="+(iNum1+iNum2));

		//2.printf ���
		System.out.printf("%d+%d=%d\n",iNum1,iNum2,iNum1+iNum2);
		
		//%d�� ���� �ɼ�
		System.out.printf("%d\n", iNum1);    // `10`
		System.out.printf("%5d\n", iNum1);	 // `   10`
		System.out.printf("%-5d\n", iNum1);  // `10   `
		//> %5d : 5ĭ�� ���� �� ������ ����
		
		
		//�Ǽ� �׽�Ʈ
		System.out.println("===�Ǽ��׽�Ʈ");
		double dNum = 4.27546789;
		
		//"dNum:xx.xxxx" �� ����غ���
		//1.println ���
		System.out.println("dNum : "+dNum); //dNum : 4.27546789
		//2.printf ���
		System.out.printf("dNum : %f\n",dNum);//dNum : 4.275468 *�ݿø���
		//> %f : �Ҽ��� �Ʒ� 7��° �ڸ����� �ݿø� �Ǿ�, �Ҽ��� �Ʒ� 6��° �ڸ������� ��µǴ²�
		
		// %f �� ���� �ɼ�
		System.out.printf("dNum : %.4f\n", dNum); //4.2755 (4.27546789) �ݿø��ؼ� 4°�ڸ����� ǥ��
		
		
		//���ڿ� ���ڿ� �׽�Ʈ
		System.out.println("===���ڿ� ���ڿ� �׽�Ʈ");
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n",ch,str);
		
		//%c, %s �� ���� �ɼ�
		System.out.printf("%C %S\n", ch,str);
		//>%C,%S : ���� ���ĺ��� ��� ��� �빮�ڷ� �����ؼ� ���
		
		/*
		 * *printf
		 * ����(����) �� �ѹ� ���÷� �����ϰ� ���� ������ ��°���
		 * ��, ������ ������ ������ ����, �ڿ����� ������ ������ ����, ������ �� �¾� �������� �Ѵ�. 
		 */
		
	}
	
}
