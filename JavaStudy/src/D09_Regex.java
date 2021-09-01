
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {

	/*
	 	# ����ǥ���� (Regular Expression)
	  
	 	 - ���ڿ��� ������ ǥ���ϴ� ǥ����
	 	 - Ư�� ���α׷��� �� ���ӵ��� �ʴ´� (�ٸ������� �����ִٴ°�)
	   	 - ���α׷��Ӱ� ���ϴ� ���ڿ� ���ϰ� ��ġ�ϴ��� �˻��Ҷ� ����Ѵ�
	   
	 	# Pattern Ŭ����
	 	
	 	 - ����ǥ������ �ٷ�� Ŭ����
	 	 
	 	# Matcher Ŭ����
	 	
	 	 - ���� �ν��Ͻ��� �̿��Ͽ� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	 */
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�Ǵ� ���ڿ����� �˻����ִ� �޼���
		System.out.println(Pattern.matches("sleep", "sleep")); 
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh@]eep", "sleep")); //true
		System.out.println(Pattern.matches("s[lh@]eep", "sheep")); //true
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep")); //true
		
		/* [] ���ο� ������ �� �ִ� �͵�
			
			 1. abc  : �ش��ڸ��� a �Ǵ� b �Ǵ� c �� ����Ѵ�
			 2. ^abc : �ش��ڸ��� abc�� ������ ������ ���
			 3. a-z	 : a ���� z���� ��� ��� (�����ڸ�)
			 4. &&	 : ������
		*/
		System.out.println(Pattern.matches("s[^lh@]eep", "s��eep")); //2. true 
		System.out.println(Pattern.matches("s[0-9]eep", "s5eep")); //3. true 
		System.out.println(Pattern.matches("s[a-d && c-f]eep", "sdeep")); //4. true [a-d]��[c-f]������ ������
		
