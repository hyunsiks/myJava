package ø¨Ω¿¿Â;

import java.util.Scanner;

public class StarMake {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		int star = 1;
		int space = 5;
		for(int k = 0; k < 10; k++) {
			if(k < 5) {
				for(int i = 0; i < space; i++) {
					System.out.print(" ");
					if(i == space-1) {
						for(int j = 0; j < star; j++) {
							System.out.print("*");							
						}					
					}					
				}	
				System.out.println();
				space--;
				star += 2;
			}//star = 11, space = 0
			else if(k >= 5) {
					for(int i = 0; i < space; i++) {				
						System.out.print(" ");								
					}
					for(int j = 0; j < star; j++) {
						System.out.print("*");
					}
					System.out.println();
					space++;
					star -= 2;
			}
			
		}
		
		
	}

}
