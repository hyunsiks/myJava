
import java.util.Scanner;

public class B03_Scanner {

	public static void main(String[] args) {
		
	/*
	  # Math Ŭ����
	  	- ���а� ���õ� ��ɵ��� ���ִ� Ŭ����
	  	  ex) abs(), round(), ceil()...
	  	  
	  # java.util.Scanner Ŭ����
	  	- ���α׷��� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ����
	  	- ��𿡼� �Է��� ������ ������ �ڿ� �پ��� ������ �Է¹��� �� �ִ�
		- �ֿܼ��� �Է¹ް� ���� ���� System.in�� ����Ѵ�
	 */
		
		//System.in���κ��� �Է¹޴� ���ɳʸ� �ϳ� �����Ѱ�
		//ScannerŸ�� ���� sc�� ������ ��ĳ�ʸ� ��Ƴ��´�
		Scanner sc = new Scanner(System.in);

		
		//Scanner�� nextInt() : �������� ������ ������ �ϳ� �Է¹޴´�
		System.out.print("�� ������ �Է��� �ּ��� > ");
		int a = sc.nextInt();
		System.out.println("�Է��Ͻ� ���� " + a + "�Դϴ�");
		System.out.println("�Է��Ͻ� ���� 3�� ���ϸ� " + a*3 + "�Դϴ�");
		System.out.println("1000�� �Է��Ͻ� ���� ���̴� " + (1000-a) + "�Դϴ�");
		
		//Scanner�� nextDouble() : �������� ������ �Ǽ��� �ϳ� �Է¹޴´�
		System.out.print("�̹����� �Ǽ��� �Է��� �ּ���(������ ����) > ");
		double b = sc.nextDouble();
		System.out.println("�ι�°�� �Է��Ͻ� ���� " + b + "�Դϴ�");
		System.out.println("ù��° ���� �ι�° ���� ���ϸ� " + (Math.round(a*b * 10) / 10.0) + "�Դϴ�");
		

	}
}
