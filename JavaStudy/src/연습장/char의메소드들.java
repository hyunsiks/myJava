package 연습장;

public class char의메소드들 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'a';
		
		Character.isAlphabetic(ch);
		Character.isLetter(ch);
		Character.getType(ch); //대문자인지 소문자인지 int로 반환(대문자 1, 소문자2)
	
		System.out.println(Character.isAlphabetic(ch));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.getType(ch));
	}

}
