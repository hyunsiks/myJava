package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.StreamCorruptedException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class E04_BaseballGame {

	/*
		1. �÷��̾�� 8���� �õ��� �� �� �ִ�
		2. �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�
		
			���ڿ� ��ġ�� �� ���� ��� - Strike
			���ڸ� ������� - Ball
			
			ex : ������ 3456�϶�
		3. ���� �ð��� Ƚ���� ���� 1������ 30�������� ��ŷ�� ������ ���Ͽ� �����Ѵ�
			(Ƚ���� ���ٸ� �ð��� �� ���� �ɸ������ ������ŷ)
		4. ���ο� ������ �����Ҷ����� ��ŷ�� ������ش�
		
		�� ���߰� ���� ������� ������� �˷��ְ� ��ŷ���� �ݿ��Ѵ�
	 */
	
	
	public static void main(String[] args) {
		E04_BaseballGame bg = new E04_BaseballGame();
		
		bg.totalGrade();
		
	}
	
	File fn = new File("./some/path/hikari.properties");;
	String name;
	int turn;
	ArrayList<Player> grade;
	ArrayList<Player> grade2;
	double time;
	int play;
	DataInputStream dis;
	ArrayList<String> arr = new ArrayList<>();
	
	public E04_BaseballGame() {
		
		//���ǥ��
		try {
			
			FileInputStream fin = new FileInputStream(fn);
			InputStreamReader isr = new InputStreamReader(fin, Charset.forName("UTF-8"));
			ObjectInputStream osr = new ObjectInputStream(fin);
			dis = new DataInputStream(fin);
				
			try {
				
				grade2 = (ArrayList<Player>) osr.readObject();
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(StreamCorruptedException e) {
				e.printStackTrace();
			}
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
//		System.out.println(grade);
	}
	
	
	
	void save(String name) {
		try {
			FileOutputStream fout = new FileOutputStream(fn);
			OutputStreamWriter fw = new OutputStreamWriter(fout, Charset.forName("UTF-8"));
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			DataOutputStream dout = new DataOutputStream(fout);
			
			
			oos.writeObject(grade);
			oos.close();
			fw.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	void gameStart() {
		
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int i = 0;
		turn = 1;
		int strike = 0, ball = 0;
		String value = "";
		String userInput = "";
		
		long startTime = System.currentTimeMillis();
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
		long endTime = System.currentTimeMillis();
		time = endTime - startTime;
		
		//turn�� �ɸ��� time�� �ɸ��ð�
	}

	
	void totalGrade() {
		
//		String nameAdd = String.format("./trash/" + name);
//		fn = new File("./trash/baseballGrade.txt");
		play++;
		
		
//		grade2.addAll(grade);
		grade = new ArrayList<>();
		
		Player p1 = new Player();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �������� : ");
		String nowName = sc.nextLine();
//		System.out.println("������̸� : " + name);
//		name += nowName;
//		name += "\n";
//		gameStart();
		
		p1.gameStart(nowName);
		
			
		if(name != null) {
			for(int i = 0; i < 30; i++) {
			
				if(turn > p1.turn){
					name += nowName;
					name += ",";
					break;
				}
			}
		}else {
			grade2.add(p1);
		}
		
		Collections.sort(grade2, new Order());
		System.out.println(grade2);
		grade.addAll(grade2);
		System.out.println("�׷��̵� ũ�� :" + grade.size());
		System.out.println(grade);
		save(name);
		
	
		}
		
}	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("%d ��� / %d �� / %d �ð�, )
//	}
class Player{
	int turn;
	double time;
	String name;
	
	
	
	void gameStart(String name) {
		
		this.name = name;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int i = 0;
		turn = 1;
		int strike = 0, ball = 0;
		String value = "";
		String userInput = "";
		
		long startTime = System.currentTimeMillis();
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
		long endTime = System.currentTimeMillis();
		time = endTime - startTime;
		
		//turn�� �ɸ��� time�� �ɸ��ð�
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " / " + turn + "�� / " + time + "�ð�";
	}
}

class Order implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		
		if(o1.turn > o2.turn) {
			return -1;
		}else if(o1.turn == o2.turn) {
			if(o1.time > o2.time) {
				return -1;
			}else {
				return 1;
			}
		}else {
			return 1;			
		}	
	}	
}


