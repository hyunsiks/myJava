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
		1. 플레이어는 8번의 시도를 할 수 있다
		2. 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다
		
			숫자와 위치가 다 맞을 경우 - Strike
			숫자만 맞을경우 - Ball
			
			ex : 정답이 3456일때
		3. 맞춘 시간과 횟수를 통해 1위부터 30위까지의 랭킹을 생성해 파일에 저장한다
			(횟수가 같다면 시간이 더 적게 걸린사람이 상위랭킹)
		4. 새로운 게임을 시작할때마다 랭킹을 출력해준다
		
		※ 맞추고 나면 몇번만에 맞췄는지 알려주고 랭킹에도 반영한다
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
		
		//등급표시
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
		while(i < 4) { //4자리 랜덤값 만들기
			int random = ran.nextInt(9) + 1;
			value += random;
			i++;
		}
		System.out.println("value값은 = " + value);
		
		for(i = 0; i < 8; i++) {
			System.out.printf("%d번째 시도를 하세요", turn);
			userInput = sc.next(); //대조할 값을 사람이 넣는곳
			
			for(int j = 0; j < userInput.length(); ++j) { //사람이 넣은 값을 처음부터 하나씩 strike, ball 세보기위함
				if(userInput.charAt(j) == value.charAt(j)) { //strike인지 알아보기위함
					strike++;
				}else {				//strike가 아닐때 ball이 있는지 알아보기위함
					for(int k = 0; k < 4; ++k) { // strike가 아닐때 0 ~ 4 번째까지 대조하기위함
						if(j != k) {	//j=k 이면 strike이 되므로 아닐때만 검색
							if(userInput.charAt(j) == value.charAt(k)){
								ball++;								
							}
						}
					}
				}
			}
			if(strike == 4) {
				System.out.println("정답을 맞추었습니다!");
				break;
			}
			System.out.printf("%d스트라이크, %d볼 입니다.\n",strike, ball);
			strike = 0;
			ball = 0;
			turn += 1;
			
			
		}
		long endTime = System.currentTimeMillis();
		time = endTime - startTime;
		
		//turn이 걸린턴 time이 걸린시간
	}

	
	void totalGrade() {
		
//		String nameAdd = String.format("./trash/" + name);
//		fn = new File("./trash/baseballGrade.txt");
		play++;
		
		
//		grade2.addAll(grade);
		grade = new ArrayList<>();
		
		Player p1 = new Player();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 적으세요 : ");
		String nowName = sc.nextLine();
//		System.out.println("저장된이름 : " + name);
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
		System.out.println("그레이드 크기 :" + grade.size());
		System.out.println(grade);
		save(name);
		
	
		}
		
}	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("%d 등급 / %d 턴 / %d 시간, )
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
		while(i < 4) { //4자리 랜덤값 만들기
			int random = ran.nextInt(9) + 1;
			value += random;
			i++;
		}
		System.out.println("value값은 = " + value);
		
		for(i = 0; i < 8; i++) {
			System.out.printf("%d번째 시도를 하세요", turn);
			userInput = sc.next(); //대조할 값을 사람이 넣는곳
			
			for(int j = 0; j < userInput.length(); ++j) { //사람이 넣은 값을 처음부터 하나씩 strike, ball 세보기위함
				if(userInput.charAt(j) == value.charAt(j)) { //strike인지 알아보기위함
					strike++;
				}else {				//strike가 아닐때 ball이 있는지 알아보기위함
					for(int k = 0; k < 4; ++k) { // strike가 아닐때 0 ~ 4 번째까지 대조하기위함
						if(j != k) {	//j=k 이면 strike이 되므로 아닐때만 검색
							if(userInput.charAt(j) == value.charAt(k)){
								ball++;								
							}
						}
					}
				}
			}
			if(strike == 4) {
				System.out.println("정답을 맞추었습니다!");
				break;
			}
			System.out.printf("%d스트라이크, %d볼 입니다.\n",strike, ball);
			strike = 0;
			ball = 0;
			turn += 1;
			
			
		}
		long endTime = System.currentTimeMillis();
		time = endTime - startTime;
		
		//turn이 걸린턴 time이 걸린시간
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " / " + turn + "턴 / " + time + "시간";
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


