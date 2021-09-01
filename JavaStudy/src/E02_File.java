import java.io.File;

public class E02_File {

	/*
		# java.util.File
		
		 - 파일 시스템의 파일 정보를 담을 수 있는 클래스
		 - 인스턴스에 담겨있는 정보를 바탕으로 새로운 파일이나 디렉토리를 생성할 수 있다
		 - 이미 존재하는 파일 또는 디렉토리의 정보를 불러오기도 한다
	 */
	
	public static void main(String[] args) {
		
		// 생성자로 경로 전달
		File a = new File("a.txt");
		File b = new File("b.txt");
		File dir = new File("C:/Users/ASUS/Documents/ms김현식");
		File dir2 = new File("C:/Users/ASUS/Documents/ms김준식");
		
		System.out.println("읽기 권한이 있는 파일인가요?" + a.canRead());
		System.out.println("실행 권한이 있는 파일인가요?" + a.canExecute());
		System.out.println("쓰기 권한이 있는 파일인가요?" + a.canWrite());
		
		//절대 경로 알아오기
		System.out.println(a.getAbsolutePath());
		
		//절대 경로 인가?
		System.out.println(a.isAbsolute()); //false(상대경로임)
		
		//a에 담긴 파일 인스턴스는 디렉토리인가?
		System.out.println(a.isDirectory()); //false
		System.out.println(dir.isDirectory()); //true
		
		//존재하는가?
		System.out.println(a.exists()); //있으니까 true
		System.out.println(dir2.exists()); //없으니까 false
		
		//존재하지 않으면 디렉토리 생성하기
		if (!dir2.exists()) {
			dir2.mkdir(); //디렉토리 생성 메서드
		}else {
			System.out.println("이미 존재하는 디렉토리입니다");
		}
	}

}
