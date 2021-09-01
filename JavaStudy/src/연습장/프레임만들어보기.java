package 연습장;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 프레임만들어보기 extends JFrame {

	JFrame jf;
	public 프레임만들어보기() {
		JButton jb1 = new JButton("바보1");
		JButton jb2 = new JButton("바보2");
		JButton jb3 = new JButton("바보3");
		JButton jb4 = new JButton("바보4");
		JButton jb5 = new JButton("바보5");
		JButton jb6 = new JButton("바보6");
		
		jf = new JFrame();
		jf.setSize(600,600);
		jf.setLocation(100, 100);
		jf.add(jb1);
		jf.add(jb2);
		jf.add(jb3);
		jf.add(jb4);
		jf.add(jb5);
		jf.add(jb6);
		
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		
		
		new 프레임만들어보기();
	}
}
