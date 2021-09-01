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
		1. 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후 
		   프로그램 종료시 플레이어의 전적을 파일에 저장해보세요
		   
		2. 프로그램 실행시 아까 저장해놨던 전적을 불러온 후 진행되도록 만들어보세요
		
		3. 이름별로 전적을 따로 저장하세요
	 */
	
	String name;
	String nameAdd;
	String decision;
	int win = 0;
	int draw = 0;
	int lose = 0;
	int com;
	
	public static void main(String[] args) {
		E03_SaveGame ee = new E03_SaveGame("김현식");
	
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
			total("김현식");
			System.out.println("게임종료!");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	String my() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보를 내세요 : ");
		decision = sc.next();
		return decision;
	}

	String game() {
		String myDecision = my();
		System.out.println("내가 낸 것 : " + myDecision);
		String comDecision = computer(); 
		System.out.println("컴퓨터가 낸 것 : " + comDecision);
		
		if(myDecision.equals("바위") && comDecision.equals("가위")) {
			System.out.println("승리!!");
			return "Win!!\n";
		}else if(myDecision.equals("가위") && comDecision.equals("보")) {
			System.out.println("승리!!");
			return "Win!!\n";
		}else if(myDecision.equals("보") && comDecision.equals("주먹")) {
			System.out.println("승리!!");
			return "Win!!\n";
		}else if(myDecision.equals(comDecision)) {
			System.out.println("무승부!");
			return "Draw!\n";
		}else {
			System.out.println("패배ㅠㅠ");
			return "Lose..\n";
		}
	}
	
	String computer() {
		Random ran = new Random();
		com = ran.nextInt(3);
		if(com == 1) {
			return "바위";
		}else if(com == 2) {
			return "가위";
		}else {
			return "보";
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
		System.out.println(String.format("승리 : %d / 패배 : %d / 무승부 : %d", win, lose, draw));
	}
	
	
}





