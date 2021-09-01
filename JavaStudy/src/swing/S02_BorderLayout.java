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
			- 동서남북과 가운데로 이루어진 레이아웃
			- 컴포넌트를 추가할 때 위치를 함께 지정해 줄 수 있다
			- 수평 여백과 수직 여백을 설정할 수 있다
	 */
	
	//JFrame을 상속받아서 클래스를 생성하면서 설정을 바꾼다
	public S02_BorderLayout() {
		
		//이 프레임의 레이아웃 설정 (설정 안해놨을때 기본적으로 BorderLayout으로 되어있기 때문에 생략이 가능하긴하다)
		setLayout(new BorderLayout());
		
		//레이아웃 설정 후 추가해야함
		JButton quit_btn = new JButton("Quit");
		
		//버튼의 폰트 설정
		quit_btn.setFont(new Font("궁서체", Font.BOLD, 35));
		
		//버튼에 이벤트를 추가
		quit_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 해당 컴포넌트에 action 발생시 e로 이벤트 당시의 정보가 넘어온다.
				System.out.println("눌린것 정보1 : " + e.getActionCommand());
				System.out.println("눌린것 정보2 : " + e.getID());
				System.out.println("눌린것 정보3 : " + e.getModifiers());
				System.out.println("눌린것 정보4 : " + e.getWhen());
				System.out.println("눌린것 정보6 : " + e.getSource());
				
				//e.getSource()에는 액션이 발생한 컴포넌트의 인스턴스가 들어있고 다운캐스팅하여 사용해야한다 
				((JButton)e.getSource()).setText("Quit 눌렸음!");
			}
			
		});
		
		JButton save_btn = new JButton("Save");
		save_btn.setFont(new Font("고딕체", Font.BOLD, 30));
		save_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				((JButton)e.getSource()).setText("Save 눌렸음!");
			}
			
		});
		add(save_btn, BorderLayout.CENTER);
		add(new JButton("Load"), BorderLayout.EAST);
		add(new JButton("Delete"), BorderLayout.WEST);
		add(new JButton("Update"), BorderLayout.NORTH);
		add(quit_btn, BorderLayout.SOUTH);
		
		//위치설정
		setLocation(100,100);
		
		//프레임 크기 설정
		setSize(500,500);
		
		//X버튼을 눌렀을 떄의 동작 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임을 보이게 설정(화면에 그린다)
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new S02_BorderLayout();
	}
}
