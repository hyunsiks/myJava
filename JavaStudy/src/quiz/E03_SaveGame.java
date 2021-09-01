package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class E03_SaveGame {

	/*
		1. ��ǻ�Ϳ� �����ϴ� ������ ���������� ������ ���� �� 
		   ���α׷� ����� �÷��̾��� ������ ���Ͽ� �����غ�����
		   
		2. ���α׷� ����� �Ʊ� �����س��� ������ �ҷ��� �� ����ǵ��� ��������
		
		3. �̸����� ������ ���� �����ϼ���
	 */
	
	String name;
	String nameAdd;
	String decision;
	int win = 0;
	int draw = 0;
	int lose = 0;
	int com;
	
	public static void main(String[] args) {
		E03_SaveGame ee = new E03_SaveGame("������");
	
	}
	
	public E03_SaveGame(String name) {
		player(name);
	}
	
	void player(String name) {
		nameAdd = String.format("./note/" + name + ".txt"); 
		File fn = new File(nameAdd);
		try {
			
			FileOutputStream fout = new FileOutputStream(fn, true);
			
			fout.write(game().getBytes());
			fout.close();
			total("������");
			System.out.println("��������!");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	String my() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������ ������ : ");
		decision = sc.next();
		return decision;
	}

	String game() {
		String myDecision = my();
		System.out.println("���� �� �� : " + myDecision);
		String comDecision = computer(); 
		System.out.println("��ǻ�Ͱ� �� �� : " + comDecision);
		
		if(myDecision.equals("����") && comDecision.equals("����")) {
			System.out.println("�¸�!!");
			return "Win!!\n";
		}else if(myDecision.equals("����") && comDecision.equals("��")) {
			System.out.println("�¸�!!");
			return "Win!!\n";
		}else if(myDecision.equals("��") && comDecision.equals("�ָ�")) {
			System.out.println("�¸�!!");
			return "Win!!\n";
		}else if(myDecision.equals(comDecision)) {
			System.out.println("���º�!");
			return "Draw!\n";
		}else {
			System.out.println("�й�Ф�");
			return "Lose..\n";
		}
	}
	
	String computer() {
		Random ran = new Random();
		com = ran.nextInt(3);
		if(com == 1) {
			return "����";
		}else if(com == 2) {
			return "����";
		}else {
			return "��";
		}
	}
	
	void total(String name) {
		
		win  = 0;
		draw = 0;
		lose = 0;
		
		nameAdd = String.format("./note/" + name + ".txt"); 
		try {
			
			FileInputStream fn = new FileInputStream(nameAdd);
			int _byte;
			while((_byte = fn.read()) != -1) { 
					
					if(_byte == 'W') {
						win++;
					}else if(_byte == 'D') {
						draw++;
					}else if(_byte == 'L') {
						lose++;
					}
					
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(String.format("�¸� : %d / �й� : %d / ���º� : %d", win, lose, draw));
	}
	
	
}





