package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class D11_DiscountDayTeacher {

	public static void main(String[] args) {
		
		int year = 2021;
		printAllEventDays(year);
	}
	public static void printAllEventDays(int year) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy��/M��/d��");

		Calendar event = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		event.set(year, 0, 1, 0, 0);
	
		int count = 1;
		while(event.get(Calendar.YEAR) == year) {
			
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY); //����Ϸ� �ٲٰ�
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2); //�̹��� �ι�° ���Ϸ� ����
			
//			System.out.printf("%d/%d/%d\n", event.get(Calendar.YEAR), event.get((Calendar.MONTH) + 1) , event.get(Calendar.DATE));
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n",count++);
			
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4);
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n",count++);
	
			
			event.add(Calendar.MONTH, 1);
		}
	}	
}
