
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {

	/*
	 	# Á¤±ÔÇ¥Çö½Ä (Regular Expression)
	  
	 	 - ¹®ÀÚ¿­ÀÇ ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â Ç¥Çö½Ä
	 	 - Æ¯Á¤ ÇÁ·Î±×·¡¹Ö ¾ğ¾î¿¡ Á¾¼ÓµÇÁö ¾Ê´Â´Ù (´Ù¸¥¾ğ¾î¿¡¼­µµ ¾µ¼öÀÖ´Ù´Â°Í)
	   	 - ÇÁ·Î±×·¡¸Ó°¡ ¿øÇÏ´Â ¹®ÀÚ¿­ ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´ÂÁö °Ë»çÇÒ¶§ »ç¿ëÇÑ´Ù
	   
	 	# Pattern Å¬·¡½º
	 	
	 	 - Á¤±ÔÇ¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º
	 	 
	 	# Matcher Å¬·¡½º
	 	
	 	 - ÆĞÅÏ ÀÎ½ºÅÏ½º¸¦ ÀÌ¿ëÇÏ¿© ¹®ÀÚ¿­À» °Ë»çÇÒ ¶§ »ç¿ëÇÏ´Â Å¬·¡½º
	 */
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : inputÀÌ regex¿¡ ¸ÅÄ¡µÇ´Â ¹®ÀÚ¿­ÀÎÁö °Ë»çÇØÁÖ´Â ¸Ş¼­µå
		System.out.println(Pattern.matches("sleep", "sleep")); 
		
		// [] : ÇØ´ç À§Ä¡ÀÇ ÇÑ ±ÛÀÚ¿¡ ¾î¶² ¹®ÀÚµéÀÌ ¿Ã ¼ö ÀÖ´ÂÁö Á¤ÀÇÇÏ´Â Ç¥Çö½Ä
		System.out.println(Pattern.matches("s[lh@]eep", "sleep")); //true
		System.out.println(Pattern.matches("s[lh@]eep", "sheep")); //true
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep")); //true
		
		/* [] ³»ºÎ¿¡ Á¤ÀÇÇÒ ¼ö ÀÖ´Â °Íµé
			
			 1. abc  : ÇØ´çÀÚ¸®¿¡ a ¶Ç´Â b ¶Ç´Â c ¸¦ Çã¿ëÇÑ´Ù
			 2. ^abc : ÇØ´çÀÚ¸®¿¡ abc¸¦ Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
			 3. a-z	 : a ºÎÅÍ z±îÁö ¸ğµÎ Çã¿ë (µüÇÑÀÚ¸®)
			 4. &&	 : ±³ÁıÇÕ
		*/
		System.out.println(Pattern.matches("s[^lh@]eep", "s¤¡eep")); //2. true 
		System.out.println(Pattern.matches("s[0-9]eep", "s5eep")); //3. true 
		System.out.println(Pattern.matches("s[a-d && c-f]eep", "sdeep")); //4. true [a-d]¿Í[c-f]»çÀÌÀÇ ±³ÁıÇÕ
		
//		Pattern instance = Pattern.compile("[0-9]@[0-9]"); //instance ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇØ ÆĞÅÏ°ú °°ÀºÁö °Ë»çÇÏ°Ú´Ù´Â°Í
		
		/* [] ³»ºÎ¿¡ Á¤ÀÇÇÒ ¼ö ÀÖ´Â °Íµé
		
		 5.   .   : ¸ğµç¹®ÀÚ¸¦ Çã¿ëÇÑ´Ù ¡Ø ¿¹¿Ü·Î [] ¹Û¿¡ ½á¾ß ÇÏ´Â ¹®ÀÚ
		 6.  \d   : ¸ğµç¼ıÀÚ¸¦ Çã¿ëÇÑ´Ù (¾µ¶§´Â ¿ª½½·¡½¬¸¦ ¾²±âÀ§ÇÑ ¿ª½½·¡½¬¸¦ ½á¾ßÇÏ¹Ç·Î \\d·Î ¾´´Ù)
		 7.  \D   : ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç °Í
		 8.  \s	  : ¸ğµç °ø¹é Çã¿ë (\t, \n, \r ½ºÆäÀÌ½º .. µîÀÇ ¸ğµç °ø¹éµé Çã¿ë)
		 9.  \S   : °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç °Í
		 10. \w   : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë [a-z A-Z 0-9]
		 11. \W   : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
	*/
		System.out.println(Pattern.matches("s.eep", "s¤¡eep")); //5. true  (¸ğµç¹®ÀÚ)
		System.out.println(Pattern.matches("s[.]eep", "s¤¡eep")); // . ¸¸Çã¿ë 
		System.out.println(Pattern.matches("s\\.eep", "s¤¡eep")); // . ¸¸Çã¿ë 
		System.out.println(Pattern.matches("s\\deep", "s9eep")); //6. true 
		System.out.println(Pattern.matches("s\\Deep", "sAeep")); //7. true 
		System.out.println(Pattern.matches("\\D\\D\\D", "CAT")); //7. true 
		System.out.println(Pattern.matches("s\\seep", "s eep")); //8. true 
		System.out.println(Pattern.matches("s\\Seep", "s eep")); //9. false 
		
		
		/* ÇØ´ç ÆĞÅÏÀÌ Àû¿ëµÉ ¹®ÀÚÀÇ °³¼ö¸¦ Á¤ÀÇÇÏ´Â ¹æ¹ı
		
		 1. [ex]{n}   : {}¾ÕÀÇ ÆĞÅÏÀÌ n°³ ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		 2. [ex]{n,m} : {}¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Òn°³ ÀÌ»ó, ÃÖ´ë m°³(Æ÷ÇÔ) ÀÏÄ¡ÇØ¾ßÇÑ´Ù
		 3. [ex]{n,}  : {}¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Òn°³ ÀÌ»óÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		 4. [ex]? 	  : 0¹ø ¶Ç´Â ÇÑ¹ø
		 5. [ex]+	  : ÃÖ¼Ò ÇÑ¹ø ÀÌ»ó
		 6. [ex]*	  : 0¹ø ¶Ç´Â ¿©·¯¹ø
	*/	
		System.out.println(Pattern.matches("[\\D]{3}", "CAT")); //1. true \\D°¡ ¼¼¹ø ¾²ÀÎ´Ù´Â°Í 
		System.out.println(Pattern.matches("[\\D3-5]{5}", "CA3TS")); //1. true ('\\D' °Å³ª '3-5')°¡ 5¹ø¾²ÀÎ´Ù´Â°Í 
		System.out.println(Pattern.matches("[\\D\\d]{5}", ".--2¤·")); //1. true  
		System.out.println(Pattern.matches("[\\D3-5]{2,4}\\.txt", "3a!f.txt")); //2. true(2~4°³ ¸Â¾Æ¾ßÇÏ°í À§¿¡´Â .txt Àû¾î¾ßÇÔ)  
		System.out.println(Pattern.matches("[\\D3-5]{2,}\\.txt", "3a!f.txt")); //3. true 
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "¾È³çÇÏ¼¼¿ä.txt")); //3. true 
		System.out.println(Pattern.matches(".{2,}\\.txt", "¾È³çÇÏ¼¼¿ä.txt")); //3. true  (¸ğµç±ÛÀÚ 2°³ÀÌ»ó)
		
		String a = "¹Ùº¸¾Æ´Ï³ÄÀ×";
		String regex1 = String.format(".{%d}\\.txt", a.length());
		System.out.println(Pattern.matches(regex1, ".......txt"));
		
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", ".txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", "ÇÑ.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", "ÇÑ±Û.txt"));
		//ÀüÈ­¹øÈ£Á¤±ÔÇ¥Çö½Ä
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-?\\d{4}", "010-1234-1234")); //4. ¼ıÀÚ{3}°³ '-' ´Â 0¶Ç´Â 1(ÀÖ°Å³ª¸»°Å³ª) ´ÙÀ½À¸·Î ¼ıÀÚ{3,4}°³ ÀÌ·±½Ä
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-?\\d{4}", "010-234-1234"));
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-?\\d{4}", "01012341234"));
		
		//¿¬½À¹®Á¦ : ÀÚ¹Ù¿¡¼­ Çã¿ëÇÏ´Â º¯¼ö¸íÀ» °Ë»çÇÒ ¼ö ÀÖ´Â Á¤±ÔÇ¥Çö½ÄÀ» ¸¸µé¾îº¸¼¼¿ä
		System.out.println(Pattern.matches("[$\\w\\D][$\\w]*", "$egex1_$"));
		
	/* 
		# Pattern.compile(regex)
	
		 - Àü´ŞÇÑ Á¤±ÔÇ¥Çö½ÄÀ» ÇØ¼®ÇÏ¿© Pattern ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ°í ¹İÈ¯ÇÑ´Ù
		 - PatternÅ¸ÀÔ ÀÎ½ºÅÏ½º¸¦ ¿ä±¸ÇÏ´Â °÷¿¡ »ç¿ëÇÒ ¼ö ÀÖ´Ù	 
		 
		# split() : ÄÄÆÄÀÏµÈ ÆĞÅÏ ÀÎ½ºÅÏ½º·Î ¹®ÀÚ¿­ split()À» ÁøÇàÇÑ´Ù
		
		# matcher() :Matcher ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ¿© ¹İÈ¯ÇÑ´Ù
	*/
		String fruit_text = "apple/banana/orange/grpe/pineapple/peach/mango/redapple";
		String fruit_text2 = "apple/banana/orange/grpe/pineapple/peach/mango/redapple";
		
		//split()
		fruit_text2.split("/"); //ÀÌ ¹æ¹ıÀ¸·Î ³ª´­¼öµµ ÀÖÁö¸¸
		String[] fruits2 = fruit_text2.split("/");
		Pattern regex = Pattern.compile("/"); //ÀÌ ¹æ¹ıÀ¸·Î ³ª´©±âµµÇÑ´Ù
		regex.split(fruit_text); //ÄÄÆÄÀÏ ¹æ½ÄÀ» ÀÎ½ºÅÏ½º·Î ¼³Á¤ÇØµÎ°í ¼³Á¤ÇØµĞ°ÍÀ¸·Î ³ª´«´Ù´Â°Í
		String[] fruits = regex.split(fruit_text);
		System.out.println(Arrays.toString(fruits));
		System.out.println(Arrays.toString(fruits2));
		
//		Pattern regex2 = Pattern.compile("^a.*e$"); //a·Î ½ÃÀÛÇØ¼­ e·Î ³¡³ª´Â°Í
		Pattern regex2 = Pattern.compile("apple");
		
		Matcher matcher = regex2.matcher(fruit_text);
		
		while(matcher.find()) { //¹®ÀÚ¸¦ °Ë»öÇÒ¼öÀÖ´Ù
			System.out.println("Ã£Àº °Í : " + matcher.group());
			System.out.println("À§Ä¡ : " + matcher.start() + "ºÎÅÍ " + matcher.end() + "±îÁö");
		}
		
	}
}



















