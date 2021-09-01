
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D12_SimpleDateFormat {

	/*
	 	# SimpleDateFormat Ŭ����
	 	
	 	 - �����ϰ� ��¥ �ν��Ͻ��� ���ڷ� ��ȯ�� �� �ִ� Ŭ����
	 	 - ��ҹ��� ������ ���ؾ��Ѵ�
	 	 
	 	# ��¥ ����
	 	
	 	 - y : ��
	 	 - M : ��
	 	 - d : ��
	 	 - D : �� ���� ���� ��(1~365)
	 	 - H : 24��
	 	 - h : 12��
	 	 - m : ��
	 	 - s : ��
	 	 - E : ����
	 	 - a : ����/����
	 	 - w : Day Of Week in Year (1���� ���° ����) 
	 	 - W : Day of Week in Month (1���� ���° ����)
	 */
	
	public static void main(String[] args) {
		
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd (DDD) a HH:mm:ss.SSS E");
		
		System.out.println(f1.format(Calendar.getInstance().getTime()));
	}

}
