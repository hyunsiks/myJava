package ������;

public class String����Int�����ιٲٱ� {

	public static void main(String[] args) {
	
		String a = "123";
		String b = "456";
		String c = "ab";
		//Integer.parseInt() �μ� ��Ʈ�� Ÿ���� ��ƮŸ������ �ٲܼ��ִ�
//		System.out.println(Integer.parseInt(c)); �׷��� ��Ʈ��(c)ó�� ��Ʈ������ ���ڰ� �ƴ� �����̸� intŸ������ �ٲܼ� ����(����)
		
		System.out.println(a + b);
		System.out.println(Integer.parseInt(a) + b);
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));

	}

}
