
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class D01_ArrayList {
	
	/*
	  # Java Collections 
	  
	  	- 자바에서 기본적으로 제공하는 자료구조 인터페이스
	  	- Collection 인터페이스를 상속받은 인터페이스로는 List, Set 등이 있다(나중에 List인터페이스를 상속받은 ArrayList클래스를 쓰게 되는것)
	  		(즉, Collections를 상속받은 List를 상속받은 ArrayList)
	  		
	  # java.util.ArrayList
	  
	  	- 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스
	  	- 배열과 유사한 형태이다
	  	- 순차적으로 모든 데이터에 접근해야 할 때 가장 유리하다
	 */
	public static void main(String[] args) {
		
		// 타입을 지정하며 ArrayList 생성하기
		// 타입을 지정할 때 사용하는 <>를 제네릭(Generic)이라고 부른다
		// 제네릭에는 기본형 타입을 사용할 수 없다(int형은 기본형이기 때문에 int의 참조형 타입인 Integer을 써야함/ 즉, 기본타입의 WrapperClass 이용)
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// add(element) : 리스트에 원하는 데이터를 순차적으로 맨뒤에 추가한다
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("banana");
		fruits.add("strawberry");
		
		numbers.add(10);numbers.add(20);numbers.add(30);numbers.add(40);
		
		//add(index, element) : 리스트의 원하는 위치에 데이터를 넣는다
		fruits.add(2, "orange");
		System.out.println(fruits);
		
		//get(index) : 원하는 위치의 데이터를 꺼낸다
		System.out.println(fruits.get(2));
		
		//size() : 해당 컬렉션의 크기를 반환한다(length느낌)
		System.out.println("fruits의 size : " + fruits.size());
		System.out.println("numbers의 size : " + numbers.size());
		
		//remove(index) : 해당 번쨰의 데이터를 삭제한다
		//remove("object") : 해당 객체를 데이터에서 삭제한다
		String deleted_fruit = fruits.remove(0);
		System.out.println("삭제 후 : " + fruits);
		System.out.println(deleted_fruit); //지워진것 확인
		fruits.remove("orange");
		System.out.println("삭제 후 : " + fruits);
		if(fruits.remove("strawberry")) {
			System.out.println("strawberry를 성공적으로 삭제했습니다");
		}else {
			System.out.println("strawberry가 없어서 삭제하지 못했습니다");			
		}
		
		//contains("object") : 해당 객체가 있는지 없는지 boolean타입으로 반환
		System.out.println(fruits.contains("orange"));
		//containsAll(Collection) : 전달한 컬렉션이 모두 포함되어 있는지를 검사
		Set<String> subset = new HashSet<>();
		
		subset.add("kiwi");
		subset.add("apple");
		//subset의 모든 내용이 fruits에 포함되는지 확인
		fruits.containsAll(subset);
		System.out.println(fruits.containsAll(subset));
		
		// addAll(Collection) : 전달한 컬렉션의 내용을 모두 추가
		//	- 추가 성공여부를 boolean 타입으로 반환
		//	- 이미 모두 포함되어있으면 false, 새로 추가된것이 있으면 true
		System.out.println("addAll : " + fruits.addAll(subset));
		
		//removeAll(Collection) : 전달한 컬렉션의 내용을 모두 삭제
		System.out.println("removeAll : " + fruits.removeAll(subset));
		
		// # retainAll(Collection) : 전달한 컬렉션과 일치한 내용만 남긴다(교집합)
		//	- 변한 것이 있으면 true, 없으면 false
		System.out.println("retainAll : " + fruits.retainAll(subset));
		
		// # isEmpty() : 해당 컬렉션이 비어있으면 true
		System.out.println("isEmpty : " + fruits.isEmpty());
		
		//정렬 
		Collections.sort(fruits); //어레이 리스트로 만든 배열의 정렬
		Collections.sort(numbers);
		int[] lottos = {45, 1, 7, 13, 8, 20, 11};
//		Collections.sort(lottos);
		Arrays.sort(lottos);
		System.out.println(Arrays.toString(lottos)); //일반배열의 정렬
		
		
	}
}
