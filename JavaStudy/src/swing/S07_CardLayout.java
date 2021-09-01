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
		
			- ������Ʈ�� ī��ó�� �ѱ�鼭 ����ϴ� ���̾ƿ�
			
		# �Լ���
			CardLayout.first(parent) : ��ó��ī�庸��
			CardLayout.last(parent) : ������ī�庸��
			CardLayout.next(parent) : ����ī�庸��
			CardLayout.previous(parent) : ����ī�庸��
			CardLayout.show(parent, "ī���") : �������ī�庸��
	 */
	
	public S07_CardLayout() {
		
		setLayout(new BorderLayout());
		
		JPanel center = new JPanel(); //���Ϳ� �ǳ��ϳ�����
		
		//JLabel : ������ �׳� ����ϴ� ��
		JLabel label1 = new JLabel("Hello!");
		JLabel label2 = new JLabel("Nice to meet you!");
		JLabel label3 = new JLabel("Good bye!");
		JLabel label4 = new JLabel(new ImageIcon("./image/kakao.jpg"));
		
//		label1.setIcon(new ImageIcon("./image/kakao.jpg"));
		
		//ī�� ���̾ƿ��� ������Ʈ�� �߰��Ҷ��� ������Ʈ�� �̸��� ������ ���� ���� ����
		CardLayout card = new CardLayout(5,5);
		center.setLayout(card);
		center.add("card1", label1); //������Ʈ�� �̸��� �����ִ°� "card1"
		center.add("card2", label2);
		center.add("card3", label3);
		center.add("card4", label4);
		
		JPanel south = new JPanel(); //�Ʒ��ʿ� �ǳ��ϳ�����
		
		JButton prev = new JButton("prev");
		JButton next = new JButton("next");
		
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// CardLayout card = (CardLayout)center.getLayout();//���̾ƿ��޴����� ��ӹ޾ұ⶧���� ���̾ƿ��� �Ʒ��� ī�巹�̾ƿ����� �ٿ�ĳ�����ʿ�
				
				//CardLayout.first(parent) : ��ó��ī�庸��
				//CardLayout.last(parent) : ������ī�庸��
				//CardLayout.next(parent) : ����ī�庸��
				//CardLayout.previous(parent) : ����ī�庸��
				//CardLayout.show(parent, "ī���") : �������ī�庸��
				
				card.next(center); //����ī��� �ѱ��(�θ� �ν��Ͻ� �ʿ�/���̾ƿ��� ������ �����̳��� �ν��Ͻ��� �ʿ��ϴ�)
				
//				card.show(center, "card3");//���ϴ�ī�� ����
			}
		});
		prev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(center);
			}
		});
		
		//�Ʒ��� �ǳ��� �׸��� ���̾ƿ����� ����� �ΰ� ��ư�� ����
		south.setLayout(new GridLayout(1,2));
		south.add(prev);
		south.add(next);
	
		
		//����� �� �ǳ� �ΰ��� ��ü ������ �ϳ��� �ִ� ����
		add(center,BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		
		setSize(350,350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new S07_CardLayout();
		
	}

}









