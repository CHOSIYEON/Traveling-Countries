package mainAlgorithm;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.ArrayList;

class ImagePanel extends JPanel {
	Image image;

	public ImagePanel() {
		image = new ImageIcon("Map.png").getImage();

	}

	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);// �����ϰ�
		super.paint(g);
	}
}

public class country extends JFrame {
	ArrayList<String> citys = new ArrayList<>();

	Container content;
	ImagePanel imgP;
	public int budget;
	public boolean go = false;

	public country() {
		super("Traveling Countselling");
		imgP = new ImagePanel();
		content = getContentPane();
		content.add(imgP, BorderLayout.CENTER);
		imgP.setLayout(null);

		JButton china = new JButton("CHINA");
		china.setFont(new Font("�� B", Font.PLAIN, 36));
		china.setBounds(673, 217, 153, 56);
		imgP.add(china);

		JButton usa = new JButton("USA");
		usa.setForeground(Color.BLACK);
		usa.setFont(new Font("�� B", Font.PLAIN, 36));
		usa.setBounds(111, 161, 126, 56);
		imgP.add(usa);

		JButton canada = new JButton("CANADA");
		canada.setBounds(58, 81, 211, 66);
		canada.setFont(new Font("�� B", Font.PLAIN, 36));
		imgP.add(canada);

		JButton brazil = new JButton("BRAZIL");
		brazil.setFont(new Font("�� B", Font.PLAIN, 36));
		brazil.setBounds(254, 313, 185, 56);
		imgP.add(brazil);

		JButton korea = new JButton("KOREA");
		korea.setFont(new Font("�� B", Font.PLAIN, 36));
		korea.setFocusPainted(false);
		korea.setContentAreaFilled(false);
		korea.setBorderPainted(false);
		korea.setBackground(Color.WHITE);
		korea.setBounds(749, 161, 170, 56);
		imgP.add(korea);

		JButton ezypt = new JButton("EZYPT");
		ezypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ezypt.setFont(new Font("�� B", Font.PLAIN, 36));
		ezypt.setFocusPainted(false);
		ezypt.setContentAreaFilled(false);
		ezypt.setBorderPainted(false);
		ezypt.setBackground(Color.WHITE);
		ezypt.setBounds(407, 217, 180, 56);
		imgP.add(ezypt);

		JButton england = new JButton("ENGLAND");
		england.setFont(new Font("�� B", Font.PLAIN, 36));
		england.setFocusPainted(false);
		england.setContentAreaFilled(false);
		england.setBorderPainted(false);
		england.setBackground(Color.WHITE);
		england.setBounds(408, 161, 263, 56);
		imgP.add(england);

		china.setBackground(Color.white);
		usa.setBackground(Color.white);
		canada.setBackground(Color.LIGHT_GRAY);
		brazil.setBackground(Color.white);
		korea.setBackground(Color.white);
		china.setBorderPainted(false);
		china.setContentAreaFilled(false);
		china.setFocusPainted(false);
		usa.setBorderPainted(false);
		usa.setContentAreaFilled(false);
		usa.setFocusPainted(false);
		canada.setBorderPainted(false);
		canada.setContentAreaFilled(false);
		canada.setFocusPainted(false);
		brazil.setBorderPainted(false);
		brazil.setContentAreaFilled(false);
		brazil.setFocusPainted(false);
		korea.setBorderPainted(false);
		korea.setContentAreaFilled(false);
		korea.setFocusPainted(false);
		ezypt.setBorderPainted(false);
		ezypt.setContentAreaFilled(false);
		ezypt.setFocusPainted(false);
		england.setBorderPainted(false);
		england.setContentAreaFilled(false);
		england.setFocusPainted(false);
		JButton start = new JButton("SEARCH AIRLINE");
		start.setBounds(752, 427, 237, 66);
		start.setFont(new Font("Yu Gothic", Font.PLAIN, 23));
		start.setBackground(SystemColor.info);
		imgP.add(start);

		JLabel selected = new JLabel("SELECTED");
		selected.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		selected.setBounds(24, 427, 106, 66);
		imgP.add(selected);

		JLabel order = new JLabel("");
		order.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		order.setBounds(144, 427, 106, 66);
		imgP.add(order);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(144, 443, 346, 36);
		imgP.add(textArea);

		JButton austrailia = new JButton("AUSTRAILIA");
		austrailia.setFont(new Font("�� B", Font.PLAIN, 36));
		austrailia.setFocusPainted(false);
		austrailia.setContentAreaFilled(false);
		austrailia.setBorderPainted(false);
		austrailia.setBackground(Color.WHITE);
		austrailia.setBounds(701, 331, 289, 56);
		imgP.add(austrailia);

		JButton russia = new JButton("RUSSIA");
		russia.setFont(new Font("�� B", Font.PLAIN, 36));
		russia.setFocusPainted(false);
		russia.setContentAreaFilled(false);
		russia.setBorderPainted(false);
		russia.setBackground(Color.WHITE);
		russia.setBounds(540, 91, 249, 56);
		imgP.add(russia);

		JButton argentina = new JButton("ARGENTINA");
		argentina.setFont(new Font("�� B", Font.PLAIN, 36));
		argentina.setFocusPainted(false);
		argentina.setContentAreaFilled(false);
		argentina.setBorderPainted(false);
		argentina.setBackground(Color.WHITE);
		argentina.setBounds(331, 375, 273, 56);
		imgP.add(argentina);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);

