
import java.util.Scanner;

public class B09_Operator3 {

	public static void main(String[] args) {
		
	/*
		# ���� ������
		
			- ������ if���� �� �ٷ� ǥ���� �� �ִ�
			- ���ǽ�? �� : �ƴϿ�;
	 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������ ����Ͻÿ� : ");
		int apple = sc.nextInt();
		int size = 10;
		
		int needs = apple % size == 0? apple / size : apple / size + 1;
		System.out.println(needs);
		
		boolean isEven = apple % 2 == 0;
		System.out.printf("����� ������ %s�Դϴ�.", isEven? "¦��" : "Ȧ��");
		
		
	}

}
