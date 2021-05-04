package mainAlgorithm;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;

public class showWindow extends JFrame{
	JTextArea txt1 = new JTextArea();
	JTextArea txt2 = new JTextArea();
	private JTextField textField_10;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	JTextArea textArea = new JTextArea();
	JTextArea textArea_1 = new JTextArea();
	JTextArea textArea_2 = new JTextArea();
	JTextArea textArea_4 = new JTextArea();
	JTextArea textArea_3 = new JTextArea();
	JTextArea textArea_5 = new JTextArea();
	JTextArea textArea_7 = new JTextArea();
	JTextArea textArea_6 = new JTextArea();
	JTextArea textArea_8 = new JTextArea();
	private final JTextArea t1 = new JTextArea();
	private final JTextArea t2 = new JTextArea();
	private final JTextArea t3 = new JTextArea();
	private final JTextArea t4 = new JTextArea();
	private final JTextArea t5 = new JTextArea();
	private final JTextArea t6 = new JTextArea();
	private final JTextArea t7 = new JTextArea();
	private final JTextArea t8 = new JTextArea();
	private final JTextArea txtrTheTimeRequired = new JTextArea();
	private final JTextArea textArea_10 = new JTextArea();
	public void info(String temp, Integer integer) {
		// TODO Auto-generated method stub
		for(int i=0; i<temp.length(); i++) {
			textArea_10.setText(integer.toString());
			String str;
			str = Character.toString(temp.charAt(i));
			str = alter(str);
			if(i==0)
				textArea.setText(str);
			else if(i==1)
				t1.setText(str);
			else if (i==2)
				textArea_1.setText(str);
			else if(i==3)
				t2.setText(str);
			else if(i==4)
				textArea_2.setText(str);
			else if(i==5)
				t3.setText(str);
			else if(i==6)
				textArea_3.setText(str);
			else if(i==7)
				t4.setText(str);
			else if(i==8)
				textArea_4.setText(str);
			else if(i==9)
				t5.setText(str);
			else if(i==10)
				textArea_5.setText(str);
			else if(i==11)
				t6.setText(str);
			else if(i==12)
				textArea_6.setText(str);
			else if(i==13)
				t7.setText(str);
			else if(i==14)
				textArea_7.setText(str);
			else if(i==15)
				t8.setText(str);
			else if(i==16)
				textArea_8.setText(str);
			
		}

	}
	public String alter(String s) {
		if(s.contentEquals("A"))
			return "China";
		else if(s.contentEquals("B"))
			return "USA";
		else if(s.contentEquals("C"))
			return "Canada";
		else if(s.contentEquals("D"))
			return "Brazil";
		else if(s.contentEquals("E"))
			return "Korea";
		else if(s.contentEquals("F"))
			return "Ezypt";
		else if(s.contentEquals("G"))
			return "England";
		else if(s.contentEquals("H"))
			return "Austrailia";
		else if(s.contentEquals("I"))
			return "Russia";
		else if(s.contentEquals("J"))
			return "Argentina";
		return s;
		
	}
	
