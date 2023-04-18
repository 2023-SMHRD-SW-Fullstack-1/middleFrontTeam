package warOfFlowers;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class imgLabel extends JLabel{
	public imgLabel(int number) {
		String filePath = "src/flowersImg/" + number + ".png";
		ImageIcon icon = new ImageIcon(filePath);
		Image image = icon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		Icon newIcon = new ImageIcon(image);
		setSize(140,140);
		setIcon(newIcon);
	}
}
