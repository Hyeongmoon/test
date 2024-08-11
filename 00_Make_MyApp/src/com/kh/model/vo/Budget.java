package com.kh.model.vo;

public class Budget {

	//�ʵ��
	
	private int year;			//��
	private int month;			//��
	private int income;			//����
	private int expenses;		//����
	private int saving; 		//����
	
	private String others;		//��Ÿ
	private double savingsRate;   //�����
	
	
	
	//�����ں�

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
		return year + "." + month+" - "+ "����:" + income + " ����:" + expenses
				+ " ����:" + saving + " �����:" + getSavingRate() + "%" + "  * ��Ÿ�޸� : " + others;
	}
	
	
	
	
	
	
	
	
}
