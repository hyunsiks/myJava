package ������;

public class char�Ǹ޼ҵ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'a';
		
		Character.isAlphabetic(ch);
		Character.isLetter(ch);
		Character.getType(ch); //�빮������ �ҹ������� int�� ��ȯ(�빮�� 1, �ҹ���2)
	
		System.out.println(Character.isAlphabetic(ch));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.getType(ch));
	}

}
