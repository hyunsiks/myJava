package ������;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import quiz.UserRecord;

public class ��Ʈ��������Ʈ�������ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// !!!! ��Ʈ�� ���ϴ� ��ü�� Ŭ������ Serializable �� ����Ѵ�, ���� SerialVersionUID�� ���������
		// ex) class UserRecord implements Comparable<UserRecord>, Serializable{}
		//     private static final long serialVersionUID = 3L; //3L �̶�� ���ڴ� ������� but, �̹� ������ �ϰ� ������ �ִ»��¶�� ���߿� �ٲٸ� �о���ϼ�����
		
		/* �� ObjectOutputStream ���
		 
		 	try {
				
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
						new File(./note/�޷�.txt));
				
				out.writeObject(ranking); //������Ʈ�� �����ϸ� �ٸ����α׷��� �����̺Ұ�
				out.close();
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			} 
		 
		 */
	}

}
