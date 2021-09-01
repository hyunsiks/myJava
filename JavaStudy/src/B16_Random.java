
import java.util.Random;

public class B16_Random {

	public static void main(String[] args) {
	
	/*
	 	# JAVA���� ������ ���� �����ϱ�
	 */	
//	 	 1. Math.random()
//	 	 	- double Ÿ���� ���� �Ҽ��� �����Ѵ�
//	 	 	- (0 <= X < 1)  �� ������ ������
			for(int i = 0; i < 10; i++) {
				System.out.println(Math.random());
			}	
//			- ���ϴ� ������ ���ڸ� ����� ��(ex. 30~60 ������ ��)
//				(1) ������ ���� �Ҽ��� ���ϴ� ������ ������ ���Ѵ�(��, 31��)
				System.out.println(Math.random() * 31);
				//0*31 <= X < 1*31 -> 0<= X < 31
//				(2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�(��, 30)
				System.out.println(Math.random() + 30);
				//0+30 <= X < 61
//				(3-1) �Ҽ��� �Ʒ��� �����Ѵ�(����Ÿ��)
				System.out.println(Math.floor(Math.random() * 31 + 30));
				//0.0 <= X <= 60.0
//				(3-2) �Ҽ��� �Ʒ��� �����Ѵ�(��ƮŸ��)
				System.out.println((int)(Math.random() * 31 + 30));
				// 0<= X <= 60
				
//		   # �������� : 1 ~ 45�� ���� ���ڸ� 7�� ����ϼ���
			
			for(int i = 0; i < 7; i++) { //int��
				System.out.println((int)(Math.random() * 45 + 1));
			}
			for(int i = 0; i < 7; i++) { //double��
				System.out.println(Math.floor(Math.random() * 45 + 1));
			}
			System.out.println("-------------------------------------");
			
//		 2. Random Ŭ����
//			- �� �� ���ϰ� ���� ���� ������ �� �ִ� ��ɵ��� ���ִ� Ŭ����
//			- ������ �� ������ ���� �õ尡 ���õȴ� (ex.ran.nextInt(�õ�))(ex.new Random(�õ�))
//			- ���ϴ� ���� �õ带 ������ ���� �ִ� 
			Random ran = new Random(); 
			// 0 ~ bound �̸��� ������ ��ȯ�Ѵ�
			System.out.println(ran.nextInt(45) + 1); //1~45��������
			System.out.println(ran.nextInt(45));//0~44��������
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			
//			# �������� : ����������
			System.out.println(ran.nextBoolean()? "�ո�" : "�޸�");
	}

}
