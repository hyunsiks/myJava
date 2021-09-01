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
		#  "�̱�"��ư�� ���������� 6���� �ߺ����� ���� ���ڸ� ������ ��ư�� 
		   �����ӿ� ���� ���α׷�
	 */
	
	public static void main(String[] args) {
	
		JFrame jf = new JFrame();
		
		JButton btn = new JButton("�̱�!");
		JButton btn2 = new JButton("�ζǹ�ȣ");
	
		
		btn.setFont(new Font("���ü",Font.BOLD, 35));
		btn2.setFont(new Font("���ü",Font.BOLD, 55));
	
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
				
		        if(e.getActionCommand().equals("�̱�!")) {
		        	
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
