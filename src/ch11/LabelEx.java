package ch11;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {

	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JLabel textLabel = new JLabel("����մϴ�.");

		ImageIcon beauty = new ImageIcon("img/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);

		ImageIcon normalIcon = new ImageIcon("img/normalIcon.gif");
		JLabel label = new JLabel("���������� ��ȭ�ϼ���", normalIcon, SwingConstants.CENTER);

		c.add(textLabel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		c.add(label,BorderLayout.SOUTH);

		setSize(400, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		new LabelEx();
	}

}