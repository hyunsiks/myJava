package quiz;

public class B17_CountAlphabetTeacher {

	public static void main(String[] args) {
		
		String text = "aaaaAFEWGWabbbbccc";
		
		text = text.toUpperCase();
		
		int[] count = new int[26];
		
		for(int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++;
			}
		}
		for(int j = 0; j < 26; j++) {
			System.out.println();
		}

	}

}
