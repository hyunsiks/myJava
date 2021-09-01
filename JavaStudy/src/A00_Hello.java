

/** ����ȭ �ּ� (�ش� Ŭ���� ��ǳ���� �����ϰԵǴ� �ּ�) */

// Ecipse ����Ű ����
//	- Ctrl + [+, -] : ����ũ�� ����
//	- Ctrl + f11 : �ҽ��ڵ� ������ �� ����(Run)
//	- Alt + ����Ű : �ҽ��ڵ� �� ���� ������� �̵�(�ٿű��)
//	- Shift + End : Ŀ���� ���� ��ġ���� �� �ڱ��� �������
//	- Shift + Home : Ŀ���� ���� ��ġ���� �� �ձ��� �������

//public class �� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�
public class A00_Hello {
//���� ���� ������ ���� �װ��� Ŀ���� �ΰ� f2�� ������ ������ ���� ������ �ذ�å�� �� �� �ִ�.
	
	/*
	  # main() �Լ� ��� �Ѵ�.
	   - ���α׷��� ���� ����
	   - ����ڰ� ���α׷��� �����ϸ� ���� ���� main()�Լ��� ã�Ƽ� �����Ų��
	   - main() �Լ��� ������ �߰�ȣ{}�� �����ȴ�
	   
	  # �Լ���?
	   - ��ܾ�ڿ� () �� �ִ� ���� �Լ���� �Ѵ�
	   
	  # �ܼ��̶�?
	   - ���ڸ� ������ ���� ȭ���� ���Ѵ� (���� ��ǻ�� ȭ��)
	   - CMOD���� �Ϳ��� ����Ǵ� ȭ���� ���Ѵ�
	   - Eclipse������ �׽�Ʈ������ �Ͼ������ �ܼ��� �����Ѵ�(Ctrl + F11 �̿�)
	   - �츮�� ���� �ҽ� �ڵ�(.java)�� �����(.class)�� bin������ ����Ǿ� �ִ�
	  
	  # ; (�����ݷ�)?
	   - �� ��ɾ �������� �˸���
	    	  
	 */
	public static void main(String[] args) { //���α׷�����
		
		/* # System.out.println() �� �Լ�
		  - ()�ȿ� ������ �����͸� �ܼ�(�Ʒ���)�� ����ϴ� �Լ�

		*/
		System.out.println("Hello, World! 1"); //Ctrl + f11
		System.out.println("Hello, World! 2"); 
		System.out.println("Hello, World! 3"); 
		System.out.println("Hello, World! 4"); 
		System.out.println("Hello, World! 5");
		
		System.out.println(12345 + 55);
		System.out.println("12345" + 55);
		
		System.out.println("����������������������������������������");
		System.out.println("��   1. New game    ��");
		System.out.println("��   2. Load game   ��");
		System.out.println("��   3. Exit        ��");
		System.out.println("����������������������������������������");
		
		/*
		  # �ڹ��� �����͵�(���ͷ�)
		   1. "" ���̿� ���� �͵� 	: ���ڿ�(String), ���ڸ� ������ �� �� �ִ� ������ Ÿ��
		   2. '' ���̿� ���� ��		: ����(Character), ���� �� �ϳ��� �� �� �ִ� ������ Ÿ��
		   3. �׳� ���ڸ� ���� ��		: ����(Integer), Ÿ��
		   4. �Ҽ��� ���� ��		: �Ǽ�(Float, Double), Ÿ��
		   5. ��, ���� ���� �� 		: boolean Ÿ��
		 */
		System.out.println("A�����");
		System.out.println('A');
		System.out.println('��');
		System.out.println('��');
		System.out.println('��');
		System.out.println(1000 + 500);
		System.out.println(100.123 + 50.55);
		System.out.println(true);
		System.out.println(false);
		
		// # ���ڵ��� �����δ� ���ڰ��� ������ �ִ�
		//	 �츮 ���� ���ϋ��� ���ڷ� ���̴� ���̴�
		//��, ''Ÿ���� ����ŸĨ���� ��ȯ�� �� �ְ�, ���� Ÿ�Ե� ''Ÿ������ ��ȯ�� �� �ִ�
		// ���ڿ� ������ �����δ� ���� Ÿ���̸� ���� ��굵 �����ϴ�
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'��'); //(int)�� ���� - ������ ���ڰ��� �� �� �ִ�
		System.out.println((char)54621); //(char)�� ���� - ���ڸ� ���ڷ� ���̰� �Ѵ�
		System.out.println((char)54622);
		System.out.println((int)'��');
		System.out.println('A' + 1);
		System.out.println((char)('A' + 1));
		System.out.println((char)('A' + 2));
		System.out.println((int)'a');
		
		// # ���ڿ� Ÿ�԰� �ٸ� Ÿ���� ���ϸ� ����� �ϴ°��� �ƴ϶� �̾���δ�
		System.out.println("'A'�� �������� ��� : " + 'A');
		System.out.println("'1'�� �ڵ尪 : " + (int)'1');
		//���ڿ�Ÿ��('A'�� �������� ��� :) �� ����Ÿ��('A')�̱� ������ �̾����
		System.out.println("1" + 5); //���ڿ� + ����
		System.out.println('1' + 5); //����(�ڵ尪) + ����
		System.out.println(1 + 5); //���� + ����
		
		// # ���� + �Ǽ��� �Ǽ��� �ȴ�
		System.out.println(10 + 10.0);

		// # ���� + ���ڴ� ������ �ȴ�
		System.out.println('a' + 10);
		System.out.println((char)('a' + 10));
		
		
		
	}//���α׷���
	
}
