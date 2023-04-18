package warOfFlowers;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	Container c;
	ArrayList<Integer> arr = new ArrayList<>();
	
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
	
	public boolean isDuplicate(int num) {
		boolean result = false;
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i) == num) {
				result = false;
			}
		}
		return true;
		
	}
	
	public void makeFlower() {
		CardController cc = new CardController();
		int cardNum;

		while(true) {
			cardNum = cc.getRandomCard().getNumber();
			if(isDuplicate(cardNum)) {
				//
			}else {
				arr.add(cardNum);
				imgLabel img = new imgLabel(cardNum);
				c.add(img);
				revalidate();
			    repaint();
				break;
			}
		}
		
	}
	
	public void deleteFlower() {
		int componentCount = c.getComponentCount();
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
