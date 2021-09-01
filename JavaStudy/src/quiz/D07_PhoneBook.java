package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class D07_PhoneBook {

	/*
	  # HashMap을 이용해 전화번호부를 구현해보세요
	  
	   1. 그룹/ 전화번호/ 이름을 저장해야 한다
	   2. 그룹 이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다
	   3. 전화번호 목록에 전화번호를 키값으로 넣으면 이름이 나온다
	   
	  ※ 구현해야 할 메서드
	   1. 새로운 그룹을 추가하는 메서드
	   2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드(그룹이 업다면 미분류 그룹에 저장)
	   3. 등록된 모든 전화번호 정보를 이름기준 내림차순으로 보여주는 메서드
	   4. 이름의 일부를 입력하면 일치하는 모든 정보가 출력되는 검색 메서드
	   5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 검색 메서드
	 */
	
	//그룹(스트링),전화번호(해쉬맵) :해쉬맵 ,  전화번호(해쉬맵) , 이름(어레이리스트) : 해쉬맵
	
	Scanner sc = new Scanner(System.in);
	
	HashMap<String, ArrayList<PhoneAndName>> GroupAndNumber;
	
	
	
	String groupName;
	
	public static void main(String[] args) {
		
		D07_PhoneBook pb1 = new D07_PhoneBook();
		
//		pb1.addGroup("학교");
//		pb1.addGroup("학원");
//		pb1.addGroup("동아리");
//		
//		pb1.addNum("학교", "010-7164-7664", "김현식");
//		pb1.addNum("학교", "010-4235-1634", "홍길동");
//		pb1.addNum("학교", "010-1214-2664", "김신호");
//		pb1.addNum("학교", "010-3554-2664", "김현준");
//		pb1.addNum("학교", "010-2534-2664", "박호형");
//		pb1.addNum("학교", "010-6968-2654", "유관순");
//		
//		pb1.searchName("김");
//		pb1.getNum("학교");
//		pb1.searchPhoneNumber("010-7");
//		pb1.desc("학교");
		
		pb1.phoneBook();
	}
	
	
	public D07_PhoneBook() { //생성자
		GroupAndNumber = new HashMap<>();		
		GroupAndNumber.put("미분류", new ArrayList<PhoneAndName>()); 
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
			System.out.print("1. 그룹추가   ");
			System.out.print("2. 새로운 이름과 번호추가   ");
			System.out.print("3. 이름찾기   ");
			System.out.print("4. 번호찾기   ");
			System.out.print("5. 이름 내림차순으로 정렬하기   ");
			System.out.print("6. 그룹내의 번호확인   ");
			System.out.println("7. 종료");
			System.out.println("===========================================================================================================");
			
			System.out.println("원하는 번호를 선택하세요 >>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("그룹이름을 정하세요 : ");
				groupName = sc.next();
				pb.addGroup(groupName);
				System.out.println("현재 그룹 : " + pb.GroupAndNumber.keySet());
				break;
			case 2:
				System.out.print("저장할 그룹을 정하세요 : ");
				groupName = sc.next();
				System.out.print("그룹내에 저장할 번호를 입력하세요 : ");
				phoneNumber = sc.next();
				System.out.println("그룹내에 저장할 이름을 입력하세요 : ");
				name = sc.next();
				pb.addNum(groupName, phoneNumber, name);				
				break;
			case 3:	
				System.out.print("찾고싶은 이름을 적으세요 : ");
				name = sc.next();
				pb.searchName(name);
				break;
			case 4:
				System.out.print("찾고싶은 번호를 적으세요 : ");
				phoneNumber = sc.next();
				pb.searchPhoneNumber(phoneNumber);
				break;
			case 5:
				System.out.print("내림차순할 그룹을 적으세요 : ");
				groupName = sc.next();
				pb.desc(groupName);
				break;
			case 6:
				System.out.print("번호를 알고싶은 그룹을 적으세요 : ");
				groupName = sc.next();
				pb.getNum(groupName);
				break;
			case 7:
				System.out.print("종료합니다");
				book = false;
				break;
			}
		}
	}
	
	void addGroup(String groupName) {		
	
		GroupAndNumber.put(groupName, new ArrayList<PhoneAndName>()); //(그룹이름)을 '키'값 (전화번호와 이름)이 있는 클래스를 '벨류'로 저장
		
	}
	
	void addNum(String groupName, String phoneNum, String name) {
		
		
		if(GroupAndNumber.containsKey(groupName)) {
			GroupAndNumber.get(groupName).add(new PhoneAndName(phoneNum, name));
		}else {
			GroupAndNumber.get("미분류").add(new PhoneAndName(phoneNum, name));
		}
		
	}
	
	void getNum(String groupName) {
		
		for(int i = 0; i < GroupAndNumber.get(groupName).size(); i++) {
			
			System.out.println(GroupAndNumber.get(groupName).get(i).phoneNumber); //어레이스트
		}
		
	}
	
	void searchPhoneNumber(String searchPhoneNum) {
		
		for(String key : GroupAndNumber.keySet()) {
			for(int i = 0; i < GroupAndNumber.get(key).size(); i++) {
				
				if((GroupAndNumber.get(key).get(i).phoneNumber).contains(searchPhoneNum)) {					
					System.out.println("비슷한 값 : " + GroupAndNumber.get(key).get(i).phoneNumber);			
				}				
			}			
		}	
		
	}
	void searchName(String searchName) {
		
		for(String key : GroupAndNumber.keySet()) {
			for(int i = 0; i < GroupAndNumber.get(key).size(); i++) {
				
				if((GroupAndNumber.get(key).get(i).name).contains(searchName)) {					
					System.out.println("비슷한 값 : " + GroupAndNumber.get(key).get(i).name);			
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

