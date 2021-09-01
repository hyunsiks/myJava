package myobj;

public class Bera31Employee {
	
	public static int pint = 320;
	public static int quater = 620;
	public static int family = 960;
	public static int halfgallon = 1200;
	int[] flaverOfPint = new int[3];
	int[] flaverOfQuater = new int[4];
	int[] flaverOfFamily = new int[5];
	int[] flaverOfHalfgallon = new int[6];
	int quantity;
	public int kindness;
	
	public Bera31Employee() {
		kindness = 1;
		quantity = 0;
	}
	

	public void quantity(String size, int kindness){
		if(size.equals("pint")) {
			quantity += pint;
			quantity += (kindness * 10);
			System.out.printf("%s의 최종 양은 %d입니다.\n",size, quantity);
			quantity = 0;
		}else if(size.equals("quater")) {
			quantity += quater;
			quantity += (kindness * 10);
			System.out.printf("%s의 최종 양은 %d입니다.\n",size, quantity);
			quantity = 0;
		}else if(size.equals("family")) {
			quantity += family;
			quantity += (kindness * 10);
			System.out.printf("%s의 최종 양은 %d입니다.\n",size, quantity);
			quantity = 0;
		}else if(size.equals("halfgallon")) {
			quantity += halfgallon;
			quantity += (kindness * 10);
			System.out.printf("%s의 최종 양은 %d입니다.\n",size, quantity);
			quantity = 0;
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}
	
	
	
}
