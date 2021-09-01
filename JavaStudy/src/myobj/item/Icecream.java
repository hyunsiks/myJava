package myobj.item;

public class Icecream extends Item {
	
	int weight;
	int money;
	
	public Icecream(String name, int price) {
		super(name, price);
		weight = 1;
		money = 10000;
	}	
	
	@Override
	public void use() {
		System.out.println(name + "�� �Ծ " + weight +" ��ŭ ü���� �����Ͽ����ϴ�");
	}
	
	public void buy() {
		System.out.println(name + "�� �����ؼ� " + money + "�� ��ŭ ���� �����Ͽ����ϴ�");
	}
}
