package quiz;

public class B16_RandomSecretKey {

	public static void main(String[] args) {
		
		/*
		  # 4�ڸ��� ���� �ӽú�й�ȣ�� �����ϴ� ���α׷��� ��������
		  (��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�)
		 */
		StringBuilder sb = new StringBuilder();
		String secretKey = "";
		int count = 0;
		for(int i = 0; count < 4; i++) {
			int key = (int)(Math.random() * 43 + 48);
			
			if((key >= 48 && key <= 57) || (key >= 65 && key <= 90)) {
				count++;
				sb.append((char)key);				
			}			
		}
		System.out.println(sb.toString());
		//48 ~ 57(0~9)
		//65 ~ 90(A~Z)

		

	}

}
