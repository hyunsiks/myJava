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
	
	private static String[] coffee_names = {"아메리카노", "카페라떼", "카페모카","카라멜마끼아또"};
	private static String[] origin_names = {"콜롬비아", "브라질", "에티오피아", "케냐", "인도"};
	
	final static CoffeeCode AMERICANO = new CoffeeCode(0,"아메리카노"); //코드번호를 지어주는 것
	final static CoffeeCode CAFFE_LATTE = new CoffeeCode(1,"카페라뗴");
	final static CoffeeCode CAFFE_MOCHA = new CoffeeCode(2,"카페모카");
	
	final static OriginCode COLOMBIA = new OriginCode(0,"콜롬비아"); //코드번호를 지어주는 것
	final static OriginCode BRAZIL = new OriginCode(1,"브라질");
	final static OriginCode INDIA = new OriginCode(2,"인도");
	
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
		
		//이름과 원산지에 static을 붙인다 왜냐면 만들때마다 this가 바뀌므로

		Coffee coffee1 = new Coffee(Coffee.CAFFE_LATTE, 1800, 15, Coffee.BRAZIL);
		Coffee coffee2 = new Coffee(Coffee.CAFFE_MOCHA, 2500, 20, Coffee.INDIA);

		coffee1.getCoffeeName();
		coffee1.getOriginName();
	}
	
}
