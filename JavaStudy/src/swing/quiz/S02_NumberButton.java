package swing.quiz;

import java.awt.Font;
import java.awt.Point;

import javax.swing.JButton;

public class S02_NumberButton extends JButton {

	public S02_NumberButton(int x, int y) {
	
		super("0");  //만들어졌을때 기본적으로 0이라는 라벨이 붙는다
		
		setFont(new Font("Consolas", Font.BOLD, 30));
		setSize(80,80);
		setLocation(new Point(x, y));
	}
}
