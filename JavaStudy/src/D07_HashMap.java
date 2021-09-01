
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class D07_HashMap {

	/*
	  # Map
	  
	   - Key�� Value�� �� ���� �̷�� �ڷᱸ��
	   - Key���� ���� Value�� ������ �� �ִ�
	   - Key�� �ߺ��� ������� �ʴ´�
	 */
	public static void main(String[] args) {
		
		HashMap<String, Integer> record = new HashMap<>();
		
		//put(key, value) 
		//	- map�� ������ �߰�
		//	- ������ ����ִ� ���� ������ �� ���� ����, ������ null�� ����
		record.put("ȫ�浿", 50000);
		record.put("��浿", 35000);
		record.put("�ڱ浿", 90000);	
		record.put("ȫ�浿", 5000); //���� Ű���� value�� �ٲٸ� ���� �ٲ��
		record.put("������", null);
		System.out.println(record);
		
		//�������� : "ȫ�浿"�� ����Ǿ� �ִ� ���ڸ� 3000�������Ѻ�����
		int a = (int)record.get("ȫ�浿") + 3000;
		record.put("ȫ�浿", record.get("ȫ�浿")+3000);
		
		//�̹� �����ϴ� Ű���� put�ϸ� ���� ����
		Integer previous_value = record.put("ȫ�浿", 3500);
		System.out.println("������ ����ִ� ��: " + previous_value);
		System.out.println("���� ����ִ� �� : " + record.get("ȫ�浿"));
		int c = record.put("��浿", 3000);
		
		//get(key) : key�� �̿��� value�� ����
		System.out.println(record.get("�ڱ浿")); //Ű������ ����������
		
		HashMap<String, Object> person = new HashMap<>();
		
		person.put("�̸�", "ȫ�浿");
		person.put("����", 35);
		person.put("�����ϴ°�", new String[] {"���", "���ڱ�", "�Ա�"});
		person.put("�Ⱦ��ϴ°�", new HashSet<>());
		
		
		
		
		System.out.println(person.get("�̸�")); //string�� int���� object���� �ٿ�ĳ���� ���ص� println�����ϴ�
		System.out.println(person.get("����"));
		System.out.println(((String[])person.get("�����ϴ°�"))[0]); //Object���� �迭�� �ٿ�ĳ���� �ؾߵȴ�
		
		HashSet<String>dislike = ((HashSet)person.get("�Ⱦ��ϴ°�"));
		((HashSet<String>)person.get("�Ⱦ��ϴ°�")).add("����");
		dislike.add("�߱�");
		dislike.add("���");
		
		System.out.println(person.get("�Ⱦ��ϴ°�"));
		
		String d = (String)person.get("�̸�");
		int b = (int)person.get("����");
		
		/*
			# �ݺ������� Map�� Ȱ���ϱ�
			
			 - keySet() : key��θ� �̷���� Set�� ��ȯ�Ѵ�
			 - values() : value��θ� �̷���� Set�� ��ȯ�Ѵ�
			 - entrySet() : Entry<key, value>�� �̷���� Set�� ��ȯ�Ѵ� (import java.util.Map.Entry;)
		 */
		for(String key : person.keySet()) {
			System.out.println(key); //key������
		
			//A instanceof B ������ : A�� B�� �ν��Ͻ������� �Ǻ��Ѵ�. ��ĳ���õ� ���¿����� �Ǻ��ȴ�
			Object value = person.get(key);
			if(value instanceof String[]) { //value�� String[] Ÿ�Կ��� ��ĳ���õȰ��̶��
				System.out.print("[");
				
				String[] arr = (String[]) value;
				
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + ", ");
				}
				
				System.out.println("]");
			}else {
				
				System.out.println(value); //value������
			}			
		}
		
		//values()
		System.out.println("values : " + person.values());
		//entrySet()
		System.out.println("entrySet : " + person.entrySet());
		for(Entry<String, Object>entry : person.entrySet()) { //import java.util.Map.Entry;
			
			String key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
		//containskey(), containsvalue() : true, false�� ��ȯ
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "hello!");
		map.put(99, "good night");
		map.put(35, "see you later!");
		
		System.out.println(map.get(3));
		System.out.println(map.get(99));
		System.out.println(map.get(35));
		
		System.out.println("Ű �߿� 15�� �ֳ���? : " + map.containsKey(15));
		System.out.println("�� �߿� hello!�� �ֳ���? : " + map.containsValue("hello!"));
	}
	
}
