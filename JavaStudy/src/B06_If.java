

public class B06_If {

	public static void main(String[] args) {
		
	/*
	 # if¹®
	 	- ()¾È¿¡ °ªÀÌ trueÀÏ ¶§ {}¾ÈÀÇ ³»¿ëÀ» ½ÇÇàÇÑ´Ù
	 	- ()¾È¿¡ °ªÀÌ falseÀÏ ¶§ {}¾ÈÀÇ ³»¿ëÀ» ¹«½ÃÇÑ´Ù
	 	- {}¾È¿¡ µé¾î°¥ ³»¿ëÀÌ ´Ü ÇÑ ÁÙÀÌ¶ó¸é {}¸¦ »ı·«ÇÒ ¼ö ÀÖ´Ù

	 # else if¹®
	 	- À§¿¡ ÀÖ´Â if¹®ÀÌ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é if¹®Ã³·³ µ¿ÀÛÇÑ´Ù
	 	- else if´Â ´Üµ¶À¸·Î »ç¿ëÇÒ ¼ö ¾ø´Ù
	 	- else if´Â ¿©·¯¹ø »ç¿ëÇÒ ¼ö ÀÖ´Ù
	 	
	 # else¹®
	 	- À§¿¡ ÀÖ´Â if, else if°¡ ¸ğµÎ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é {}¾ÈÀÇ ³»¿ëÀ» ¹«Á¶°Ç ½ÇÇàÇÑ´Ù
	 	- if ¹Ù·Î ´ÙÀ½¿¡ ¾µ ¼öµµ ÀÖ´Ù
	 	**else°¡ ºÙ¾îÀÖ´Â Á¶°ÇÀıÀº ÃÖ¼Ò ÇÑ¹øÀº ½ÇÇàµÈ´Ù, Áï ifÁ¶°ÇÀÌ ¾Æ´Ï¸é ¹«Á¶°Ç else½ÇÇà
	 */
		int a = 10;
		
		if(a < 15) {
			System.out.println("hello!");
		} else if (a > 0) {
			System.out.println("Nice to meet you!");
		} else if (a > -10) {
			System.out.println("Greeting!");
		} else if (a > -20) {
			System.out.println("Good to see you!");
		}
		System.out.println("ÇÁ·Î±×·¥ÀÌ ³¡³µ½À´Ï´Ù.");
		
		char ch = '°¡';
		
		if(ch >= '°¡' && ch <= 'ÆR') {
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÇÑ±ÛÀÔ´Ï´Ù.");
		} else if (ch >= 12352 && ch <= 12543){
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÀÏº»¾îÀÔ´Ï´Ù.");
		} else {
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÇÑ±Û, ÀÏº»¾î°¡ ¾Æ´Õ´Ï´Ù.");
		}
		
	}

}
