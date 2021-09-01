
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class C15_Throw {
	
	/*
	   # throw
	   	
	   	- ���ϴ� ���ܸ� �߻���Ų��
	   	
	   # throws
	   
	   	- �ش� �޼��忡�� �̷��� ���ܵ��� �߻���Ų�ٴ� ���� �˸���
	   	- �ش� �޼��带 ȣ���ϴ� ���� ��� ���� �� �ִ�
	   	- ���ܿ� ���� ó���� ȣ���ϴ� ������ �����Ѵ�(ȣ���ϴ� ���� ó���ض�)
	   	
	   # Exception Ŭ������ ��ӹ��� ���ܴ� "�ݵ�� ó���ؾ� �ϴ� ����"�� �ȴ�
	   	 - Exception�� ����ó���� ���� ������ ������ ������ �߻���Ų��
	   	 - ����ó���� �� ��쿡�� �������� ������ش�(ex.fileReader)
	   # RuntimeException Ŭ������ ��ӹ��� ���ܴ� "�ݵ�� ó������ �ʾƵ� �Ǵ� ����"���ȴ�
	   	 -ex)InputMismatchException, ArrayIndexOutOfBoundException..��
	   	 - ����ó���� ���� �ʾƵ� ������ ������ �߻����� �ʴ� ���ܵ�
	 */
	public static void main(String[] args) {

		C15_Throw th = new C15_Throw();
		
		try {
			
			th.dangerous_method();
			th.dangerous_method2();
		}catch(FileNotFoundException e) {
			System.out.println("���� ��ã��");
		}catch(ArrayIndexOutOfBoundsException e) {			
			System.out.println("�迭����" + e.getMessage());
		}
		
		try {			
			th.checkEven(20);
			th.checkOdd(15);
		}catch(NotEvenException e) {
			System.out.println("¦�� �ƴ� �ͼ��� �߻�");
		}catch(NotOddException e) {
			System.out.println("Ȧ�� �ƴ� �ͼ��� �߻�");
		}
		
		System.out.println("���α׷� ���� ����");
			
		
	}
	
	public void dangerous_method() throws FileNotFoundException{
	
		File f = new File("C:\\Users\\ASUS\\Desktop\\���������\\nameless1.txt");
		FileReader reader = new FileReader(f);
	}
	
	public void dangerous_method2() {
		throw new ArrayIndexOutOfBoundsException("�׳� �������");
	}
	
	public void checkEven(int num) throws NotEvenException {
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}else {
			throw new NotEvenException();
		}
		
		System.out.println("checkEven �޼��尡 ���� ���� �Ǿ����ϴ�");
	}
	
	public void checkOdd(int num){ //Runtime Exception�̱� ������ throw ���ص���
		if(num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�");
		}else {
			throw new NotOddException();
		}
		
		System.out.println("checkOdd �޼��尡 ���� ���� �Ǿ����ϴ�");
	}
}

//¦���� �ƴҶ� �߻���ų ����(����ó�� ���� ������ ������ �Ұ�)
class NotEvenException extends Exception{
	
	public NotEvenException() {
		super("¦���� �ƴϾ �߻��ϴ� ����");
	}
}

//Ȧ���� �ƴҶ� �߻���ų ����(����ó�� ���� �ʾƵ� �������� ���� �ʴ� ����)
class NotOddException extends RuntimeException{
	
	public NotOddException() {
		super("Ȧ���� �ƴϾ �߻��ϴ� ����");
	}
}









