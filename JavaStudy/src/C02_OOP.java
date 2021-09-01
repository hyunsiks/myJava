
import myobj.Peach;
import myobj.Shoes;

public class C02_OOP {
		
	/*
	  # ��ü���� ���α׷���(OOP : Object Oriented Programming)
	  
	  	- ���� �����ϴ� ��� �͵��� ������ �Լ�(�޼���)�� ǥ���Ϸ��� ���α׷��� �����
		  ex ��� 
		  	- ����� ���� : ũ��, ����, �絵, Į�θ�, ������� ....
		  	- ����� �޼��� : ������(ũ�� ��ŭ�� �������� ������), �Դ´�(Į�θ��� �����ϰ�, ũ�Ⱑ �پ���), ����� �����Ѵ�(��������� �����Ѵ�)
		  	�� Ŭ���� ���ο� �ִ� �Լ��� �޼����� �θ���(���� ��� java���� �޼���ۿ� ����)  
		 - ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� ���ǿ� �����ϴ� ��ü������ ��� ǥ���Ͽ� �������� �ø���
		 - ��ü(Object) : ���� �����ϴ� ��� ���� ���Ѵ�(�繰, ���� ... ��)
		 
	  # Ŭ���� (Class)
	  
	  	- ��ü�� ���α׷��� ���� ǥ���� ��
	  	- Ŭ������ ��ü�� ���赵�̴� (������ ���������� ��ü�� ����)
	  	- Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���
	  	- Ŭ������ ������ ���� Ÿ���̴� (����Ÿ��, ��Ʈ��Ÿ��)
	 */
	
	// ���α׷� ���� �ÿ� public class�� �ִ� main�� ã�� �� �ִ�
	public static void main(String[] args) {
	
		//Apple Ŭ����(���赵)�� ���� �ν��Ͻ�(����ǰ) a1
		Apple a1 = new Apple(); // ���� Ÿ���� ����ٴ°�
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.calorie = 100;
		a2.calorie = 120;
		a3.calorie = 115;
		
		//�ٸ� ��Ű���� ������ public class�� ����� �� �ִ�
		//import���ϰ� Ǯ���Ӽ����ϱ�
		myobj.Peach p1 = new myobj.Peach();
		//import�ϰ� �����ϱ�(�ٸ� Ŭ������ �ִ� ���� ����ö��� import�Ѵ�)
		Peach p2 = new Peach();
		
		a1.eat();  //Apple Ŭ������ ������ a1�� �ִ� eat()�޼��带 ����Ѵٴ°�
		
		System.out.println(a1.calorie);
		System.out.println(a2.calorie);
		System.out.println(a3.calorie);
		
		
		
		String str1 = "abc"; //��Ʈ�� Ÿ���� ����ϴ°� �̰��� ��� Ŭ������
		String str2 = "abc";
		String str3 = "abc";
		
		/*
		 # �������� : myobj ��Ű���� ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ ��
		   		   �ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
		   		   - �ν��Ͻ� ���� 3���̻�, �ν��Ͻ� �޼��� 2���̻�, ���� ����
		 */
		myobj.Shoes shoe1 = new myobj.Shoes();
		Shoes shoe2 = new Shoes();
		
		System.out.println("���簡�� : " + shoe1.price);
		shoe1.use();
		shoe1.washing();
		System.out.println(shoe1.heigt(178));
		
		
		myobj.Apart apt = new myobj.Apart();
		System.out.println(apt.floorValue(15));
		System.out.println(apt.locateValue(5));
		System.out.println(apt.price(30));
	}

}
//dafault class(public�� �� ���� class)�� ã�� �� �� ����
class Apple{
	/*
	  # �ν��Ͻ� ����(a1.Apple, a2.Apple ���� �� �ٸ��� �� ���밡��)
	  	- �� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ����
	  	- =�ʵ� =�Ӽ� =������� =����  �� ���� ���̴�
	 */
	int size;
	int calorie;
	long lifetime;
	double sweet;
	String color;
	
	/*
	  # �ν��Ͻ� �޼���
	  	- �ν��Ͻ� ������ Ȱ���Ͽ� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	 */
	 void eat() {
		 size--;
		 calorie -= 10;
	 }	
	
}
