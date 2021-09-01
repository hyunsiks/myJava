package myobj.PirateTeacher;

public class Barrel {
	
	int size;
	boolean[] forked;
	int fireBtn;
	
	boolean game_over;
	
	public Barrel(int size) {
		
		
		this.size = size;
		this.forked = new boolean[size];
		this.fireBtn = (int)(Math.random() * size);
		this.game_over = false;
	}
	
	public boolean checkGameOver() {
		return game_over;
	}
	
	public boolean fork(int slot) {
		if(forked[slot]) {
			System.out.println("�̹� �񷶴� ���Դϴ�. �ٸ� ���� ����ּ���.");
			return false;
		}
		if(slot == fireBtn) {
			game_over = true;
		}
		forked[slot] = true;
		return true;
	}
	
	public boolean forkCom(int slotCom) {
		if(forked[slotCom]) {
			System.out.println("��ǻ�Ͱ� �ݺ������߽��ϴ�");
			return false;
		}else if(slotCom == fireBtn) {
			System.out.println(slotCom);
			game_over = true;
			return true;
		}else{
			forked[slotCom] = true;
			System.out.println(slotCom);
			return true;
		}
	}
}
