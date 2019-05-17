package library_gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SeatPanel extends JPanel implements ActionListener {

	
	
	int room_id = 0;
	int row  = 2;
	int colum = 2;
	int capacity=4;
	JButton[] btn_zuowei;

	public SeatPanel(int room_id) {//��ʼ����λ״̬
		
		this. setBounds(0, 0, 850, 602);
		this.setLayout(new GridLayout(row, colum));
		btn_zuowei = new JButton[capacity];
		for(int i =0;i<capacity;i++){
			btn_zuowei[i] = new  JButton();
			btn_zuowei[i].setBounds(10, 1, 50, 20);
			btn_zuowei[i].setText("δռ��");
			btn_zuowei[i].addActionListener(this);
			this.add(btn_zuowei[i]);
		}				
	}
	public void changeSeatState(int seatNum,int state) {//��ʼ����λ״̬
		
			if(state<0) {
				btn_zuowei[seatNum].setText("δռ��");
			}
			else {
				if(state==0)
				{
					btn_zuowei[seatNum].setText("ռ��");
				}
				else
					btn_zuowei[seatNum].setText("����"+state+"����");
			}
			
			
		}				
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		for (int i = 0; i < btn_zuowei.length; i++) {
				
				if (obj == btn_zuowei[i]) {
//					int flag = JOptionPane.showConfirmDialog(ZuoWeiFrame.this, "ȷ��ѡ����", "ȷ����Ϣ",JOptionPane.YES_NO_OPTION);	
//					if(flag == JOptionPane.YES_OPTION) {
//						seat = i*10+j+1;
//						String seat2 = seat+"";
//						Ticket ticket = new Ticket(user.getUser_id(), session.getMovie_id(), session.getSession_id(), seat2);
//						boolean addTicket = ts.addTicket(ticket);
//						if(addTicket){
//							JOptionPane.showMessageDialog(ZuoWeiFrame.this, "����ɹ�!");
//							sessionSevice.updataSession(session.getSession_id(), session.getRemain()-1);
//							us.updataUser(user.getUser_id(), user.getBalance()-session.getPrice());
//							uu.showSessionTable(sessionSevice.queryAllSession());
//							uu.showTicketTable(ts.queryTicketByUserId(user.getUser_id()));
						}
					 //ZuoWeiFrame.this.dispose();
					//}
				}
			}
		//}
	//}
 
}
