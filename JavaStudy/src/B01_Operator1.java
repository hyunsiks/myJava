

public class B01_Operator1 {

	public static void main(String[] args) {
		
	/*
		# ������ (Operator)
			- ����� �� ���Ǵ� ��
			- +, -, *, / ...
	*/		
//	# ��� ������
		int a = 10, b = 7;
		double c = 7.0;
		float d = (float)a/b;
		System.out.println("+ : " + (a + b));
		System.out.println("- : " + (a - b));
		System.out.println("* : " + a * b);
		System.out.println("/ : " + a / b); //�������� ������ �򸸳���		
		System.out.println("/(float) : " + a / (float)b); //������ �Ǽ��� ������ ��Ȯ�� ���� �����		
		System.out.println("/(double) : " + a / (double)b); //������ �Ǽ��� ������ ��Ȯ�� ���� �����		
		System.out.println("% : " + a % b);		
		System.out.printf("%.6f", d);
		System.out.println();
		System.out.println("���� : " + Math.pow(a, 4));
		System.out.println("����? : " + (a ^ 4)); //^�� ������ �ƴϴ�(���α׷��־��� ��Ʈ�������̴�)
		System.out.println("������ : " + Math.sqrt(49));
		System.out.println("���밪 : " + Math.abs(-25.3));
		/*
		  Mate.round()�� �Ҽ� ù° �ڸ������� �ݿø� �� �� �ִ�
		  ��° �ڸ����� �ݿø� �ϰ� ���� ��� 100���� ������ �״�� 
		  3�����⶧���� 100.0���� �Ǽ�Ÿ�������ؾ� ��Ȯ�� ���� ���� 
		 */
		System.out.println("�Ҽ� ù° �ڸ����� �ݿø� : " + Math.round(3.335));
		System.out.println("�Ҽ� ��° �ڸ����� �ݿø� : " + Math.round(3.335 * 100) / 100.0); //���� �� �� �Ǽ�Ÿ������ ������� ������ �����´�
		System.out.println("�ø� : " + Math.ceil(1.001));
		System.out.println("���� : " + Math.floor(1.001));
		
		System.out.println("�� ū ���� ����� : " + Math.max(1900, 1500));
		System.out.println("�� ���� ���� ����� : " + Math.min(1900, 1500));
		
//	#��Ʈ������(&, |, ^, >>, <<)
	
		// 1010
		// 0111
		// ------&
		// 0010 (0�� �ϳ��� ������ 0)
		System.out.println("a & b : " + (a & b)); //AND
		
		// 1010
		// 0111 
		// ------|
		// 1111 (1�� �ϳ��� ������ 1)
		System.out.println("a | b : " + (a | b)); //OR
		
		// 1010
		// 0111
		// ------^
		// 1101 (������0, �ٸ���1)
		System.out.println("a | b : " + (a ^ b)); //XOR
		
		// 0000 1000 << 2
		// 0010 0000 
		System.out.println(8 << 2); 
		// 0000 1000 >> 2
		// 0000 0010 
		System.out.println(8 >> 2); 
		

	}
}
