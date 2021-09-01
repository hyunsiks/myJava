
import java.util.Scanner;

import myobj.Apart;
import myobj.Peach;

public class C03_Constructor {
	
	/*
	  # Ŭ������ ������ (Constructor)
	  
	  	- Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
	  	- �޼��������� ����Ÿ���� �������� �ʴ´�
	  	- �ν��Ͻ��� �����ϱ� ���ؼ��� new�� ���� �����ڸ� ȣ���ؾ� �Ѵ�
	  	- �����ڸ� �ϳ��� �������� ���� Ŭ�������� �⺻ �����ڰ� �ڵ����� �����ȴ�
	  	- �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ�ȴ�(ex:sc.~~ sc��� �����ڿ� �� ������ �ּҹ�ȯ)
	  	
	 */
	
	
	public static void main(String[] args) {
		
		//Ŭ���� �̸��� �Ȱ��� �̸��� �޼��带 ȣ���� �ν��Ͻ��� ������ �� �ִ�.
		
		//*�����ڸ� ȣ���ϴ� ������
		String s1 = new String(); //������ ������ �ּҿ� ���� ��� ã�ư��� ������ ������������� �Ѵ�
		Scanner sc = new Scanner(System.in);
		Peach p1 = new Peach();	//�����ڰ� ���� �����ڴ� �ڵ����� �⺻ �����ڸ� �������ش�
		
		
		Orange[] orange_box = new Orange[8]; 
		for(int i = 0; i< 5; i++) {		//�ν��Ͻ��� 5�� �����
			orange_box[i] = new Orange();
		}
		System.out.println(orange_box[0].sweet);
		System.out.println(orange_box[1].size);
		System.out.println(orange_box[2].color[0]);
		System.out.println(orange_box[3].color[1]);
		System.out.println(orange_box[4].color[2]);
		
		new Orange();  //�����ڸ� ���� ���ο� �ν��Ͻ��� ����ٴ°� �ȿ� �ν��Ͻ��������� �� �ʱⰪ���� �Ǿ��ִ�
		new Orange(8); //�絵�� 8�� ���س��� �����Ѵٴ°�
		new Orange(9, 10, new int[] {255, 165, 0});
		Orange or1 = new Orange();
		
		System.out.println(sc); //�ּҰ� ��ȯ�ȴ�
		System.out.println(p1); 
		System.out.println(s1); //�ּҰ� �ȳ������� ��Ʈ�� Ÿ�Ե� �ּ� ������ִ�
		
		//����
		Strawberry berry01 = new Strawberry(150);

		System.out.println(berry01.color);
		System.out.println(berry01.seed);
		
		//����Ʈ
		Apart apt01 = new Apart();
		System.out.println("�ʱ�ȭ ����Ʈ ��簡�� : " + apt01.perOfPrice);
		System.out.println("�ʱ�ȭ ����Ʈ ���� : " + apt01.price(33));
		Apart apt02 = new Apart(25000, 5, 1);
		System.out.println("2�� ����Ʈ ��簡�� : " + apt02.perOfPrice);
		System.out.println("2�� ����Ʈ �������� : " + apt02.price(33));
		
		System.out.println("1�� ����Ʈ ������ ��ġ : " + apt01.floorValue(7));
		System.out.println("1�� ����Ʈ ��ġ�� ��ġ : " + apt01.locateValue(3));
		System.out.println("1�� ����Ʈ �������� : " + apt01.price(33));
	}
}
class Orange{
	int sweet;
	int size;
	int[] color;
	
	//������ (Ŭ������ �Ȱ��� �̸��� �Լ�) - Ŭ������ �ν��Ͻ��� ������ �� ���� ���� ȣ��Ǵ� �޼���(�ַ� �ν��Ͻ��� �ʱ�ȭ�ϴ� �뵵�� ���)
	Orange(){
		System.out.println("�������� �����Ǿ����ϴ�");
		sweet = 5;
		size = (int)(Math.random() * 3 + 7);
		color = new int[] {255, 165, 0};
	}
	
	//�����ڵ� �޼����̱� ������ �����ε�(�����̸��Լ�) �� �� �ִ�
	Orange(int sweet){
		//�ν��Ͻ����� sweet�� �Ѱܹ��� sweet�� ����
		this.sweet = sweet; //�ڿ��ִ�sweet�� �Լ�ȣ���Ҷ� �޾Ƽ� Ŭ�������� sweet�� �����ϰڴٴ°�(�������� sweet�� ������� sweet)
//		 *this : �� �ν��Ͻ����� �ڱ� �ڽ��� ����Ų��
	}
	
	Orange(int sweet, int size, int[]color){
		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}	
}

class Strawberry{
	
	// Ŭ������ �ν��Ͻ� ������ �ʱ�ȭ�� ���� ������ �迭�� �Ȱ��� �ʱⰪ�� ���Ѵ�
	int seed;
	String color;
	
	//�ٸ� �����ε�Ÿ���� �����ڰ� �����ϸ� �⺻ �����ڸ� ����� �� ���� Ŭ������ �ȴ�
	public Strawberry(int seed) { //ctrl + space �ϸ� ������ �ڵ�������ɵ��ִ�
		this.seed = seed;
	}
}
//�Ʊ� myobj�� ������� Ŭ������ �˸��� �����ڸ� 2���̻� �߰��غ�����



