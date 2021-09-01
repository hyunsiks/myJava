import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {

	/*
	  #Java I/O (Input/Output)
	  
	   - 자바는 스트림이라는 개념을 이용해 입출력을 다룬다
	   - 프로그램으로 들어오는 모든 데이터들을 입력이라고 부른다(Input)
	   - 프로그램이 연산해서 내보내는 모든 데이터들을 출력이라고 부른다(Output)
	   
	  # Stream
	  
	   - 데이터들이 오고가는 통로
	   - 입력을 받을 때 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 부른다
	   - 출력 할 때 데이터들이 프로그램에서 나가는 통로를 OutputStream이라고 부른다
	   - 데이터가 Stream으로 이동하기위해서는 byte 타입으로 변환해야 한다
	 */
	
	public static void main(String[] args) {
		
		/*
		  # 절대 경로
		  
		   - 원하는 자원까지의 경로를 뿌리(root)부터 모두 적는 것을 절대경로라고 한다
		     뿌리 -> C:\, D:\, http://, ftp://, file://, /
		     절대경로 -> C:\\Users\\ASUS\\Documents\\ms김현식\\입출력연습파일\\b.txt
		 	
		  # 상대 경로
		   
		   - 원하는 자원까지의 경로를 현재 위치부터 찾아가는 것을 상대경로라고 한다
		     상대경로는 반드시 ./ 로 시작한다(./는 생략이 가능하다)
		     (./) : 현재 위치부터 시작
		     (./)../ : 상위 폴더
		     a.txt -> 현재위치에 a.txt 만들겠다
		     상대경로 -> ./../../documents/a.txt (현재위치에서 올라가고, 올라가서 거기에 documents파일들어가서 a.txt)
		 */
		
		
		FileOutputStream fout = null;
		FileOutputStream fout2 = null;
		FileOutputStream fout3 = null;
		
		try {fout2 = new FileOutputStream("C:\\Users\\ASUS\\Documents\\ms김현식\\입출력연습파일\\b.txt");	   //일반타입으로 하면 덮어쓰기가 되어진다	
			fout3 = new FileOutputStream("C:\\Users\\ASUS\\Documents\\ms김현식\\입출력연습파일\\a.txt", true); //boolean타입으로 true를 하면 덮어쓰기가 아니고 있는 글에 이어붙인다
			
			// '\' 루트폴더로 가는 것이고  '.' 은 현재위치를 말한다 (즉, 현재위치의 루트폴더에 fout하겠다)
			fout = new FileOutputStream("a.txt", true); 
			
			// 소스에서 현재위치(./)는 프로젝트의 root이다
			for(int i = 0; i < 10; i++) {
				
				fout.write(String.format("오늘은 날씨가 참 좋네요..%d\n", i).getBytes());
				fout2.write(String.format("오늘은 날씨가 참 좋네요..%d\n", i).getBytes());
			}
			
			
			//※ I/O Stream은 수동으로 close()를 호출해줘야 한다(메모리회수)
			//fout.close();
			
			System.out.println("파일쓰기완료");
			
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다");
		}catch(IOException e) {
			System.out.println("데이터를 쓰다가 문제가 생겼음");
		}finally {
				try {
					if(fout != null) fout.close();
				} catch (IOException e) {}
		}
		
		
	}
}
