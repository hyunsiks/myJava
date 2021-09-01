import java.io.File;

public class E02_File {

	/*
		# java.util.File
		
		 - ���� �ý����� ���� ������ ���� �� �ִ� Ŭ����
		 - �ν��Ͻ��� ����ִ� ������ �������� ���ο� �����̳� ���丮�� ������ �� �ִ�
		 - �̹� �����ϴ� ���� �Ǵ� ���丮�� ������ �ҷ����⵵ �Ѵ�
	 */
	
	public static void main(String[] args) {
		
		// �����ڷ� ��� ����
		File a = new File("a.txt");
		File b = new File("b.txt");
		File dir = new File("C:/Users/ASUS/Documents/ms������");
		File dir2 = new File("C:/Users/ASUS/Documents/ms���ؽ�");
		
		System.out.println("�б� ������ �ִ� �����ΰ���?" + a.canRead());
		System.out.println("���� ������ �ִ� �����ΰ���?" + a.canExecute());
		System.out.println("���� ������ �ִ� �����ΰ���?" + a.canWrite());
		
		//���� ��� �˾ƿ���
		System.out.println(a.getAbsolutePath());
		
		//���� ��� �ΰ�?
		System.out.println(a.isAbsolute()); //false(�������)
		
		//a�� ��� ���� �ν��Ͻ��� ���丮�ΰ�?
		System.out.println(a.isDirectory()); //false
		System.out.println(dir.isDirectory()); //true
		
		//�����ϴ°�?
		System.out.println(a.exists()); //�����ϱ� true
		System.out.println(dir2.exists()); //�����ϱ� false
		
		//�������� ������ ���丮 �����ϱ�
		if (!dir2.exists()) {
			dir2.mkdir(); //���丮 ���� �޼���
		}else {
			System.out.println("�̹� �����ϴ� ���丮�Դϴ�");
		}
	}

}
