

public class B06_If {

	public static void main(String[] args) {
		
	/*
	 # if��
	 	- ()�ȿ� ���� true�� �� {}���� ������ �����Ѵ�
	 	- ()�ȿ� ���� false�� �� {}���� ������ �����Ѵ�
	 	- {}�ȿ� �� ������ �� �� ���̶�� {}�� ������ �� �ִ�

	 # else if��
	 	- ���� �ִ� if���� ������� �ʾҴٸ� if��ó�� �����Ѵ�
	 	- else if�� �ܵ����� ����� �� ����
	 	- else if�� ������ ����� �� �ִ�
	 	
	 # else��
	 	- ���� �ִ� if, else if�� ��� ������� �ʾҴٸ� {}���� ������ ������ �����Ѵ�
	 	- if �ٷ� ������ �� ���� �ִ�
	 	**else�� �پ��ִ� �������� �ּ� �ѹ��� ����ȴ�, �� if������ �ƴϸ� ������ else����
	 */
		int a = 10;
		
		if(a < 15) {
			System.out.println("hello!");
		} else if (a > 0) {
			System.out.println("Nice to meet you!");
		} else if (a > -10) {
			System.out.println("Greeting!");
		} else if (a > -20) {
			System.out.println("Good to see you!");
		}
		System.out.println("���α׷��� �������ϴ�.");
		
		char ch = '��';
		
		if(ch >= '��' && ch <= '�R') {
			System.out.println("ch�� ����ִ� ���� �ѱ��Դϴ�.");
		} else if (ch >= 12352 && ch <= 12543){
			System.out.println("ch�� ����ִ� ���� �Ϻ����Դϴ�.");
		} else {
			System.out.println("ch�� ����ִ� ���� �ѱ�, �Ϻ�� �ƴմϴ�.");
		}
		
	}

}
