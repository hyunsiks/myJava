package myobj.phoneBook;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class PhoneBook {

	public static class PhoneInfo{
		
	String name;
	String phone_number;
	String address;
	String profile_image_pth;
	}
	
	HashMap<String, HashMap<String, String>> phonebook;
	
	public PhoneBook() {
		// TODO Auto-generated constructor stub
		phonebook = new HashMap<>();
		
		phonebook.put("�̺з�", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("ģ��", new HashMap<>());
		phonebook.get("����").put("010-1234-1234", "����");
	}
	
	public boolean addGroup(String groupName) {
		if(phonebook.containsKey(groupName)) {
			System.out.println("�̹� �����ϴ� �׷��Դϴ� : " + groupName);
			return false;
		}else {
			System.out.println("���������� �߰��Ǿ����ϴ� : " + groupName);
			phonebook.put(groupName, new HashMap<>());
			return true;
		}
	}
	
	public void printGroupList() {
		for(String groupName : phonebook.keySet()) {
			System.out.printf("#### %s ####\n", groupName);
		}
	}
	
	public boolean addNumber(String groupName, String phoneNumber, String name) {

		//phonebook : ���� �׷��� ������ �� �ִ� ��ü ��ȭ��ȣ�� �ν��Ͻ�
		//phonebook.keySet() : �׷���
		//phonebook.values() : �׷�� �ش��ϴ� �ؽ��� �ν��Ͻ�
		
		for(HashMap<String, String> group : phonebook.values()) {
			
			if(group.containsKey(phoneNumber)) {
				System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNumber, name);
		}else {
			phonebook.get("�̺з�").put(phoneNumber, name);
		}
		return true;
	}
	
	public void printPhoneBook() {
		
		for(String groupName : new TreeSet<>(phonebook.keySet())) { //Ʈ������ �̿��Ͽ� �ڵ�����
			
			System.out.printf("---- %s ----\n", groupName);
			
			HashMap<String, String> group = phonebook.get(groupName);
			
			// TreeSetd�� �ΰ��� ������
			//	1. ���ı����� ���ϸ鼭 �ν��Ͻ��� ����
			//	2. �÷����� ����(���� ������ �ش� �÷��� ���׸��� comparable�� ���)
			TreeSet<Entry<String, String>> sortedSet = 
				new TreeSet<>(new Comparator<Entry<String, String>>() { //�����͸�Ŭ���� �Ｎ�ؼ������
					@Override
					public int compare(Entry<String, String> o1, Entry<String, String> o2) {
						
						//�̸� �������� 1�� ���� ��, ��ȭ��ȣ �������� 2�� ����
						int value_diff = o1.getValue().compareTo(o2.getValue());
						
						if(value_diff == 0) { //�̸��� �����Ƿ� ��ȭ��ȣ �������� 2�� ����
							return o1.getKey().compareTo(o2.getKey());
						}else {
							return value_diff;
						}
						
					}			
				});
			sortedSet.addAll(group.entrySet());
			
			for(Entry entry : sortedSet) {
				System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
			}
		}
	}
	
	public void searchByName(String keyword) {
		
		int count = 0;
		
		System.out.println("==========�˻� ���==========");
		for(HashMap<String,String> group : phonebook.values()) {
			
			for(Entry<String, String> entry : group.entrySet()) {
				
				if(entry.getValue().contains(keyword)) {
					System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
					count++;
				}
			}
		}
		System.out.printf("�˻� ��� %d��\n", count);
	}
	
	public void searchByPhoneNumber(String number_fragment) {
		
		int count = 0;
		
		System.out.println("==========�˻� ���==========");
		for(HashMap<String,String> group : phonebook.values()) {
			for(String phoneNumber : group.keySet()) {
				if(phoneNumber.contains(number_fragment));
				System.out.printf("%s : %s\n", group.get(phoneNumber), phoneNumber);
				count++;
			}
		}
		System.out.printf("�˻� ��� %d��\n", count);
	}
	
	public static void main(String[] args) {
		
		PhoneBook book = new PhoneBook();
		
		book.addGroup("����");
		book.addGroup("��ȣȸ");
		book.addGroup("�ʵ��б� ��â");
		book.addGroup("���б� ��â");
		book.addGroup("���е���");
		book.addGroup("�����");
		
		book.printGroupList();

		book.addNumber(null,"123-1234-1234","�赿��");
		book.addNumber(null,"010-9354-1234","�߼���");
		book.addNumber(null,"010-3234-1234","�̴�ȣ");
		book.addNumber(null,"010-6224-1234","�߽ż�");
		book.addNumber(null,"010-8647-1234","��ȣ��");
		
		book.printPhoneBook();
		
		book.searchByName("ȣ");
		book.searchByPhoneNumber("010-8647");
	}
}
