package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {

	public static void main(String[] args) {
		
		/*
		 ����ڰ� �Է��� ���ڿ��� ���ĺ��� 
		 ���յǾ� ������ true�� ���, ������ false�� ���
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String word = sc.nextLine();
		boolean exist = false;
		
		for(int i = 0; i < word.length(); i++) {
			if((word.charAt(i) > 'a' && word.charAt(i) < 'z') || (word.charAt(i) > 'A' && word.charAt(i) < 'Z')) {
				exist = true;
				break; //�ϳ��� ã���� ���̻� �ݺ����� ������ ������ ����
			}
		}
		System.out.println("���ڿ��� ���ĺ� ������ �Ǿ��°�? : " + exist);
			
		
	}

}
