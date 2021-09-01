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
		
//		JButton btn1 = new JButton("눌러보세요");
//		JButton btn2 = new JButton("눌러보세요");
//		JButton btn3 = new JButton("눌러보세요");
//		JButton btn4 = new JButton("눌러보세요");
		
		//setBounds() : 버튼의 위치와 크기설정을 한번에 한다(x,x,x,x) x,x위치에 x,x크기
//		btn1.setBounds(100, 100, 400, 400);
		
		//setText() : 해당 컴포넌트의 텍스트를 변경한다
//		btn1.setText("Push this Button!");
		
		//setEnabled() : 해당 컴포넌트를 활성화/비활성화한다
//		btn1.setEnabled(true);
		
		//setBackground() : 해당 컴포넌트의 배경색을 변경한다
//		btn1.setBackground(Color.BLACK); //원래이는컬러사용
//		btn1.setBackground(new Color(255,255,0)); //컬러표사용
		
		//setIcon() : 해당 컴포넌트의 아이콘을 설정한다
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
