package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class S07_CardLayout extends MyFrame {

	/*
		# CardLayout
		
			- 컴포넌트를 카드처럼 넘기면서 사용하는 레이아웃
			
		# 함수들
			CardLayout.first(parent) : 맨처음카드보기
			CardLayout.last(parent) : 마지막카드보기
			CardLayout.next(parent) : 다음카드보기
			CardLayout.previous(parent) : 이전카드보기
			CardLayout.show(parent, "카드명") : 보고싶은카드보기
	 */
	
	public S07_CardLayout() {
		
		setLayout(new BorderLayout());
		
		JPanel center = new JPanel(); //센터에 판넬하나만듬
		
		//JLabel : 내용을 그냥 출력하는 곳
		JLabel label1 = new JLabel("Hello!");
		JLabel label2 = new JLabel("Nice to meet you!");
		JLabel label3 = new JLabel("Good bye!");
		JLabel label4 = new JLabel(new ImageIcon("./image/kakao.jpg"));
		
//		label1.setIcon(new ImageIcon("./image/kakao.jpg"));
		
		//카드 레이아웃에 컴포넌트를 추가할때는 컴포넌트의 이름을 지정해 놓는 것이 좋다
		CardLayout card = new CardLayout(5,5);
		center.setLayout(card);
		center.add("card1", label1); //컴포넌트의 이름을 정해주는것 "card1"
		center.add("card2", label2);
		center.add("card3", label3);
		center.add("card4", label4);
		
		JPanel south = new JPanel(); //아래쪽에 판넬하나만듬
		
		JButton prev = new JButton("prev");
		JButton next = new JButton("next");
		
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// CardLayout card = (CardLayout)center.getLayout();//레이아웃메니저를 상속받았기때문에 레이아웃의 아래인 카드레이아웃으로 다운캐스팅필요
				
				//CardLayout.first(parent) : 맨처음카드보기
				//CardLayout.last(parent) : 마지막카드보기
				//CardLayout.next(parent) : 다음카드보기
				//CardLayout.previous(parent) : 이전카드보기
				//CardLayout.show(parent, "카드명") : 보고싶은카드보기
				
				card.next(center); //다음카드로 넘기기(부모 인스턴스 필요/레이아웃이 설정된 컨테이너의 인스턴스가 필요하다)
				
//				card.show(center, "card3");//원하는카드 보기
			}
		});
		prev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(center);
			}
		});
		
		//아래쪽 판넬을 그리드 레이아웃으로 나누어서 두개 버튼을 넣음
		south.setLayout(new GridLayout(1,2));
		south.add(prev);
		south.add(next);
	
		
		//만들어 둔 판넬 두개를 전체 프레임 하나에 넣는 과정
		add(center,BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		
		setSize(350,350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new S07_CardLayout();
		
	}

}









