

public class B17_Array {

	public static void main(String[] args) {
		
	/*
	 # �迭(Array)
	 
	 	- ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
	 	- ���� �̸����� ������ ������ ������ �� �ε����� Ȱ���� �����Ѵ�
	 	- �迭�� �迭.length �� ���� ���̸� �� �� �ִ�
	 		* �Ϲ� length() �� �ٸ����� �迭���� ()�� ���� �ʴ´�
	 	- �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����
	 	- �迭�� ������ ���ÿ� �ʱ�ȭ�� �Ǿ��ִ�(������ �ٸ����̴�)
	 	 (���� : 0/ �Ǽ� : 0.0/ boolean : false/ ������ : null)
	 */
		
		int[] score = new int[100]; //[0] ~ [99]������ �迭
		
		for(int index = 0; index < score.length; ++index) {
			score[index] = (int)(Math.random() * 101);
		}
		System.out.println("10��° �л��� ���� : " + score[9]);		
	
	
	//�������� : Score�� ���հ� ���(�Ҽ� ��° �ڸ�)�� ����غ�����
		int sum = 0;
		for(int index = 0; index < score.length; ++index) {
			sum += score[index];		
		}
		//%.2f ���
		System.out.printf("score�� ������ %d�̰� ����� %.2f �̴�", sum, (double)sum/(score.length));
		System.out.println();
	
		//Math.round ��� ���
		System.out.print("Math.round ����� ��հ� : ");
		System.out.print(Math.round(sum / (double)(score.length) * 100) / 100.0);
	
	/*
	 # �迭�� �����ϴ� ���
	 
	  1. Ÿ��[] �迭�̸� = new Ÿ��[�迭ũ��];
	  2. Ÿ��[] �迭�̸� = {��1, ��2, ��3 ...};
	  3. Ÿ��[] �迭�̸� = new Ÿ��[]{��1, ��2, ��3 ...};
	 */
		int[] age = {10, 15, 18, 20, 32, 17};
		boolean[]passExam = {true, false, 80>70, false, false}; //80>70�� true�� ����
		String[] animals = new String[] {"lion", "tiger", "dog", "cat"};
		String[] animals2 = {"lion2", "tiger2","dog2","cat2"};
		
//	 # String�� char�� �迭�� ��ȯ�� �� �ִ�
		char[] msg1 = new char[] {'h','e','l','l','o'};
		
		String msg2 = "hello";
		
		System.out.println(msg1[0]);
		System.out.println(msg1[1]);
		System.out.println(msg1[2]);
		
		System.out.println(msg2.charAt(0));
		System.out.println(msg2.charAt(1));
		System.out.println(msg2.charAt(2));
		
		//���� �ʹ� �񽺻�� ������ ��Ʈ���� char������ ��ȯ����
		char[] msg3 = msg2.toCharArray();
		
		//char���� string���� ��ȯ�Ұ�
		String msg4 = msg1.toString(); //�̻��� �������
		
		System.out.println(msg3[0]);
		System.out.println(msg3[1]);
		System.out.println(msg3[2]);
		System.out.println(msg4);
		
		System.out.println(animals);
		
		
	
	}
}