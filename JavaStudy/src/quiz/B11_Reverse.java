package quiz;

import java.util.Scanner;

public class B11_Reverse {

	public static void main(String[] args) {
		
		/*
		  ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(word.length() - i -1);
			System.out.print(ch);
		}

	}

}
