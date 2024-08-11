package com.kh.controller;

import java.util.ArrayList;
import java.util.Arrays;

import com.kh.model.vo.Budget;

public class BudgetController {

	
	private ArrayList<Budget> list = new ArrayList<>();
	{
		list.add(new Budget(2023,1,5000000,1500000,3500000,"�������� !!"));
		list.add(new Budget(2023,2,5000000,1200000,3800000,"���ϰ��־�!!"));
		list.add(new Budget(2023,3,5000000,1300000,3700000,"��"));
		list.add(new Budget(2023,4,5000000,1400000,3600000,"��"));
		list.add(new Budget(2023,5,5000000,1300000,3200000,"���� ��!"));
		list.add(new Budget(2023,6,5000000,3400000,1600000,"����...��"));
		list.add(new Budget(2023,7,6000000,1300000,4700000," "));
		list.add(new Budget(2023,8,6000000,1200000,4800000," "));
		list.add(new Budget(2023,9,6000000,1000000,5000000," "));
		list.add(new Budget(2023,10,6000000,1100000,4900000," "));
		list.add(new Budget(2023,11,6000000,950000,5050000," "));
		list.add(new Budget(2023,12,6000000,1000000,5000000," "));
		list.add(new Budget(2024,1,7000000,4000000,3000000,"�±�����,���� ���.."));
		list.add(new Budget(2024,2,7000000,1000000,6000000," "));
		list.add(new Budget(2024,3,7000000,1000000,6000000," "));
		list.add(new Budget(2024,4,7000000,950000,6050000,"�� ��¥ �߸�Դ�."));
		list.add(new Budget(2024,5,7000000,950000,6050000,"�� �� !! "));
		
	}
	
	
	// 1. ����� �߰�
	public void addBudgetEntry(int year, int month, int income, int expenses, int saving, String others) {
		list.add(new Budget(year, month, income, expenses, saving,others));
	}
	
	
	
	//2. ����� �� �˻�
	public ArrayList<Budget> viewMonthlyBudget(int year, int month) {

		
		ArrayList<Budget> searchedMonth = new ArrayList<>();
		int num = 0;
		for(int i=0; i<list.size();i++) {
			
			if(list.get(i).getYear()== year) {
				
				if(list.get(i).getMonth()==month){
					
					searchedMonth.add(list.get(i));
										
				}
				
				
			}
		}
		return searchedMonth;
			
	}
	
	//3 ����� �⵵ ��ȸ
	public ArrayList<Budget> viewYearlyBudget(int year){
		
		ArrayList<Budget> searchedYearly= new ArrayList<>();
		
		for( int i =0; i<list.size();i++) {
			if(list.get(i).getYear()==year) {
				searchedYearly.add(list.get(i));
			}
			
		}
		
		
		return searchedYearly;
	}
	
	
	
	//4. ����� ��ü ��ȸ
	public ArrayList<Budget> viewAllBudget(){
		
		
		
		return list;
	}
	
	
	
	//5. ����� ����
	public void setBudget(int year, int month,int setIncome, int setExpenses, int setSaving, String setOthers) {
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getYear()==year) {
				if(list.get(i).getMonth()==month) {
					list.set(i, new Budget(year,month,setIncome, setExpenses, setSaving,setOthers));
					
					
				}
			}
			
		}
	}
	
	
	
	//6. ����� ����
	public void deleteBudget(int year, int month) {
		for(int i = 0 ; i<list.size();i++) {
			
			if(list.get(i).getYear()==year) {
				if(list.get(i).getMonth()==month) {
					list.remove(i);
				}
				
			}
			
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
