package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
		
		/*
        [ �˸��� ���ǽ��� �������� ]

        1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
        2. char�� ���� b�� �����̳� ���� �ƴ� �� true
        3. char�� ���� c�� ����('0' ~ '9')�� �� true
        4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
        5. char�� ���� e�� �ѱ��� �� true
        6. char�� ���� f�� �Ϻ����� �� true        
*/        
//      1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
			char a = 'q';
			System.out.println(a == 'q' | a == 'Q');		
//      2. char�� ���� b�� �����̳� ���� �ƴ� �� true
			char b = ' '; 
			System.out.println(b == ' ' | a == '	');			
//      3. char�� ���� c�� ����('0' ~ '9')�� �� true
			char c = (int)'t';
			System.out.println(c >= 0 && c <= 9);			
//      4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
			char d = (int)'A';
			System.out.println((d >= 65 && d <= 90) || (d >= 97 && d <= 122));			
//      5. char�� ���� e�� �ѱ��� �� true   (�����ڵ�ǥ �˻�)
			char e = (int)'��';
			System.out.println(d >= 44032 && d <= 55203);
//      6. char�� ���� f�� �Ϻ����� �� true  (�����ڵ�ǥ �˻�)
			char f = (int)'��';
			System.out.println(d >= 12352 && d <= 12543);
//			��Ÿ���� d >= 12448 && d <= 12543, ���󰡳� d >= 12352 && d <= 12447
//		7. ����ڰ� �Է��� ���ڿ��� exit�� �� true			
			Scanner sc = new Scanner(System.in);
			System.out.print("���ڸ� �Է��ϼ��� >> ");
			String exit = sc.next();
			System.out.println(exit.equals("exit"));

	}

}
