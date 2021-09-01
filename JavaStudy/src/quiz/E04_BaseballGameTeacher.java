package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class E04_BaseballGameTeacher {

	public static void main(String[] args) {
		
		LinkedList<UserRecord> ranking = new LinkedList<>();
		
		File save = new File("./trash/base.game");
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream(save));
			ranking = (LinkedList)oin.readObject();
			oin.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("######## ���緩ŷ #########");
		printRanking(ranking);
		
		int answer = 1234;
		
		InputStreamReader input = new InputStreamReader(System.in);
		Scanner sc = new Scanner(input);
		
		System.out.println("���ӽ���! ������ 1234�� �Է��ϴ� ����");
		
		long start = System.currentTimeMillis();
		System.out.print("�Է��غ����� >> ");
		
		int record = -1;
		if(sc.nextInt() == 1234) {
			System.out.println("����!");
			record = (int)(System.currentTimeMillis() - start);
			
			sc.nextLine();
			System.out.println("����� �̸��� �Է��ϼ��� > ");
			
			ranking.add(new UserRecord(sc.next(), record));
			
			Collections.sort(ranking);
			try {
				
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
						save));
				
				out.writeObject(ranking); //������Ʈ�� �����ϸ� �ٸ����α׷��� �����̺Ұ�
				out.close();
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("����!");
		}
		printRanking(ranking);
	
	
	}
		

	
	private static void printRanking(LinkedList<UserRecord> ranking) {
		
		int i = 1;
		for(UserRecord record : ranking) {
			System.out.println(i++ + "�� - " + record);
		}
	}
}
/*
 	# Serializable interface
 	 - �ش� Ŭ������ ������ �ν��Ͻ��� ����ȭ �� �� ������ ǥ���ϴ� �������̽�
 	 - SerialVersionUID�� ���ϴ� ���� ������ �ȴ�
 	 - ObjectOutputStream���� �ڹ� ��ü�� ���Ͽ� ������ ��
 	   �ش� ��ü�� ����ȭ(�ڵ�ȭ) �� �� �־�� �Ѵ�
 */
class UserRecord implements Comparable<UserRecord>, Serializable{
	
	private static final long serialVersionUID = 3L; //3L �̶�� ���ڴ� ������� but, �̹� ������ �ϰ� ������ �ִ»��¶�� ���߿� �ٲٸ� �о���ϼ�����
	
	String name;
	int userTry;
	int record;
	
	public UserRecord(String name, int record) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.record = record;
		this.userTry = (int)(Math.random() * 8 + 1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s [%d ��][%d millisec]", name, userTry,record);
	}
	@Override
	public int compareTo(UserRecord o) {
		// TODO Auto-generated method stub
		return this.userTry - o.userTry != 0 ? 
				this.userTry - o.userTry : this.record - o.record;
	}
}
