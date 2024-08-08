package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	
	public static void main(String[] args) {
		
		//���׸� X 
		
		//HashMap ��ü ���� ����
		HashMap hm1 = new HashMap();
		
		//����� ���� : ���� ������ ���� List �� Set �迭�� Collection �� ������ Ŭ����
		//> value �� ���� ����, �����͸� �߰��Ҷ� add �޼ҵ� ( �ٸ� �޼ҵ� ���� ���� ���)
		
		//��, Map �� �ƴϴ�.
		//> key + value ������ ����, �����͸� �߰��� �� xxx �޼ҵ�
		// (�޼ҵ� ������ �ƿ� �ٸ�
		
		
		// ���׸��������� �ʾ��� ���
		// K : Key   == Object
		// V : Value == Object��
		
		//1. put(K key , V value)
		// : Map ������ key + value ��Ʈ�� �����͸� �߰��ش� �޼ҵ�
		hm1.put("123","ù��°���");
		hm1.put(0, 1.234);
		hm1.put('a',"ù��°���");
		hm1.put("123","�ι�°���");
		// > ���� Ű������ �� put �� �ع����� ���������� put �� �����ͷ� ���� ������
		
		System.out.println(hm1);
		//>�׻�  Key + Value �������� ������ ����
		// value �� �ߺ��� ��� O
		// ������� ����x
		//> ���������� ���׸� ������ ������ ��� �ƹ� Ÿ���̳� �� �� �� �ִ�!!
		
		System.out.println("---------------���׸�����------------------");
		
		//���׸� O 
		
		//*Map �迭�� ���׸��� ������ ���
		//���� Key �� ���� Ÿ�԰� Value �� ���� Ÿ�� ���� �����ؾ��Ѵ�. 
		
		//HashMap<Key�� ���� Ÿ�� , Value �� ���� Ÿ��>
		
		HashMap<String, Snack> hm2 = new HashMap<>();
		
		//1.put(K key, V value)
		// : Map ������ �����͸� key + value �������� �߰����ִ� �޼ҵ�
		
		hm2.put("������", new Snack("���ڵ����",200));
		hm2.put("Ģ��",new Snack("����Ĩ��",150));
		hm2.put("ũ�����Ƿ�", new Snack("����Ѹ�",100));
		hm2.put("�����", new Snack("§��",500));
		
		
		System.out.println(hm2);
		//���� ���� ����x
		// value ���� �����ϴٰ� �ص�  key ���� �������� ������ �� �����
		// ���׸� ���� �� Key, Value ������ Ÿ�Կ� �´� ���� ��
		
		hm2.put("�����", new Snack("�ſ��",700)); //�ߺ��Ǵ°� put
		
		System.out.println(hm2); 
		//> �ߺ��� key ���� value ������ ���� ������
		
		
		//2.get(Objcet key) : V
		//> Map �������� �ش� Ű���� value ���� ��ȯ���ִ� �޼ҵ�
		System.out.println(hm2.get("������"));
		
		Snack s=hm2.get("ũ�����Ƿ�");
		System.out.println(s);
		//>���׸� ������ �ϸ� Map ���� ����������
		// �Ź� ������ �ڽ�Ÿ������ ��������ȯ�� �����൵ ��!!
		
		System.out.println(hm2.get("��������"));// ���� Ű�� ���� -> null
		//> ���� Ű���� �������� ��� null �� ���ϵȴ�. 
		
		//3.size()
		// : Map ������ ����ִ� �������� ���� ��ȯ
		System.out.println(hm2.size()); //4
		
		//4.replace(K Key, V value)
		//: Map ������ �ش� key ���� �����Ƽ� ���� ���޵� value �� ��������ִ� �޼ҵ�
		hm2.replace("�����", new Snack("�̳�§��",1000));
		
//		hm2.put("�����", new Snack("�̳�§��", 1000)); 
		//> put �� ���� ������ �����͸� �߰����ִ� ������ !!
		// (�쿬�� Ű���� �ߺ��Ǿ��� �� �����Ͱ� ���ܿ���� ȿ���� �� ��)
		
		System.out.println(hm2);
		
		//5. remove(Object key)
		// : Map �������κ��� ���޵� key ���� ã�Ƽ� key + value ��Ʈ�� �����δ� �޼ҵ�
		hm2.remove("�����");
		System.out.println(hm2);
		
		System.out.println("------------------------------");
		
		// Map �� ����ִ� �����͵鿡 ���������� �����ϰ��� �� �� ?
		
		//
		/* foreach �� ���Ұ�
		for(String k , Snack s : hm2) {
			System.out.println(k,s);
		}
		*/
		//Map ���� key + value ��Ʈ�� ���� ������ ���� for �� ���Ұ�
		
		//List �� Map �� �ٸ� �迭�̱� ������
		//ArrayList �� �Ű� ���� �� �ݺ��� ����� �Ұ� !!
//		ArrayList list = new ArrayList(hm2); // �Ұ� , �ٸ� �迭
//		ArrayList list = new ArrayList();
//		list.addAll(hm2); //�迭�� �ٸ��� ������ �ȉ� 
		
		//Iterator(�ݺ���) �� �̿��ϴ� ���
		// > .iterato() �� List �� Set �迭������ ����� ���մ� �޼ҵ�
//		Iterator it = hm2.iterator();// �Ұ� 
		
		//*����� �ƿ� ���°� �ƴ� !! 
		//> Map �� Set ���� �ٲ� �� �Ʊ� ����� ��� 3������ ����
		
		//Map �� Set ���� �ٱ��ִ� �޼ҵ� (2��)
		//1. keySet() �޼ҵ带 �̿��ϴ� ���
		// > Map ������ ����ִ� Key ���鸸 �̾Ƽ� Set ���� �Ű�����, get�޼ҵ�� �� ����
		
		//1) hm2.keySet() �޼ҵ� ȣ���ϱ�
		Set<String> keySet = hm2.keySet();
		
		//2) ���� for ���� ���ų�, ArrayList �� �Ű� ���� �� �Ϲ� for ���� ���ų�, 
		//   iterator �� �Ἥ �ݺ� ������
		// - iterator �Ẹ��
		Iterator<String> itKey = keySet.iterator();
		
		while(itKey.hasNext()==true) {
			String key = itKey.next();
			Snack value = hm2.get(key);
			
			System.out.println("ket : "+ key + ", vlaue : "+ value);
			
			
		System.out.println("-----------------------------------");	
		
		//2.entrySet() �޼ҵ带 �̿��ϴ� ���
		// > Entry : ���� ���� ( key + value �����ִ� ����)
		
		//1) hm2.entrySet() �޼ҵ� ȣ���ϱ� - (key + value) ���·� Set ���� �Ű���
		Set<Entry<String,Snack>> entrySet = hm2.entrySet();
		
		//2) Iterator �� �̿��ؼ� �ݺ� ������
		Iterator<Entry<String,Snack>>itEntry = entrySet.iterator();
		
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			
			String key1 = entry.getKey();
			Snack value1 = entry.getValue();
			System.out.println("key : "+key1+", value : "+value1);
		}
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
