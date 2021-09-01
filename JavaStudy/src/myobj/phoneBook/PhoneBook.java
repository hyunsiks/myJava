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
		
		phonebook.put("미분류", new HashMap<>());
		phonebook.put("가족", new HashMap<>());
		phonebook.put("직장", new HashMap<>());
		phonebook.put("친구", new HashMap<>());
		phonebook.get("가족").put("010-1234-1234", "엄마");
	}
	
	public boolean addGroup(String groupName) {
		if(phonebook.containsKey(groupName)) {
			System.out.println("이미 존재하는 그룹입니다 : " + groupName);
			return false;
		}else {
			System.out.println("성공적으로 추가되었습니다 : " + groupName);
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

		//phonebook : 여러 그룹을 저장할 수 있는 전체 전화번호부 인스턴스
		//phonebook.keySet() : 그룹명들
		//phonebook.values() : 그룹명에 해당하는 해쉬맵 인스턴스
		
		for(HashMap<String, String> group : phonebook.values()) {
			
			if(group.containsKey(phoneNumber)) {
				System.out.println("이미 등록된 번호입니다");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNumber, name);
		}else {
			phonebook.get("미분류").put(phoneNumber, name);
		}
		return true;
	}
	
	public void printPhoneBook() {
		
		for(String groupName : new TreeSet<>(phonebook.keySet())) { //트리셋을 이용하여 자동정렬
			
			System.out.printf("---- %s ----\n", groupName);
			
			HashMap<String, String> group = phonebook.get(groupName);
			
			// TreeSetd의 두가지 생성자
			//	1. 정렬기준을 정하면서 인스턴스를 생성
			//	2. 컬렉션을 전달(정렬 기준은 해당 컬렉션 제네릭의 comparable을 사용)
			TreeSet<Entry<String, String>> sortedSet = 
				new TreeSet<>(new Comparator<Entry<String, String>>() { //내부익명클래스 즉석해서만든것
					@Override
					public int compare(Entry<String, String> o1, Entry<String, String> o2) {
						
						//이름 기준으로 1차 정렬 후, 전화번호 기준으로 2차 정렬
						int value_diff = o1.getValue().compareTo(o2.getValue());
						
						if(value_diff == 0) { //이름이 같으므로 전화번호 기준으로 2차 정렬
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
		
		System.out.println("==========검색 결과==========");
		for(HashMap<String,String> group : phonebook.values()) {
			
			for(Entry<String, String> entry : group.entrySet()) {
				
				if(entry.getValue().contains(keyword)) {
					System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
					count++;
				}
			}
		}
		System.out.printf("검색 결과 %d건\n", count);
	}
	
	public void searchByPhoneNumber(String number_fragment) {
		
		int count = 0;
		
		System.out.println("==========검색 결과==========");
		for(HashMap<String,String> group : phonebook.values()) {
			for(String phoneNumber : group.keySet()) {
				if(phoneNumber.contains(number_fragment));
				System.out.printf("%s : %s\n", group.get(phoneNumber), phoneNumber);
				count++;
			}
		}
		System.out.printf("검색 결과 %d건\n", count);
	}
	
	public static void main(String[] args) {
		
		PhoneBook book = new PhoneBook();
		
		book.addGroup("가족");
		book.addGroup("동호회");
		book.addGroup("초등학교 동창");
		book.addGroup("중학교 동창");
		book.addGroup("대학동기");
		book.addGroup("취업반");
		
		book.printGroupList();

		book.addNumber(null,"123-1234-1234","김동현");
		book.addNumber(null,"010-9354-1234","추성훈");
		book.addNumber(null,"010-3234-1234","이대호");
		book.addNumber(null,"010-6224-1234","추신수");
		book.addNumber(null,"010-8647-1234","강호동");
		
		book.printPhoneBook();
		
		book.searchByName("호");
		book.searchByPhoneNumber("010-8647");
	}
}
