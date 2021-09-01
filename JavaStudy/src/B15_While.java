
import java.util.Scanner;

public class B15_While {

	public static void main(String[] args) {
		
	/*
	 	# while
	 	
	 		- for���� ������ �ణ �ٸ� �ݺ���
	 		- �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�
	 		- ()���� ������ ���ε��� {}���� ������ �ݺ��Ѵ�
	 */
			//1. while���� ���� �⺻���� ����
			int i = 0;
		
			while(i < 10) {
				System.out.println(i);
				i++;
			}
			
			//2. while���� �������� ��ġ�� ���� ����� �޶��� �� �ִ�
			i = 0;
			while(++i < 10){//i++(1~10), ++i(1~9)
				System.out.println("�ݺ���2" + i);				
			}
			
			//3. while���� ����ϱ� ���Բ� ����� Ŭ�������� �ִ�
//				-has, next���� ���ľ ���� �Լ�(�޼���)�� �������ִ�
//				-Scanner ��
			Scanner sc1 = new Scanner("apple banana orange");
			Scanner sc2 = new Scanner("1234 1588 1541 111 222 333 444 555");
			
			while(sc1.hasNext()) {//hasNext()�� ���� ���� ������ true ������ false
				System.out.println(sc1.next());//next()�� ���� �ϳ��� ���� StringŸ������ ������
			}
			while(sc2.hasNextInt()) {
				System.out.println(sc2.nextInt());
			}
			while(sc2.hasNextInt()) { //�̹� �ѹ� �� ���� ������ �ֺ�� �־ �ٽ� ���� �� ����
				System.out.println(sc2.nextInt());
			}		
			
	}

}
