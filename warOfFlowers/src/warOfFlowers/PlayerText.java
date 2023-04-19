package warOfFlowers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PlayerText extends JPanel{

	public PlayerText(PlayerDTO player) {
		
		setLayout(new GridLayout(2,1));
		setSize(90,60);
		
		JLabel userNick = new JLabel();
		userNick.setText(player.getNickname());
		userNick.setPreferredSize(new Dimension(90,30));
		// 폰트 조정
		Font bFont = new Font("monospaced", Font.PLAIN, 12);
		userNick.setFont(bFont);
		userNick.setForeground(Color.WHITE);
		// 중앙 정렬
		userNick.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JLabel userScore = new JLabel();
		userScore.setText(player.getNickname());
		userScore.setPreferredSize(new Dimension(90,30));
		userScore.setFont(bFont);
		userScore.setForeground(Color.WHITE);
		// 중앙 정렬
		userScore.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(userNick);
		add(userScore);
		
	}
	

}
