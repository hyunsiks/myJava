package quiz;

public class B05_TypeCasting {

	public static void main(String[] args) {

	/*
	 	# Ÿ�� ĳ����
	 	
	 	 - Ÿ���� �ڿ������� ���ϴ� ��� (Ÿ���� ���ϴ��� ������ ���� ��)
	 	 - Ÿ���� ������ ��ȯ���Ѿ� �ϴ� ��� (Ÿ���� ���ϸ� ������ ���� ��)
	 	 
	 	# Ÿ���� ũ��
	 	
	 	 - ���� Ÿ�� : byte(1) < char, short(2) < int(4) < long(8)
	 	 - �Ǽ� Ÿ�� : float(4) < double(8)	 
	 	 
	 	 *���� Ÿ���� ������ �Ǽ�Ÿ�� ���� �۴�
	 */
		
	// 1. �ڿ������� Ÿ�� ĳ����
		byte _byte = 127;
		short _short;
		int _int;
		float _float;
		long _long;
		
		_int = _byte;
		_long = _int;
		_float = _long;
		
	// 2. ���� �ջ�� ������ �ִ� Ÿ�� ĳ����
		_int = 50000;
//		_short = _int; //int�� short���� �Ѿ�� ���ڰ� ��������� ���� �ջ�� �� �ֱ� ������ ��� ����
		_short = (short)_int; //�̷������� ������ Ÿ��ĳ������ �� �� �ִ�
		
		System.out.println(_short);
		int round = (int)Math.round(10.3);
		
	// 3. ���� ���̴��� �ٸ��� �ؼ� �� �� �ִ� Ÿ���� ��� Ÿ�� ĳ������ �ʿ��ϴ�
		int a = 80;
		char ch = 'Z';
		System.out.println((char)a);
		System.out.println(a);
		System.out.println((int)ch);
		System.out.println(ch);
		System.out.println(ch > 'A');//�ƽ�Ű�ڵ�ǥ �� A = 65, Z = 90
		System.out.println(ch > 'a');//�ƽ�Ű�ڵ�ǥ �� a = 97
		//�ڵ�ǥ�� �ܿ� �ʿ䰡 ����(charŸ�Կ� ���ڸ� ����� ������ ����)
		
		
	}

}
