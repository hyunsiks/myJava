

public class C11_AnonymousInnerClass {

	/*
	 	# �͸� ���� Ŭ����
	 	
	 	 - Ŭ������ �̸��� ���� �ʰ� ������ ���� �ٷ� ����ϴ� ���
	 	 - ��ȸ�� Ŭ����
	 */
	public static void kick(Kickable something) {
		something.kick();
	}
	
	public static void main(String[] args) {
		kick(new Human());
		kick(new VendingMachine());
		kick(new Ball("�޽�"));
		kick(new Ball("�̴Ͽ���Ÿ"));
//		kick(new Kickable());//�߻�Ŭ������ �ν��Ͻ�ȭ �Ҽ�����
		
		
		//# ���� ���� Ŭ����
		class Door extends Kickable{
			
			boolean open;
			
			@Override
			void kick() {
				if(open) {					
					System.out.println("��¦�� �߷� ���� �ݾҽ��ϴ�");
					open = false;
				}else {
					System.out.println("��¦�� �߷� �Ⱦ����� �������ϴ�");
					open = true;
				}
			}
		}
		Door door1 = new Door(), door2 = new Door(),door3 = new Door();
		
		kick(door1);
		kick(door1);
		kick(door1);
		kick(door2);
		kick(door3);
		kick(door3);
		
		//# �͸� Ŭ����(�Ｎ���� Door�� ���׷��̵��� �ν��Ͻ��� ����)-�ٷο������̵�
		kick(new Door() { //����� ���� �������� �ʱ� ������ ��ȸ���̴�
			@Override
			void kick() {
				System.out.println("ưư�� �ݰ� ���� ���ſ��� ��½�� ���� �ʾҽ��ϴ�");
			}
		});		
		kick(new Ball("ö��") {
			@Override
			void kick() {
				System.out.println("�󱸰��� �߷� á���� �ָ� �������� �ʰ� �����⸸ �մϴ�");
			}
		});
		
		/* punch �޼����� ���ڰ����� ������ �� �ִ�
		   �͸�Ŭ���� 2���� ���� ���� Ŭ���� 2���� ���� �����غ�����
		 */
		
			
		class Tree extends Punchable{
			@Override
			void punch() {
				System.out.println("������ ������ �ƴ��� ���� �η������ϴ�");				
			}
		}
		Tree tr1 = new Tree();
		PunchingMachine pm = new PunchingMachine();
		Monitor mo = new Monitor();
		tr1.punch();
		pm.punch();
		mo.punch();
		
		punch(new Tree() {
			@Override
			void punch() {
				System.out.println("���� ���� Ƣ�����ϴ�");
			}
		});	
		punch(new Monitor() {
			@Override
			void punch() {
				System.out.println("����� �������ϴ�");
			}
			
		});
	}//�����Լ�
	
	public static void punch(Punchable something) {
		something.punch();
	}	
}//AnonymousInnerClass ----------------------------------------

abstract class Punchable{
	abstract void punch();
}

class PunchingMachine extends Punchable{
	
	@Override
	void punch() {
		System.out.println("�ְ����� �����Ͽ����ϴ�");		
	}
}
class Monitor extends Punchable{
	
	@Override
	void punch() {
		System.out.println("�Ѵ�ġ ��Ȱ�� �������ϴ�");		
	}
}
//--------------------------------------------------------------
abstract class Kickable{ //�߻�Ŭ������ �ν��Ͻ�ȭ �Ҽ�����
	abstract void kick();
}

class Ball extends Kickable{
	
	String kicker;
	
	public Ball(String kicker) {
		this.kicker = kicker;
	}
	
	@Override
	void kick() {
		if(kicker.equals("�޽�")) {
			System.out.println("���� ���ְ� á���ϴ�");
		}else if(kicker.equals("�̴Ͽ���Ÿ")) {
			System.out.println("�н��� ��Ȯ�ϰ� á���ϴ�");
		}
	}
}

class Human extends Kickable{
	
	@Override
	void kick() {
		System.out.println("����� �߷� �Ⱦ�á���ϴ�");		
	}
}

class VendingMachine extends Kickable{
	
	@Override
	void kick() {
		System.out.println("���Ǳ⸦ �Ⱦ�á���� ������� �ϳ� ���Խ��ϴ�");
	}
}
//--------------------------------------------------------------
