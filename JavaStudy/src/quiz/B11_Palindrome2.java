package quiz;

import java.util.Scanner;

public class B11_Palindrome2 {

	public static void main(String[] args) {

		// Palindrome 다른 방식풀이
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		boolean palindrome = true;
		
		for(int i = 0, j = word.length() - 1; i < word.length(); i++, j--) {
			
			//System.out.printf("'%c' VS '%C'\n", word.charAt(i), word.charAt(j));
			if(word.charAt(i) != word.charAt(j)) {
				palindrome = false;
				break;
			}
		}
		System.out.println(palindrome? "PALINDROME" : "NOT PALINDROME");
	}

}
