package warOfFlowers;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
				result = true;
			}
		}
		return result;
		
	}
	
	public int makeFlower() {
		CardController cc = new CardController();
		int cardNum;
//		cardNum = cc.getRandomCard().getNumber();
//		System.out.println(cardNum);
		
		
		while(true) {
			cardNum = cc.getRandomCard().getNumber();
			if(isDuplicate(cardNum)) {
				cardNum = cc.getRandomCard().getNumber();
			}else {
				arr.add(cardNum);
				imgLabel img = new imgLabel(cardNum);
				c.add(img);
				revalidate();
			    repaint();
				break;
			}
		}
		return cardNum;
		
	}
	
	public int makeFakeFlower() {
		CardController cc = new CardController();
		int cardNum;
//		cardNum = cc.getRandomCard().getNumber();
//		System.out.println(cardNum);
		
		
		while(true) {
			cardNum = cc.getRandomCard().getNumber();
			if(isDuplicate(cardNum)) {
				cardNum = cc.getRandomCard().getNumber();
			}else {
				arr.add(cardNum);
				break;
			}
		}
		
		imgLabel img = new imgLabel(21);
		c.add(img);
		revalidate();
	    repaint();
		
		return cardNum;
		
		
	}
	
	public void openFlower() {
		c.remove(8);
		c.remove(7);
		c.remove(6);
		for(int i=3; i<arr.size(); i++) {
			imgLabel img = new imgLabel(arr.get(i));
			c.add(img);
			revalidate();
		    repaint();
		}
		
	}
	
	
	public void deleteFlower() {
		int componentCount = c.getComponentCount();
		if(componentCount == 6) {
			c.remove(5);
			c.remove(4);
			c.remove(3);
			arr.clear();
			revalidate();
		    repaint();
		}else if(componentCount == 9) {
			c.remove(8);
			c.remove(7);
			c.remove(6);
			c.remove(5);
			c.remove(4);
			c.remove(3);
			arr.clear();
			revalidate();
		    repaint();
		}
	}
	
	public void showPriority() {
		// 족보 보이기 맨위로 보이게 수정하기
		String filePath = "src/flowersImg/zokbo.jpg";
		ImageIcon icon = new ImageIcon(filePath);
		Image image = icon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		Icon newIcon = new ImageIcon(image);
		JLabel label = new JLabel(newIcon);
		label.setPreferredSize(new Dimension(500, 500));
		JOptionPane.showMessageDialog(null, label);
	}
	
	
}
