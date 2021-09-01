
import java.util.Arrays;
import java.util.HashSet;

public class D08_String {

	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/kiwi/pineapple";
		
		// split(구분할문자) : 문자열을 원하는 기준으로 자른 후 문자열 배열로 반환한다
		String[] splited_fruit = fruits.split("/");
		System.out.println(Arrays.toString(splited_fruit));
		
		// join(구분할문자, 이어붙이고 싶은것) : 뒤에 나오는 문자열들을 구분할문자로 이어붙인다
		String join_result = String.join("/", splited_fruit);
		String join_result2 = String.join("-", "Java", "is", "good");		
		
		HashSet<StringBuilder> set = new HashSet<>();
		set.add(new StringBuilder("Hello"));
		set.add(new StringBuilder("my name is"));
		set.add(new StringBuilder("John Doe"));
		
		String join_result4 = String.join("--", set);
		
		System.out.println(join_result);
		System.out.println(join_result2);
		System.out.println(join_result4);
		
		// substring(start) : start부터 끝까지 문자열을 잘라서 반환
		// substring(start, end) : start부터 end미만까지 문자열을 잘라서 반환
		System.out.println("Hello, everyone!".substring(3, 8));
		System.out.println("Hello, everyone!".substring(10));
		
		//replace() : 문자열을 치환한다(char, string 둘다됨)
		String emails = "abc123@naver.com, abc1234@naver.com, abcd1234@naver.com";
		String replaced = emails.replace("@naver.com", "@gmail.com");
		System.out.println(replaced);
		
		//format(format, value) : 서식을 이용해 원하는 문자열을 생성한다
		String text = String.format("오늘은 %c요일 입니다.\n", '수');
		System.out.println(text);
		
		//contains(seq) : 문자열에 해당 문자열이 포함되어있는지 검사한다
		System.out.println("pineapple".contains("apple"));
		
		//startsWith(seq) : 문자열이 해당 문자열로 시작하는지 검사한다
		System.out.println("pineapple".startsWith("pine"));
		
		//endsWith(seq) : 문자열이 해당 문자열로 끝나는지 검사한다
		System.out.println("pineapple".endsWith("apple"));
		System.out.println("펭귄.jpeg".endsWith(".jpeg")); //확장자검사많이함
		
		//getByte() : 문자열을 byte[]로 변환한다(데이터 전송준비)
		String data = "안녕하세요";
		
		byte[] byte_arr = data.getBytes();
		
		for(byte b : byte_arr) {
			
			System.out.printf("%d ", b);
		}
		System.out.println();
		
		//생성자를 이용해 byte[]을 다시 문자열로 합칠 수 있다(전달 받은 데이터를 변환)
		//byte[] 로 나뉠 떄와 같은 인코딩 타입을 사용해야 한다
		System.out.println(new String(byte_arr));
		
		//trim() : 문자열 바깥쪽의 공백을 제거해준다
		String str1 = "   abc123 ";
		String str2 = "abc123    ";
		String str3 = "abc 123    ";
		
		str1 = str1.trim();
		str2 = str2.trim();
		str3 = str3.trim();
		
		System.out.println(str1.equals(str2)); 
		System.out.println(str2.equals(str3)); //내부에 있는 공백은 제거하지 않는다
		
		//toUpperCase() : 문자열을 모두 대문자로 변환한 새로운 인스턴스 반환
		System.out.println(str1.toUpperCase());
		
		//toLowerCase() : 문자열을 모두 소분자로 변환한 새로운 인스턴스 반환
		System.out.println(str1.toLowerCase());
		
		//equalsIgnoreCase() : 대소문자 상관없는 equals()
		str1 = "Hello Java";
		str2 = "hello java";
		System.out.println("equals : " + str1.equals(str2));
		System.out.println("equalsIgnoreCase : " + str1.equalsIgnoreCase(str2));
		
		//getChars(start, end, 담을곳, 담을곳시작지점) : char[] 에 문자열의 원하는 부분을 담을 수 있다
		char[] buffer = new char[20];
		
		//Arrays.fill(담을곳, 담고싶은char형문자) : 빈곳에 모든 것을 담고싶은문자로 채운다
		Arrays.fill(buffer, '#');
		
		"Hello, world!!!".getChars(7, 12, buffer, 10);
		
		System.out.println(buffer);
	}
	
}















