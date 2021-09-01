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
		System.out.println(name + "을 먹어서 " + weight +" 만큼 체중이 증가하였습니다");
	}
	
	public void buy() {
		System.out.println(name + "을 구매해서 " + money + "원 만큼 돈이 감소하였습니다");
	}
}
