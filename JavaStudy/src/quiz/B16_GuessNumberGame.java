package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_GuessNumberGame {

	public static void main(String[] args) {
		
		/*
		 	# ������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�
		 	1 �÷��̾�� 8���� �õ��� �� �� �ִ�
		 	2 �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�
		 		- ���ڿ� ��ġ�� �� ������� - strike
		 		- ���ڸ� ������� - ball
		 	3 �ٸ��߸� ������� ���߾����� �˷��ش�
		 */
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int i = 0;
		int turn = 1;
		int strike = 0, ball = 0;
		String value = "";
		String userInput = "";
		while(i < 4) { //4�ڸ� ������ �����
			int random = ran.nextInt(9) + 1;
			value += random;
			i++;
		}
		System.out.println("value���� = " + value);
		
		for(i = 0; i < 8; i++) {
			System.out.printf("%d��° �õ��� �ϼ���", turn);
			userInput = sc.next(); //������ ���� ����� �ִ°�
			
			for(int j = 0; j < userInput.length(); ++j) { //����� ���� ���� ó������ �ϳ��� strike, ball ����������
				if(userInput.charAt(j) == value.charAt(j)) { //strike���� �˾ƺ�������
					strike++;
				}else {				//strike�� �ƴҶ� ball�� �ִ��� �˾ƺ�������
					for(int k = 0; k < 4; ++k) { // strike�� �ƴҶ� 0 ~ 4 ��°���� �����ϱ�����
						if(j != k) {	//j=k �̸� strike�� �ǹǷ� �ƴҶ��� �˻�
							if(userInput.charAt(j) == value.charAt(k)){
								ball++;								
							}
						}
					}
				}
			}
			if(strike == 4) {
				System.out.println("������ ���߾����ϴ�!");
				break;
			}
			System.out.printf("%d��Ʈ����ũ, %d�� �Դϴ�.\n",strike, ball);
			strike = 0;
			ball = 0;
			turn += 1;			
		}
		
	}

}
