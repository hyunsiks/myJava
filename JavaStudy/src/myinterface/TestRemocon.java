package myinterface;

import myobj.remote.AirconditionRemocon;

//�������̽��� ���� ���յ��� ���� �ڵ带 �ۼ��� �� �ִ�
public class TestRemocon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new AirconditionRemocon());
	}
	
	public static void test(Remocon remocon) {
		remocon.power();
		remocon.up(1);
		remocon.down(1);
		remocon.change();
	}
}
