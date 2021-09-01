package myobj;

public class Coffee {

	private static class CoffeeCode{
		int code;
		String name;
		
		
		private CoffeeCode(int code, String name) {
			this.code = code;
			this.name = name;
		}
	}
	
	private static class OriginCode{
		int codeOrigin;
		String nameOrigin;
		
		private OriginCode(int codeOrigiin, String nameOrigin) {
			this.codeOrigin = codeOrigin;
			this.nameOrigin = nameOrigin;
		}
	}
	
	private static String[] coffee_names = {"�Ƹ޸�ī��", "ī���", "ī���ī","ī��Ḷ���ƶ�"};
	private static String[] origin_names = {"�ݷҺ��", "�����", "��Ƽ���Ǿ�", "�ɳ�", "�ε�"};
	
	final static CoffeeCode AMERICANO = new CoffeeCode(0,"�Ƹ޸�ī��"); //�ڵ��ȣ�� �����ִ� ��
	final static CoffeeCode CAFFE_LATTE = new CoffeeCode(1,"ī����");
	final static CoffeeCode CAFFE_MOCHA = new CoffeeCode(2,"ī���ī");
	
	final static OriginCode COLOMBIA = new OriginCode(0,"�ݷҺ��"); //�ڵ��ȣ�� �����ִ� ��
	final static OriginCode BRAZIL = new OriginCode(1,"�����");
	final static OriginCode INDIA = new OriginCode(2,"�ε�");
	
	CoffeeCode coffee;
	int price;
	int caffeine;
	OriginCode origin;
	boolean hot;
	
	
	public Coffee(CoffeeCode coffee, int price, int caffeine, OriginCode origin) {
		this.coffee = coffee;
		this.price = price;
		this.caffeine = caffeine;
		this.origin = origin;
		this.hot = true;
	}
	
	public String getCoffeeName() {
		
		System.out.println(coffee.name);
		return coffee.name;
	}
	
	public String getOriginName() {
		
		System.out.println(origin.nameOrigin);
	
		return origin.nameOrigin;
	}
	
	public static void main(String[] args) {
		
		//�̸��� �������� static�� ���δ� �ֳĸ� ���鶧���� this�� �ٲ�Ƿ�

		Coffee coffee1 = new Coffee(Coffee.CAFFE_LATTE, 1800, 15, Coffee.BRAZIL);
		Coffee coffee2 = new Coffee(Coffee.CAFFE_MOCHA, 2500, 20, Coffee.INDIA);

		coffee1.getCoffeeName();
		coffee1.getOriginName();
	}
	
}
