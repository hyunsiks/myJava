

public class C11_AnonymousInnerClass {

	/*
	 	# 익명 내부 클래스
	 	
	 	 - 클래스에 이름을 짓지 않고 구현한 다음 바로 사용하는 방식
	 	 - 일회용 클래스
	 */
	public static void kick(Kickable something) {
		something.kick();
	}
	
	public static void main(String[] args) {
		kick(new Human());
		kick(new VendingMachine());
		kick(new Ball("메시"));
		kick(new Ball("이니에스타"));
//		kick(new Kickable());//추상클래스는 인스턴스화 할수없다
		
		
		//# 지역 내부 클래스
		class Door extends Kickable{
			
			boolean open;
			
			@Override
			void kick() {
				if(open) {					
					System.out.println("문짝을 발로 차서 닫았습니다");
					open = false;
				}else {
					System.out.println("문짝을 발로 걷어차서 열었습니다");
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
		
		//# 익명 클래스(즉석에서 Door를 업그레이드한 인스턴스를 생성)-바로오버라이드
		kick(new Door() { //만들고 따로 저장하지 않기 때문에 일회용이다
			@Override
			void kick() {
				System.out.println("튼튼한 금고 문이 무거워서 꿈쩍도 하지 않았습니다");
			}
		});		
		kick(new Ball("철수") {
			@Override
			void kick() {
				System.out.println("농구공을 발로 찼더니 멀리 나가지는 않고 아프기만 합니다");
			}
		});
		
		/* punch 메서드의 인자값으로 전달할 수 있는
		   익명클래스 2개와 지역 내부 클래스 2개를 만들어서 전달해보세요
		 */
		
			
		class Tree extends Punchable{
			@Override
			void punch() {
				System.out.println("나무를 손으로 쳤더니 손이 부러졌습니다");				
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
				System.out.println("물이 몸에 튀었습니다");
			}
		});	
		punch(new Monitor() {
			@Override
			void punch() {
				System.out.println("허공을 갈랐습니다");
			}
			
		});
	}//메인함수
	
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
		System.out.println("최고기록을 갱신하였습니다");		
	}
}
class Monitor extends Punchable{
	
	@Override
	void punch() {
		System.out.println("한달치 생활비가 깨졌습니다");		
	}
}
//--------------------------------------------------------------
abstract class Kickable{ //추상클래스는 인스턴스화 할수없다
	abstract void kick();
}

class Ball extends Kickable{
	
	String kicker;
	
	public Ball(String kicker) {
		this.kicker = kicker;
	}
	
	@Override
	void kick() {
		if(kicker.equals("메시")) {
			System.out.println("슈을 멋있게 찼습니다");
		}else if(kicker.equals("이니에스타")) {
			System.out.println("패스를 정확하게 찼습니다");
		}
	}
}

class Human extends Kickable{
	
	@Override
	void kick() {
		System.out.println("사람을 발로 걷어찼습니다");		
	}
}

class VendingMachine extends Kickable{
	
	@Override
	void kick() {
		System.out.println("자판기를 걷어찼더니 음료수가 하나 나왔습니다");
	}
}
//--------------------------------------------------------------
