
import java.util.Scanner;

public class B18_Array2 {

	public static void main(String[] args) {
		
		//�迭 ���ο��� �迭�� ���� �� �ִ�
		int[] num1 = {1, 2, 3, 4, 5, 6};
		int[] num2 = new int[10];
		int[] num3 = new int[] {100, 200, 300, 400};
		
		int[][]arr2 = {num1, num2, num3};
		
		
		System.out.println(arr2[0]); //arr2��� ���߹迭�ȿ� arr2[0]�� �迭 �����ּ�
		System.out.println(num1);	//num1 �� �迭 �����ּ�
		
		//2���� �迭�� �� ����ϱ�
		System.out.println("arr2[][]�� 0���� �迭�� num1[]�� 3���ּ� ���̴� : " + arr2[0][3]);
		System.out.println("arr[1][8]" + arr2[1][8]);
		System.out.println("arr[2][3]" + arr2[2][3]);
		
		//n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�
		for(int i = 0; i < arr2.length; i++) { //arr2.length : �迭�� ����
			System.out.println("####" + i + "��° �迭�� ���� : " + arr2[i].length); //arr2[i]�� �迭����
			
			for(int j = 0; j < arr2[i].length; j++) { //arr2[i]�� ���̸�ŭ j�� ������ arr2[i][j]�� ���� ����ϱ�����
				System.out.printf("arr2[%d][%d] : %d\n", i, j, arr2[i][j]);
			}
		}
		
		//2���� �迭�� Ȱ�� ��
		char[][] block1 = {
				{'��', '��', '��', '��', },
				{'��', '��', '��', '��', },
				{'��', '��', '��', '��', },
				{'��', '��', '��', '��', },

		};
		for(int i = 0; i < block1.length; i++) {
			for(int j = 0; j < block1[i].length; j++) {
				System.out.print(block1[i][j]);
			}
			System.out.println();
		}
		
		//���񸸵��
		Scanner sc = new Scanner(System.in);
		
		int[][] omok = new int[15][15]; //15 x 15 ¥�� �ٵ���
	while(true) {
		System.out.print("��ǥ�� �Է��� �ּ��� : ");
		String point = sc.nextLine();
		
		int x1 = Integer.parseInt(point.split(",")[0].trim());
		int y1 = Integer.parseInt(point.split(",")[0].trim());
		
		
		omok[x1][14 - y1] = 1;	//y���� ������ ��µǴ°Ÿ� �Ʒ��� 0���� ����ϱ� ���� ������
		
		for(int y = 0; y < omok.length; y++) {
			for(int x = 0; x < omok[y].length; x++) {
				
				switch(omok[x][y]) {
				case 0:
					System.out.print('��');
					break;
				case 1:
					System.out.print('��');
					break;
				case 2:
					System.out.print('��');
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
		
		
	}

}
