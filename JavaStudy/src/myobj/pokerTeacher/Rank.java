package myobj.pokerTeacher;

public class Rank {
	
	//private�� �̿��� �ʵ带 �Ժη� ������ �� ���� ����� (��û�� ���� �����ڰ�)
	private int rankValue;
	private String name;
	
	public Rank(int value, String name) {
		this.rankValue = value;
		this.name = name;		
	}
	
	//getter : public���� private�ʵ带  �������⸸�ϴ� �޼���
	public String getName() {
		return name;
	}
	public int getRankValue() {
		return rankValue;
	}
	@Override
	public String toString() {
		
		return name;
	}
}
