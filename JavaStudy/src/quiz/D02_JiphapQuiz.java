package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//���׸��� �����ص� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� �� �� �ְ� �ȴ�
//���� ������ object�� �����ȴ�
public class D02_JiphapQuiz<DynamicType, T> {

	/*
	 	1. �� �÷����� �Ű������� ���� ������ �� �÷����� 
	 	   �������� SetŸ������ ��ȯ�ϴ� �޼��� 
	 	  
	 	2. �� �÷����� �Ű������� ���� ������ �� �÷����� 
	 	   �������� SetŸ������ ��ȯ�ϴ� �޼���  
	 	 
	 	2. �� �÷����� �Ű������� ���� ������ �� �÷����� 
	 	   �������� SetŸ������ ��ȯ�ϴ� �޼���  
	 */
	
	ArrayList a;
	HashSet b;
	Collections c1;
	Collections c2;
	
	public static void main(String[] args) {

		D02_JiphapQuiz jip = new D02_JiphapQuiz();
		D02_JiphapQuiz<Integer> jiphap_tools = new D02_JiphapQuiz<>();
		D02_JiphapQuiz<String> jiphap_tools2 = new D02_JiphapQuiz<>();
	
		System.out.println(jiphap_tools.hapjiphap(jip.c1, jip.c2));
		System.out.println(jip.kyojiphap(jip.c1, jip.c2));
		System.out.println(jip.chajiphap(jip.c1, jip.c2));
		
		
		
	}
	
	public D02_JiphapQuiz() {
		a = new ArrayList<>();
		b = new HashSet<>();
	}	
	
	
	public Set<T> hapjiphap(Collection<? extends T> a, Collection<? extends T> b){
		
		Set<T> o1 = ((Set) a);
		Set<T> o2 = ((Set) b);
		o1 = new HashSet<>();
		o2 = new HashSet<>();
		o1.add(1); o1.add(2); o1.add(3); 
		o2.add(2); o2.add(3); o2.add(4);
		
		o1.addAll(o2);
		
		return o1;
	}
	public Set<T> kyojiphap(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> o1 = ((Set) a);
		Set<T> o2 = ((Set) b);
		o1 = new HashSet<>();
		o2 = new HashSet<>();
		o1.add(1); o1.add(2); o1.add(3); 
		o2.add(2); o2.add(3); o2.add(4);
		
		o1.retainAll(o2);
	
		return o1;		
	}
	public Set<T> chajiphap(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> o1 = ((Set) a);
		Set<T> o2 = ((Set) b);
		o1 = new HashSet<>();
		o2 = new HashSet<>();
		o1.add(1); o1.add(2); o1.add(3);
		o2.add(2); o2.add(3); o2.add(4);
		
		o1.removeAll(o2);
		
		return o1;		
	}
}
