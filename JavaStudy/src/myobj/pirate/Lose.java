package myobj.pirate;

import java.util.Random;

public class Lose {
	int correct;
	Random ran = new Random();
	boolean[] lose = new boolean[20];
	
	public Lose() {
		correct = ran.nextInt(20);
		lose[correct] = true;
		System.out.println("´çÃ·¹øÈ£ : " + correct);
	}
	
	
}
