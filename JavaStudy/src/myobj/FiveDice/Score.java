package myobj.FiveDice;

public class Score {
	
	int dice[] = new int[5];
	
	public Score() {
		for(int i = 0; i < dice.length; i++) {
			dice[i] = (int)(Math.random() * 6 + 1);
		}
	}	
	
}
