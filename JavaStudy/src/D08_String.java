
import java.util.Arrays;
import java.util.HashSet;

public class D08_String {

	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/kiwi/pineapple";
		
		// split(�����ҹ���) : ���ڿ��� ���ϴ� �������� �ڸ� �� ���ڿ� �迭�� ��ȯ�Ѵ�
		String[] splited_fruit = fruits.split("/");
		System.out.println(Arrays.toString(splited_fruit));
		
		// join(�����ҹ���, �̾���̰� ������) : �ڿ� ������ ���ڿ����� �����ҹ��ڷ� �̾���δ�
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
		
		// substring(start) : start���� ������ ���ڿ��� �߶� ��ȯ
		// substring(start, end) : start���� end�̸����� ���ڿ��� �߶� ��ȯ
		System.out.println("Hello, everyone!".substring(3, 8));
		System.out.println("Hello, everyone!".substring(10));
		
		//replace() : ���ڿ��� ġȯ�Ѵ�(char, string �Ѵٵ�)
		String emails = "abc123@naver.com, abc1234@naver.com, abcd1234@naver.com";
		String replaced = emails.replace("@naver.com", "@gmail.com");
		System.out.println(replaced);
		
		//format(format, value) : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�
		String text = String.format("������ %c���� �Դϴ�.\n", '��');
		System.out.println(text);
		
		//contains(seq) : ���ڿ��� �ش� ���ڿ��� ���ԵǾ��ִ��� �˻��Ѵ�
		System.out.println("pineapple".contains("apple"));
		
		//startsWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�
		System.out.println("pineapple".startsWith("pine"));
		
		//endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻��Ѵ�
		System.out.println("pineapple".endsWith("apple"));
		System.out.println("���.jpeg".endsWith(".jpeg")); //Ȯ���ڰ˻縹����
		
		//getByte() : ���ڿ��� byte[]�� ��ȯ�Ѵ�(������ �����غ�)
		String data = "�ȳ��ϼ���";
		
		byte[] byte_arr = data.getBytes();
		
		for(byte b : byte_arr) {
			
			System.out.printf("%d ", b);
		}
		System.out.println();
		
		//�����ڸ� �̿��� byte[]�� �ٽ� ���ڿ��� ��ĥ �� �ִ�(���� ���� �����͸� ��ȯ)
		//byte[] �� ���� ���� ���� ���ڵ� Ÿ���� ����ؾ� �Ѵ�
		System.out.println(new String(byte_arr));
		
		//trim() : ���ڿ� �ٱ����� ������ �������ش�
		String str1 = "   abc123 ";
		String str2 = "abc123    ";
		String str3 = "abc 123    ";
		
		str1 = str1.trim();
		str2 = str2.trim();
		str3 = str3.trim();
		
		System.out.println(str1.equals(str2)); 
		System.out.println(str2.equals(str3)); //���ο� �ִ� ������ �������� �ʴ´�
		
		//toUpperCase() : ���ڿ��� ��� �빮�ڷ� ��ȯ�� ���ο� �ν��Ͻ� ��ȯ
		System.out.println(str1.toUpperCase());
		
		//toLowerCase() : ���ڿ��� ��� �Һ��ڷ� ��ȯ�� ���ο� �ν��Ͻ� ��ȯ
		System.out.println(str1.toLowerCase());
		
		//equalsIgnoreCase() : ��ҹ��� ������� equals()
		str1 = "Hello Java";
		str2 = "hello java";
		System.out.println("equals : " + str1.equals(str2));
		System.out.println("equalsIgnoreCase : " + str1.equalsIgnoreCase(str2));
		
		//getChars(start, end, ������, ��������������) : char[] �� ���ڿ��� ���ϴ� �κ��� ���� �� �ִ�
		char[] buffer = new char[20];
		
		//Arrays.fill(������, ������char������) : ����� ��� ���� ���������ڷ� ä���
		Arrays.fill(buffer, '#');
		
		"Hello, world!!!".getChars(7, 12, buffer, 10);
		
		System.out.println(buffer);
	}
	
}















