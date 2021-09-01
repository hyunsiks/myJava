import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {

	/*
	  #Java I/O (Input/Output)
	  
	   - �ڹٴ� ��Ʈ���̶�� ������ �̿��� ������� �ٷ��
	   - ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ���(Input)
	   - ���α׷��� �����ؼ� �������� ��� �����͵��� ����̶�� �θ���(Output)
	   
	  # Stream
	  
	   - �����͵��� ������ ���
	   - �Է��� ���� �� �����͵��� ���α׷����� ������ ��θ� InputStream�̶�� �θ���
	   - ��� �� �� �����͵��� ���α׷����� ������ ��θ� OutputStream�̶�� �θ���
	   - �����Ͱ� Stream���� �̵��ϱ����ؼ��� byte Ÿ������ ��ȯ�ؾ� �Ѵ�
	 */
	
	public static void main(String[] args) {
		
		/*
		  # ���� ���
		  
		   - ���ϴ� �ڿ������� ��θ� �Ѹ�(root)���� ��� ���� ���� �����ζ�� �Ѵ�
		     �Ѹ� -> C:\, D:\, http://, ftp://, file://, /
		     ������ -> C:\\Users\\ASUS\\Documents\\ms������\\����¿�������\\b.txt
		 	
		  # ��� ���
		   
		   - ���ϴ� �ڿ������� ��θ� ���� ��ġ���� ã�ư��� ���� ����ζ�� �Ѵ�
		     ����δ� �ݵ�� ./ �� �����Ѵ�(./�� ������ �����ϴ�)
		     (./) : ���� ��ġ���� ����
		     (./)../ : ���� ����
		     a.txt -> ������ġ�� a.txt ����ڴ�
		     ����� -> ./../../documents/a.txt (������ġ���� �ö󰡰�, �ö󰡼� �ű⿡ documents���ϵ��� a.txt)
		 */
		
		
		FileOutputStream fout = null;
		FileOutputStream fout2 = null;
		FileOutputStream fout3 = null;
		
		try {fout2 = new FileOutputStream("C:\\Users\\ASUS\\Documents\\ms������\\����¿�������\\b.txt");	   //�Ϲ�Ÿ������ �ϸ� ����Ⱑ �Ǿ�����	
			fout3 = new FileOutputStream("C:\\Users\\ASUS\\Documents\\ms������\\����¿�������\\a.txt", true); //booleanŸ������ true�� �ϸ� ����Ⱑ �ƴϰ� �ִ� �ۿ� �̾���δ�
			
			// '\' ��Ʈ������ ���� ���̰�  '.' �� ������ġ�� ���Ѵ� (��, ������ġ�� ��Ʈ������ fout�ϰڴ�)
			fout = new FileOutputStream("a.txt", true); 
			
			// �ҽ����� ������ġ(./)�� ������Ʈ�� root�̴�
			for(int i = 0; i < 10; i++) {
				
				fout.write(String.format("������ ������ �� ���׿�..%d\n", i).getBytes());
				fout2.write(String.format("������ ������ �� ���׿�..%d\n", i).getBytes());
			}
			
			
			//�� I/O Stream�� �������� close()�� ȣ������� �Ѵ�(�޸�ȸ��)
			//fout.close();
			
			System.out.println("���Ͼ���Ϸ�");
			
		}catch(FileNotFoundException e) {
			System.out.println("������ ã���� �����ϴ�");
		}catch(IOException e) {
			System.out.println("�����͸� ���ٰ� ������ ������");
		}finally {
				try {
					if(fout != null) fout.close();
				} catch (IOException e) {}
		}
		
		
	}
}
