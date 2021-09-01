package 연습장;

import java.util.Comparator;

public class String끼리의비교 {
	
	public static void main(String[] args) {
		
		String a = "hello";
		String b = "he";
		String c = "el";
		String d = "ho";

		System.out.println(a.contains(b)); //이문자 전체가 연속적으로 이어져야됨
		System.out.println(a.contains(c)); 
		System.out.println(a.contains(d)); //즉, 따로 떨어뜨리면 있어도 붙어있지 않으면 되지 않는다
	}
	
	
}

