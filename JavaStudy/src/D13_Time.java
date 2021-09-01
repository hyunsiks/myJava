
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class D13_Time {

	/*
	 	# java.time ��Ű��
	 	
	 	 - Calendar�� �ν��Ͻ��� set()�� ���� ��ȭ��Ų�ٴ� ������ ������ Ŭ����
	 	 
	 	 - java.time ��Ű���� Ŭ�������� �ð��� ����� �� ���ο� �ν��Ͻ��� ��ȯ�ϰ�
	 	   ���� �ν��Ͻ��� �״�� �����Ѵ�
	 	   
	 	 - LocalDate, LocalTime, LocalDateTime�� �ִ�
	 */
	public static void main(String[] args) {
		
//		1. now() : ���� �ð��� �ν��Ͻ��� �����ϴ� �޼���
		
		//LocalDate : ��¥�� �����ϱ� ���� Ŭ����
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//LocalTime : �ð��� �����ϱ� ���� Ŭ����
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		//LocalDateTime : ��¥�� �ð��� ��������ϱ����� Ŭ����(��� T��� delemeter �س��� ©�󾲰��ص�)
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
//		2. of() : ���ϴ� ��¥/�ð��� �ν��Ͻ��� �����ϴ� �޼���
		
		LocalDate childrensDay = LocalDate.of(2021, 5, 5);
		System.out.println(childrensDay);
		LocalTime promise = LocalTime.of(17, 8);
		System.out.println(promise);
		LocalDateTime my_promise = LocalDateTime.of(childrensDay, promise);
		System.out.println(my_promise);
		
//		3. �ð��� �����ϱ�
		
		System.out.println(promise.plusHours(3)); //��ӽð����� 3�ð� ���� �ν��Ͻ��� ��ȯ
		//Calendar ���� ��쿡�� Calendar.set ���� �����ϸ� ������ü�� ����ȴ�
		System.out.println(childrensDay.getMonth());
		System.out.println(childrensDay.getMonthValue());
		System.out.println(childrensDay.minusWeeks(1)); //��������
		
//		4. �ð��� ���ڿ��� ��ȯ�ϱ�
		// ��ü.format(DateTimeFormmater.ofPattern("y�� M�� d��"));
		//- DateTimeFormatter Ŭ������ ���
		//- �پ��� static �޼���� ǥ�ص��� �̿��� ���ڿ� ������ ������ �� �ִ�
		
		// DateTimeFormatter.ofPattern(str) : ���� ���� �����
		System.out.println(childrensDay.format(DateTimeFormatter.ofPattern("y�� M�� d��")));
		
		// .�پ��� ǥ�� �̸��� : ǥ�ػ���ϱ�
		System.out.println(childrensDay.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(childrensDay.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
//		5. �ð� ��ü���� ���ϱ� (isAfter, isBefore)
		LocalDate christmas = LocalDate.of(2021, 12, 25);
		
		System.out.println("2021�� ��̳��� 2021�� ũ������������ ���ΰ���? : " 
				+ childrensDay.isAfter(christmas));
		System.out.println("2021�� ��̳��� 2021�� ũ������������ ���ΰ���? : " 
				+ childrensDay.isBefore(christmas));
	}
}




















