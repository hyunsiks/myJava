package ������;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ���Ͼ�������� {

	//FileOutputStream(fn, true); �̾
	//FileOutputStream(fn); ��������
	
	public static void main(String[] args) {
		
		File fn = new File("a.txt");
		try {
			
			FileOutputStream fin = new FileOutputStream(fn, true); //Output�� true�� ����Ͽ� ���� �̾�Ⱑ �ǰ� true���� fn ������ ������
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
