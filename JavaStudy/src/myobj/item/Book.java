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
		System.out.println(name + "을 읽어서 " + information +" 만큼 정보가 증가하였습니다");
	}
	
	public void buy() {
		System.out.println(name + "을 구매해서 " + money + "원 만큼 돈이 감소하였습니다");
	}
}
