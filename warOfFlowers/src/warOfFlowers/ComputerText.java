package warOfFlowers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ComputerText extends JLabel{
	
	public ComputerText() {
		setText("Computer");
		setPreferredSize(new Dimension(90,30));
		// 폰트 조정
		Font bFont = new Font("monospaced", Font.PLAIN, 17);
		setFont(bFont);
		setForeground(Color.WHITE);
		// 중앙 정렬
		setHorizontalAlignment(SwingConstants.CENTER);
		
	}
}
