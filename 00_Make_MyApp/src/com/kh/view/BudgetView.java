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
			
			System.out.println(" << ����� ���α׷� >>\n");
			
			System.out.println("-�޴�-\n");
			
			System.out.println("1. ����� �ۼ�");
			
			System.out.println("2. ����� ���� �˻�");
			
			System.out.println("3. ����� �⵵ �˻�");
			
			System.out.println("4. ����� ��ü ��ȸ");
			
			System.out.println("5. ����� ����");
			
			System.out.println("6. ����� ����");
			
			System.out.println("0. ����");
			
			System.out.println();
						
			System.out.print("��ȣ�� �Է��ϼ��� : ");
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
					System.out.println( "���α׷��� ���� �մϴ� !!");
					return;
					
				default :
					System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
			}
		
		}


		
	}
	
	
	
	// 1. ����� �߰�
	public void addBudgetEntry() {
		
		System.out.println("<����� �ۼ�>\n");
		
		
		System.out.print(" �� : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" �� : ");
		int month = sc.nextInt();
		sc.nextLine();
		//08,09 �� �Է½�, 8������ �����ϱ⶧���� ����
		
		System.out.print(" ���� : ");
		int income = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print(" ���� : ");
		int expenses = sc.nextInt();
		sc.nextLine();
		System.out.print(" ���� : ");
		int saving = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" ��Ÿ�޸� : ");
		String others = sc.nextLine();
		

			
			
		bc.addBudgetEntry(year, month, income, expenses, saving, others);
		
		System.out.println("\n---------------------------\n");
	}
	
	//2. ����� �˻� //Ʋ�� ��, �� �˻�
	public void viewMonthlyBudget() {
		
		System.out.println("<����� ���� �˻�>\n");
		
		System.out.print("�˻��� �⵵ : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�˻��� �� : ");
		int month= sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		ArrayList<Budget> searchedMonth = bc.viewMonthlyBudget(year,month);	
		
		for( Budget s : searchedMonth) {
			System.out.println(s);
		}
		
		
		System.out.println("\n---------------------------\n");
	}
	
	
	//3. ����� �⵵ �˻�
	public void viewYearlyBudget() {
		
		System.out.println("<����� �⵵ �˻�>\n");
		
		System.out.print("�˻��� �⵵ : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		
		ArrayList<Budget> searchedYearly = bc.viewYearlyBudget(year);
		

		for (Budget b : searchedYearly) {
			System.out.println(b);
		}
						
		System.out.println();
		System.out.println(year+"�⵵");
		//�Ѽ��� 
		int totalIncome = 0;
		for(int i=0;i<searchedYearly.size();i++) {
			totalIncome+=searchedYearly.get(i).getIncome();
		}
		System.out.print(" * �Ѽ��� :"+totalIncome + " ��");
		System.out.println();
		
		//������
		int totalExpenses = 0;
		for(int i=0;i<searchedYearly.size();i++) {
			totalExpenses+=searchedYearly.get(i).getExpenses();
		}
		System.out.print(" * ������ :"+totalExpenses + " ��");
		System.out.println();
		
		
		//�� ����
		int totalSavings = 0;
		for(int i=0;i<searchedYearly.size();i++) {
			totalSavings+=searchedYearly.get(i).getSaving();
		}
		
		System.out.print(" * ������ :"+totalSavings + " ��");
		System.out.println();
		
		
		//����� ���
		int averageSavingsRate=0;
		for(int i=0;i<searchedYearly.size();i++) {
			averageSavingsRate+=searchedYearly.get(i).getSavingRate();
		}
		
		System.out.print(" * �������� :"+averageSavingsRate/searchedYearly.size() + "%");
		System.out.println();
		System.out.println("\n---------------------------\n");
		
	}
	
	
	
	
	
	
	
	
	//4. ����� ��ü ��ȸ
	public void viewAllBudget() {
		
		ArrayList<Budget> all = bc.viewAllBudget();
		
		ArrayList<Budget> sortAll = all;
		System.out.println("<����� ��ü ��ȸ>\n");
				
		for(Budget b : all) {
			System.out.println(b);
		}
		
		System.out.println();
		
		System.out.println(" ��ü�⵵ ");
		//�Ѽ��� 
		int totalIncome = 0;
		for(int i=0;i<sortAll.size();i++) {
			totalIncome+=sortAll.get(i).getIncome();
		}
		System.out.print(" * �Ѽ��� :"+totalIncome + " ��");
		System.out.println();
		
		//������
		int totalExpenses = 0;
		for(int i=0;i<sortAll.size();i++) {
			totalExpenses+=sortAll.get(i).getExpenses();
		}
		System.out.print(" * ������ :"+totalExpenses + " ��");
		System.out.println();
		
		
		//�� ����
		int totalSavings = 0;
		for(int i=0;i<sortAll.size();i++) {
			totalSavings+=sortAll.get(i).getSaving();
		}
		
		System.out.print(" * ������ :"+totalSavings + " ��");
		System.out.println();
		
		
		//����� ���
		int averageSavingsRate=0;
		for(int i=0;i<sortAll.size();i++) {
			averageSavingsRate+=sortAll.get(i).getSavingRate();
		}
		
		System.out.print(" * �������� :"+averageSavingsRate/sortAll.size() + "%");
		System.out.println();
		
		System.out.println("\n---------------------------\n");
	}
	
	
	//5. ����� ����
	public void setBudget() {
		
		System.out.println("<����� ����>\n");
		
		//������ ����� ����.
		System.out.print("�� : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� : ");
		int month = sc.nextInt();
		sc.nextLine();
		
		System.out.println("������ ��� \n");
		System.out.println(bc.viewMonthlyBudget(year, month));
		System.out.println();
		//������ ����
		
		System.out.print("������ ������ �Է�\n");
		
		System.out.print("���� : ");
		int setIncome=sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		int setExpenses = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		int setSaving = sc.nextInt();
		sc.nextLine();
		
		System.out.println("��Ÿ : ");
		String setOthers = sc.nextLine();
		
		
		bc.setBudget(year, month, setIncome, setExpenses, setSaving, setOthers);	
		System.out.println("\n---------------------------\n");
	}
	
	//6.����� ����
	public void deleteBudget() {
		
		System.out.println("<����� ����>\n");
		
		System.out.print("�� : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� : ");
		int month = sc.nextInt();
		sc.nextLine();
		
		bc.deleteBudget(year, month);
		
		System.out.println("\n---------------------------\n");
	}
}
