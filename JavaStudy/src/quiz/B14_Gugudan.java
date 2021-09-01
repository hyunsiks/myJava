package quiz;

public class B14_Gugudan {

	public static void main(String[] args) {
		
	/*
	 1. �������� ������ ���� ���η� ����غ�����
	 ex) 2�� : 2x1=2 2x2=4 2x3=6 ...
	 	 3�� : 3x1=3 3x2=6 3x3=9 ...
	 	 
	 2. �������� ������ ���� ���η� ����غ�����
	 ex) 2��		3��		4��
	 	 2x1=2	3x1=3	4x1=4
	 	 2x2=4	3x2=6	4x2=8
	 	 ...
	 */

//		1������
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d�� : ", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%dx%d=%-2d ", i, j, i*j);
			}
			System.out.println();
		}
		
//		2������
		for(int i = 2; i <= 9; i++) {
			System.out.print(i + "��\t ");
		}
		System.out.println();
		for(int k = 1; k <= 9; k++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%dx%d=%-2d\t ", j, k, j*k);
			}
			System.out.println();
		}
	}

}
