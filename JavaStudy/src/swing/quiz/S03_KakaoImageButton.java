package swing.quiz;

import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_KakaoImageButton extends JFrame{

	public S03_KakaoImageButton() {
		// TODO Auto-generated constructor stub
		
//		JSplitPane sp1,sp2;        //JSplitPane�� ����
//	    JButton b1,b2,b3;
		
	    setLayout(null);
	    
//	    sp1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);    // �¿� �ڸ���..
//	    sp1.setDividerLocation(350);
//        ImageIcon i1=new ImageIcon("./image/kakao.jpg");
//        b1=new JButton(i1);
        
//        sp1.setRightComponent(b1);    //�����ʿ� ��ư�� ����
//	   
//        b1.setBounds(10,10,200,200);
//        b1.setEnabled(true); 
//        
//        b1.contains(50, 50);
//        sp1.contains(50, 50);
//        add(b1);
        
//        sp2=new JSplitPane(JSplitPane.VERTICAL_SPLIT);    //���� �ѹ��� �ڸ�
//        sp2.setDividerLocation(40);        //�ڸ��� ��ġ�� ���� 120�� ��ġ���� ����
//        ImageIcon i2=new ImageIcon("./image/kakao.jpg");
//        b2=new JButton(i2);
//        ImageIcon i3=new ImageIcon("./image/kakao.jpg");
//        b3=new JButton(i3);
//        sp2.setTopComponent(b2);    //���ʿ� ��ư2 ����
//        sp2.setBottomComponent(b3);        //�Ʒ��ʿ� ��ư3 ����
//        
//        sp1.add(sp2);        //���Ϸ� �ڸ� JSplitPane�� �¿�� �ڸ� JSplitPane�� �߰��Ѵ�.
//        getContentPane().add(sp1);    //JSplitPane�� �����ӿ� ��ġ�Ѵ�.
        
		
		JButton btn1 = new JButton("");

				
//		ImageIcon chageImage = new ImageIcon("./image/kakao.jpg");
//		Image changedImage = chageImage.getImage();
//		Image completeImage = changedImage.getScaledInstance(30, 80, EXIT_ON_CLOSE);
//		ImageIcon icon = new ImageIcon(completeImage);
		
		btn1.setIcon(new ImageIcon("./image/kakao.jpg").);
//		btn1.setIcon(icon);
		btn1.setBounds(100, 100, 400, 400);
		btn1.setEnabled(true);
		
		
		
		add(btn1);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,700);
		setLocation(300,100);
		setVisible(true);
	    
		BufferedImage img = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);

		//-----------------------------------------------------------------------------------
		
		
	    
	}
	
	public static void main(String[] args) {
		
		new S03_KakaoImageButton();
		
	}
}
