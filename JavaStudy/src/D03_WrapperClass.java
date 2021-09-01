

public class D03_WrapperClass {

	
	/*
	 	# Wrapper Class
	 	
	 	 - �⺻ Ÿ�Ե��� ������ Ÿ������ ����ϱ� ���� Ŭ����
	 	 - �� Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
	 	 
	 	# �⺻�� Ÿ�� �̸�
	 	
	 	 - byte, short, char, int, long, float, double
	 	 
	 	# ������ �̸�
	 	
	 	 - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
		
	
	public static void main(String[] args) {
	
		Integer i = Integer.valueOf(10);
		Integer i2 = new Integer(10); //����ٱ׾������� ����Ҽ��� ������ ���� ��õ���� �ʰ� �������� �ʰڴٴ°�
		
		// # parse �ø��� (��Ʈ���� ��Ʈ������, ��Ʈ���� ������ �ٲٴµ� ����)
		//	- ���ڿ��� ���ϴ� Ÿ������ ��ȯ����Ű�� ���
		//	- �� Ÿ�Կ� ����ƽ �޼���� �����Ѵ�
		//	- �����͸� �ְ� �������� ��� ���ڿ��� ��ȯ�Ͽ� ���۵Ǵ� ��찡 ����
		//	- �ٽ� ����ϱ� ���ؼ��� ���� �����͸� ������ Ÿ������ �ǵ����� �Ѵ�
		//	- radix�� �����ִ� �����ε��� ������ �ǹ��Ѵ�
		
		try {
			int a = Integer.parseInt("1234ABC", 16);
			System.out.println(a); 
		}catch(NumberFormatException e) {
			System.out.println("int�� ��ȯ�� �� ���� ���ڿ��̾����ϴ�...");
		}		
		System.out.printf("%.9f\n", Double.parseDouble("123.123456789"));
		System.out.println(Boolean.parseBoolean("tRuE"));
		
		// # toString() �ø���
		//	- �ش� Ÿ���� ���� �ս��� ���ڿ��� ��ȯ�� �� �ִ�
		//	- toString�� Object�� �޼����̱� ������ ��� Ŭ������ �����Ѵ�
		//	- �ν��Ͻ� �޼��� toString()�� �ش� �ν��Ͻ��� ���� ���ڿ��� ��ȯ�Ѵ�
		//	- ����ƽ �޼��� toString()�� ������ ���� ���ڿ��� ��ȯ�Ѵ�
		int num = 12;
		System.out.println(Integer.toString(num, 2)); //������ �ٲ�
		System.out.println(Integer.toString(num, 8));
		System.out.println(Integer.toString(num, 16));
		System.out.println(Character.toString('A'));
		
//		num.toString //int������ �ȵ�
		Integer num2 = 10;
		num2.toString(); //Integer������ ��
		
		/*
		   # typeValue() �ø���
		   
		    - �ش� �ν��Ͻ� ���� ���ϴ� Ÿ���� ������ �ս��� �����ϴ� �޼���
		    - Ÿ��ĳ������ ������ ����(������ -> �⺻��)
		 */
		Integer num3 = 10000000;
		
		System.out.println(num3.byteValue());
		System.out.println(num3.shortValue());
		System.out.println(num3.floatValue());
		System.out.println(num3.doubleValue());
		
	}

}
