package library_gui;

import javax.swing.JPanel;
import java.util.*;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class CalendarPanel extends JPanel{

	private Chooser ser,ser2;
	private JTextField text;
	public CalendarPanel () {
		this.setLayout(null);
        this.setBounds(400, 200, 600, 400);
        ser = Chooser.getInstance();
        text = new JTextField();
        text.setBounds(10, 10, 200, 30);
        text.setText("2018-9-3");
        ser.register(text);
        
        ser2 = Chooser.getInstance("yyyy��MM��dd��");
        
        this.add(text);
        this.setVisible(true);
	}
	public String getText() {//��ȡ����
		
		return text.getText();
	}
	
	public int getYear() {//�����꣨int��
		int year=0;
		String str1;
		String str2="";
		
		str1=text.getText();
		if(str1!=null) {
			int i=0;
			while(str1.charAt(i)>=48&&str1.charAt(i)<=57)//48-57�����ֵ�ASCii��
			{
				str2+=str1.charAt(i);
				i++;
			}
			year=Integer.parseInt(str2);
			
		}
		return year;
	}
	public int getMonth() {//�����£�1-12��
		int month=0;
		String str1;
		String str2="";
		
		str1=text.getText();
		if(str1!=null) {
			int i=0;
			while(str1.charAt(i)>=48&&str1.charAt(i)<=57)
			{
				i++;
			}
			i++;
			while(str1.charAt(i)>=48&&str1.charAt(i)<=57)
			{
				str2+=str1.charAt(i);
				i++;
			}
			month=Integer.parseInt(str2);
			
		}
		
		
		return month;
	}
	public int getDate()//�������ڣ�1-31������
	{
		int date=0;
		String str1;
		String str2="";
		str1=text.getText();
		int length=str1.length();
		if(str1!=null) {
			int i=0;
			while(str1.charAt(i)>=48&&str1.charAt(i)<=57)
			{
				i++;
			}
			i++;
			while(str1.charAt(i)>=48&&str1.charAt(i)<=57)
			{
				
				i++;
			}
			i++;
			while(str1.charAt(i)>=48&&str1.charAt(i)<=57)
			{
				str2+=str1.charAt(i);
				if(i<length-1)
					i++;
				else {
					date=Integer.parseInt(str2);
					return date;
				}
			}
			date=Integer.parseInt(str2);
			
		}		
		return date;
	}
}
