package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	public static void main(String[] args) {
		
		/*
		 ����ڷ� ���� ������ �ϳ� �Է¹ް� 
		 �ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
		 (��ҹ��� ���о��� �� ��)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		String sentence = sc.next();
		int[] alphabet = new int[26];
		
		
//		
//		for(int i = 0; i < 26; i++) {
//			for(int k = 0; k < sentence.length(); k++) {
//				if(sentence.charAt(k) == (char)('a' + i) || sentence.charAt(k) == (char)('A' + i)) {
//					alphabet[i] += 1;
//				}
//			}
//		}
//		for(int j = 0; j < 26; j++) {
//			
//			System.out.printf("%s�Ǵ� %s�� ������ %d �Դϴ�\n",(char)('a'+ j),(char)('A' + j) ,alphabet[j]);
//			
//		}
//		-----------------------------------------------------------------------------------------
		
		for(int i = 0; i < sentence.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(sentence.charAt(i) == (char)('a' + j) || sentence.charAt(i) == (char)('A' + j)) {
					alphabet[j] += 1;
					break;
				}else {
					continue;
				}
			}
		}
		for(int j = 0; j < 26; j++) {
		
			System.out.printf("%s�Ǵ� %s�� ������ %d �Դϴ�\n",(char)('a'+ j),(char)('A' + j) ,alphabet[j]);
		
		}
	}

}
