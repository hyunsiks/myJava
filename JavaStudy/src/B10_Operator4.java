

public class B10_Operator4 {

	public static void main(String[] args) {
		
	/*
	 	# ���� ������	 	
	 	 = : ������ ������ �������� ���� �����Ѵٴ� ��
	 */
		int num = 10;
		num = num + 20; //30
		num = num + 5; //35
		System.out.println(num);
		
	/*
	 	# ���� ���� ������	 	
	 	 - ������ ����� ������Ű�� ������
	 */
		num = 10;
		num += 20;
		num += 5;
		System.out.println(num);
		
	/*
	 	# ���� ������	 	
	 	 - ������ ����� 1�� ������Ű�� ������
	 	 - ++, --�� ��ġ�� ���� ����� �޶�����
	 */
		num = 10;
		num++;
		System.out.println(num);
	
		num = 3;
		System.out.println(num++); //�� ���� ��� ��ɾ �� �����ϰ� +���ش�
		System.out.println(++num); //�� ���� ��ɾ �����Ҷ� �տ� +���ش�
		
	}

}
