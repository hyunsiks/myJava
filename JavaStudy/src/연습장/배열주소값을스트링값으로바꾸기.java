package 연습장;

import java.util.ArrayList;

public class 배열주소값을스트링값으로바꾸기 {

	public static void main(String[] args) {
		
		
		//배열에 <클래스변수>를 사용하면 출력할때 주소값이 출력된다
		ArrayList<Apple> arr = new ArrayList<>();
		arr.add(new Apple(10,20));
		arr.add(new Apple(50,43));
		arr.add(new Apple(31,25));
		arr.add(new Apple(12,73));
		System.out.println(arr);
		
	}

}
class Apple{
	
	
	int size;
	int num;
	public Apple(int size, int num) {
		this.size = size;
		this.num = num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[크기 : " + size + ", " + " 갯수 : " + num + "]";
	}
}