	showWindow() {
        setTitle("result");
        // ÁÖÀÇ, ¿©±â¼­ setDefaultCloseOperation() Á¤ÀÇ¸¦ ÇÏÁö ¸»¾Æ¾ß ÇÑ´Ù
        // Á¤ÀÇÇÏ°Ô µÇ¸é »õ Ã¢À» ´ÝÀ¸¸é ¸ðµç Ã¢°ú ÇÁ·Î±×·¥ÀÌ µ¿½Ã¿¡ ²¨Áø´Ù
        
        JPanel NewWindowContainer = new JPanel();
        setContentPane(NewWindowContainer);
        NewWindowContainer.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 0, 694, 675);
        NewWindowContainer.add(panel);
        panel.setLayout(null);
        txt1.setForeground(new Color(135, 206, 235));
        txt1.setText("Result");
        txt1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 37));
        
        
        txt1.setBounds(279, 33, 173, 60);
        panel.add(txt1);
        
        txt2.setText("The shortest time");
        txt2.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 28));
        txt2.setBounds(233, 105, 335, 39);
        panel.add(txt2);
        
        JTextArea txtrWeCanGet = new JTextArea();
        txtrWeCanGet.setText("in the budget range is ");
        txtrWeCanGet.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 28));
        txtrWeCanGet.setBounds(208, 143, 402, 39);
        panel.add(txtrWeCanGet);
        
        textField_10 = new JTextField();
        textField_10.setFont(new Font("°íµµ B", Font.PLAIN, 28));
        textField_10.setText("\u2192");
        textField_10.setColumns(10);
        textField_10.setBounds(252, 254, 51, 30);
        panel.add(textField_10);
        
        textField = new JTextField();
        textField.setText("\u2192");
        textField.setFont(new Font("°íµµ B", Font.PLAIN, 28));
        textField.setColumns(10);
        textField.setBounds(252, 346, 51, 30);
        panel.add(textField);
        
        textField_1 = new JTextField();
        textField_1.setText("\u2192");
        textField_1.setFont(new Font("°íµµ B", Font.PLAIN, 28));
        textField_1.setColumns(10);
        textField_1.setBounds(468, 252, 51, 30);
        panel.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setText("\u2192");
        textField_2.setFont(new Font("°íµµ B", Font.PLAIN, 28));
        textField_2.setColumns(10);
        textField_2.setBounds(468, 346, 51, 30);
        panel.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setText("\u2192");
        textField_3.setFont(new Font("°íµµ B", Font.PLAIN, 28));
        textField_3.setColumns(10);
        textField_3.setBounds(468, 440, 51, 30);
        panel.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setText("\u2192");
        textField_4.setFont(new Font("°íµµ B", Font.PLAIN, 28));
        textField_4.setColumns(10);
        textField_4.setBounds(252, 440, 51, 30);
        panel.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setText("\u2192");
        textField_5.setFont(new Font("°íµµ B", Font.PLAIN, 28));
        textField_5.setColumns(10);
        textField_5.setBounds(42, 440, 51, 30);
        panel.add(textField_5);
        
        textField_6 = new JTextField();
        textField_6.setText("\u2192");
        textField_6.setFont(new Font("°íµµ B", Font.PLAIN, 28));
        textField_6.setColumns(10);
        textField_6.setBounds(42, 346, 51, 30);
        panel.add(textField_6);
        textArea.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        
        textArea.setBounds(110, 237, 139, 47);
        panel.add(textArea);
        textArea_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        

        textArea_1.setBounds(313, 237, 139, 47);
        panel.add(textArea_1);
        textArea_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        
        textArea_2.setBounds(527, 237, 139, 47);
        panel.add(textArea_2);
        textArea_4.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        
        textArea_4.setBounds(313, 328, 139, 47);
        panel.add(textArea_4);
        textArea_3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        
        textArea_3.setBounds(110, 328, 139, 47);
        panel.add(textArea_3);
        textArea_5.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        
        textArea_5.setBounds(527, 328, 139, 47);
        panel.add(textArea_5);
        textArea_7.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        
        textArea_7.setBounds(313, 423, 139, 47);
        panel.add(textArea_7);
        textArea_6.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        
        textArea_6.setBounds(110, 423, 139, 47);
        panel.add(textArea_6);
        textArea_8.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        
        textArea_8.setBounds(527, 423, 139, 47);
        panel.add(textArea_8);
        t1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        t1.setBounds(252, 218, 51, 39);
        
        panel.add(t1);
        t2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        t2.setBounds(468, 218, 51, 39);
        
        panel.add(t2);
        t3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        t3.setBounds(42, 307, 51, 39);
        
        panel.add(t3);
        t4.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        t4.setBounds(252, 307, 51, 39);
        
        panel.add(t4);
        t5.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        t5.setBounds(468, 307, 51, 39);
        
        panel.add(t5);
        t6.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        t6.setBounds(42, 402, 51, 39);
        
        panel.add(t6);
        t7.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        t7.setBounds(252, 402, 51, 39);
        
        panel.add(t7);
        t8.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
        t8.setBounds(468, 402, 51, 39);
        
        panel.add(t8);
        txtrTheTimeRequired.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 24));
        txtrTheTimeRequired.setText("The time required : ");
        txtrTheTimeRequired.setBounds(157, 513, 217, 47);
        
        panel.add(txtrTheTimeRequired);
        textArea_10.setFont(new Font("Sitka Banner", Font.BOLD, 27));
        textArea_10.setBounds(383, 510, 203, 47);
        
        panel.add(textArea_10);
        
        //String resultStr = null;
        //resultStr = JOptionPane.showInputDialog("Please enter Budget");
        // (resultStr ¸®ÅÏ°ªÀ¸·Î ÀÔ·Â¹ÞÀº ¸Þ½ÃÁö ¹®ÀÚ¿­À» ¸®ÅÏÇØÁØ´Ù.)    
        setSize(700,700);
        setResizable(false);
        setVisible(true);
    }
}
