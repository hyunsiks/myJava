package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

/*
   ��(1, 6) ȭ(2,7) ��(3,8) ��(4,9) ��(5, 0) ������(�ٵ�), ��������(�����,���Ƶ���,����)
     
 */

public class D11_CarNumber {

	LocalDate today;
	DayOfWeek dayOfWeek;
	LocalDate day;
	
	public static void main(String[] args) {
		
		D11_CarNumber cn = new D11_CarNumber();
		cn.checkNumber("1236");
	}
	
	public D11_CarNumber() {
		today = LocalDate.now().plusDays(51);
		dayOfWeek = today.getDayOfWeek();
		day = LocalDate.of(today.getYear(), today.getMonth(), today.getDayOfMonth());
	}
	
	boolean checkNumber(String carNum) {
		
		System.out.println("���ó�¥ : " + day);
		
		char lastNum = carNum.charAt(3);
		
		if(holiday(dayOfWeek)) {
			System.out.println("������ �������̹Ƿ� �����������");
			return true;
		}
		
		if((lastNum - '0') % 5 == 1) {
			if(dayOfWeek == DayOfWeek.MONDAY) {
				System.out.println("�������ѿ���");
				return false;
			}
		}else if((lastNum - '0') % 5 == 2) {
			if(dayOfWeek == DayOfWeek.TUESDAY) {
				System.out.println("�������ѿ���");
				return false;
			}
		}else if((lastNum - '0') % 5 == 3) {
			if(dayOfWeek == DayOfWeek.WEDNESDAY) {
				System.out.println("�������ѿ���");
				return false;
			}
		}else if((lastNum - '0') % 5 == 4) {
			if(dayOfWeek == DayOfWeek.THURSDAY) {
				System.out.println("�������ѿ���");
				return false;
			}
		}else if((lastNum - '0') % 5 == 0) {
			if(dayOfWeek == DayOfWeek.FRIDAY) {
				System.out.println("�������ѿ���");
				return false;
			}
		}
		System.out.printf("������ '%s' �� '%s' ������ ���԰����մϴ�", dayOfWeek, carNum);
		return true;
	}
	
	boolean holiday(DayOfWeek dayofweek) {
		
		if(dayofweek == DayOfWeek.SATURDAY || dayofweek == DayOfWeek.SUNDAY) {
			return true;
		}
	
		LocalDate ���� = LocalDate.of(today.getYear(), 1, 1);
		LocalDate ������ = LocalDate.of(today.getYear(), 3, 1);
		LocalDate ��̳� = LocalDate.of(today.getYear(), 5, 5);
		LocalDate ��ó�Կ��ų� = LocalDate.of(today.getYear(), 5, 19);
		LocalDate ������ = LocalDate.of(today.getYear(), 6, 6);
		LocalDate ������ = LocalDate.of(today.getYear(), 8, 15);
		LocalDate ��õ�� = LocalDate.of(today.getYear(), 10, 3);
		LocalDate �ѱ۳� = LocalDate.of(today.getYear(), 10, 9);
		LocalDate ũ�������� = LocalDate.of(today.getYear(), 12, 25);
		
		if(day.equals(����) || day.equals(������) || day.equals(��̳�) || day.equals(��ó�Կ��ų�) ||
		   day.equals(������) || day.equals(������) || day.equals(��õ��) || day.equals(�ѱ۳�) ||
		   day.equals(ũ��������)) {
			return true;
		}
		return false;
	}

}
