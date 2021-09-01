import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E07_JSON implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
		# JSON
		
		 - JavaScript의 Object타입과 굉장히 유사한 형태의 데이터 표현 양식
		 - 문자열만으로 다양한 데이터를 간결하게 표현할 수 있어서 인기가 많다
		 - { "Key" : Value, "Key" : Value, ...} 이런식으로 표현
		 
		# JSON의 Value에 표현 가능한 타입들
		
		 - '', "" : String
		 - 숫자, 소수 : Number
		 - null
		 - [] : Array
		 - {} : object (Java의 Map)
	 */
	/*
	 Json ex)
	  	sister = {}
		mom = {}
		dad = {}
		
		data = {
		 "이름" : "홍길동",
		 "나이" : 15,
		 "혈액형" : "AB",
		 "좋아하는음식" : ["햄버거", "파스타", "불고기"],
		 "가족관계" : { "동생" : sister, "엄마" : mom, "아빠" : dad },
		}

	 */
	File save = new File("./trash/StringToJson.json");
	
	HashMap<String, Object> myMap;
	public E07_JSON() {
		// TODO Auto-generated constructor stub
		myMap = new HashMap<>();
		
		try {
			InputStreamReader oos = new InputStreamReader(new FileInputStream(
					save));
			
			int ch;
			while((ch = oos.read()) != -1) {
				System.out.print((char)ch);
			}
			
			oos.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		// myMap에 저장된 데이터들을 JSON형태의 문자열로 만들어 파일에 출력하는 메서드를 만들어보세요
		// 확장자는 .json
		E07_JSON jsn = new E07_JSON();
		
		HashMap<String, Object> myMap = new HashMap<>();
		
		jsn.myMap.put("name", "홍길동");
		jsn.myMap.put("age", 123);
		jsn.myMap.put("tel", "010-1234-1234");
		jsn.myMap.put("tel2", null);
		jsn.myMap.put("language", new String[] {"C", "JAVA", "JavaScript", "React"});
		jsn.myMap.put("lotto", new Integer[] {1, 2, 3, 4, 5, 6, 7});
		
		myMap = jsn.myMap;
		
		mapToJsonStr(myMap);

		mapToJsonFile(mapToJsonStr(myMap));
		
		jsonToMap(mapToJsonStr(myMap));
//		System.out.println(mapToJsonStr(myMap));
		
	}
	
	static void mapToJsonFile(String json){
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
					new File("./trash/StringToJson.json")));
			
			osw.append(json);
			osw.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static String mapToJsonStr(HashMap<String, Object> myMap) {
		
		String js;
		js = String.format("{\n");
//		System.out.println("{");
		
		for(String key : myMap.keySet()) {
//			System.out.println(key); //key값보기
		
			Object value = myMap.get(key);
			
			if(value instanceof String) {
				js += String.format("\"" + key + "\" : \"" + value + "\",\n");
//				System.out.println("\"" + key + "\" : \"" + value + "\"");
			}
			
			if(value instanceof Integer) {
				js += String.format("\"" + key + "\" : " + value + ",\n");
//				System.out.println("\"" + key + "\" : " + value);
			}
			
			if(value == null) {
				js += String.format("\"" + key + "\" : " + value + ",\n");
//				System.out.println("\"" + key + "\" : " + value);
			}
			
			if(value instanceof String[]) { //value가 String[] 타입에서 업캐스팅된것이라면
				js += String.format("\"" + key + "\" : ");
//				System.out.print("\"" + key + "\" : ");
				js += String.format("[");
//				System.out.print("[");
				
				String[] arr = (String[]) value;
				
				for(int i = 0; i < arr.length; i++) {
					if(i == arr.length - 1) {
						js += String.format("\"" + arr[i] + "\"");
//						System.out.print("\"" + arr[i] + "\"");
					}else {
						js += String.format("\"" + arr[i] + "\"" + ", ");
//						System.out.print("\"" + arr[i] + "\"" + ", ");
					}
				}
				js += String.format("],\n");
//				System.out.println("]");
			}
			
			if(value instanceof Integer[]) {
				js += String.format("\"" + key + "\" : ");
//				System.out.print("\"" + key + "\" : ");
				js += String.format("[");
//				System.out.print("[");
				
				Integer[] arr2 = (Integer[]) value;
				
				for(int i = 0; i < arr2.length; i++) {
					
					if(i == arr2.length -1) {
						js += arr2[i];
//						System.out.print(arr2[i]);
					}else {
						js += String.format(arr2[i] + ", ");
//						System.out.print(arr2[i] + ", ");
					}
				}
				js += String.format("],\n");
//				System.out.println("]");
			}
		}
		js += String.format("}\n");
//		System.out.println("}");
		
		return js;
	}
	
	static HashMap<String, Object> jsonToMap(String json) {
		
		HashMap<String, Object> myMap2 = new HashMap<>();
		
		// , 중심으로 split 나눠두고
		// : 뒤로 있는 글자들을 전부 value값 취급, : 앞의 숫자들을 key값으로 취급하여 myMap2 에 value값으로 저장
		
		String[] jsonArr = json.split(":");
//		System.out.println("jsonArr[0] : " + jsonArr[0]);
//		System.out.println("jsonArr[1] : " + jsonArr[1]);
//		System.out.println("jsonArr[2] : " + jsonArr[2]);
//		System.out.println("jsonArr[3] : " + jsonArr[3]);
//		System.out.println("jsonArr[4] : " + jsonArr[4]);
//		System.out.println("jsonArr[5] : " + jsonArr[5]);
//		System.out.println("jsonArr[6] : " + jsonArr[6]);
		Pattern regex = Pattern.compile("\"\\S*\"");
//		Pattern regex2 = Pattern.compile("[\\S^,]*");
		Pattern regex2 = Pattern.compile("\\[(.+)\\]");
		ArrayList<String> keys = new ArrayList<>();
		ArrayList<String> values = new ArrayList<>();
		
		for(int i = 0; i < jsonArr.length; i++) {
			
				
			Matcher matcher = regex.matcher(jsonArr[i]);
			Matcher matcher2 = regex2.matcher(jsonArr[i]);
			
			int count = 0;
			int start = 0;
			int end = 0;
			String key = "";
			while(matcher.find()) {
				start = matcher.start();
				end = matcher.end();
//				System.out.println(start);
//				System.out.println(end);
				
				
				count++;
				key = matcher.group();
//				System.out.println("키 ========== " + key);
				
			}
			if(count == 1 && jsonArr[i].contains("[")) {
				
//				System.out.println("카운트1, []포함");
				
				keys.add(key);
				while(matcher2.find()) {
					values.add(matcher2.group());
				}
				
			}else if(count == 1) {
				
				String[] sub = jsonArr[i].split(",");
				if(sub.length > 1) {
					sub[0] = sub[0].replace(" ", "");
					sub[0] = sub[0].replace("\n", "");
					sub[1] = sub[1].replace("\n", "");
					sub[1] = sub[1].replace("\n", "");
					values.add(sub[0]);
					keys.add(sub[1]);
				}else {
					
					keys.add(key);
				}
				
			}
			if(count == 2) {
				
				String[] sub = jsonArr[i].split(",");
				sub[0] = sub[0].replace(" ", "");
				sub[0] = sub[0].replace("\n", "");
				sub[1] = sub[1].replace("\n", "");
				sub[1] = sub[1].replace("\n", "");
				
				values.add(sub[0]);
				keys.add(sub[1]);
				
				
			}
			if(count > 2) {
				
//				System.out.println("카운트많음");
				
				keys.add(key);
				while(matcher2.find()) {
					String key2 = matcher2.group();
					values.add(key2);
//					System.out.println("값들 =====================" + key2);
				}
			}
			
			if(count == 0 && jsonArr[i].contains(",")) {
				String[] sub = jsonArr[i].split(",");
				sub[0] = sub[0].replace(" ", "");
				sub[0] = sub[0].replace("\n", "");
				sub[1] = sub[1].replace("\n", "");
				sub[1] = sub[1].replace("\n", "");
				
				values.add(sub[0]);
			}
			
			
		}
		for(int i = 0; i < keys.size(); i++) {
			
			myMap2.put(keys.get(i), values.get(i));
		}
		System.out.println("스트링 -> 해쉬맵 : " + myMap2);
		return myMap2;
		
	}
}














