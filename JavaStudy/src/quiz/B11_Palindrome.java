package quiz;

import java.util.Scanner;

public class B11_Palindrome {

	public static void main(String[] args) {
		
		/*
		  ����ڷκ��� �ܾ �ϳ� �Է¹ް�
		  �ش� �ܾ ȸ���̶�� "PALINDROME" �� ���
		  ȸ���� �ƴ϶�� "NOT PALINDROME" �� ����غ�����
		  (��ȸ��? MOM,BOB,ABBA,MADAM ó�� �¿� ��Ī�� �ܾ�)		  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܾ �Է��ϼ��� : ");
		String word = sc.next();
		/*
		String result = "PALINDROME";
		
		int length = word.length() - 1;

		for(int i = 0; i < (word.length() / 2); i++) {				
			for(int j = length; length >= (word.length() / 2); ) {
				if(word.charAt(i) != word.charAt(j)){
					result = "NOT PALINDROME";
					length--;
					break;
					
				}else {
					length--;
					break;
				}
			}			
		}
		System.out.println("����� : " + result);
		*/
		
//		---------------------------------------------------
//		�����Ǯ��
		String result = "PALINDROME";
		for(int i = 0; i < word.length() / 2; ++i) {
			char ch = word.charAt(i);
			char ch2 = word.charAt(word.length() - i -1);

			if(ch != ch2) {
				result = "NOT PALINDROME";
				break;
			}
		}
		System.out.printf("[%s]�� ����� %s�Դϴ�. \n", word, result);

	}

}
