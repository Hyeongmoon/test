package run;

import java.util.Scanner;

import model.vo.Product;

public class Run {

	public static void main(String[] args) {

		
		Product[] p = new Product[10];  //�迭�� �����, �� ��ü���� �ʱ�ȭ�� �ȵǾ��־ �ȶ�ܴ�.
		
		int count=0;
		
		System.out.println(p[count]);
		
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			p[count]=new Product();
			
			System.out.print("��ǰ�� : ");
			p[count].setProductName(sc.nextLine());
			
			System.out.print("��ǰ���� : ");
			p[count].setPrice(sc.nextInt());
			
			System.out.print("���� : ");
			p[count].setAmount(sc.nextInt());
			
			
			
			
			System.out.print("n �Է½� ���� : ");
			String str = sc.nextLine();
			if(str.equals("n")) {
				break;
			}
			System.out.println("����ϰڽ��ϴ�.");
			count++;
		}
		//�������
		for(int i = 0; i<count;i++) {
			System.out.println(p[i]);
		}
		//���ݰ��
		int sum=0;
		for(int i =0; i<count;i++) {
			sum+=p[i].getAmount()*p[i].getPrice();
		}
		
		System.out.println("��ǰ�� �Ѱ����� "+sum+"���Դϴ�.");
	}

}
