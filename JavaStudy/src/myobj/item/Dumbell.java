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
		System.out.println(name + "을 사용해서 " + power +" 만큼 파워가 증가하였습니다");
	}
	
	public void buy() {
		System.out.println(name + "을 구매해서 " + money + "원 만큼 돈이 감소하였습니다");
	}
}
