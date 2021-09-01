package swing.quiz;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_LottoTeacher extends JFrame{

	public S02_LottoTeacher() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		btns.add(new S02_NumberButton(100, 100));
		btns.add(new S02_NumberButton(200, 100));
		btns.add(new S02_NumberButton(300, 100));
		btns.add(new S02_NumberButton(400, 100));
		btns.add(new S02_NumberButton(500, 100));
		btns.add(new S02_NumberButton(600, 100));
		
		JButton nextBtn = new S02_NextButton(100, 300, btns);
		
		for(JButton btn : btns) {
			add(btn);
		}
		add(nextBtn);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(500,500);
		setSize(800,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new S02_LottoTeacher();
	}

}
