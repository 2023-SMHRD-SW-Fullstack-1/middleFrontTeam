package warOfFlowers;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PeopleLabel extends JLabel{ // 사람 아이콘 JLabel
	public PeopleLabel() {
		String filePath = "image/aaaa.png";
		ImageIcon icon = new ImageIcon(filePath);
		Image image = icon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		Icon newIcon = new ImageIcon(image);
		setIcon(newIcon);
	}
}
