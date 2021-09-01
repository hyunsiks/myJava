package quiz;

import java.util.Scanner;

public class D07_checkValidPhoneNumber {

	/*
	  ����ڷκ��� �ڵ�����ȣ�� �Է¹�����
	  �ùٸ� ��ȭ��ȣ���� �����ϴ� ���α׷��� ��������
	  
	  ���� 3�ڸ��� '����' 
	  �ι�° ���ڴ� 3�ڸ� Ȥ�� 4�ڸ�
	  ����° ���ڴ� 4�ڸ�
	  4��° �Ǵ� 8��° �Ǵ� 9��° ���ڴ� '-'
	 */
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		D07_checkValidPhoneNumber pn = new D07_checkValidPhoneNumber();
		
		pn.checkNumber("010-123-1234");
		pn.checkNumber("010-1234-1234");
		pn.checkNumber("010-12345-123");
	}
	
	
	public void checkNumber (String number) {		
		
		int count = 0;
		
		while(true) {			
			try {
				for(int i = 0; i < 3; i++) { //3��°���� �������� �ƴ���Ȯ��
				
					Integer.parseInt(Character.toString(number.charAt(i)));
					count++;					
				}
				if(count == 3) {
					count = 0;
					break;
				}else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
					System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
					number = sc.next();
				}
			}catch(NumberFormatException e) {
				System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
				System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
				number = sc.next();
			}			
		}
		
	
		while(true) {
			
			if(number.charAt(3) == '-') { //4��°�� - �̾����
				break;
			}else {
				System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
				System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
				number = sc.next();
			}
		}
		
		while(true) { //�߰� 3���� 4���� ���ڿ�����
			try {
				for(int i = 4; i < 7; i++) { //3��°���� �������� �ƴ���Ȯ��
				
//					System.out.println(number.charAt(i) - '0');
//					System.out.println(Integer.parseInt(Character.toString(number.charAt(i))));
					if(number.charAt(i) - '0' == Integer.parseInt(Character.toString(number.charAt(i)))) {
						count++;;
					}			
				}
				if(count == 3) {
					count = 0;
					break;
				}else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
					System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
					number = sc.next();
				}
			}catch(NumberFormatException e) {
				System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
				System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
				number = sc.next();
			}			
		}
		
		 //������ -
		while(true) {
			try {
				if(number.charAt(7) == '-' ||	number.charAt(7) - '0' == Integer.parseInt(Character.toString(number.charAt(7)))) {
					break;
				}else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
					System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
					number = sc.next();
				}
			}catch(NumberFormatException e) {
				System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
				System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
				number = sc.next();	
			}
		}
		//������ ���� 4�ڸ�
		if(number.charAt(7) == '-') {
			while(true) {			
				try {
					for(int i = 8; i < 12; i++) { 
					
						if(number.charAt(i) - '0' == Integer.parseInt(Character.toString(number.charAt(i)))) {
							count++;
						}			
					}
					if(count == 4) {
						count = 0;
						break;
					}else {
						System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
						System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
						number = sc.next();
					}
				}catch(NumberFormatException e) {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
					System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
					number = sc.next();
					new D07_checkValidPhoneNumber().checkNumber(number);
					break;
				}			
			}
			System.out.println("���������� ��ȣ�� �ԷµǾ����ϴ�");
			System.out.println("�Է��ϽŹ�ȣ : " + number);
		}else {
			boolean judge = true;
			while(judge) {
				if(number.charAt(8) == '-') {
					while(true) {		
						try {
							for(int i = 9; i < 13; i++) { 
							
								if(number.charAt(i) - '0' == Integer.parseInt(Character.toString(number.charAt(i)))) {
									count++;
								}			
							}
							if(count == 4) {
								count = 0;								
								System.out.println("���������� ��ȣ�� �ԷµǾ����ϴ�");
								System.out.println("�Է��ϽŹ�ȣ : " + number);
								judge = false;
								break;
							}else {
								System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
								System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
								number = sc.next();
							}
						}catch(NumberFormatException e) {
							System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
							System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
							number = sc.next();
						}
						System.out.println("���������� ��ȣ�� �ԷµǾ����ϴ�");
						System.out.println("�Է��ϽŹ�ȣ : " + number);
						judge = false;
					}
				}else {
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�");
					System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
					number = sc.next();
					new D07_checkValidPhoneNumber().checkNumber(number);
					break;
				}
			}
		}
	}
}
