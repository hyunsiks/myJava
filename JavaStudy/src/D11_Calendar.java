
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class D11_Calendar {

	/*
	 	# Date, Calendar, Time
	 
	 	 - �ڹٷ� ��¥�� �ð� �ٷ�� Ŭ����
	 */
	public static void main(String[] args) {
		
		// �ý����� ���н� Ÿ���� �������� �޼���
		// �� ���н�Ÿ�� - 1970�� 1�� 1�� ���ķ� �ð��� �� �и��ʳ� �귶���� ����
		// System.currentTimeMillis()
		System.out.println("1970�� 1�� 1�� ���ķ�.." +
				System.currentTimeMillis() + "�и��� �귶���ϴ�");
		System.out.println("1970�� 1�� 1�� ���ķ�.." +
				System.currentTimeMillis()/1000 + "�� �귶���ϴ�");
		System.out.println("1970�� 1�� 1�� ���ķ�.." +
				System.currentTimeMillis()/1000/60 + "�� �귶���ϴ�");
		System.out.println("1970�� 1�� 1�� ���ķ�.." +
				System.currentTimeMillis()/1000/60/60 + "�ð� �귶���ϴ�");
		System.out.println("1970�� 1�� 1�� ���ķ�.." +
				System.currentTimeMillis()/1000/60/60/24 + "�� �귶���ϴ�");
		System.out.println("1970�� 1�� 1�� ���ķ�.." +
				System.currentTimeMillis()/1000/60/60/24/365 + "�� �귶���ϴ�");
		
		/*
		   Date (java.util.date)
		    - Date Ŭ���� ������ �޼������ ���� ���������� ���� ������Ʈ�� �ߴܵǾ� �ִ�
		    - �ð��� ��� �Ҷ��� �ٸ� Ŭ������ ����� ���� �����Ѵ�
		    - Date Ŭ������ �ַ� �ð� �ν��Ͻ��� �����ϴ� �뵵�θ� ����Ѵ�(�ð��� �ű涧 dateŸ������ �ٲ㼭 �����°�찡����)
		 */
		Date now = new Date();
		System.out.println(now);
		
		/*
		   Calendar
		   
		    - �޷��� ǥ���� Ŭ����
		    - ��¥�� ���� �Ի��� �� �ִ� ��ɵ��� ���ִ�
		    - �ð��� ������ �� �����ڰ� �ƴ� getInstance() ����ƽ �޼��带 ����Ѵ�
		    - getInstance() �޼��忡 �浵�� ��Ÿ���� TimeZone�� ������ �� �ִ�
		    
		   TimeZone
		   
		    - ���� ������ ������ �����ϰ� �ִ� Ŭ����
		    - getAvailiableIDS() ����ƽ �޼��带 ���� ����� �� �ִ� Ÿ�������� �� �� �ִ�
		 */
		for(String zoneId : TimeZone.getAvailableIDs()) {
			System.out.println(zoneId);
		}
		
		// Calendar�� ����� �ð� �� ���ϴ� ���� get() �޼��带 ���� ���� �� �ִ�
		// Date Ÿ������ ��ȯ�ϸ� ������ �������		
		Calendar korea = Calendar.getInstance(); //abstractŬ������ ���� ä���������� �޼��尡 ���⶧���� new�� ����
		System.out.println("�ѱ�����ð� : " + korea.get(Calendar.HOUR));
				
		Calendar new_york = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		System.out.println("��������ð� : " + new_york.get(Calendar.HOUR));
		
		int year = korea.get(Calendar.YEAR);
		int month = korea.get(Calendar.MONTH) + 1; //month�� 0���� ���۵Ǳ� ������ +1 �������
		int date = korea.get(Calendar.DATE);
		
		//korea.getTimeZone().getID(); : korea�� ID
		System.out.printf("%s : %d/%d/%d\n",korea.getTimeZone().getID(), year, month, date);
		
		int minute = korea.get(Calendar.MINUTE);
		int second = korea.get(Calendar.SECOND);
		int millisec = korea.get(Calendar.MILLISECOND);
		System.out.printf("%d:%d.%03d\n", minute, second, millisec);
		
		//Calendar.ERA�� �ʵ����̰�, GregorianCalendar.AD�� .BC�� ����̴�
		int era = korea.get(Calendar.ERA); //��������� �ƴ��� 0��1�γ�Ÿ��
		//Calendar.AM_PM�� �ʵ����̰�, Calendar.AM�� .PM�� ����̴�
		int am = korea.get(Calendar.AM_PM); //AM���� PM���� 0��1�γ�Ÿ��
		System.out.println(era); //������̸� 0 �ƴϸ� 1
		System.out.println(era == 1? "AD" : "BC"); 
		System.out.println(era == GregorianCalendar.AD? "AD" : "BC"); //GregorianCalendar.AD�� ��� 0���� �����Ǿ��ִ�
		System.out.println(am); //AM�̸� 0 PM�̸� 1
		System.out.println(am == Calendar.AM? "AM" : "PM"); 
		
		// Calendar�� ����� �ð��� set() �޼��带 ���� ������ �� �ִ�
		korea.set(Calendar.HOUR_OF_DAY, 15);	
		int hour = korea.get(Calendar.HOUR); //12�ð�¥��
		int hourOfDay = korea.get(Calendar.HOUR_OF_DAY); //24�ð�¥��
		
		
		int doy = korea.get(Calendar.DAY_OF_YEAR);
		int dom = korea.get(Calendar.DAY_OF_MONTH);
		int dow = korea.get(Calendar.DAY_OF_WEEK);
		int dowim = korea.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.println("DAY_OF_YEAR : " + doy); //�̹��⵵ ���� �ϼ�
		System.out.println("DAY_OF_MONTH : " + dom); //�̹��� ���� �ϼ�
		System.out.println("DAY_OF_WEEK : " + dow); //�̹��� ���� �ϼ�, ����
		System.out.println("DAY_OF_WEEK_IN_MONTH" + dowim); //�̹��޿� �ش� ������ ���°����
		
		//������ ����� ǥ�õȴ�
		System.out.println("Calendar.SUNDAY : " + Calendar.SUNDAY);
		System.out.println("Calendar.MONDAY : " + Calendar.MONDAY);
		System.out.println("Calendar.TUESDAY : " + Calendar.TUESDAY);
		System.out.println("Calendar.WEDNESDAY : " + Calendar.WEDNESDAY);
		System.out.println("Calendar.THURSDAY: " + Calendar.THURSDAY);
		System.out.println("Calendar.FRIDAY : " + Calendar.FRIDAY);
		System.out.println("Calendar.SATURDAY : " + Calendar.SATURDAY);
		
		
		
	}
}
