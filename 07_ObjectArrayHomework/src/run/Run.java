package run;

import java.util.Scanner;

import model.vo.Product;

public class Run {

	public static void main(String[] args) {

		
		Product[] p = new Product[10];  //배열만 만들고, 각 객체마다 초기화가 안되어있어서 안뜬단다.
		
		int count=0;
		
		System.out.println(p[count]);
		
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			p[count]=new Product();
			
			System.out.print("상품명 : ");
			p[count].setProductName(sc.nextLine());
			
			System.out.print("상품가격 : ");
			p[count].setPrice(sc.nextInt());
			
			System.out.print("수량 : ");
			p[count].setAmount(sc.nextInt());
			
			
			
			
			System.out.print("n 입력시 종료 : ");
			String str = sc.nextLine();
			if(str.equals("n")) {
				break;
			}
			System.out.println("계속하겠습니다.");
			count++;
		}
		//정보출력
		for(int i = 0; i<count;i++) {
			System.out.println(p[i]);
		}
		//가격계산
		int sum=0;
		for(int i =0; i<count;i++) {
			sum+=p[i].getAmount()*p[i].getPrice();
		}
		
		System.out.println("상품의 총가격은 "+sum+"원입니다.");
	}

}
