package 연습장;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import quiz.UserRecord;

public class 스트림오브젝트를저장하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// !!!! 스트림 원하는 객체의 클래스에 Serializable 을 써야한다, 또한 SerialVersionUID를 정해줘야함
		// ex) class UserRecord implements Comparable<UserRecord>, Serializable{}
		//     private static final long serialVersionUID = 3L; //3L 이라는 숫자는 내맘대로 but, 이미 저장을 하고 파일이 있는상태라면 도중에 바꾸면 읽어들일수없다
		
		/* ※ ObjectOutputStream 사용
		 
		 	try {
				
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
						new File(./note/메롱.txt));
				
				out.writeObject(ranking); //오브젝트로 저장하면 다른프로그램과 연동이불가
				out.close();
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			} 
		 
		 */
	}

}
