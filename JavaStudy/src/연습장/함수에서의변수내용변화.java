package ������;

import java.util.HashSet;

public class �Լ������Ǻ������뺯ȭ {

	public static void main(String[] args) {
		
		int int_a = 20;
		int int_b = 30;
		String string_a = "�ٺ�";
		String string_b = "õ��";
		HashSet<Integer> hash_a = new HashSet<>();
		HashSet<Integer> hash_b = new HashSet<>();
		
		hash_a.add(10); hash_a.add(20);	hash_a.add(30);
		hash_b.add(30);	hash_a.add(40);	hash_a.add(50);
		
		System.out.println(plus(int_a, int_b));
		System.out.println("plus �� int_a�� �� : " + int_a); //�ٲ����������(���� �����Ͽ� �����ϱ� ������ ���� ���빰�� �״����)
		
		System.out.println(plus2(string_a, string_b));
		System.out.println("plus �� String_a�� �� : " + string_a);//�ٲ����������(�ּҸ� ����������, StringŬ�������� final�� �پ��ֱ� ������ ������)
		
		System.out.println(plus3(hash_a, hash_b));
		System.out.println("plus �� hash_a�� �� : " + hash_a); //�ٲ������(������������ �ּ�����)
		
		//�ҹ��ڷ� ���۵Ǵ� (�⺻��)Ÿ�Ե��� �Ű������� ������ �� '��' �� �����Ͽ� �����Ѵ�
		//ex) int ���� ���� ���� ���������ϴ°��̱� ������ �ּҿ� �ִ� ���� �״�δ�
		
		//�빮�ڷ� ���۵Ǵ� (������)Ÿ��(String����)���� �Ű������� ������ �� '�ּ�' �� �����Ͽ� �����Ѵ�
		//ex) set ���� ���� �ּҸ� �����ϱ� ������ �ּҾ��� ���� �ٲ���ִ�
	}
	public static int plus(int a, int b) {
		a += b;
		return a;
	}
	public static String plus2(String a, String b) {
		//String�� ���� ��ȭ��ų�� ����
		//+=�� �Ҷ� �˾Ƽ� ���ο� String �ν��Ͻ��� �����ϵ��� ����Ǿ��ִ�
		a += b;
		return a;
	}
	public static HashSet plus3(HashSet a, HashSet b) {
		
		a.addAll(b);
		
		return a;
	}
	

}
