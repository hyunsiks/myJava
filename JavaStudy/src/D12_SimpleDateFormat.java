
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D12_SimpleDateFormat {

	/*
	 	# SimpleDateFormat 클래스
	 	
	 	 - 간편하게 날짜 인스턴스를 문자로 변환할 수 있는 클래스
	 	 - 대소문자 구별을 잘해야한다
	 	 
	 	# 날짜 서식
	 	
	 	 - y : 년
	 	 - M : 월
	 	 - d : 일
	 	 - D : 월 구분 없는 일(1~365)
	 	 - H : 24시
	 	 - h : 12시
	 	 - m : 분
	 	 - s : 초
	 	 - E : 요일
	 	 - a : 오전/오후
	 	 - w : Day Of Week in Year (1년중 몇번째 요일) 
	 	 - W : Day of Week in Month (1달중 몇번째 요일)
	 */
	
	public static void main(String[] args) {
		
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd (DDD) a HH:mm:ss.SSS E");
		
		System.out.println(f1.format(Calendar.getInstance().getTime()));
	}

}
