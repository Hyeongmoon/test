package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.BudgetController;
import com.kh.model.vo.Budget;

public class BudgetView {

	private Scanner sc = new Scanner(System.in);
	private BudgetController bc = new BudgetController();
	
		
	public void mainMenu() {
		
		while(true) {
			
			System.out.println(" << 가계부 프로그램 >>\n");
			
			System.out.println("-메뉴-\n");
			
			System.out.println("1. 가계부 작성");
			
			System.out.println("2. 가계부 월별 검색");
			
			System.out.println("3. 가계부 년도 검색");
			
			System.out.println("4. 가계부 전체 조회");
			
			System.out.println("5. 가계부 수정");
			
			System.out.println("6. 가계부 삭제");
			
			System.out.println("0. 종료");
			
			System.out.println();
						
			System.out.print("번호를 입력하세요 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			System.out.println("\n---------------------------\n");
			
			switch (menu) {
				case 1: 
					addBudgetEntry();
					break;
				case 2:
					viewMonthlyBudget();
					break;
					
				case 3:
					viewYearlyBudget();
					break;
					
				case 4:
					viewAllBudget();
					break;
					
				case 5:
					setBudget();
					break;
					
				case 6:
					deleteBudget();
					break;
					
				case 0:
					System.out.println("==========================");
					System.out.println( "프로그램을 종료 합니다 !!");
					return;
					
				default :
					System.out.println("번호를 잘못 입력했습니다.");
			}
		
		}


		
	}
	
	
	
	// 1. 가계부 추가
	public void addBudgetEntry() {
		
		System.out.println("<가계부 작성>\n");
		
		
		System.out.print(" 년 : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" 월 : ");
		int month = sc.nextInt();
		sc.nextLine();
		//08,09 로 입력시, 8진수로 이해하기때문에 에러
		
		System.out.print(" 수익 : ");
		int income = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print(" 지출 : ");
		int expenses = sc.nextInt();
		sc.nextLine();
		System.out.print(" 저축 : ");
		int saving = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" 기타메모 : ");
		String others = sc.nextLine();
		

			
			
		bc.addBudgetEntry(year, month, income, expenses, saving, others);
		
		System.out.println("\n---------------------------\n");
	}
	
	//2. 가계부 검색 //틀정 년, 월 검색
	public void viewMonthlyBudget() {
		
		System.out.println("<가계부 월별 검색>\n");
		
		System.out.print("검색할 년도 : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print("검색할 월 : ");
		int month= sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		ArrayList<Budget> searchedMonth = bc.viewMonthlyBudget(year,month);	
		
		for( Budget s : searchedMonth) {
			System.out.println(s);
		}
		
		
		System.out.println("\n---------------------------\n");
	}
	
	
	//3. 가계부 년도 검색
	public void viewYearlyBudget() {
		
		System.out.println("<가계부 년도 검색>\n");
		
		System.out.print("검색할 년도 : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		
		ArrayList<Budget> searchedYearly = bc.viewYearlyBudget(year);
		

		for (Budget b : searchedYearly) {
			System.out.println(b);
		}
						
		System.out.println();
		System.out.println(year+"년도");
		//총수익 
		int totalIncome = 0;
		for(int i=0;i<searchedYearly.size();i++) {
			totalIncome+=searchedYearly.get(i).getIncome();
		}
		System.out.print(" * 총수익 :"+totalIncome + " 원");
		System.out.println();
		
		//총지출
		int totalExpenses = 0;
		for(int i=0;i<searchedYearly.size();i++) {
			totalExpenses+=searchedYearly.get(i).getExpenses();
		}
		System.out.print(" * 총지출 :"+totalExpenses + " 원");
		System.out.println();
		
		
		//총 저축
		int totalSavings = 0;
		for(int i=0;i<searchedYearly.size();i++) {
			totalSavings+=searchedYearly.get(i).getSaving();
		}
		
		System.out.print(" * 총저축 :"+totalSavings + " 원");
		System.out.println();
		
		
		//저축률 평균
		int averageSavingsRate=0;
		for(int i=0;i<searchedYearly.size();i++) {
			averageSavingsRate+=searchedYearly.get(i).getSavingRate();
		}
		
		System.out.print(" * 평균저축률 :"+averageSavingsRate/searchedYearly.size() + "%");
		System.out.println();
		System.out.println("\n---------------------------\n");
		
	}
	
	
	
	
	
	
	
	
	//4. 가계부 전체 조회
	public void viewAllBudget() {
		
		ArrayList<Budget> all = bc.viewAllBudget();
		
		ArrayList<Budget> sortAll = all;
		System.out.println("<가계부 전체 조회>\n");
				
		for(Budget b : all) {
			System.out.println(b);
		}
		
		System.out.println();
		
		System.out.println(" 전체년도 ");
		//총수익 
		int totalIncome = 0;
		for(int i=0;i<sortAll.size();i++) {
			totalIncome+=sortAll.get(i).getIncome();
		}
		System.out.print(" * 총수익 :"+totalIncome + " 원");
		System.out.println();
		
		//총지출
		int totalExpenses = 0;
		for(int i=0;i<sortAll.size();i++) {
			totalExpenses+=sortAll.get(i).getExpenses();
		}
		System.out.print(" * 총지출 :"+totalExpenses + " 원");
		System.out.println();
		
		
		//총 저축
		int totalSavings = 0;
		for(int i=0;i<sortAll.size();i++) {
			totalSavings+=sortAll.get(i).getSaving();
		}
		
		System.out.print(" * 총저축 :"+totalSavings + " 원");
		System.out.println();
		
		
		//저축률 평균
		int averageSavingsRate=0;
		for(int i=0;i<sortAll.size();i++) {
			averageSavingsRate+=sortAll.get(i).getSavingRate();
		}
		
		System.out.print(" * 평균저축률 :"+averageSavingsRate/sortAll.size() + "%");
		System.out.println();
		
		System.out.println("\n---------------------------\n");
	}
	
	
	//5. 가계부 수정
	public void setBudget() {
		
		System.out.println("<가계부 수정>\n");
		
		//수정할 가계부 선택.
		System.out.print("년 : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		sc.nextLine();
		
		System.out.println("수정할 목록 \n");
		System.out.println(bc.viewMonthlyBudget(year, month));
		System.out.println();
		//수정할 내용
		
		System.out.print("수정할 내용을 입력\n");
		
		System.out.print("수익 : ");
		int setIncome=sc.nextInt();
		sc.nextLine();
		
		System.out.print("지출 : ");
		int setExpenses = sc.nextInt();
		sc.nextLine();
		
		System.out.print("저축 : ");
		int setSaving = sc.nextInt();
		sc.nextLine();
		
		System.out.println("기타 : ");
		String setOthers = sc.nextLine();
		
		
		bc.setBudget(year, month, setIncome, setExpenses, setSaving, setOthers);	
		System.out.println("\n---------------------------\n");
	}
	
	//6.가계부 삭제
	public void deleteBudget() {
		
		System.out.println("<가계부 삭제>\n");
		
		System.out.print("년 : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		sc.nextLine();
		
		bc.deleteBudget(year, month);
		
		System.out.println("\n---------------------------\n");
	}
}
