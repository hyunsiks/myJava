package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
	
	/*
	 ����ڷκ��� �ܾ �ϳ� �Է¹ް� ù��° ���ڿ� ��������° ���ڰ�
	 ��ġ�ϸ� "OK"�� ��� �ƴ϶�� "NOT OK"�� ����غ�����
	 */

	Scanner sc = new Scanner(System.in);
	
	System.out.print("���ڸ� �Է��ϼ��� : ");
	
	//next() : ���� ���ڿ��� �޾ƿ��� (����������� �տ��͸� ������)
	//nextLine() : ���� ������ ���ڿ��� �޾ƿ��� (\n�������� �տ��͸� ������)
	
	String word = sc.nextLine();
	
	int firstWord = word.charAt(0);
	
	int length = word.length();
	
	int lastWord = word.charAt(length - 1);
	
	
	if(firstWord == lastWord) {
		System.out.println("OK");
	}else {
		System.out.println("NOT OK");
	}
	
	}

}
