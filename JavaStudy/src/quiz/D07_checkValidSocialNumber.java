package quiz;

public class D07_checkValidSocialNumber {

	/*
	  ����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ� 
	  �� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��ϴ� ���α׷�
	 
	  �Ǿ� 2�ڸ� ��
	  ���ڸ��� 01~12 �̳��� ����
	  ���ڸ��� 01~31 
	  7��°�ڸ� '-'
	  8��°�ڸ� 1,2,3,4
	 */
	String registrationNumber;
	int thirtyone;
	int thirty;
	
	public static void main(String[] args) {
		
		D07_checkValidSocialNumber ch = new D07_checkValidSocialNumber();
		if(ch.check("721212-1927483")) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�");
		}
		if(ch.check("725212-1927483")) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�");
		}
		if(ch.check("720252-1927483")) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�");
		}
		if(ch.check("720212-5927483")) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�");
		}
		if(ch.check("720232-1927483")) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�");
		}
		if(ch.check("000229-1927483")) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�");
		}
	}
	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public boolean check(String registrationNumber) {
		
		this.registrationNumber = registrationNumber;
		
		int len = registrationNumber.length();
		
		char ch;
		
		for(int i = 0; i < len; i++) {					
			
			
			if(len != 14) {
				System.out.println("[error] ���̰� �ùٸ��� �ʽ��ϴ�");
				return false;
			}
			
			ch = registrationNumber.charAt(i);
			
			if(i < 2 && !checkNumeric(ch)) {
				System.out.println("[error] �Ǿ� 2�ڸ��� ���� �ƴѰ��� �ֽ��ϴ�");
				return false;
			}else if(i==2 && (ch != '0' && ch != '1')) {
				System.out.println("'��' �� �߸�ǥ���߽��ϴ�");
				return false;
			}else if(i==3 && !checkNumeric(ch)){
				System.out.println("[error] 4��° �ڸ��� ���� �ƴѰ��� �ֽ��ϴ�");
				return false;
			}else if(i==4 && !(ch == '0' || ch == '1' || ch == '2' || ch == '3')) {
				System.out.println("'��'�� �߸�ǥ���߽��ϴ�");				
				return false;
			}else if(i==5 && !checkNumeric(ch)) {
				System.out.println("[error] 6��° �ڸ��� ���� �ƴѰ��� �ֽ��ϴ�");
				return false;
			}else if(i==6 && ch != '-') {
				System.out.println("'-' ǥ�ð� �ùٸ��� �ʽ��ϴ�");
				return false;
			}else if(i==7 && !(ch == '1' || ch == '2' || ch == '3' || ch == '4')) {
				System.out.println("[error] ���ڸ� ù° ���ڰ� �߸��Ǿ����ϴ�");
				return false;
			}else if(i >= 8 && !checkNumeric(ch)) {
				System.out.println("[error] ���ڸ��� ���� �ƴѰ��� �ֽ��ϴ�");
				return false;
			}
		}
		
		if(month(registrationNumber) == 31 && registrationNumber.charAt(4) == '3') {
			if(registrationNumber.charAt(5) != '1' && registrationNumber.charAt(5) != '0') {
				System.out.println("31�� �������� �����ϴ�");
				return false;
			}
		}
		if(month(registrationNumber) == 30 && registrationNumber.charAt(4) == '3') {
			if(registrationNumber.charAt(5) != '0') {
				System.out.println("30�� �������� �����ϴ�");
				return false;
			}
		}
		String year = "";
		
		if(registrationNumber.charAt(0) != '0' && registrationNumber.charAt(0) != '1'){
			
			year = "19" + registrationNumber.charAt(0) + registrationNumber.charAt(1);
		}else {
			year = "20" + registrationNumber.charAt(0) + registrationNumber.charAt(1);
		}
		
		int intYear;
		intYear = Integer.parseInt(year);
		
		if(month(registrationNumber) == 28) {
			if(registrationNumber.charAt(4) == '3') {
				System.out.println("�� ������ �ʰ��Ͽ����ϴ�");
				return false;
			}
			if(intYear % 400 == 0 || ( intYear % 4 == 0 && intYear % 100 != 0)){
				if(registrationNumber.charAt(4) == '3') {
					System.out.println("�����̱� ������ ��¥�� �߸��Ǿ����ϴ�");
					return false;
				}
				if(registrationNumber.charAt(4) == '2' && registrationNumber.charAt(5) == '9') {
					System.out.println("�����̱� ������ ��¥�� �߸��Ǿ����ϴ�");
					return false;
				}
		    }
		}
		
		
		return true;			
	}
	
	int month(String registrationNumber) {
		//1,3,5,7,8,10,12 31��
		//4,6,9,11 30��
		//2�� ����
	
		if(registrationNumber.charAt(3) == '4' ||  registrationNumber.charAt(3) == '6' ||registrationNumber.charAt(3) == '9' ||
				(registrationNumber.charAt(3) == '1' && registrationNumber.charAt(2) == '1')) {
				return 31;
		}else if(registrationNumber.charAt(3) == '2') {
			return 28;
		}else {
			return 30;
		}
	}
	
}
