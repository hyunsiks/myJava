package quiz;

public class B16_RandomSecretKey {

	public static void main(String[] args) {
		
		/*
		  # 4자리의 랜덤 임시비밀번호를 생성하는 프로그램을 만들어보세요
		  (비밀번호를 구성하는 문자는 영어 대문자와 숫자입니다)
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
