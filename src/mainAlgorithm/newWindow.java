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

public class newWindow extends JFrame{
	JTextArea txt1 = new JTextArea();
	newWindow() {
        setTitle("No result");
        // ����, ���⼭ setDefaultCloseOperation() ���Ǹ� ���� ���ƾ� �Ѵ�
        // �����ϰ� �Ǹ� �� â�� ������ ��� â�� ���α׷��� ���ÿ� ������
        
        JPanel NewWindowContainer = new JPanel();
        setContentPane(NewWindowContainer);
        NewWindowContainer.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 394, 371);
        NewWindowContainer.add(panel);
        panel.setLayout(null);
        txt1.setForeground(new Color(153, 50, 204));
        txt1.setText("Sorry!");
        txt1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
        
        
        txt1.setBounds(139, 78, 119, 60);
        panel.add(txt1);
        
        JTextArea txt2 = new JTextArea();
        txt2.setText("There's no way\r\n");
        txt2.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 30));
        txt2.setBounds(88, 148, 220, 39);
        panel.add(txt2);
        
        JTextArea txtrWeCanGet = new JTextArea();
        txtrWeCanGet.setText("we can get to the budget.");
        txtrWeCanGet.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 28));
        txtrWeCanGet.setBounds(52, 185, 308, 39);
        panel.add(txtrWeCanGet);
        
        //String resultStr = null;
        //resultStr = JOptionPane.showInputDialog("Please enter Budget");
        // (resultStr ���ϰ����� �Է¹��� �޽��� ���ڿ��� �������ش�.)

        
        setSize(400,300);
        setResizable(false);
        setVisible(true);
    }
}