		// ��ư�� Ŭ���ϸ� �̰���
		china.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("A");
				citys.add("A"); // citys array list �� ���� �ֱ�
				china.setForeground(Color.RED);
			}
		});
		usa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("B");
				citys.add("B"); // country array�� ���� �ֱ�
				usa.setForeground(Color.RED);
			}

		});
		canada.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("C");
				citys.add("C"); // country array�� ���� �ֱ�
				canada.setForeground(Color.RED);
			}

		});
		brazil.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("D");
				citys.add("D"); // country array�� ���� �ֱ�
				brazil.setForeground(Color.RED);
			}

		});
		korea.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("E");
				citys.add("E"); // country array�� ���� �ֱ�
				korea.setForeground(Color.RED);
			}

		});
		ezypt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("F");
				citys.add("F"); // country array�� ���� �ֱ�
				ezypt.setForeground(Color.RED);
			}

		});
		england.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("G");
				citys.add("G"); // country array�� ���� �ֱ�
				england.setForeground(Color.RED);
			}

		});
		austrailia.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("H");
				citys.add("H"); // country array�� ���� �ֱ�
				austrailia.setForeground(Color.RED);
			}

		});
		russia.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("I");
				citys.add("I"); // country array�� ���� �ֱ�
				russia.setForeground(Color.RED);
			}

		});
		argentina.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("J");
				citys.add("J"); // country array�� ���� �ֱ�
				argentina.setForeground(Color.RED);
			}

		});
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (citys.size() >= 3) { // ������ ���� 2�� �̻��� �� �˰��� ����
					// new newWindow(citys); // *** ������ array list�� ����.
					go = true;
					String budgetStr = null;
					budgetStr = JOptionPane.showInputDialog("Please enter Budget");
					budget = Integer.parseInt(budgetStr);
					System.out.println("budget : " + budget);
					Demo.money = budget;
					setVisible(false);
					for (int i = 0; i < citys.size(); i++) {

						if (i == 0) {
							Demo.start_city = citys.get(i);
						} else {
							Demo.visitCity = Demo.visitCity + citys.get(i);

						}

					}
					Demo.visitCity=Demo.visitCity.substring(4);
					//System.out.println(Demo2.visitCity);
					Demo.execute();
					

				} else {// ������ ���� 1���� �˰��� ������Ѵ�.
					System.out.println("Please select at least two destinations.");
					JOptionPane.showMessageDialog(null, "Please select at least two destinations.");
				}
			}

		});
		// public void action
		setSize(1022, 562);
		setVisible(true);
	}

	public ArrayList<String> getCountryList() {
		return citys;
	}

	public int getBudget() {
		return budget;
	}

	public boolean start() {
		return go;
	}

	public static void main(String[] args) {
		country frame = new country();
	}

	/*
	 * class newWindow extends JFrame { // ��ư�� �������� ��������� �� â�� ������ Ŭ����
	 * newWindow(ArrayList<String> citys) { setTitle("result"); // ����, ���⼭
	 * setDefaultCloseOperation() ���Ǹ� ���� ���ƾ� �Ѵ� // �����ϰ� �Ǹ� �� â�� ������ ��� â�� ���α׷��� ���ÿ�
	 * ������
	 * 
	 * JPanel NewWindowContainer = new JPanel(); setContentPane(NewWindowContainer);
	 * 
	 * JLabel NewLabel = new JLabel("�Ϳ��");
	 * 
	 * NewWindowContainer.add(NewLabel);
	 * 
	 * setSize(500,500); setResizable(false); setVisible(true); } }
	 */

}
