package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] arr = new Animal[5];
		
		arr[0]=new Dog("�۸���", "������", 6);
		arr[1]=new Cat("�����1", "���������?", "����", "Brown");
		arr[2]=new Dog("�۸���2", "��찳", 4);
		arr[3]=new Cat("�����2", "�����2����", "�߿�", "Black");
		arr[4]=new Dog("�۸���2", "Ǫ��",2);
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i].speak();
		}
		
		
	}

}
