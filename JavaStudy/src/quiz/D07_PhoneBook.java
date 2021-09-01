package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class D07_PhoneBook {

	/*
	  # HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	  
	   1. �׷�/ ��ȭ��ȣ/ �̸��� �����ؾ� �Ѵ�
	   2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
	   3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű������ ������ �̸��� ���´�
	   
	  �� �����ؾ� �� �޼���
	   1. ���ο� �׷��� �߰��ϴ� �޼���
	   2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���(�׷��� ���ٸ� �̺з� �׷쿡 ����)
	   3. ��ϵ� ��� ��ȭ��ȣ ������ �̸����� ������������ �����ִ� �޼���
	   4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼���
	   5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼���
	 */
	
	//�׷�(��Ʈ��),��ȭ��ȣ(�ؽ���) :�ؽ��� ,  ��ȭ��ȣ(�ؽ���) , �̸�(��̸���Ʈ) : �ؽ���
	
	Scanner sc = new Scanner(System.in);
	
	HashMap<String, ArrayList<PhoneAndName>> GroupAndNumber;
	
	
	
	String groupName;
	
	public static void main(String[] args) {
		
		D07_PhoneBook pb1 = new D07_PhoneBook();
		
//		pb1.addGroup("�б�");
//		pb1.addGroup("�п�");
//		pb1.addGroup("���Ƹ�");
//		
//		pb1.addNum("�б�", "010-7164-7664", "������");
//		pb1.addNum("�б�", "010-4235-1634", "ȫ�浿");
//		pb1.addNum("�б�", "010-1214-2664", "���ȣ");
//		pb1.addNum("�б�", "010-3554-2664", "������");
//		pb1.addNum("�б�", "010-2534-2664", "��ȣ��");
//		pb1.addNum("�б�", "010-6968-2654", "������");
//		
//		pb1.searchName("��");
//		pb1.getNum("�б�");
//		pb1.searchPhoneNumber("010-7");
//		pb1.desc("�б�");
		
		pb1.phoneBook();
	}
	
	
	public D07_PhoneBook() { //������
		GroupAndNumber = new HashMap<>();		
		GroupAndNumber.put("�̺з�", new ArrayList<PhoneAndName>()); 
	}
	
	void phoneBook() {
		
		D07_PhoneBook pb = new D07_PhoneBook();
		int select = 0;
		String groupName;
		String phoneNumber;
		String name;
		boolean book = true;
		
		while(book) {
			System.out.println("===========================================================================================================");
			System.out.print("1. �׷��߰�   ");
			System.out.print("2. ���ο� �̸��� ��ȣ�߰�   ");
			System.out.print("3. �̸�ã��   ");
			System.out.print("4. ��ȣã��   ");
			System.out.print("5. �̸� ������������ �����ϱ�   ");
			System.out.print("6. �׷쳻�� ��ȣȮ��   ");
			System.out.println("7. ����");
			System.out.println("===========================================================================================================");
			
			System.out.println("���ϴ� ��ȣ�� �����ϼ��� >>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("�׷��̸��� ���ϼ��� : ");
				groupName = sc.next();
				pb.addGroup(groupName);
				System.out.println("���� �׷� : " + pb.GroupAndNumber.keySet());
				break;
			case 2:
				System.out.print("������ �׷��� ���ϼ��� : ");
				groupName = sc.next();
				System.out.print("�׷쳻�� ������ ��ȣ�� �Է��ϼ��� : ");
				phoneNumber = sc.next();
				System.out.println("�׷쳻�� ������ �̸��� �Է��ϼ��� : ");
				name = sc.next();
				pb.addNum(groupName, phoneNumber, name);				
				break;
			case 3:	
				System.out.print("ã����� �̸��� �������� : ");
				name = sc.next();
				pb.searchName(name);
				break;
			case 4:
				System.out.print("ã����� ��ȣ�� �������� : ");
				phoneNumber = sc.next();
				pb.searchPhoneNumber(phoneNumber);
				break;
			case 5:
				System.out.print("���������� �׷��� �������� : ");
				groupName = sc.next();
				pb.desc(groupName);
				break;
			case 6:
				System.out.print("��ȣ�� �˰���� �׷��� �������� : ");
				groupName = sc.next();
				pb.getNum(groupName);
				break;
			case 7:
				System.out.print("�����մϴ�");
				book = false;
				break;
			}
		}
	}
	
	void addGroup(String groupName) {		
	
		GroupAndNumber.put(groupName, new ArrayList<PhoneAndName>()); //(�׷��̸�)�� 'Ű'�� (��ȭ��ȣ�� �̸�)�� �ִ� Ŭ������ '����'�� ����
		
	}
	
	void addNum(String groupName, String phoneNum, String name) {
		
		
		if(GroupAndNumber.containsKey(groupName)) {
			GroupAndNumber.get(groupName).add(new PhoneAndName(phoneNum, name));
		}else {
			GroupAndNumber.get("�̺з�").add(new PhoneAndName(phoneNum, name));
		}
		
	}
	
	void getNum(String groupName) {
		
		for(int i = 0; i < GroupAndNumber.get(groupName).size(); i++) {
			
			System.out.println(GroupAndNumber.get(groupName).get(i).phoneNumber); //��̽�Ʈ
		}
		
	}
	
	void searchPhoneNumber(String searchPhoneNum) {
		
		for(String key : GroupAndNumber.keySet()) {
			for(int i = 0; i < GroupAndNumber.get(key).size(); i++) {
				
				if((GroupAndNumber.get(key).get(i).phoneNumber).contains(searchPhoneNum)) {					
					System.out.println("����� �� : " + GroupAndNumber.get(key).get(i).phoneNumber);			
				}				
			}			
		}	
		
	}
	void searchName(String searchName) {
		
		for(String key : GroupAndNumber.keySet()) {
			for(int i = 0; i < GroupAndNumber.get(key).size(); i++) {
				
				if((GroupAndNumber.get(key).get(i).name).contains(searchName)) {					
					System.out.println("����� �� : " + GroupAndNumber.get(key).get(i).name);			
				}				
			}			
		}
	}
	void desc(String group) {
		Collections.sort(GroupAndNumber.get(group), new descForName());
		System.out.println(GroupAndNumber.get(group));
	}

}	

class PhoneAndName {
		
	String phoneNumber;
	String name;
	
	public PhoneAndName(String phoneNumber, String name) {
		// TODO Auto-generated constructor stub
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + phoneNumber;
	}

}	
class descForName implements Comparator<PhoneAndName>{

	@Override
	public int compare(PhoneAndName o1, PhoneAndName o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name) * -1;
	}	
}

