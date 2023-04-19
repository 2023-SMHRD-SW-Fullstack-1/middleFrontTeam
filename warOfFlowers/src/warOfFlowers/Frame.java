package warOfFlowers;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Frame extends JFrame {

	private Container c;
//	ArrayList<Integer> arr = new ArrayList<>();

	public Frame() {
		// 리사이즈 못하게 막기
		setTitle("warOfFlowers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 12));
		c.add(new PeopleLabel());
		c.add(new ComputerLabel());
		c.add(new ComputerLabel());

		c.setBackground(new Color(77, 70, 24));
		setSize(480, 480);
		setResizable(false);
		setVisible(true);
	}

	public Container getC() {
		return c;
	}

	public void setC(Container c) {
		this.c = c;
	}

}
