package ������;

import java.util.Random;

public class �ߺ����·������迭����� {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		Random ran = new Random();
		
		for(int i = 0; i < 10; i++) {
			a[i] = ran.nextInt(10) + 1; //a[1]
			for(int j = 0; j < i; j++) { // 0 < 1
				if(a[i] == a[j]) {		//a[4] < a[0],a[1],a[2],a[3]�� a[0]���� �ߺ��� �ȵǴ°��� ���ö����� ��� �ݺ�
					i--;
				}
			}
		}
		for(int b = 0; b < 10; b++) {
			System.out.println(a[b]);
		}
	}

}
