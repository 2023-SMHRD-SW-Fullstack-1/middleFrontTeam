package warOfFlowers;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FrameController {
	
	ArrayList<Integer> arr = new ArrayList<>();
	Container c;
	
	public FrameController() {
		Frame frame = new Frame();
		c = frame.getC();
	}

	private boolean isDuplicate(int num) {
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
				rePrint();
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
		rePrint();
		
		return cardNum;
		
	}
	
	public void makeBlankFlower() {
		CardController cc = new CardController();
		BlankLabel blank = new BlankLabel();
		c.add(blank);
		rePrint();
	}
	
	public void openFlower() {
		c.remove(11);
		c.remove(10);
		for(int i=4; i<arr.size(); i++) {
			imgLabel img = new imgLabel(arr.get(i));
			c.add(img);
			rePrint();
		}
		
	}
	
	
	public void deleteFlower() {
		int componentCount = c.getComponentCount();
		if(componentCount == 9) {
			c.remove(8);
			c.remove(7);
			c.remove(6);
			arr.clear();
			rePrint();
		}else if(componentCount == 12) {
			c.remove(11);
			c.remove(10);
			c.remove(9);
			c.remove(8);
			c.remove(7);
			c.remove(6);
			arr.clear();
			rePrint();

		}
	}
	
	
	public void showPriority() {
//		String filePath = "src/flowersImg/zokbo.jpg";
		String filePath = "image/flowersImg/zokbo.jpg";
		ImageIcon icon = new ImageIcon(filePath);
		Image image = icon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		Icon newIcon = new ImageIcon(image);
		JLabel label = new JLabel(newIcon);
		label.setPreferredSize(new Dimension(500, 500));
		JOptionPane.showMessageDialog(null, label, "족보", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void makePlayer() {
        c.add(new PlayerText(main.player));
        c.add(new ComputerText());
        c.add(new ComputerText());
        rePrint();
	}
	
	public void rePaintMoney(PlayerDTO player) {
		PlayerText.userScore.setText("머니: "+player.getPoint());
		rePrint();
	}
	
	public void rePrint() {
		c.validate();
		c.repaint();
	}
//	
//	public void showWhatPlayerFlower() {
//		WhatFlowerLabel fl = new WhatFlowerLabel();
//		c.add(fl);
//		c.validate();
//		c.repaint();
//	}
	
}
