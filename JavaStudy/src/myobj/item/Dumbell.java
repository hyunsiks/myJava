package myobj.item;

public class Dumbell extends Item {
	
	int power;
	int money;
	
	public Dumbell(String name, int price) {
		super(name, price);
		power = 10;
		money = 10000;
	}	
	
	@Override
	public void use() {
		System.out.println(name + "�� ����ؼ� " + power +" ��ŭ �Ŀ��� �����Ͽ����ϴ�");
	}
	
	public void buy() {
		System.out.println(name + "�� �����ؼ� " + money + "�� ��ŭ ���� �����Ͽ����ϴ�");
	}
}
