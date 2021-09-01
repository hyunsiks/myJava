package quiz;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class D11_DiscountDay {

	/*
		� ī�信�� ¦����° ����ϸ��� ������縦 �����Ѵٰ� ���� �� ��
		�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ����غ�����
	 */
	
	public static void main(String[] args) {
		
		Calendar korea = Calendar.getInstance();
		
		System.out.println("�⵵ �Է� : ");
		int insertYear = new Scanner(System.in).nextInt();
				
		korea.set(Calendar.YEAR, insertYear); //�⵵����
		
		int year = korea.getActualMaximum(Calendar.DAY_OF_YEAR); //�ش� �⵵�� ����

		for(int i =1; i <= year; i++) {
			korea.set(Calendar.DAY_OF_YEAR, i); //365���� �ѹ��� ��ħ
			
			int dowim = korea.get(Calendar.DAY_OF_WEEK_IN_MONTH);
			
			if(dowim == 2 || dowim == 4) { //2���� 4������
								
				if(korea.get(Calendar.DAY_OF_WEEK) == 5) { //����ϸ� 
					
					System.out.printf("%d�� %d�� %d��\n", korea.get(Calendar.YEAR), korea.get(Calendar.MONTH) + 1, korea.get(Calendar.DATE));
				}				
			}
		}
	}
}
