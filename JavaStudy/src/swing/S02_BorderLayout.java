package swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout extends javax.swing.JFrame{

	/*
		# BorderLayout
			- �������ϰ� ����� �̷���� ���̾ƿ�
			- ������Ʈ�� �߰��� �� ��ġ�� �Բ� ������ �� �� �ִ�
			- ���� ����� ���� ������ ������ �� �ִ�
	 */
	
	//JFrame�� ��ӹ޾Ƽ� Ŭ������ �����ϸ鼭 ������ �ٲ۴�
	public S02_BorderLayout() {
		
		//�� �������� ���̾ƿ� ���� (���� ���س����� �⺻������ BorderLayout���� �Ǿ��ֱ� ������ ������ �����ϱ��ϴ�)
		setLayout(new BorderLayout());
		
		//���̾ƿ� ���� �� �߰��ؾ���
		JButton quit_btn = new JButton("Quit");
		
		//��ư�� ��Ʈ ����
		quit_btn.setFont(new Font("�ü�ü", Font.BOLD, 35));
		
		//��ư�� �̺�Ʈ�� �߰�
		quit_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �ش� ������Ʈ�� action �߻��� e�� �̺�Ʈ ����� ������ �Ѿ�´�.
				System.out.println("������ ����1 : " + e.getActionCommand());
				System.out.println("������ ����2 : " + e.getID());
				System.out.println("������ ����3 : " + e.getModifiers());
				System.out.println("������ ����4 : " + e.getWhen());
				System.out.println("������ ����6 : " + e.getSource());
				
				//e.getSource()���� �׼��� �߻��� ������Ʈ�� �ν��Ͻ��� ����ְ� �ٿ�ĳ�����Ͽ� ����ؾ��Ѵ� 
				((JButton)e.getSource()).setText("Quit ������!");
			}
			
		});
		
		JButton save_btn = new JButton("Save");
		save_btn.setFont(new Font("���ü", Font.BOLD, 30));
		save_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				((JButton)e.getSource()).setText("Save ������!");
			}
			
		});
		add(save_btn, BorderLayout.CENTER);
		add(new JButton("Load"), BorderLayout.EAST);
		add(new JButton("Delete"), BorderLayout.WEST);
		add(new JButton("Update"), BorderLayout.NORTH);
		add(quit_btn, BorderLayout.SOUTH);
		
		//��ġ����
		setLocation(100,100);
		
		//������ ũ�� ����
		setSize(500,500);
		
		//X��ư�� ������ ���� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�������� ���̰� ����(ȭ�鿡 �׸���)
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new S02_BorderLayout();
	}
}
