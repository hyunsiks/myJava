package myobj.item;

import java.util.Scanner;

public class Dsa extends Dumbell {
	
	int strength;
	
	public Dsa(String name, int price) {
		
		super(name, price);
		
		if(name.equals("fire")) {
			power = 15;
			strength = 200;
		}else if(name.equals("ice")) {
			power = 13;
			strength = 150;
		}else {
			power = 10;
			strength = 100;
		}
	}
	void ss() {
		System.out.printf("%s의 파워는 %d 증가, 힘은 %d 증가, 가격은 %d 입니다", name, this.power, this.strength, price);
	}
	
	
}
