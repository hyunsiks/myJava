import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class E05_StreamToPrimitive {

	/*
		# DataInputStream / DataOutputStream	vs  Reader / Writer
		
		 - Reader/Writer는 Stream을 문자로 손쉽게 다루기 위한 클래스 였다면,
		   DataInputStream/DataOutputStream은 기본형 타입으로 손쉽게 다루기 위한 클래스
	 */
	
	public static void main(String[] args) {
		
		File file = null;
		
		try {
			file = new File("./trash/myData.data");
			FileOutputStream fout = new FileOutputStream(file);
			DataOutputStream dout = new DataOutputStream(fout);
			
			dout.writeInt(9990); //바이트단위로 할떄는 불가능했던 것을 write는 알아서 int타입으로 저장함
			dout.writeInt(850);
			dout.writeInt(3000);
			dout.writeFloat(123.456F);
			dout.writeDouble(123.456543);
			dout.writeUTF("메롱");
			dout.writeBoolean(true);
		
			//사용한 스트림은 가장 최근에 만든 것 부터 차례대로 닫아줘야 한다
			OutputStreamWriter writer = new OutputStreamWriter(fout, Charset.forName("UTF-8"));
			
			writer.append("안녕하세요!");
			writer.flush();
			
			writer.close();			
			dout.close();
			fout.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		FileInputStream fin;
		DataInputStream din;
		try {
			
			fin = new FileInputStream(file);
			din = new DataInputStream(fin);
			
			// ※writeInt로 썼던 것은 readInt로 읽어야 한다
			//  파일에 썼던 순서대로 읽으면 데이터를 다시 가져올 수 있다
			System.out.println("아까 저장했던 첫번째 int : " + din.readInt());
			System.out.println("아까 저장했던 두번째 int : " + din.readInt());
			System.out.println("아까 저장했던 세번째 int : " + din.readInt());
			System.out.println("float : " + din.readFloat());
			System.out.println("double : " + din.readDouble());
			System.out.println("UTF : " + din.readUTF());
			System.out.println("boolean : " + din.readBoolean());
	
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
