

public class B14_InnerLoop {

	public static void main(String[] args) {
	
	
//	  # �ݺ��� ���ο� �ݺ��� ����ϱ�
		for(int i = 0; i < 3; i++) {
			System.out.printf("========================�ٱ��� �ݺ���%d\n", i);
			
			for(int j = 0; j < 2; j++) {
				System.out.printf("==========���� �ݺ���%d-%d\n", i, j);
			}
		}
	
//	  # �������� : ���� �ݺ������� ������ ����غ���
		for(int i = 1; i <= 9; i++) {
			System.out.println("=====" + i + "�� =====");
			for(int j = 1; j <= 9; j++)
				System.out.printf("%d x %d = %d\n", i, j, i*j);
		}

	}

}
