

public class C05_Inheritance {

	/*
	  # Ŭ���� ���
	  
	   - �̹� �����ϴ� Ŭ������ �״�� �����ްų� ���ļ� ����ϴ� ��
	   - ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ���� Ŭ������� �Ѵ�
	   - ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ������� �Ѵ� 
	 */
	public static void main(String[] args) {
		
		Person[] persons = new Person[3];
		
		persons[0] = new Person("ȫ�浿", 10, 10);
		persons[1] = new Person("��浿", 45, 15);
		persons[2] = new Person("�̱浿", 30, 12);
		
		persons[0].sayHi();
		persons[1].sayHi();
		persons[2].sayHi();
		
		Police police1 = new Police();
		police1.sayHi(); //�θ�Ŭ�������� ������ ����� �ڽ�Ŭ�������� ������� ����� �� �ִ�
		police1.walk();
		police1.run();
		System.out.println();
		
		police1.thisSuperTest("�Ѹ�");
	}
	
}

class Person{
	String name;
	int age;
	int speed;
	
	
	public Person(String name, int age, int speed) {
		this.name = name;
		this.age = age;	
		this.speed = speed;
	}
	
	void sayHi() {
		// �������� : ���̸� �������� �����ϰ� �λ��ϵ��� ��������
		if(age < 0) {
			System.out.println("?");
		}else if(age > 40) {
			System.out.printf("�ȳ��ϼ��� �ݰ����ϴ�. �� �̸��� %s�̰�, ���̴� %d���Դϴ�\n", name, age);
		}else if(age > 19) {
			System.out.printf("�ȳ��ϼ���! �� �̸��� %s�̰�, ���̴� %d���̿���\n", name, age);
		}else {
			System.out.printf("�ȳ�! �� �̸��� %s�̾�. ���̴� %d���̾�\n", name, age);			
		}
	}
	
	void walk() {
		System.out.printf("%s���� %d��ŭ �ɾ����ϴ�\\n", name, speed/2);
	}
	
	void run() {
		System.out.printf("%s���� %d���� �پ����ϴ�\\n", name, speed);		
	}
}

/*
  1. ��ӹ޴� Ŭ������ �����ڿ��� ���� ���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�.
  	 �θ� Ŭ������ �⺻�����ڰ� �����ϸ� ������ �� ������, 
  	 �������� �������� ������ �Ұ����ϴ�
  
  2. �ڽ� Ŭ������ �θ��� �޼��带 ������� ���ļ� ����� �� �ִ�(�������̴�, Override)(@Override ��� ���ٿ� ǥ���Ѵ�)
  	 
  3. �θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ���
  	 super�� this�� ��Ȯ�ϰ� ������ �� �ִ�
 */
class Police extends Person{ //Ŭ������ �����Ҷ� extends Ŭ������ �ϸ� Ŭ������ ���� Ŭ������ ����Ѵ�
	
	String name = "������";
	
	//�ڽ� Ŭ������ �����ڿ����� ù �ٿ� super()�� �ݵ�� ȣ���ؾ��Ѵ�(�ʼ�) (�θ�Ŭ������ �⺻������ �ִ°��, super��������)
	public Police(){
		super("�����", 23, 20); //super()�� �θ�Ŭ������ �����ڸ� ȣ���Ѵ�
							   //����Ŭ����(�θ�Ŭ����)�� ���� �⺻�����ڰ� ���»��� (�⺻�����ڶ�, �ν��Ͻ������� �����س��� �Ű������� �ʿ���� ������)ex. Person();
							   //�θ�Ŭ������ �⺻�����ڰ� ���� ������ super()�� ������� �ʾƵ� ������ ���·� �ִ� ���°� �ȴ�(��, �����ص��ȴ�)
							   //��� �����ڸ� ������ �� �ڽ� Ŭ�������� �⺻ �����ڰ� ����� �θ� Ŭ������ �⺻ �����ڸ� ����Ѵ�
	}
	
	@Override	//�������̵��� ǥ�ø����ָ� ���� �θ�Ŭ������ sayHi�� ������� �������̵��ε� �� �θ𿡴� �����Լ��� ���İ� ǥ�ð���, �Ƚ�θ� �θ� sayHi�� �����ص� �ƹ� ��������
	void sayHi() {	//�������̵� : �θ�Ŭ������ �����̸��� �޼��带 ����ϸ� �ڽ�Ŭ������ �޼���� �����Ҽ��ִ�(�ǿ��ʿ� �������̵��ߴٴ�ǥ�ó���)
		System.out.printf("�ȳ��Ͻʴϱ�! ���� %s �����Դϴ�.\n", name);
	}
	
	void thisSuperTest(String name) {
		System.out.println("�׳� name : " + name);	//���ο��� ����ϴ� �̸� ȣ��
		System.out.println("this. name : " + this.name);  //�ڽ� Ŭ����(����Ŭ����) �̸�ȣ��
		System.out.println("super.name : " + super.name); //�θ� Ŭ������ �̸�ȣ��
	}
	
	void arrest(String suspect) {//String �ڸ��� Person �� ������ Person�� �ִ� ��� ����� ü���ϰԵɼ��ְԵȴ�
		System.out.printf("%s ����� ������ %s���� ü���Ͽ����ϴ�.", name, suspect);
	}
}
