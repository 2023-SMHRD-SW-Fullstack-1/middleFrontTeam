package warOfFlowers;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ComputerLabel extends JLabel{
	
	String filePath;
	public ComputerLabel() {
		filePath = "image/com.png";
		ImageIcon icon = new ImageIcon(filePath);
		Image image = icon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		Icon newIcon = new ImageIcon(image);
		setIcon(newIcon);

	}
}
