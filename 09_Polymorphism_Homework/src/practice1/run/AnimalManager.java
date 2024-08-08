package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] arr = new Animal[5];
		
		arr[0]=new Dog("멍멍이", "진돗개", 6);
		arr[1]=new Cat("고양이1", "고양이종류?", "가정", "Brown");
		arr[2]=new Dog("멍멍이2", "삽살개", 4);
		arr[3]=new Cat("고양이2", "고양이2종류", "야외", "Black");
		arr[4]=new Dog("멍멍이2", "푸들",2);
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i].speak();
		}
		
		
	}

}
