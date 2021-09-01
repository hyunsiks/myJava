
import myobj.Bera31Employee;

public class C04_Static {
	
	/*
	  # static(���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����)
	  
	  	- static�� ���� Ŭ������ ��� �ν��Ͻ��� �������λ���ϴ� �����̴�
	  	- static�� ����� Ŭ������ �ڿ��� ��� �ν��Ͻ����� ���� ���� ���ϰ� �ȴ�(�޸� ������ ����)
	  	- static�� ���� ������ Ŭ������ �ϳ��ۿ� �������� �����Ƿ� �޸𸮰� ����ȴ�
	  	- static ������ Ŭ������ �ϳ��̱� ������ Ŭ������ .�� ��� �����ϴ� ���� ����
	  	- static ������ �ڿ��� �ν��Ͻ��� ����� ������ ȣ���� �� �ִ�
	  		(���� ������ �ν��Ͻ��� ������ static�� ���� �ڿ��� �� �� �ִ�)
	  	- �ν��Ͻ��� �������� ���� ���� static�� ���� ���ɼ��� �ֱ� ������ 
	  	  static�޼��忡���� �ν��Ͻ� �ڿ��� ����� �� ����(static ������ ��� �� ���� �ִٴ� ��)
	 */

	public static void main(String[] args) {
		
		System.out.println(Lamp.width);	//Lamp lam = new Lamp(); �� ���� ���������� �ʾҴµ� static�ڿ��� ��밡��
		System.out.println(Lamp.height);
		
		Lamp.chagewidth(500);
//		Lamp.turnOn();
		
		Lamp lamp01 = new Lamp();
		Lamp lamp02 = new Lamp();
		Lamp lamp03 = new Lamp();
		Lamp lamp04 = new Lamp();
		
		System.out.println(lamp01.width);
		System.out.println(lamp02.width);
		System.out.println(lamp03.width);
		System.out.println(lamp04.width);
		System.out.println(Lamp.width); //������ ���� ������ ��ó�� Ŭ������(Lamp)���ٰ� .�� ��� �����ϴ°� ���� (Lamp.width)
		
		lamp03.width = 30;
		
		System.out.println(lamp01.width);
		System.out.println(lamp02.width);
		System.out.println(lamp03.width);
		System.out.println(lamp04.width);
		System.out.println(Lamp.width);
		
		
		//��������
		Bera31Employee bera = new Bera31Employee();
		
		bera.quantity("pint", 3);
		bera.quantity("quater", 4);
		bera.quantity("family", 3);
		bera.quantity("halfgallon", 5);
		bera.quantity("halfgallon", 10);
	}
}
class Lamp {
	
	//������ ������ ��� �������� �ʺ�� ���̴� �����ϴ�
	static int width = 50;
	static int height = 200;
	
	int[] position;
	double brightness;
	boolean powerOn;
	
	//static�޼��忡�� static������ �����ϴ� ���� ����
	public static void chagewidth(int width) {
		Lamp.width = width;
	}
	static void turnOn() { //static������ �ν��Ͻ� ������
//		this.powerOn = true;
	}
}

/*
  myobj ��Ű���� static ������ ������ Ŭ������ �ϳ� ���� �غ�����
  
 */






