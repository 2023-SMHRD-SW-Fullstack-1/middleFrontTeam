package warOfFlowers;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FrameController {
	PlayerDTO player = null;
	ArrayList<Integer> arr = new ArrayList<>();
	Container c;
	
	public FrameController(PlayerDTO player) {
		this.player = player;
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
	
	// 화투패 랜덤으로 만들기
	public int makeFlower() {
		CardController cc = new CardController();
		int cardNum;
		
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
	
	// 화투 뒷면패 만들기
	public int makeFakeFlower() {
		CardController cc = new CardController();
		int cardNum;

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
	
	// 빈화면 만들기
	public void makeBlankFlower() {
		imgLabel img = new imgLabel(99);
		c.add(img);
		arr.add(99);
		rePrint();
	}
	
	// 화투패 뒤집기
	public void openFlower() {
		c.remove(11);
		c.remove(10);
		for(int i=4; i<arr.size(); i++) {
			imgLabel img = new imgLabel(arr.get(i));
			c.add(img);
			rePrint();
		}
		
	}
	
	// 컴퓨터가 기권했을때 화투패 뒤집기
	public void openFlower(int num) {
		if( num == 1) { // com1 die

			Component temp = c.getComponent(11);
			imgLabel retrievedButton = (imgLabel) temp;
			c.remove(11);
			c.remove(10);
			c.add(new imgLabel(99));
			c.add(new imgLabel(arr.get(5)));
			rePrint();
		}else if(num == 2) { // com2 die
			Component temp = c.getComponent(10);
			imgLabel retrievedButton = (imgLabel) temp;
			c.remove(11);
			c.remove(10);
			c.add(new imgLabel(arr.get(4)));
			c.add(new imgLabel(99));
			rePrint();
		}else { // num == 3 , com1, com2 둘다 die
			c.remove(11);
			c.remove(10);
			c.add(new imgLabel(arr.get(4)));
			c.add(new imgLabel(arr.get(5)));
			rePrint();
		}
		
		
	}
	
	// 다시 게임시작시 화투패 지우기
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
	
	// 족보창 띄우기
	public void showPriority() {
		String filePath = "image/zokbo.jpg";
		ImageIcon icon = new ImageIcon(filePath);
		Image image = icon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		Icon newIcon = new ImageIcon(image);
		JLabel label = new JLabel(newIcon);
		label.setPreferredSize(new Dimension(500, 500));
		JOptionPane.showMessageDialog(null, label, "족보", JOptionPane.PLAIN_MESSAGE);
	}
	
	// 텍스트창 띄우기
	public void makePlayer() {
        c.add(new PlayerText(player));
        c.add(new ComputerText());
        c.add(new ComputerText());
        rePrint();
	}
	
	// 플레이어의 머니 갱신하기
	public void rePaintMoney(PlayerDTO player) {
		PlayerText.userScore.setText("머니: "+player.getPoint());
		rePrint();
	}
	
	// 화면 새로고침하기
	public void rePrint() {
		c.validate();
		c.repaint();
	}
	
	// 컴퓨터 죽었을떄 컴퓨터 이미지 변경
	public void changeComDieImage(boolean yes, int comType) {
		ComputerLabel c1;
		ImageIcon icon;
		Image image;
		Icon newIcon;
		ComputerLabel c2;
		c1 = (ComputerLabel) c.getComponent(1);	
		c2 = (ComputerLabel) c.getComponent(2);	 
		if(yes) { // comdie 로 바꿀때
			if(comType == 1) { // 컴퓨터1 or 컴퓨터2
			    c1.filePath = "image/comDie.png";
			    icon = new ImageIcon(c1.filePath);
				image = icon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
				newIcon = new ImageIcon(image);
				c1.setIcon(newIcon);
				rePrint();
			}else { 
			    c2.filePath = "image/comDie.png";
			    icon = new ImageIcon(c2.filePath);
				image = icon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
				newIcon = new ImageIcon(image);
				c2.setIcon(newIcon);
				rePrint();
			}
			
		}else { // 다시 com 으로 바꿀때
			if(comType == 1) { // 컴퓨터1  
			    c1.filePath = "image/com.png";
			    icon = new ImageIcon(c1.filePath);
				image = icon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
				newIcon = new ImageIcon(image);
				c1.setIcon(newIcon);
				rePrint();
			}else { // 컴퓨터2   
			    c2.filePath = "image/com.png";
			    icon = new ImageIcon(c2.filePath);
				image = icon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
				newIcon = new ImageIcon(image);
				c2.setIcon(newIcon);
				rePrint();
			}
		}
	}
	
	
}
