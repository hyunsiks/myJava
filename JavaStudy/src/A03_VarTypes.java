

public class A03_VarTypes {
	
	public static void main(String[] args){
		
	/*
		# ���� Ÿ��
		 - byte	 : (1byte) -128 ~ 127
		 	1byte => 8bit : 2^8 ��, 256���� ��ȣ��(0,1 ������)
		 	0000 0000 ~ 1111 1111 ���� ��Ÿ�� �� �ִ� ��
		 	* ù��° bit�� ��ȣ ��Ʈ�� ���ȴ�
		 	byteŸ���� ��� ���� 0000 0000(0) ~ 0111 1111(127)
		 	byteŸ���� ���� ���� 1000 0000(-128) ~ 1111 1111(-1)
		 	
		 - short : (2byte) - ��ȣ���ִ�, signed
		  	2^16 - 65536���� 
		  	������� 0 ~ 32767 �������� -32768 ~ -1
		  	
		 - char	 : (2byte) - ��ȣ������, unsigned
		 	2byte -> short�� ���� 65536���� ������
		 			 ����� ��Ÿ���� ������ 0 ~ 65535�� ����� ��Ÿ��

		 - int	 : (4byte) 2^32 - ��43�� �����߶� ���, ����

		 - long	 : (8byte) 2^64 - ���ǹ��Ѱ������
		
	*/
		byte a = 127; //128, -129 ���� ������ ���� 
		short b = 32767; //32768, -32769 ���� ������ ����
		char c = 65535; //65536, -1���� ������ ����
		int d = 10;
		long e = 10;
		
		byte maxbyte = 127;
		byte minbyte = -128;
		System.out.println("byteŸ�Կ� ������ �� �ִ� ���� ū ���� : " + maxbyte + "�̰�, ���� ���� ���� " + minbyte + "�Դϴ�.");
		
		short maxshort = 32767;
		short minshort = -32768;
		System.out.println("shortŸ�Կ� ������ �� �ִ� ���� ū ���� : " + maxshort + "�̰�, ���� ���� ���� " + minshort + "�Դϴ�.");
		
		char maxchar = 65535;
		char minchar = 0;
		char ch = 65;
		System.out.println("char Ÿ�Կ� ����� ���� �⺻������ ���ڷ� ��µȴ�. " + ch);
		System.out.println("char Ÿ�Կ� ����� �ڵ尪�� Ȯ���ϰ� ������ (int)�� ���δ�. " + (int)ch);
		System.out.println("charŸ�Կ� ������ �� �ִ� ���� ū ���� : " + maxchar + "�̰�, ���� ���� ���� " + minchar + "�Դϴ�.");
		System.out.println("charŸ�Կ� ������ �� �ִ� ���� ū ���� : " + (int)maxchar + "�̰�, ���� ���� ���� " + (int)minchar + "�Դϴ�.");
		
		int maxint = 2_147_483_647;
		int minint = -2_147_483_648;
		System.out.println("intŸ�Կ� ������ �� �ִ� ���� ū ���� : " + maxint + "�̰�, ���� ���� ���� " + minint + "�Դϴ�.");
		
		long _long =  2_147_483_648L;
		//int�� ������ �Ѿ�� ���ڸ� ����� ������ L�� �ٿ��� ��Ÿ������ �ν����ش�.
		
	 /*

		# �Ǽ� Ÿ��
		 - float  (4byte)
		 - double (8byte)
			�Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�
			�ε��Ҽ��� ����� ����Ѵ�
	*/
		//�׳� �Ҽ��� ���� ���� �⺻������ double Ÿ���̴�
		//floatŸ���� �Ҽ��� �ڿ� F�� �ٿ��� �Ѵ�
		float weight = 54.55F; //F�� �ҹ��ڷ� f�� ����
		double height = 179.23;
	/*		
		# ��,���� Ÿ��
		 - boolean
			���� ������ ǥ���ϴµ��� ���Ǵ� Ÿ��
			���� true�� false �ۿ� ����
	*/
		boolean hasfood = true;
		boolean over130cm = false;
	/*		
		# ������ Ÿ�� (Ŭ���� Ÿ��)
		 ������ Ÿ���� �ٸ� �⺻�� Ÿ�Ե���� �ٸ��� �빮�ڷ� ����
		 - String : ���ڿ�
		 - �� �� ��� Ŭ������ .. ex)Scanner
	 */
		String hellomessage = "Hello, My name is Jhon Doe.";
		String byemessage = "Good bye. ";
		System.out.println(hellomessage);
		System.out.println("hellomessage");
		System.out.println(byemessage + byemessage + byemessage);
		
	}

}
