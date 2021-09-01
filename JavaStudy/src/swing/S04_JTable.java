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
		
		//��� ���� ũ�⸸ŭ ���̺����
		JTable table2 = new JTable(3, 4);
		
		//�������� model �� �÷�, Ʃ�� insert�ϱ�
		DefaultTableModel model = (DefaultTableModel)table2.getModel();
		
		model.addRow(data[0]);;
		model.addRow(data[1]);;
		model.addRow(data[2]);;
		
		add(table, BorderLayout.CENTER);
		add(new JButton("Hello, Swing!"), BorderLayout.SOUTH);
		add(new JButton("Hello, Swing!"), BorderLayout.EAST);
		add(new JButton("Hello, Swing!"), BorderLayout.NORTH);
		add(new JButton("Hello, Swing!"), BorderLayout.WEST);
		
		//������Ʈ�� ũ�Ⱑ ���Ҷ����� �̺�Ʈ �߻���Ű�°�
		//������Ʈ�����ʷ� �״�� ��ӹ����� �ִ°��� �� �����ؾߵǰ� ������Ʈ��͸� ���� �����ϸ� ���߿� �����ϰ� �����͸� �����Ҽ��ִ�
		// ��Adapter �� Listener ��ҹ���! �� �������ص��ǰ� ���ϴ°͸��ص���
		addComponentListener(new ComponentAdapter() {
			
			@Override
			public void componentResized(ComponentEvent e) {
				java.awt.Component com = e.getComponent();
				System.out.println("-----------------------------------");
				System.out.println("location - (" + com.getX() + ", " + com.getY() + ")");
				System.out.println("size - (" + com.getWidth() + ", " + com.getHeight() + ")");
			}
		});
		
		//MouseListener ����غ���
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
