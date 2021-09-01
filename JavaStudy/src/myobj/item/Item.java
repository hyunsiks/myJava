package myobj.item;

/*
  	이 클래스를 상속받아 아이템을 3개 만들어보세요
  	(아이템클래스는 수정하지말것)
 */

public class Item {

	String name;
	int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//final을 붙인 메서드는 자식 클래스에서 오버라이드를 금지시킨다
	final public void item_info() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price + "원");
	}
	
	public void use() {
		System.out.println("세부 사항은 자식 클래스에서 오버라이드로 구현");
	}
	
	public static void main(String[] args) {
		Dumbell dumbell1 = new Dumbell("덤벨", 20000);
		Book book1 = new Book("책", 8000);
		
		book1.item_info();
		book1.use();
		book1.buy();
		dumbell1.item_info();
		dumbell1.use();
		dumbell1.buy();
		
		System.out.println(book1.name);
		System.out.println(dumbell1.name);
		System.out.println("=======================");
		Dsa dd = new Dsa("fire", 20000);
		dd.ss();	
	}
	
	public void element(String element) {
		System.out.println(element);
	}
}
 
