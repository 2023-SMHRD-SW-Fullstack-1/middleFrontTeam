package warOfFlowers;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame {

	private Container c;

	public Frame() {
		setTitle("warOfFlowers");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    c = getContentPane();

	    c.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
	    c.add(new PeopleLabel());
	    c.add(new ComputerLabel());
	    c.add(new ComputerLabel());
	    
	    c.setBackground(new Color(77, 70, 24));
	    setSize(480, 600);
	    setResizable(false);

	    setLocationRelativeTo(null); // 화면 중앙에 위치하도록 설정

	
	    setLocation(820, 0); //
	    setVisible(true);
	}

	public Container getC() {
		return c;
	}


}
