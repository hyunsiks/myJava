package myobj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {

	final private static Scanner sc = new Scanner(System.in);
	
	public static int inputInt() {

		while(true) {
			try {
				System.out.print("> ");
				return sc.nextInt();
			}catch(InputMismatchException e){
				sc.nextLine();
			}
		}
	}	
	
	public static int inputInt(String message) {

		while(true) {
			try {
				System.out.print(message);
				return sc.nextInt();
			}catch(InputMismatchException e){
				sc.nextLine();
			}
		}
	}
	
	public static String input() {
		System.out.println("> ");
		return sc.nextLine();
	}
	
	public static String input(String message) {
		System.out.println("> ");
		return sc.nextLine();
	}
}

