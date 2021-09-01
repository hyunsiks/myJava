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
		
		 - JavaScript�� ObjectŸ�԰� ������ ������ ������ ������ ǥ�� ���
		 - ���ڿ������� �پ��� �����͸� �����ϰ� ǥ���� �� �־ �αⰡ ����
		 - { "Key" : Value, "Key" : Value, ...} �̷������� ǥ��
		 
		# JSON�� Value�� ǥ�� ������ Ÿ�Ե�
		
		 - '', "" : String
		 - ����, �Ҽ� : Number
		 - null
		 - [] : Array
		 - {} : object (Java�� Map)
	 */
	/*
	 Json ex)
	  	sister = {}
		mom = {}
		dad = {}
		
		data = {
		 "�̸�" : "ȫ�浿",
		 "����" : 15,
		 "������" : "AB",
		 "�����ϴ�����" : ["�ܹ���", "�Ľ�Ÿ", "�Ұ��"],
		 "��������" : { "����" : sister, "����" : mom, "�ƺ�" : dad },
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
		
		// myMap�� ����� �����͵��� JSON������ ���ڿ��� ����� ���Ͽ� ����ϴ� �޼��带 ��������
		// Ȯ���ڴ� .json
		E07_JSON jsn = new E07_JSON();
		
		HashMap<String, Object> myMap = new HashMap<>();
		
		jsn.myMap.put("name", "ȫ�浿");
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
//			System.out.println(key); //key������
		
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
			
			if(value instanceof String[]) { //value�� String[] Ÿ�Կ��� ��ĳ���õȰ��̶��
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
		
		// , �߽����� split �����ΰ�
		// : �ڷ� �ִ� ���ڵ��� ���� value�� ���, : ���� ���ڵ��� key������ ����Ͽ� myMap2 �� value������ ����
		
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
//				System.out.println("Ű ========== " + key);
				
			}
			if(count == 1 && jsonArr[i].contains("[")) {
				
//				System.out.println("ī��Ʈ1, []����");
				
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
				
//				System.out.println("ī��Ʈ����");
				
				keys.add(key);
				while(matcher2.find()) {
					String key2 = matcher2.group();
					values.add(key2);
//					System.out.println("���� =====================" + key2);
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
		System.out.println("��Ʈ�� -> �ؽ��� : " + myMap2);
		return myMap2;
		
	}
}














