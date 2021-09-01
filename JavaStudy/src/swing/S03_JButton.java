package swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import swing.quiz.S03_KakaoImageButtonTeacher;

public class S03_JButton extends JFrame{

	private static final long serialVersionUID = 1L;

	public S03_JButton() {
		
		setLayout(null);
		
//		JButton btn1 = new JButton("����������");
//		JButton btn2 = new JButton("����������");
//		JButton btn3 = new JButton("����������");
//		JButton btn4 = new JButton("����������");
		
		//setBounds() : ��ư�� ��ġ�� ũ�⼳���� �ѹ��� �Ѵ�(x,x,x,x) x,x��ġ�� x,xũ��
//		btn1.setBounds(100, 100, 400, 400);
		
		//setText() : �ش� ������Ʈ�� �ؽ�Ʈ�� �����Ѵ�
//		btn1.setText("Push this Button!");
		
		//setEnabled() : �ش� ������Ʈ�� Ȱ��ȭ/��Ȱ��ȭ�Ѵ�
//		btn1.setEnabled(true);
		
		//setBackground() : �ش� ������Ʈ�� ������ �����Ѵ�
//		btn1.setBackground(Color.BLACK); //�����̴��÷����
//		btn1.setBackground(new Color(255,255,0)); //�÷�ǥ���
		
		//setIcon() : �ش� ������Ʈ�� �������� �����Ѵ�
//		btn1.setIcon(new ImageIcon("./image/lionimage.png"));
//		btn2.setIcon(new ImageIcon("./image/lionimage.png"));
//		btn3.setIcon(new ImageIcon("./image/lionimage.png"));
//		btn4.setIcon(new ImageIcon("./image/lionimage.png"));
		
//		add(btn1);
		add(new S03_KakaoImageButtonTeacher(S03_KakaoImageButtonTeacher.RYON, 100, 300, 100, 100));		
		add(new S03_KakaoImageButtonTeacher(S03_KakaoImageButtonTeacher.APEACH, 300, 400, 100, 100));		
		add(new S03_KakaoImageButtonTeacher(S03_KakaoImageButtonTeacher.MUJI, 400, 500, 100, 100));		
		add(new S03_KakaoImageButtonTeacher(S03_KakaoImageButtonTeacher.TUBE, 0, 300, 100, 100));		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,700);
		setLocation(300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new S03_JButton();
		
	}
}
