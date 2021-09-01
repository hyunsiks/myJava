package myobj.item;

public class Inventory {

	Item[] inventory;
	int size;
	
	public Inventory(int size) {
		inventory = new Item[size];
	}
	
	public boolean put(Item item) { //Item item 이란 것은 String item 처럼 변수를 선언한것
		for(int i = 0; i < inventory.length; i++) {
			if(inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}
		System.out.println("가방이 꽉 찼습니다.");
		return false;
	}
	
	public void useAllItems() {
		for(Item item : inventory) {
			if(item!= null) {
				item.use();	//Item클래스에 있는 use()는 모든 자식클래스에 있기 때문에 사용가능
//				item.buy();//Item 클래스에 buy()없으므로 안됨
			}
		}
	}
	
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(3);
		
		//Item을 넣어야 하는 자리에 Item을 상속받은 모든 것들이 들어갈 수 있다
		inven1.put(new Icecream("메로나", 3000));
		inven1.put(new Dumbell("파워덤벨", 3000));
		inven1.put(new Book("해리포터책", 3000));
		
//		for(int i = 0; i < 4; i++) {
//			if(inven1.put(new Icecream("메로나", 3000))) {//Icecream ice01 = new Icecream("메로나", 3000)
//				System.out.println("아이템이 잘들어가면 put()에서 true가 리턴");
//			}else {
//				System.out.println("아이템이 잘 안들어가면 put()에서 false가 리턴");
//			}
//		}
		
		inven1.useAllItems();
	}

	
}
