package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	public static void main(String[] args) {
		
	/*
	  # �ʸ� �Է¹����� ��/ ��/ �ð�/ ��/ �ʷ� ��ȯ�Ͽ� ����غ�����
	   �ʿ���� ������ ������� ����
	   ex) 0�� 0�� 5�ð� 0�� 20���� ��� 0�� 0���� ������ �ʾƾ� ��
	 */

		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("�����ϱ� ���ϴ� ��(��)�� �Է��ϼ���");
		
		
		long insertTime = sc.nextLong();
		int sec;
		int min = 60;
		int hour = min * 60;
		int day = hour * 24;
		int year = day * 365;
		long yearCount = 0, dayCount = 0, hourCount = 0, minCount = 0;
		
		if(insertTime / year > 0) {
			yearCount = insertTime / year;
			System.out.print(insertTime / year + "�� ");
			insertTime %= year;			
		}
		if(insertTime / day > 0) {
			dayCount = insertTime / day;
			System.out.print(insertTime / day + "�� ");
			insertTime %= day;		
		}else if(yearCount > 0) {
			dayCount = insertTime / day;
			System.out.print(insertTime / day + "�� ");
			insertTime %= day;
		}
		if(insertTime / hour > 0) {
			hourCount = insertTime / hour;
			System.out.print(insertTime / hour + "�ð� ");
			insertTime %= hour;
		}else if(yearCount > 0 || dayCount > 0) {
			hourCount = insertTime / hour;
			System.out.print(insertTime / hour + "�ð� ");
			insertTime %= hour;
		}
		if(insertTime / min > 0) {
			System.out.print(insertTime / min + "�� ");
			insertTime%= min;
		}else if(yearCount > 0 || dayCount > 0 || hourCount > 0) {
			System.out.print(insertTime / min + "�� ");
			insertTime %= min;
		}
		System.out.println(insertTime + "�� �Դϴ�.");
		*/
		
//		------------------------------------------------------------------------------------
	//����� Ǯ�̹�
		System.out.print("�� > ");
		int second = sc.nextInt();
		int original = second;
		
		int y = 0, d = 0, h = 0, m = 0, s = 0;
		
		y = second / (60 * 60 * 24 * 365);
		second %= (60 * 60 * 24 * 365);

		d = second / (60 * 60 * 24);
		second %= (60 * 60 * 24);

		h = second / (60 * 60);
		second %= (60 * 60);

		m = second / 60;
		second %= 60;

		s = second;
		
//		System.out.printf("'%d'�ʴ� ��ȯ�ϸ� '%d'�� %d�� %�ð� %�� %��' �Դϴ�.\n", original, y, d, h, m, s);
		
		System.out.printf("%d �ʴ� ��ȯ�ϸ�", original);
		
		boolean exist = false;
		//true�� ���� ������ ���� true�� ��ٸ� �� �Ʒ��δ� ������ 0�̵� �ƴϵ� ����ϰڴٴ°�
		//��, y���� true�� �������� ���� �� �Ʒ��δ� 0�̾ ����ϰڴٴ°�
		if(y != 0) { 
			System.out.print(y + "�� ");
			exist = true;
		}
		if(exist || d != 0) {
			System.out.print(d + "�� ");
			exist = true;
		}
		if(exist || h != 0) {
			System.out.print(h + "�ð� ");
			exist = true;
		}
		if(exist || m != 0) {
			System.out.print(m + "�� ");
		}
		System.out.print(s + "�� �Դϴ�.");
		
	}
	
	//53550000
}
