package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//제네릭을 설정해둔 클래스는 인스턴스 생성시 원하는 타입을 고를 수 있게 된다
//고르지 않으면 object로 설정된다
public class D02_JiphapQuiz<DynamicType, T> {

	/*
	 	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 
	 	   합집합을 Set타입으로 반환하는 메서드 
	 	  
	 	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 
	 	   교집합을 Set타입으로 반환하는 메서드  
	 	 
	 	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 
	 	   차집합을 Set타입으로 반환하는 메서드  
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
