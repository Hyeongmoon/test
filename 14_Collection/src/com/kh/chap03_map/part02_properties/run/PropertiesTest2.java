package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		System.out.println(prop); //�����
		
		try {
			//4.properties ������ ���Ϸκ��� �����͸� 
			//key + value �������� "�о�鿩��"
			//Properties ��ü�� ���� ���� ����ִ� �޼ҵ� (�Է�)
			//load(InputStream is)
			
			prop.load(new FileInputStream("test.properties"));
			
			
			//5. Xml ������ ���Ϸκ��� �����͸� 
			// Key + value �������� "�о� �鿩�� "
			//Properties ��ü�� ���� ���� ����ִ� �޼ҵ� (�Է�)
			// loadFromXML(InputStream is)
//			prop.loadFromXML(new FileInputStream("test.xml"));
			
			
			//6.getProperty(String key) : String value
			// : Properties �� ����� ������ �� ���޵� String key�� �ش�Ǵ� 
			// String value ���� �������ִ� �޼ҵ�
			System.out.println(prop.getProperty("List"));
			System.out.println(prop.getProperty("Set"));
			System.out.println(prop.getProperty("Map"));
			System.out.println(prop.getProperty("Cillection"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Ȯ��
		System.out.println(prop);
	}

}



/*
 * * properties ����
 * �ش� ���α׷��� �⺻������ ������ �ϴ� �������� ����
 * .properties ������ ���Ϸ� �����صд�. (���� " ȯ�漳��" �� ���õ� ����)
 * key, value ��� ���ڿ��̱� ������ Properties ��ü�� 
 * �Բ� �����ϰ� ��� ���� !!
 * >key, value ��� �Ϲ� �ؽ�Ʈ ���ڿ��̱� ������ �����ڰ� �ƴ�
 * 	�Ϲ� ������ ���忡�� ȯ�漳������ �ٷ�� ������
 * >JDBC ��Ʈ���� ����� ���� !!
 * 
 * *xml ����
 * ����� �����͸� "����ȭ��(<�±�>)" �������� �����ϱ� ���� ����
 * �پ��� ���α׷��� ��� ���� ȣȯ�� �����ϴ�
 * 
 * > .properties ���ϰ��� �������̶�� �Ѵٸ�
 * 	  properties ������ ����¥�� �������� ǥ�� ������!!
 * 	 .xml ������ ������¥�� ������� ǥ�� ������ !!
 * 	jdbc ��Ʈ���� ��� ����
 */
























