

import java.util.Scanner;

import quiz.A01_printQuiz;
import quiz.A02_introduce;
//import quiz.advance.AbcQuiz;
//import quiz.basic.AbcTest;

public class B02_Import {

	public static void main(String[] args) {
		
		//���� ��Ű���� �ڿ� ���
		A00_Hello.main(null);
		A01_Escape.main(null);
		
		//�ٸ� ��Ű���� �ڿ��� ��� (import�ʿ�)
		A01_printQuiz.main(null);//(import quiz.A01_printQuiz; ����)
		A02_introduce.main(null);//(import quiz.A02_introduce; ����)
		
		Scanner sc = new Scanner(System.in); //Ctrl + Shift + O
		
		//���� : quiz���� advance���� AbcQuiz Ŭ������ ����غ�����
//		AbcQuiz.main(null);
		
		//����� : quiz�ؿ� basic�̶�� ��Ű���� ������ abcTestŬ������ ���� ��
		//		 �ҷ��ͼ� ����غ�����.(��Ÿ���� �޼����� �ƹ��ų�)
//		AbcTest.main(null);
	}
}
