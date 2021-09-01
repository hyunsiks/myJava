
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {

	/*
	  # Set
	  
	   - 집합을 구현해놓은 클래스
	   - 요소로 같은 값이 들어오는 것을 허용하지 않는다(중복을 제거하고 싶으면 set을 써라)
	   
	  # Hash
	  
	   - 어떤 값을 넣었을 때 전혀 예측할 수 없는 값이 생성되어야 하는 알고리즘
	   - 같은 값을 넣었을 때는 항상 일정한 값이 나와야 한다
	   - 유사한 값을 넣었을 때 예측하기 힘든 전혀 다른 값이 나온다
	   - 생성된 해쉬값으로 원래 값을 찾는 것이 불가능해야 한다
	   - 다시 원래 값으로 돌아갈 수도 없는 단방향성 알고리즘
	   - 중복 체크시에 뛰어난 성능을 보인다
	   - !!따라서 수정이 되었나 안되었나 볼때 사용많이하게됨(해쉬값이 달라지기때문)
	   - !!해쉬를 사용하는 알고리즘은 순서(index)가 없다(hash값을 예측하기 어렵기때문)
	   ex) hello -> 5D41402ABC4B2A76B9719D911017C592 이런식으로나옴
	   	   hello1 - > 203AD5FFA1D7C650AD681FDFF3965CD2
	   	   *MD5, SHA256 에서 해쉬로 변환
	 */
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		System.out.println(numbers);
		
		//같은 컬렉션 인터페이스이기 때문에 ArrayList에 있는 메서드들이 여기에도 있다
		
		//remover(object) - HashSet은 remove(index)가 없다 왜냐하면 index가 없기 때문이다 랜덤이기때문
		if(numbers.remove(100)) {
			System.out.println("지우기성공");
		}else {
			System.out.println("지우기실패");
		}
		System.out.println(numbers);
		
		//이름에 해쉬가 들어간 알고리즘들은 순서가없다(해쉬순서)
		HashSet<String> english = new HashSet<>();
		english.add("apple");
		english.add("airplane");
		english.add("bio");
		english.add("cat");
		english.add("drama");
		english.add("zebra");
		english.add("elephant");
		
		System.out.println(english);
		
		// ※ Set은 인덱스가 없기 때문에 for-each만 사용할 수 있다
		for(String word : english) {
			System.out.println(word);
		}
		
		// ※ 컬렉션끼리는 변환이 자유롭다
		//1. english는 HashSet인데 이것을 ArrayList로 변환하여서 정렬할수있다
		//2. ArrayList의 내용중 중복제거가 필요하면 HashSet으로 변환하여 중복제거할 수 있다
		ArrayList<String> english_list = new ArrayList<>(english);
		Collections.sort(english_list);   //ArrayList로 변환하여 정렬하는법
		System.out.println(english_list);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(3);
		numbers2.add(6);
		numbers2.add(6);
		numbers2.add(6);
		numbers2.add(13);
		System.out.println(new HashSet<>(numbers2)); //HashSet으로 변환하여 중복제거하는법
		
		// ※ 컬렉션들을 배열로 변환하기
		Object[] arr1 = english.toArray(); //1번방법, Object[]생성
		
		String[] arr2 = new String[english.size()]; //2번방법, 미리 만들어둔 배열을 전달
		english.toArray(arr2);
		
		System.out.println("Object[]로 변환된 english : " + Arrays.toString(arr1));
		System.out.println("배열로 변환된 english : " + Arrays.toString(arr2)); //toString사용
		
		// ※ 제네릭을 사용하지 않는 경우
		//		- 제네릭을 사용하지 않는 경우 모든 타입을 넣을 수 있다
		//		- 모든 타입이 Object타입으로 업캐스팅 되어 저장된다
		//		- 해당 값을 다시 제대로 사용하기 위해서는 다운캐스팅이 필요해서 번거롭다
		ArrayList numbers3 = new ArrayList();
		numbers3.add("홍길동");
		numbers3.add("홍길동");
		numbers3.add("홍길동");
		numbers3.add('A');
		numbers3.add(123.123);
		numbers3.add(333);
		
		System.out.println(numbers3);
//		String str = (String)numbers3.get(3); //자바 문법상으로는 아무 문제없음(컴파일시 예외나옴)
		
		// contains() : 커넥션에 해당 요소가 포함되어 있는지 여부를 반환(boolean 타입)
		System.out.println(english.contains("apple"));
		
		//containsAll(Collection) : 전달한 컬렉션이 모두 포함되어 있는지를 검사
		Set<String> subset = new HashSet<>();
		List<String> sublist = new ArrayList<>();
		
		subset.add("zebra");
		subset.add("drama");
		subset.add("tiger");
		
		sublist.add("apple");
		sublist.add("apple");
		sublist.add("apple");
		//subset의 모든 내용이 fruits에 포함되는지 확인
		
		System.out.println("english에는 subset의 모든 내용이 들어있나요? "
							+ english.containsAll(subset));
		System.out.println("english에는 sublist의 모든 내용이 들어있나요? "
							+ english.containsAll(sublist));
		
		// addAll(Collection) : 전달한 컬렉션의 내용을 모두 추가
		//	- 추가 성공여부를 boolean 타입으로 반환
		//	- 이미 모두 포함되어있으면 false, 새로 추가된것이 있으면 true
		System.out.println(english.addAll(subset));
		
		// # removeAll(Collection) : 전달한 컬렉션과 같은 내용을 모두 제거
		System.out.println(english_list.removeAll(subset));
		
		// # retainAll(Collection) : 전달한 컬렉션과 일치한 내용만 남긴다(교집합)
		//	- 변한 것이 있으면 true, 없으면 false
		System.out.println(english.retainAll(subset));
	}
	
}
