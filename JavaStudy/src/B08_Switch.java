

public class B08_Switch {

	public static void main(String[] args) {
	
	/*
	 # switch-case ��
	 	
	 	- ()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
	 	- ()�ȿ� boolean Ÿ���� �� �� ����
	 	- if������ �Ϻ��ϰ� ��ü�����ϴ�. �׷��� ���̽㿡���� switch�� ��ü�� ����
	 	- ����� ���� case�� �����Ͽ� ���� case�� ���� �� �ִ� ex) case 0: case 1:
	 	- break�� �Ⱦ��� break�� ���� ������ �������鼭 ��� case�� �����ع�����
	 	- default�� ���� case�� ���� ����� ���� ó���Ѵ�(��, else���� ����)
	 */
	
		int a = 10;
		switch(a % 2) {
		case 0 : 
			System.out.println("a�� ¦���Դϴ�.");
			break;
		case 1 :
			System.out.println("a�� Ȧ���Դϴ�.");
			break;
		}
		
		
		char grade = 'B';
		
		switch(grade) {
		case 'A' : case 'a' :
			System.out.println("Fantastic");
			break;
		case 'B' : case 'b' :
			System.out.println("Great");
			break;
		case 'C' : case 'c' :
			System.out.println("Soso");
			break;
		case 'D' : case 'd' :
			System.out.println("Bad");
			break;
		case 'F' : case 'f' :
			System.out.println("Find another job");
			break;
		default :
			System.out.println("�߸��� �Է��Դϴ�");
			break;
		}

	}

}
