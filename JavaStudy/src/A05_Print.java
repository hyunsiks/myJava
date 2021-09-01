

public class A05_Print {

	public static void main(String[] args) {
		
	/*
	  # �ֿܼ� ����ϱ� ���� �������� �Լ���
	  
	  	1. print()
	  		- ���� �ڵ����� �ٲ��� �ʴ� ���� �⺻ ���
	  		
	  	2. println()
	  		- ���� �ڵ����� �ٲ��ָ� ����ϴ� �Լ�
	  		- ()�� ������ ������ �� �ڿ� '\n'�� �߰��Ͽ� ����ϴ� �Ͱ� ����
	  		- ()�� �ƹ��͵� �������� ������ '\n'�� ����Ѵ�
	 
	  	3. printf()
	  		- ���� ���ڸ� �̿��� �� �ִ� ��� �Լ�
	  		- ���ڿ� +�� �̾���̴� �� ���� ������ ����ϴ� ��찡 ���Ҷ��� �ִ�
	  		- ���� �ڵ����� �ٲ����� �ʴ´�	 
			- %d �ڸ��� ���ڸ� �ϳ��� ä���� ����Ѵ� */
			int year=2001, month=3, day=17, hour=11, minute=9, second=38, millisec=1234;
			System.out.println(year + "�� " + month + "�� " + day + "�� / "
					+ hour + ":" + minute + ":" + second + "." + millisec);
			System.out.printf("%d�� %d�� %d�� / %d:%d:%d.%d\n", year,month,day,hour,minute,second,millisec);
	/*
	  # ���� ������ ����
	 	
	 	%d		: �ش� �ڸ��� ������ ������ 10������ ������ش�(decimal)
	 	%x,%X	: �ش� �ڸ��� ������ ������ 16������ ������ش�(hexa decimal)
	 	%o		: �ش� �ڸ��� ������ ������ 8������ ������ش�(octal)
	 	%s		: ���ڿ�(String)
	 	%c		: ����(char)
	 	%f		: �Ǽ�(float)
	 	
	  # ������ ����
	  	1. 10������ ���ڵ�
	  		0 1 2 3 4 5 6 7 8 9 10
	  	2. 8������ ���ڵ�
	  		0 1 2 3 4 5 6 7 10
	  	3. 16������ ���ڵ�
	  		0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 .... 19 1a 1b 1c 1d ... */
		int testNum=15;
		System.out.printf("16������ %d��(��) %x�Դϴ�.\n", testNum, testNum);	
		System.out.printf("16������ %d��(��) %X�Դϴ�.\n", testNum, testNum);	
		System.out.printf("8������ %d��(��) %o�Դϴ�.\n", testNum, testNum);	
	
//	  # ���Ĺ��� �ɼǵ�(d�� �ִ°��� �ƴ϶� s,c,f ��ΰ���)
//	  	1. %����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ �����Ͽ� ����Ѵ�
				System.out.printf("��� : %d��\n", 10);
				System.out.printf("��� : %5d��\n", 10);
				System.out.printf("��� : %10d��\n", 10);
				System.out.printf("�̸� : %10s�Դϴ�\n", "������");
				System.out.printf("���� : %10c����\n", 'A');
		
//		2. %-����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ���� �����Ͽ� ����Ѵ�
				System.out.printf("��� : %d��\n", 10);
				System.out.printf("��� : %-5d��\n", 10);
				System.out.printf("��� : %-10d��\n", 10);
				
//		3. %0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0�� ä���� ����Ѵ�
				System.out.printf("��� : %d��\n", 10);
				System.out.printf("��� : %05d��\n", 10);
				System.out.printf("��� : %010d��\n", 10);
				
//		4. %+����d : ��� �տ��� ��ȣ�� �ٿ��ش�
				System.out.printf("��� : %d��\n", 10);
				System.out.printf("��� : %+d��\n", 10);
				System.out.printf("��� : %+5d��\n", 10);
				
//		5. %.����f : �Ҽ� �ڸ����� �����Ѵ�
				System.out.printf("������� : %.2f\n", 0.123456789);
				System.out.printf("������� : %.5f\n", 0.123456789);
	
	}

}
