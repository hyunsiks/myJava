package myobj.item;

public class Book extends Item {
	
	int information;
	int money;
	
	public Book(String name, int price) {
		super(name, price);
		information = 5;
		money = 10000;
	}	
	
	@Override
	public void use() {
		System.out.println(name + "�� �о " + information +" ��ŭ ������ �����Ͽ����ϴ�");
	}
	
	public void buy() {
		System.out.println(name + "�� �����ؼ� " + money + "�� ��ŭ ���� �����Ͽ����ϴ�");
	}
}
