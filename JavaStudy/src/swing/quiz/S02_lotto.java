package swing.quiz;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_lotto {

	/*
		#  "뽑기"버튼을 누를때마다 6개의 중복없는 랜덤 숫자를 가지는 버튼을 
		   프레임에 띄우는 프로그램
	 */
	
	public static void main(String[] args) {
	
		JFrame jf = new JFrame();
		
		JButton btn = new JButton("뽑기!");
		JButton btn2 = new JButton("로또번호");
	
		
		btn.setFont(new Font("고딕체",Font.BOLD, 35));
		btn2.setFont(new Font("고딕체",Font.BOLD, 55));
	
		jf.setLayout(new BorderLayout());
		jf.setLocation(500, 100);
		jf.setSize(800,600);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.add(btn, BorderLayout.AFTER_LAST_LINE);
		jf.add(btn2, BorderLayout.CENTER);

		
		btn.addActionListener(new ActionListener() {	
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
				System.out.println(e.getActionCommand());
				
		        if(e.getActionCommand().equals("뽑기!")) {
		        	
		        	btn2.setText(Arrays.toString(lottoNum()));

		        }
				
//				((JButton)e.getSource()).setText(Arrays.toString(lottoNum()));
			}
			
		});

	}
	
	static int[] lottoNum() {
		
		int[] lotto = new int[6];
		Random ran = new Random();
		
		for(int i = 0; i < 6; i++) {
			lotto[i] = ran.nextInt(45) + 1; 
			for(int j = 0; j < i; j++) { 
				if(lotto[i] == lotto[j]) {						
					i--;
				}
			}
		}
		return lotto;
	}

}