//		Pattern instance = Pattern.compile("[0-9]@[0-9]"); //instance �ν��Ͻ��� ������ ���ϰ� ������ �˻��ϰڴٴ°�
		
		/* [] ���ο� ������ �� �ִ� �͵�
		
		 5.   .   : ��繮�ڸ� ����Ѵ� �� ���ܷ� [] �ۿ� ��� �ϴ� ����
		 6.  \d   : �����ڸ� ����Ѵ� (������ ���������� �������� ���������� ����ϹǷ� \\d�� ����)
		 7.  \D   : ���ڸ� ������ ��� ��
		 8.  \s	  : ��� ���� ��� (\t, \n, \r �����̽� .. ���� ��� ����� ���)
		 9.  \S   : ������ ������ ��� ��
		 10. \w   : �Ϲ����� ���ڵ��� ��� [a-z A-Z 0-9]
		 11. \W   : �Ϲ����� ���ڵ��� ������ ������ ���
	*/
		System.out.println(Pattern.matches("s.eep", "s��eep")); //5. true  (��繮��)
		System.out.println(Pattern.matches("s[.]eep", "s��eep")); // . ����� 
		System.out.println(Pattern.matches("s\\.eep", "s��eep")); // . ����� 
		System.out.println(Pattern.matches("s\\deep", "s9eep")); //6. true 
		System.out.println(Pattern.matches("s\\Deep", "sAeep")); //7. true 
		System.out.println(Pattern.matches("\\D\\D\\D", "CAT")); //7. true 
		System.out.println(Pattern.matches("s\\seep", "s eep")); //8. true 
		System.out.println(Pattern.matches("s\\Seep", "s eep")); //9. false 
		
		
		/* �ش� ������ ����� ������ ������ �����ϴ� ���
		
		 1. [ex]{n}   : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		 2. [ex]{n,m} : {}���� ������ �ּ�n�� �̻�, �ִ� m��(����) ��ġ�ؾ��Ѵ�
		 3. [ex]{n,}  : {}���� ������ �ּ�n�� �̻���ġ�ؾ� �Ѵ�
		 4. [ex]? 	  : 0�� �Ǵ� �ѹ�
		 5. [ex]+	  : �ּ� �ѹ� �̻�
		 6. [ex]*	  : 0�� �Ǵ� ������
	*/	
		System.out.println(Pattern.matches("[\\D]{3}", "CAT")); //1. true \\D�� ���� ���δٴ°� 
		System.out.println(Pattern.matches("[\\D3-5]{5}", "CA3TS")); //1. true ('\\D' �ų� '3-5')�� 5�����δٴ°� 
		System.out.println(Pattern.matches("[\\D\\d]{5}", ".--2��")); //1. true  
		System.out.println(Pattern.matches("[\\D3-5]{2,4}\\.txt", "3a!f.txt")); //2. true(2~4�� �¾ƾ��ϰ� ������ .txt �������)  
		System.out.println(Pattern.matches("[\\D3-5]{2,}\\.txt", "3a!f.txt")); //3. true 
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "�ȳ��ϼ���.txt")); //3. true 
		System.out.println(Pattern.matches(".{2,}\\.txt", "�ȳ��ϼ���.txt")); //3. true  (������ 2���̻�)
		
		String a = "�ٺ��ƴϳ���";
		String regex1 = String.format(".{%d}\\.txt", a.length());
		System.out.println(Pattern.matches(regex1, ".......txt"));
		
		System.out.println(Pattern.matches("[��-�R]?\\.txt", ".txt"));
		System.out.println(Pattern.matches("[��-�R]?\\.txt", "��.txt"));
		System.out.println(Pattern.matches("[��-�R]?\\.txt", "�ѱ�.txt"));
		//��ȭ��ȣ����ǥ����
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-?\\d{4}", "010-1234-1234")); //4. ����{3}�� '-' �� 0�Ǵ� 1(�ְų����ų�) �������� ����{3,4}�� �̷���
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-?\\d{4}", "010-234-1234"));
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-?\\d{4}", "01012341234"));
		
		//�������� : �ڹٿ��� ����ϴ� �������� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches("[$\\w\\D][$\\w]*", "$egex1_$"));
		
	/* 
		# Pattern.compile(regex)
	
		 - ������ ����ǥ������ �ؼ��Ͽ� Pattern �ν��Ͻ��� �����ϰ� ��ȯ�Ѵ�
		 - PatternŸ�� �ν��Ͻ��� �䱸�ϴ� ���� ����� �� �ִ�	 
		 
		# split() : �����ϵ� ���� �ν��Ͻ��� ���ڿ� split()�� �����Ѵ�
		
		# matcher() :Matcher �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ�
	*/
		String fruit_text = "apple/banana/orange/grpe/pineapple/peach/mango/redapple";
		String fruit_text2 = "apple/banana/orange/grpe/pineapple/peach/mango/redapple";
		
		//split()
		fruit_text2.split("/"); //�� ������� �������� ������
		String[] fruits2 = fruit_text2.split("/");
		Pattern regex = Pattern.compile("/"); //�� ������� �����⵵�Ѵ�
		regex.split(fruit_text); //������ ����� �ν��Ͻ��� �����صΰ� �����صа����� �����ٴ°�
		String[] fruits = regex.split(fruit_text);
		System.out.println(Arrays.toString(fruits));
		System.out.println(Arrays.toString(fruits2));
		
//		Pattern regex2 = Pattern.compile("^a.*e$"); //a�� �����ؼ� e�� �����°�
		Pattern regex2 = Pattern.compile("apple");
		
		Matcher matcher = regex2.matcher(fruit_text);
		
		while(matcher.find()) { //���ڸ� �˻��Ҽ��ִ�
			System.out.println("ã�� �� : " + matcher.group());
			System.out.println("��ġ : " + matcher.start() + "���� " + matcher.end() + "����");
		}
		
	}
}



















