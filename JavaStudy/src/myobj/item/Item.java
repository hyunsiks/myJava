package myobj.item;

/*
  	�� Ŭ������ ��ӹ޾� �������� 3�� ��������
  	(������Ŭ������ ������������)
 */

public class Item {

	String name;
	int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//final�� ���� �޼���� �ڽ� Ŭ�������� �������̵带 ������Ų��
	final public void item_info() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price + "��");
	}
	
	public void use() {
		System.out.println("���� ������ �ڽ� Ŭ�������� �������̵�� ����");
	}
	
	public static void main(String[] args) {
		Dumbell dumbell1 = new Dumbell("����", 20000);
		Book book1 = new Book("å", 8000);
		
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
 
