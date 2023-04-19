package warOfFlowers;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class imgLabel extends JLabel{ // 화투패 구현
	private int number;
	
	public imgLabel(int number) {
//		String filePath = "src/flowersImg/" + number + ".png";
		String filePath = "image/" + number + ".png";
		ImageIcon icon = new ImageIcon(filePath);
		Image image = icon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		Icon newIcon = new ImageIcon(image);
		
		// 그림자 조절
		setSize(140,140);
		setIcon(newIcon);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
