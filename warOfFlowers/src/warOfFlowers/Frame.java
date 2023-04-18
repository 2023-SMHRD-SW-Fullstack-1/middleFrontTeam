package warOfFlowers;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;


import javax.swing.JFrame;

public class Frame extends JFrame{
	
	Container c;
	
	public Frame() {
		setTitle("warOfFlowers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
     
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 30));
        c.add(new PeopleLabel());
        c.add(new ComputerLabel());
        c.add(new ComputerLabel());
        c.setBackground(new Color(77,70,24));
		setSize(480, 480);
		setVisible(true);
	}
	
	public void makeFlower(int number) {
		imgLabel img = new imgLabel(number);
		c.add(img);
		revalidate();
	    repaint();
	}
	
	public void deleteFlower() {
		int componentCount = c.getComponentCount();
		System.out.println(componentCount);
		if(componentCount == 6) {
			c.remove(5);
			c.remove(4);
			c.remove(3);
			revalidate();
		    repaint();
		}else if(componentCount == 9) {
			c.remove(8);
			c.remove(7);
			c.remove(6);
			c.remove(5);
			c.remove(4);
			c.remove(3);
			revalidate();
		    repaint();
		}
	}
	
	public void showPriority() {
		
	}
	
	
}
