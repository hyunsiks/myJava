package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {

	/*
		# Swing
	 		- Java�� ������ GUI ���α׷��� ���� �� �ִ� API
		 
		# Container
			- ������Ʈ�� �߰��� �� �ִ� ��
			- JFrame, JPanel, JDialog .. ��
			- �����̳ʸ��� ���ϴ� ���̾ƿ��� ������ �� �ִ�
			
		# Component
			- �����̳ʿ� �߰��� �� �ִ� ��ǰ
			- JButton, JTable, JSlider, JMenu .. ��
			
		# JFrame
			- ������ �����̳�
			- �پ��� ������Ʈ���� �߰��� �� �ִ�
	 */
	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		
		//������Ʈ �߰�
		JButton btn1 = new JButton("This is button");
		
		btn1.setLocation(100, 100);
		btn1.setSize(100, 50);
		
		frame.add(btn1);
		
		frame.setLocation(500, 100);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
