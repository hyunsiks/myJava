
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class D07_HashMap {

	/*
	  # Map
	  
	   - Key와 Value가 한 쌍을 이루는 자료구조
	   - Key값을 통해 Value에 접근할 수 있다
	   - Key는 중복을 허용하지 않는다
	 */
	public static void main(String[] args) {
		
		HashMap<String, Integer> record = new HashMap<>();
		
		//put(key, value) 
		//	- map에 데이터 추가
		//	- 예전에 들어있던 값이 있으면 그 값을 리턴, 없으면 null을 리턴
		record.put("홍길동", 50000);
		record.put("고길동", 35000);
		record.put("박길동", 90000);	
		record.put("홍길동", 5000); //같은 키값에 value를 바꾸면 값이 바뀐다
		record.put("김현식", null);
		System.out.println(record);
		
		//연습문제 : "홍길동"에 저장되어 있는 숫자를 3000증가시켜보세요
		int a = (int)record.get("홍길동") + 3000;
		record.put("홍길동", record.get("홍길동")+3000);
		
		//이미 존재하는 키값에 put하면 값을 수정
		Integer previous_value = record.put("홍길동", 3500);
		System.out.println("이전에 들어있던 값: " + previous_value);
		System.out.println("지금 들어있는 값 : " + record.get("홍길동"));
		int c = record.put("고길동", 3000);
		
		//get(key) : key를 이용해 value를 꺼냄
		System.out.println(record.get("박길동")); //키값으로 데이터접근
		
		HashMap<String, Object> person = new HashMap<>();
		
		person.put("이름", "홍길동");
		person.put("나이", 35);
		person.put("좋아하는것", new String[] {"놀기", "잠자기", "먹기"});
		person.put("싫어하는것", new HashSet<>());
		
		
		
		
		System.out.println(person.get("이름")); //string과 int값은 object에서 다운캐스팅 안해도 println가능하다
		System.out.println(person.get("나이"));
		System.out.println(((String[])person.get("좋아하는것"))[0]); //Object에서 배열로 다운캐스팅 해야된다
		
		HashSet<String>dislike = ((HashSet)person.get("싫어하는것"));
		((HashSet<String>)person.get("싫어하는것")).add("과자");
		dislike.add("야근");
		dislike.add("퇴근");
		
		System.out.println(person.get("싫어하는것"));
		
		String d = (String)person.get("이름");
		int b = (int)person.get("나이");
		
		/*
			# 반복문으로 Map을 활용하기
			
			 - keySet() : key들로만 이루어진 Set을 반환한다
			 - values() : value들로만 이루어진 Set을 반환한다
			 - entrySet() : Entry<key, value>로 이루어진 Set을 반환한다 (import java.util.Map.Entry;)
		 */
		for(String key : person.keySet()) {
			System.out.println(key); //key값보기
		
			//A instanceof B 연산자 : A가 B의 인스턴스인지를 판별한다. 업캐스팅된 상태에서도 판별된다
			Object value = person.get(key);
			if(value instanceof String[]) { //value가 String[] 타입에서 업캐스팅된것이라면
				System.out.print("[");
				
				String[] arr = (String[]) value;
				
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + ", ");
				}
				
				System.out.println("]");
			}else {
				
				System.out.println(value); //value값보기
			}			
		}
		
		//values()
		System.out.println("values : " + person.values());
		//entrySet()
		System.out.println("entrySet : " + person.entrySet());
		for(Entry<String, Object>entry : person.entrySet()) { //import java.util.Map.Entry;
			
			String key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
		//containskey(), containsvalue() : true, false로 반환
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "hello!");
		map.put(99, "good night");
		map.put(35, "see you later!");
		
		System.out.println(map.get(3));
		System.out.println(map.get(99));
		System.out.println(map.get(35));
		
		System.out.println("키 중에 15가 있나요? : " + map.containsKey(15));
		System.out.println("값 중에 hello!가 있나요? : " + map.containsValue("hello!"));
	}
	
}
