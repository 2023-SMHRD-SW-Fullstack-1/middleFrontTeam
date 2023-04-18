package warOfFlowers;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	public Frame() {
		setTitle("warOfFlwoers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(new Color(77,70,24));
		
		
		setSize(500, 500);
		setVisible(true);
	}
	
	
	
}
