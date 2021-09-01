package myobj.FiveDice;

public class Player {
	
	int player;
	int[] arrPlayer;
	
	public Player(int player) {
		
		int winner = 0;
		this.player = player;
		arrPlayer = new int[player];
		
		for(int i = 0; i < player; i++) {
			System.out.println("----- " + (i+1) + "번째 player 시작 -----");
			GameStart gm = new GameStart();
			arrPlayer[i] = gm.GameStart();
			System.out.println("----- " + (i+1) + "번째 player 종료 -----");
		}
		System.out.println("변경전1 : " + arrPlayer[0]);
		System.out.println("변경전2 : " + arrPlayer[1]);
		System.out.println(arrPlayer.length);
		
		for(int i = arrPlayer.length - 1, k = 0; i >= 0; i--, k++) { //1
			for(int j = arrPlayer.length - 2, p = 1; j >= 0; j--, p++) { //0
				if(arrPlayer[arrPlayer.length - 1 - k] > arrPlayer[arrPlayer.length - 1 - p]) {
					int temp;
					temp = arrPlayer[arrPlayer.length - 1 -k];
					arrPlayer[arrPlayer.length - 1 - k] = arrPlayer[arrPlayer.length - 1 - p];
					arrPlayer[arrPlayer.length - 1 - p] = temp;
					winner = arrPlayer.length - k;
				}else {
					winner = arrPlayer.length - p;
				}
			}
		}
		System.out.println("변경후1 : " + arrPlayer[0]);
		System.out.println("변경후2 : " + arrPlayer[1]);
		System.out.println("승리자는 " + winner + "번째 player 이고, 최종점수는 " + arrPlayer[0] + "점 입니다.");
		
	}
	
	void numberOfPlayer() {
		
		
		
	}
}
