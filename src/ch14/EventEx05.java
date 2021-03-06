package ch14;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventEx05 extends JFrame {
	private JLabel la;

	public EventEx05() {
		la = new JLabel("Hello");
		setTitle("MouseEvent 예제");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 이벤트 분배 스레드 종료
		Container c = getContentPane();

		c.addMouseListener(new MyMouseListener());
		c.setLayout(null); // absoulte 레이아웃
		la.setSize(50, 20); // 라벨의 사이즈
		la.setLocation(30, 30); // 라벨의 위치
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {
		// Adapter를 이용하면 강제성이 없어서 찾아서 써야함
		// 마우스를 클릭하고 땠을 때....
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // X 좌표
			int y = e.getY(); // Y 좌표
			la.setLocation(x, y); // 라벨 위치 변경 = repaint()
			new Thread(new Runnable() {
				@Override
				public void run() {
					int y = e.getY();
					int targetY = e.getY() + 50;
					while (y < 195 && targetY > y) {
						try {
							Thread.sleep(50);
							y = y + 2;
							la.setLocation(x, y);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}).start();

//			while(true) {
//				if(y>220) break;
//				y = y + 3;
//				try {
//					Timer time = new Timer();
//					time.wait(1);
//				} catch (Exception e1) {
//					e1.printStackTrace();
//				}
//				la.setLocation(x, y);
//			}
		}
	}

	public static void main(String[] args) {
		new EventEx05();
	}
}
