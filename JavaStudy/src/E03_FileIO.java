import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class E03_FileIO {

	/*
		# Stream
		  - �����͵��� ������ ���
		  - ���α׷����� ���� �� ����ϴ� ��θ� InputStream�̶�� �Ѵ�
		  - ���α׷����� ó���� �� ���� �� ����ϴ� ��θ� OutputStream�̶�� �Ѵ�
		
		# InputStream�� ���� �޼���
		  - read() : ��Ʈ������ ���� ������ �� ����Ʈ�� �о�´�. EOF�� �����ϸ� -1�� ��ȯ(EOF : END OF FILE , ���̻�����������������)
		  - read(byte[]) : byte[]�� ���� �����ϸ� �ű⿡ ����ش�
		  - read(byte[], off, len) : byte[]�� ���� �����ϵ� ���ϴ� ��ŭ ���ϴ� ��ġ�� �д´�
		  - close() : �� ����� ��Ʈ���� �ݴ´�. ���������� ��� �޸𸮸� �����ϰ� �ְԵȴ�
		# OutputStream�� ���� �޼���
		  - write(int) : �� ���ھ� ����
		  - write(byte[]) : byte[]�� ��� ������ �ѹ��� ����
		  - flush() : write�� ��Ƴ��� ������� ��� ��������
		  - close() : �� ����� ��Ʈ���� �ݴ´�. ���������� ��� �޸𸮸� �����ϰ� �ְԵȴ�
		  			  close()�� �� ���� �����Ͱ� �ִٸ� flush() �ȴ�
		
	 */	
	public static void main(String[] args) {
		
		File git = new File("./note/01_Git");
		
		try {
			FileInputStream fin = new FileInputStream(git);
			// �� ���ϴ� ����Ʈ�� �б�
//			byte[] buffer = new byte[100];
//			
//			int len;
//			while((len = fin.read(buffer)) != -1) {
//				System.out.println(new String(buffer, 0, len));
//			}
			
			//�ȳ��ϼ��� �ݰ����ϴ�!!
			//�ȳ���
			//����^
			//�ݰ���
			//�ϴ�!
			//!
			
			// �� 1����Ʈ�� �б�
//			int _byte = 0;
//			while((_byte = fin.read()) != -1) { //EOF �� �Ǹ� -1�� �Ǳ⶧���� ������ �ϰڴٴ°�
//												//fin.read() �� ���ڸ��� �ٷ� ��µǱ⶧���� while�� �ȿ� �־�θ�ȵȴ�
//				System.out.print((char)_byte);
//				
//			}
			fin.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(git.exists());
		
		//--------------------------------------------------
		
		File newFile = new File("./note/my first file output.txt");
		try {
			
			FileOutputStream fout = new FileOutputStream(newFile);
			
			//1. int�� ����ϴ� ���
			fout.write(65); //a�� ����
			fout.write(66); //b�� ����
			fout.write('\n');
			
			//2. byte[]�� �̿��ϴ� ���
			fout.write("�ȳ��ϼ���!\n".getBytes());
			fout.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}














