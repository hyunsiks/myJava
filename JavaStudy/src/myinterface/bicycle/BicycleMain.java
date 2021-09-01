package myinterface.bicycle;

import java.util.Arrays;

public class BicycleMain {

	public static void main(String[] args) {
		
		Qualisports qmax = new Qualisports();		

		qmax.brand();
		System.out.println(qmax.wheel());
		Arrays.toString(qmax.setColor(120, 70, 0));
		System.out.println(qmax.gear());
		System.out.println(qmax.numberOfWheel());
		System.out.println(qmax.size());
	}

}
