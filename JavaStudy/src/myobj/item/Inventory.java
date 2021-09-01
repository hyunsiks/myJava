package myobj.item;

public class Inventory {

	Item[] inventory;
	int size;
	
	public Inventory(int size) {
		inventory = new Item[size];
	}
	
	public boolean put(Item item) { //Item item �̶� ���� String item ó�� ������ �����Ѱ�
		for(int i = 0; i < inventory.length; i++) {
			if(inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}
		System.out.println("������ �� á���ϴ�.");
		return false;
	}
	
	public void useAllItems() {
		for(Item item : inventory) {
			if(item!= null) {
				item.use();	//ItemŬ������ �ִ� use()�� ��� �ڽ�Ŭ������ �ֱ� ������ ��밡��
//				item.buy();//Item Ŭ������ buy()�����Ƿ� �ȵ�
			}
		}
	}
	
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(3);
		
		//Item�� �־�� �ϴ� �ڸ��� Item�� ��ӹ��� ��� �͵��� �� �� �ִ�
		inven1.put(new Icecream("�޷γ�", 3000));
		inven1.put(new Dumbell("�Ŀ�����", 3000));
		inven1.put(new Book("�ظ�����å", 3000));
		
//		for(int i = 0; i < 4; i++) {
//			if(inven1.put(new Icecream("�޷γ�", 3000))) {//Icecream ice01 = new Icecream("�޷γ�", 3000)
//				System.out.println("�������� �ߵ��� put()���� true�� ����");
//			}else {
//				System.out.println("�������� �� �ȵ��� put()���� false�� ����");
//			}
//		}
		
		inven1.useAllItems();
	}

	
}
