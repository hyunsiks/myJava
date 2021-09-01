package myinterface.bicycle;

public class Qualisports implements Frame{

	@Override
	public void brand() {
		System.out.println("Ä÷¸®½ºÆ÷Ã÷ Ä÷¸®¸Æ½º");
		
	}

	@Override
	public String wheel() {
		String wheel = "20ÀÎÄ¡ Å©±âÀÇ °­È­¿ë ¹ÙÄûÀÔ´Ï´Ù";
		
		return wheel;
	}

	@Override
	public int[] setColor(int a, int b, int c) {
		
		int[] color = {a, b, c};
		
		return color;
	}

	@Override
	public int numberOfWheel() {
		
		int wheel = 2;
		
		return wheel;
	}

	@Override
	public int size() {
		
		int size = 120;
		return size;
	}

	@Override
	public int gear() {
		
		int gear = 7;
		return gear;
	}

}
