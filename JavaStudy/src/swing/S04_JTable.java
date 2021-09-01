package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class S04_JTable extends JFrame{

	public S04_JTable() {
		
		Container container = getContentPane();
		
		setLayout(new BorderLayout(50,50));
		
		String data[][] = {
				{"100","Smith","3500","10"},
				{"101","King","4500","30"},
				{"102","Steve","50000","20"},
				{"103","Ryo","30","10"},
		};
		
		String column[] = {"ID", "NAME", "SALARY", "DEPTNO"};
		
		JTable table = new JTable(data, column);
		
		//행과 열의 크기만큼 테이블생성
		JTable table2 = new JTable(3, 4);
		
		//수동말고 model 로 컬럼, 튜플 insert하기
		DefaultTableModel model = (DefaultTableModel)table2.getModel();
		
		model.addRow(data[0]);;
		model.addRow(data[1]);;
		model.addRow(data[2]);;
		
		add(table, BorderLayout.CENTER);
		add(new JButton("Hello, Swing!"), BorderLayout.SOUTH);
		add(new JButton("Hello, Swing!"), BorderLayout.EAST);
		add(new JButton("Hello, Swing!"), BorderLayout.NORTH);
		add(new JButton("Hello, Swing!"), BorderLayout.WEST);
		
		//컴포넌트의 크기가 변할때마다 이벤트 발생시키는것
		//컴포넌트리스너로 그대로 상속받으면 있는것을 다 구현해야되고 컴포넌트어뎁터를 통해 구현하면 이중에 구현하고 싶은것만 구현할수있다
		// ※Adapter 는 Listener 축소버전! 다 구현안해도되고 원하는것만해도됨
		addComponentListener(new ComponentAdapter() {
			
			@Override
			public void componentResized(ComponentEvent e) {
				java.awt.Component com = e.getComponent();
				System.out.println("-----------------------------------");
				System.out.println("location - (" + com.getX() + ", " + com.getY() + ")");
				System.out.println("size - (" + com.getWidth() + ", " + com.getHeight() + ")");
			}
		});
		
		//MouseListener 사용해보자
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				container.setBackground(Color.GREEN);
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				container.setBackground(Color.BLUE);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				container.setBackground(Color.BLACK);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				container.setBackground(Color.RED);
				
			}
			
		});
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(465,162,482,478);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S04_JTable();
	}
}
