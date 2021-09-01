package quiz;

public class B04_ConditionQuiz {

	public static void main(String[] args) {
	
//	[ �˸��� �񱳿����� ��������]
//		*�񱳸� �� ������ ������ ���ʿ� �ִ� ���� ����
	
//		1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		int a = 15;
		System.out.print("1�� ������ ��� : ");
		System.out.println(a > 10 && a < 20);
		
//		2. int�� ���� b�� ¦���� �� true
		int b = 16;
		System.out.print("2�� ������ ��� : ");
		System.out.println(b % 2 == 0);
		
//		3. int�� ���� c�� 7�� ����� �� true
		int c = 21;
		System.out.print("3�� ������ ��� : ");
		System.out.println(c % 7 == 0);
		
//		4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻� �� �� true
		int hour = 16;
		System.out.print("4�� ������ ��� : ");
		System.out.println(hour >= 12 && hour < 24);
		
//		5. int�� ���� d�� e�� ���̰� 30�� �� true
		int d = 40, e = 10;
		System.out.print("5�� ������ ��� : ");
		System.out.println(Math.abs(d - e) == 30);
		
//		6. int�� ���� year�� 400���� ������ �������ų�
//		   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		int year = 800;
		System.out.print("6�� ������ ��� : ");
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		
//		7. �μ��� ö������ 2�� ������ true
		int minsuAge = 16, chulsuAge = 14;
		System.out.print("7�� ������ ��� : ");
		System.out.println(minsuAge - chulsuAge == 2);
		
//		8. �μ��� ö������ ������ 3�� ������ true
		int minsuBirth = 3, chulsuBirth = 6;
		System.out.print("8�� ������ ��� : ");
		System.out.println(chulsuBirth - minsuBirth == 3);
		
//		9. boolean�� ���� powerOn�� false�� �� true
		boolean powerOn = false;
		System.out.print("9�� ������ ��� : ");
		System.out.println(!powerOn);
		
//		10. ���ڿ� �������� str�� "yes"�� �� true
		String str = "yes";
		System.out.print("10�� ������ ��� : ");
		System.out.println(str == "yes");
		
		//!!!! #���ڿ�(������ Ÿ��)�� ==���� ���ϸ� �ȵȴ�.
		//  ������ Ÿ���� ���� ���� ���� �ش� Ŭ������ ���ǵǾ� �ִ�
		//  equals()��� �޼��带 �̿��ؾ��Ѵ�
		System.out.println(str.equals("yes"));
		/*
		  # �⺻�� Ÿ�԰� ������ Ÿ���� ������
		  	- �⺻�� Ÿ���� ���� �������� ũ�⸦ �����ϱ� ����
		  		(�������� ���̴� �޸𸮸� ����Ѵ�, Stack)
		  	- ������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ�
		  		(�������� �� ���� �޸𸮸� ����Ѵ�, Heap)
		 */
		String str1 = "yes";
		String str2 = new String("yes"); //new�� ���� ���ο� ��Ʈ���� ����ڴٴ°�, ��� �ּҸ� �����İڴٴ°�
		String str3 = "yes";
		
		System.out.println(str1 == str2); //�ּҰ� �ٸ��� ������ false
		System.out.println(str1 == str3); //�ּҰ� ���� ������ true
		System.out.println(str1.equals(str3)); //�ּҵ��� ������ ã�ư��� ���Ѵ�(��, str1 �ּҿ� str3�� �ּ��� ���� ã�ư��� ��)
		

	}

}
