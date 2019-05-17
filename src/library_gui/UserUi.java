package library_gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class UserUi{

	// ��Ա����
	private JFrame jf = new JFrame("ͼ���ϵͳ");//���� 
	private Container con = jf.getContentPane();// ������

	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Dimension sc = toolkit.getScreenSize();// �����Ļ�ߴ�
	private JLabel lb_welcome = null;// ��ӭ��ǩ

	JTable rtb = null;
	JTable rtb2 = null;

	private JButton btnsearch = new JButton("����");// ������ť
	private CalendarPanel cp= new CalendarPanel();//ʱ���ǩ
	private TimePanel tp = new TimePanel();
	
	private JMenuBar menuBar = new JMenuBar();// �˵���


	private JLabel card0 = new JLabel();// ��ǩ
	private JLabel card1 = new JLabel();
	
	private Font font = new Font("����", 0, 20);
	private Font font0 = new Font("����", 0, 25);
	private Font font1 = new Font("����", 0, 16);
	private Font font2 = new Font("����", 0, 15);

	private JTable tb = null;
	private SeatPanel panel1;
	private SeatPanel panel2;

	JButton[] card1_btn = null;
	int x = 0;

	int k = 0;


	public UserUi() {
		
		jf.setSize(1000, 618);
		jf.setLocation((sc.width - 1000) / 2, (sc.height - 618) / 2);

		jf.setResizable(false);// ���ڴ�С���ɱ�
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.setVisible(true);
		
		btnsearch.setBounds(300, 0, 150, 30);
		btnsearch.setFont(font1);
		btnsearch.addActionListener(new ActionListener() {//��������
		@Override
		public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println(cp.getText());//���ڸ�ʽXXX-yy-zz
				String[] time = tp.getText();
				//System.out.println(time[0]);//Сʱ(�ַ���)
				//System.out.println(time[1]);//����(�ַ���)
				int hour = tp.getHour();//Сʱ(����)
				int min = tp.getMin();//����(����)
				int year=cp.getYear();//��
				int month=cp.getMonth();//��
				int date=cp.getDate();//��
				//System.out.println(cp.getYear());
				//System.out.println(cp.getMonth());
				//System.out.println(cp.getDate());
				//System.out.println(hour);
				//System.out.println(min);
				panel1.changeSeatState(2, -1);//�ı�ĳ������ĳ����λ״̬
				panel2.changeSeatState(2, 0);
				panel1.changeSeatState(1, 40);
			}
		});

		lb_welcome = new JLabel("��ӭʹ��ѡ��ϵͳ");
		lb_welcome.setFont(new Font("����", Font.BOLD, 34));
		lb_welcome.setForeground(Color.BLUE);

		jf.setJMenuBar(menuBar);
		menuBar.add(cp);
		menuBar.add(tp);
		menuBar.add(btnsearch);
		menuBar.add(lb_welcome);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.RIGHT);// �����λ��
		// ѡ������
		tabbedPane.setFont(font);// ѡ���������壬�ֺ�
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);// ÿ��ѡ�����ģʽ
		
		con.add(tabbedPane);
		
		tabbedPane.addTab("301����", card0);
		panel1 = new SeatPanel(301);
		card0.add(panel1);

		// card1
		tabbedPane.addTab("302����", card1);
		panel2 = new SeatPanel(302);
		panel2.setBounds(0, 0, 850, 602);
		card1.add(panel2);

		tabbedPane.setSelectedIndex(0); // ����Ĭ��ѡ�е�card
	}
	public static void main(String[] args) {
		new UserUi();
		
	}
}
