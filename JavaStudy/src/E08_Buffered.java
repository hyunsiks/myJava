import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E08_Buffered {

	/*
		# BufferedReader
	 	# BufferedWriter
	 */
	
	public static void main(String[] args) {

		File franken = new File("./data/text/frankenstein.txt");
		try {
			
			BufferedReader bin = new BufferedReader(new FileReader(franken));
			StringBuilder sb = new StringBuilder();
			double start3 =0, end3 =0;
			start3 = System.currentTimeMillis();
			String line = null;
			while((line = bin.readLine()) != null) { //bufferedReader를 사용한 readLine은 마지막출력이 -1이 아닌 null이다
				sb.append(line);
			}
			end3 = System.currentTimeMillis();
			System.out.println("bufferdReader 걸린시간 : " + (end3 - start3));
			bin.close();
		}catch (IOException e) {                        
            e.printStackTrace();
		}
		
		// frankenstein.txt를 한 글자씩 모두 읽고 걸린 시간을 측정해보세요
		
		StringBuilder sb = new StringBuilder();
		double start = 0,start2 = 0;
		double end = 0,end2 = 0;
		try (FileReader in = new FileReader(franken, Charset.forName("UTF-8"))) {

            int len = -1;
            
            start = System.currentTimeMillis();
            int len2 = -1;
            while ((len2 = in.read()) != -1) {
            	sb.append((char)len2);
            }
            end = System.currentTimeMillis();
            
		}catch (IOException e) {                        
            e.printStackTrace();
		}
		
		
		try (FileReader in2 = new FileReader(franken, Charset.forName("UTF-8"))) {
            
            char[] buff = new char[2048];
            int len = -1;
            
            start2 = System.currentTimeMillis();
            while ((len = in2.read(buff)) != -1) {
            	
            	sb.append(new String(buff, 0, len));
             
            }
            end2 = System.currentTimeMillis();
            
		}catch (IOException e) {                        
            e.printStackTrace();
		}
		double time = end - start;
		double time2 = end2 - start2;
//		System.out.println(sb);
		System.out.println("한글자 걸린시간 : " + time);
		System.out.println("버퍼(2048byte) 걸린시간 : " + time2);
		
		try(BufferedWriter bout = new BufferedWriter(
				new FileWriter(new File("./trash/bufferedWriter.txt")))){
			bout.append("Hello BufferedWriter!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
