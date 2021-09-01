package 연습장;

public class String메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello world! i love you";
		String[] b = a.split(" ");
		//스플릿의 또다른방법
		// StringTokenizer st = new StringTokenizer(스트링값, "스플릿대상");
		
		String c = a.replace(" ", ", ");
		
		
		System.out.println(c);
	}

}
