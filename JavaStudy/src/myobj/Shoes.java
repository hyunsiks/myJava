package myobj;

public class Shoes {
	
	public int price = 50000;
	public char sex;
	public double size;
	
	
	public void use(){
		price -= 1000;
		System.out.println("����� ���� : " + price);
	}
	public char heigt(double height) {
		sex = 'F';
		if(height > 170) {
			sex = 'M';
			return sex;
		}
		return sex;
	}
	public void washing() {
		price -= 100;
		System.out.println("��Ź�� ���� : " + price);
	}

	
}
