package warOfFlowers;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BlankLabel extends JLabel {
	public BlankLabel() {
		String filePath = "image/99.png";
		ImageIcon icon = new ImageIcon(filePath);
		Image image = icon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		Icon newIcon = new ImageIcon(image);
		
		setSize(140,140);
		setIcon(newIcon);
	}
}
