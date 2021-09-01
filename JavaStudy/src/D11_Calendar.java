
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class D11_Calendar {

	/*
	 	# Date, Calendar, Time
	 
	 	 - 자바로 날짜와 시간 다루는 클래스
	 */
	public static void main(String[] args) {
		
		// 시스템의 유닉스 타임을 가져오는 메서드
		// ※ 유닉스타임 - 1970년 1월 1일 이후로 시간이 몇 밀리초나 흘렀는지 센것
		// System.currentTimeMillis()
		System.out.println("1970년 1월 1일 이후로.." +
				System.currentTimeMillis() + "밀리초 흘렀습니다");
		System.out.println("1970년 1월 1일 이후로.." +
				System.currentTimeMillis()/1000 + "초 흘렀습니다");
		System.out.println("1970년 1월 1일 이후로.." +
				System.currentTimeMillis()/1000/60 + "분 흘렀습니다");
		System.out.println("1970년 1월 1일 이후로.." +
				System.currentTimeMillis()/1000/60/60 + "시간 흘렀습니다");
		System.out.println("1970년 1월 1일 이후로.." +
				System.currentTimeMillis()/1000/60/60/24 + "일 흘렀습니다");
		System.out.println("1970년 1월 1일 이후로.." +
				System.currentTimeMillis()/1000/60/60/24/365 + "년 흘렀습니다");
		
		/*
		   Date (java.util.date)
		    - Date 클래스 내부의 메서드들은 요즘 버전에서는 거의 업데이트가 중단되어 있다
		    - 시간을 계산 할때는 다른 클래스를 사용할 것을 권장한다
		    - Date 클래스는 주로 시간 인스턴스를 보관하는 용도로만 사용한다(시간을 옮길때 date타입으로 바꿔서 보내는경우가많다)
		 */
		Date now = new Date();
		System.out.println(now);
		
		/*
		   Calendar
		   
		    - 달력을 표현한 클래스
		    - 날짜를 쉽게 게산할 수 있는 기능들이 모여있다
		    - 시간을 가져올 때 생성자가 아닌 getInstance() 스태틱 메서드를 사용한다
		    - getInstance() 메서드에 경도를 나타내는 TimeZone을 전달할 수 있다
		    
		   TimeZone
		   
		    - 여러 지역의 시차를 보관하고 있는 클래스
		    - getAvailiableIDS() 스태틱 메서드를 통해 사용할 수 있는 타임존들을 볼 수 있다
		 */
		for(String zoneId : TimeZone.getAvailableIDs()) {
			System.out.println(zoneId);
		}
		
		// Calendar에 저장된 시간 중 원하는 값을 get() 메서드를 통해 꺼낼 수 있다
		// Date 타입으로 변환하면 시차가 사라진다		
		Calendar korea = Calendar.getInstance(); //abstract클래스라서 아직 채워지지않은 메서드가 없기때문에 new를 못함
		System.out.println("한국현재시간 : " + korea.get(Calendar.HOUR));
				
		Calendar new_york = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		System.out.println("뉴욕현재시간 : " + new_york.get(Calendar.HOUR));
		
		int year = korea.get(Calendar.YEAR);
		int month = korea.get(Calendar.MONTH) + 1; //month만 0으로 시작되기 때문에 +1 해줘야함
		int date = korea.get(Calendar.DATE);
		
		//korea.getTimeZone().getID(); : korea의 ID
		System.out.printf("%s : %d/%d/%d\n",korea.getTimeZone().getID(), year, month, date);
		
		int minute = korea.get(Calendar.MINUTE);
		int second = korea.get(Calendar.SECOND);
		int millisec = korea.get(Calendar.MILLISECOND);
		System.out.printf("%d:%d.%03d\n", minute, second, millisec);
		
		//Calendar.ERA가 필드상수이고, GregorianCalendar.AD와 .BC는 상수이다
		int era = korea.get(Calendar.ERA); //기원전인지 아닌지 0과1로나타냄
		//Calendar.AM_PM이 필드상수이고, Calendar.AM과 .PM은 상수이다
		int am = korea.get(Calendar.AM_PM); //AM인지 PM인지 0과1로나타냄
		System.out.println(era); //기원전이면 0 아니면 1
		System.out.println(era == 1? "AD" : "BC"); 
		System.out.println(era == GregorianCalendar.AD? "AD" : "BC"); //GregorianCalendar.AD가 상수 0으로 설정되어있다
		System.out.println(am); //AM이면 0 PM이면 1
		System.out.println(am == Calendar.AM? "AM" : "PM"); 
		
		// Calendar에 저장된 시간을 set() 메서드를 통해 수정할 수 있다
		korea.set(Calendar.HOUR_OF_DAY, 15);	
		int hour = korea.get(Calendar.HOUR); //12시간짜리
		int hourOfDay = korea.get(Calendar.HOUR_OF_DAY); //24시간짜리
		
		
		int doy = korea.get(Calendar.DAY_OF_YEAR);
		int dom = korea.get(Calendar.DAY_OF_MONTH);
		int dow = korea.get(Calendar.DAY_OF_WEEK);
		int dowim = korea.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.println("DAY_OF_YEAR : " + doy); //이번년도 지난 일수
		System.out.println("DAY_OF_MONTH : " + dom); //이번달 지난 일수
		System.out.println("DAY_OF_WEEK : " + dow); //이번주 지난 일수, 요일
		System.out.println("DAY_OF_WEEK_IN_MONTH" + dowim); //이번달에 해당 요일이 몇번째인지
		
		//요일은 상수로 표시된다
		System.out.println("Calendar.SUNDAY : " + Calendar.SUNDAY);
		System.out.println("Calendar.MONDAY : " + Calendar.MONDAY);
		System.out.println("Calendar.TUESDAY : " + Calendar.TUESDAY);
		System.out.println("Calendar.WEDNESDAY : " + Calendar.WEDNESDAY);
		System.out.println("Calendar.THURSDAY: " + Calendar.THURSDAY);
		System.out.println("Calendar.FRIDAY : " + Calendar.FRIDAY);
		System.out.println("Calendar.SATURDAY : " + Calendar.SATURDAY);
		
		
		
	}
}
