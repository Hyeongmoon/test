package com.kh.model.vo;

public class Budget {

	//필드부
	
	private int year;			//년
	private int month;			//월
	private int income;			//수익
	private int expenses;		//지출
	private int saving; 		//저축
	
	private String others;		//기타
	private double savingsRate;   //저축률
	
	
	
	//생성자부

	public Budget(int year, int month, int income, int expenses, int saving, String others) {
		super();
		this.year = year;
		this.month = month;
		this.income = income;
		this.expenses = expenses;
		this.saving = saving;
		this.others = others;
	}


	//getterSetter

	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getIncome() {
		return income;
	}



	public void setIncome(int income) {
		this.income = income;
	}



	public int getExpenses() {
		return expenses;
	}



	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}



	public int getSaving() {
		return saving;
	}



	public void setSaving(int saving) {
		this.saving = saving;
	}



	public String getOthers() {
		return others;
	}



	public void setOthers(String others) {
		this.others = others;
	}


	
	public int getSavingRate() {
		
		return (saving*100) / income;
	}
	
	
	@Override
	public String toString() {
		return year + "." + month+" - "+ "수익:" + income + " 지출:" + expenses
				+ " 저축:" + saving + " 저축륙:" + getSavingRate() + "%" + "  * 기타메모 : " + others;
	}
	
	
	
	
	
	
	
	
}
