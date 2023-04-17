package warOfFlowers;

import java.util.Random;

public class CardController {
	
	public CardController() {
		
	}
	
	public Card getRandomCard(int number) {
		// 1~20 까지 랜덤카드 출력
		Random rd = new Random();
		int num = rd.nextInt(20) + 1;
		Card card = new Card();
		card.setNumber(num);
		card.setImg(cardToAscii(num));
		return card;
		
	}
	
	
	
	public String cardToAscii(int number) {
		String temp = "";
		switch (number) {
		case 1:
			temp += "\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⡏⠉⠉⠉⠉⠉⠉⠉⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣧⣶⣿⣶⣶⠾⠛⠁⠀⠀⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⠛⢹⠋⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⡟⣶⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠿⠿⠿⠿⣿⣿\r\n"
					+ "⣿⣿⡇⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣴⣿⣿\r\n"
					+ "⣿⣿⡇⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⡇⡇⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣽⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⡇⡿⢛⡟⠉⣉⠉⠐⠒⠒⠢⢤⡀⠀⠀⡜⣽⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣇⢡⠘⡆⠄⣦⠽⠀⠀⠄⢀⠀⢈⣧⣰⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣦⠣⡈⠢⠄⣊⡕⢺⢉⣤⣧⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⢧⠀⠑⠢⠤⣉⣀⣉⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣆⣤⣦⠀⠘⣾⠹⣿⢿⡿⢏⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣾⣿⣿⡄⠀⣿⠀⣿⣦⣤⣮⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⡗⠀⡏⠀⡟⢹⣿⣿⣿⣿⡿⣫⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣷⡶⠧⠀⡇⢸⣿⣿⣿⣿⠇⢰⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⢀⣠⡇⠙⣿⣿⣿⣫⣿⣙⣛⣹⣿⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "";
			break;
		case 2:
			temp += "\r\n"
					+ "⡟⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⢻\r\n"
					+ "⡇⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸\r\n"
					+ "⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⣠⡄⠀⠀⠀⠀⠀⠀⠀⢸\r\n"
					+ "⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⢀⣤⣷⣧⡀⠀⠀⠀⠀⠀⠀⢸\r\n"
					+ "⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⡧⠀⣴⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⢸\r\n"
					+ "⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣇⡀⠀⠀⠀⠀⢸\r\n"
					+ "⡇⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢕⠀⠀⠀⠀⢸\r\n"
					+ "⣷⣄⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣸⠄⠀⠀⠀⢸\r\n"
					+ "⣿⣿⣆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⡅⠀⠀⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢋⠄⠀⠀⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡗⠀⠀⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢟⡅⠀⠀⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡃⠀⠀⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡁⢀⣀⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⠀⢸\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣾\r\n"
					+ "";
			break;
		case 3:
			temp += "\r\n"
					+ "⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠏⠁⠀⠀⠉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⡟⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠈⠙⠛⠛⠛⠻⣿⣿\r\n"
					+ "⣿⡇⠀⠀⢀⣠⣤⣄⠀⠀⣠⣶⣿⣦⠀⠀⠀⢀⣀⡀⠀⠀⢸⣿⣿\r\n"
					+ "⣿⣧⣠⣤⡞⢻⡟⢿⣷⡄⠙⠛⠉⠁⠀⠀⣼⣿⣿⣿⣦⠀⠘⣿⣿\r\n"
					+ "⣿⡏⠀⠀⠙⢄⠀⠀⢻⣿⣆⠀⠀⠀⢀⣴⣿⣿⠿⢿⣿⣿⣾⣿⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠸⠀⣠⣾⣿⣿⣦⡀⠀⣿⣿⣿⣿⣤⣴⣿⣿⣿⣿⣿\r\n"
					+ "⣿⡇⢀⣀⠀⠀⡆⢿⣿⣿⣿⣿⣿⣦⡈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⡟⠙⠛⠀⠀⠀⡘⣿⣿⣿⣿⣿⣿⣿⣶⣾⣿⡿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠀⠙⠈⠻⢿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣟⣹⣿⣿\r\n"
					+ "⣿⣇⠀⠀⠀⠀⠀⠀⣠⣶⣶⣬⣽⠛⣿⠟⠛⢿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣷⣦⠀⣤⣤⣾⣿⣿⣿⠉⠉⠈⠁⠀⠀⠀⠈⠙⠻⢿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⠁⠀⢻⣿⣿⣿⣿⣄⠀⠀⠀⠀⣠⣤⡀⠀⠀⠀⠀⢈⣿⣿\r\n"
					+ "⣿⣿⣿⣇⠀⠘⢿⣿⣿⣿⣿⣿⣶⣤⣼⡿⠿⣷⡄⠀⠀⠀⢸⣿⣿\r\n"
					+ "⣿⣏⡉⣿⣦⠀⠀⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⢸⣿⣿\r\n"
					+ "⣿⡿⢿⣿⣿⣷⣾⣷⣦⡀⠉⠛⠿⢿⣿⣿⣿⣿⣶⣄⡀⠀⢸⣿⣿\r\n"
					+ "⣿⣧⣼⣿⣿⡿⠿⢿⣿⣿⣷⣦⣤⠀⢻⣿⣿⣿⣿⣿⣿⣦⣤⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣷⣴⣾⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "";
			break;
		case 4:
			temp += "\r\n"
					+ "⠘⣿⣿⣿⠟⠛⠿⠛⢿⡟⠛⠛⠛⠿⠿⠟⠻⡟⠻⠿⠿⠿⠿⣿⣿\r\n"
					+ "⠀⣿⣿⣿⣦⠀⠀⣠⣾⣧⣴⣦⣄⠀⠀⠀⣼⠃⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⠀⣿⠟⠛⠋⠀⣾⣿⣿⠿⠿⣿⣿⣷⡆⣠⠏⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⠀⣿⠀⠀⠀⢰⣿⣿⣿⣄⣠⣼⣿⡟⢙⣿⣄⣤⡀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⠀⣿⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⡿⢣⣾⣿⣿⣿⡇⠀⠀⠀⠀⢸⣿\r\n"
					+ "⠀⣿⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣷⡿⠁⠘⠛⠉⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⠀⣿⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣀⣠⣤⣴⣾⣿⣿⣷⡀⠀⢸⣿\r\n"
					+ "⠀⣿⠀⠀⠹⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣼⣿\r\n"
					+ "⠀⣿⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣯⡀⢀⣿⣿⣿⣿⣿⣿\r\n"
					+ "⠀⣿⠀⠀⠀⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠉⢹⣿\r\n"
					+ "⠀⣿⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣀⠀⠀⢸⣿\r\n"
					+ "⠀⣿⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣿\r\n"
					+ "⠀⣿⣷⣤⣾⣿⣿⠁⣀⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿\r\n"
					+ "⠀⣿⠀⢹⠁⠙⠻⠿⠟⠛⠋⠉⢿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⢸⣿\r\n"
					+ "⠀⣿⠀⢸⡆⠀⠀⣠⣄⠀⠛⠀⢀⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⢸⣿\r\n"
					+ "⠀⣿⠀⠀⢷⡀⠀⠈⠉⠀⠀⣠⣿⣿⣿⣿⣿⣿⠟⢿⣿⣆⠀⢸⣿\r\n"
					+ "⠀⣿⡀⠀⠀⠻⣶⣶⣦⣀⣼⣿⣿⣿⠟⠙⠛⠋⠀⠻⣿⠿⠀⢸⣿\r\n"
					+ "⢀⣿⣷⣤⣤⣤⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⣤⣤⣤⣀⣤⣄⣤⣾⣿\r\n"
					+ "";
			break;
		case 5:
			temp += "\r\n"
					+ "⢸⣿⠟⠛⠛⠛⠛⠻⠿⣿⡟⠛⠻⣟⣙⠛⠛⠛⠛⠛⢛⣿⠛⢿⣿\r\n"
					+ "⢸⣿⣀⣀⣠⣾⣿⣷⣶⢉⣷⢦⣄⠙⣿⣿⣶⣶⣶⣆⣈⣉⣀⣼⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣿⣶⣟⣵⣾⣇⣠⣿⣿⣿⣿⣿⣿⣿⣏⡁⢹⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣬⣿⣿⣿⣿⣿⣿⣿⡟⠁⢸⣿\r\n"
					+ "⢸⣿⠋⣿⡿⠟⠿⢻⣿⣿⣿⣿⣿⡿⢿⣿⠿⣿⡿⢿⠻⣿⠀⢸⣿\r\n"
					+ "⢸⣿⣀⡿⢀⣴⣶⡌⠙⣿⣿⣿⣟⠁⣴⣷⣦⠙⢷⠿⢳⣤⣶⣾⣿\r\n"
					+ "⢸⣿⠁⣰⠈⠻⠿⠃⢤⣿⣿⣿⣿⡀⠙⠛⠋⣤⣿⣶⣦⠉⡁⣸⣿\r\n"
					+ "⢸⣿⡇⢹⣷⡜⠲⣶⣾⣿⣿⣿⣿⣷⣿⣶⣶⣿⣿⣿⣿⡈⠁⢹⣿\r\n"
					+ "⢸⣿⣷⣤⣿⣀⡀⠙⠻⠿⢿⣿⠿⣿⣿⣿⣿⣿⣿⡿⠛⢿⠄⢸⣿\r\n"
					+ "⢸⣿⣿⣿⡿⢿⣿⣿⣷⣶⣦⣥⣤⣽⣿⣿⣿⣿⣿⣧⣤⣿⣶⣾⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣾⣿⣿⣿⣹⣿⣿⣿⠿⣿⣿⣿⡿⣿⣿⣿⣿⠛⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⡟⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⡏⠁⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⠗⠀⠀⠾⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣶⣿⣷⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "";
			break;
		case 6:
			temp += "\r\n"
					+ "⣿⣿⡿⠿⣿⣿⠿⠿⠿⠿⠿⠿⠿⣿⠿⢿⣿⡿⠿⣿⠿⢿⣿⣿⣿\r\n"
					+ "⣿⣧⢠⣄⠈⣿⣄⣀⣀⡀⠀⠀⣤⠖⠶⠾⢿⡀⠠⠶⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡁⠀⠁⠰⠟⠛⣁⣈⠉⣀⡔⢠⣶⣶⡆⢨⣿⣶⣦⡄⠀⠀⣿⣿\r\n"
					+ "⣿⠟⠶⣶⣿⣦⡾⣿⣿⣦⣼⣧⣴⣿⣿⠁⣠⠟⠁⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⠀⢠⡟⠛⣀⣀⡘⣿⣿⣿⣿⣿⣿⣿⠛⠀⢠⣶⣶⡶⠀⠀⣿⣿\r\n"
					+ "⣿⠀⢺⣄⠰⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣄⣉⡉⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡷⠿⠧⣀⣨⠉⣠⣿⣿⣿⣿⣿⣿⣿⠿⠟⠃⢈⣿⠿⠟⠛⣿⣿\r\n"
					+ "⣿⠀⢠⡄⠉⠁⢸⡿⣿⣿⣿⣿⣿⣿⣿⣦⣴⣿⣿⣇⠀⠀⠀⣿⣿\r\n"
					+ "⣿⠀⠰⠞⠀⠀⡀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⣿⣿\r\n"
					+ "⣿⣄⡴⠤⠤⠾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠿⣿⣆⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣧⠀⣴⣶⣦⢼⣿⣿⣿⣿⣿⣿⣿⠘⠟⠀⠀⠀⠉⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣧⠀⠻⠿⢋⣼⣿⣿⣿⣿⣿⣿⣿⣧⣄⣀⠀⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣿⣿⣧⣤⣼⣿⣿⣿⣿⣿⣿⣿⣉⣤⣄⢩⣄⠀⠻⠿⠃⠀⣿⣿\r\n"
					+ "⣿⠟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠹⣿⡿⠁⣰⣶⣦⣀⠀⠀⣿⣿\r\n"
					+ "⣿⠋⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣀⣀⣿⡉⠉⠉⠋⠀⠀⣿⣿\r\n"
					+ "⣿⣄⣰⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠿⠆⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡇⠯⣀⠹⠿⠟⠉⡁⢀⣿⡿⠛⠻⣿⣿⡄⠀⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣀⣴⣿⠦⠤⠒⠛⠀⠛⠋⠀⡶⠀⠈⠿⠇⠀⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣤⣶⣶⣶⣦⣴⣶⣶⣶⣴⣶⣤⣴⣶⣶⣶⣶⣶⣶⣿⣿\r\n"
					+ "";
			break;
		case 7:
			temp += "\r\n"
					+ "⣿⣿⡿⠛⣿⠛⠛⠛⠛⠛⠛⠛⠛⠻⠟⣻⣿⣿⣿⠟⢛⠛⢻⣿⣿\r\n"
					+ "⣿⣿⠀⠀⣿⣷⡄⠀⠀⠀⢀⡔⣨⣶⣿⣿⠿⠋⠁⠐⡿⠸⠟⢻⣿\r\n"
					+ "⣿⣿⠀⠀⢿⣿⣿⣦⡀⠐⢡⣼⣿⣵⠟⠁⠀⠀⢠⣾⡇⠀⠀⣻⣿\r\n"
					+ "⣿⣿⠀⠀⠘⣿⣿⣿⣿⡆⠉⣼⠸⣿⠀⠀⢀⣶⣿⣿⣿⣿⣟⣿⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠈⢿⣿⣿⣷⠀⠻⠀⣿⣶⣰⣿⣿⣡⣾⣿⣿⣟⣻⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠹⠟⠛⠁⠄⠀⠀⠙⢿⢏⣿⣿⡿⠋⠉⠛⣻⣿\r\n"
					+ "⣿⣿⠀⠀⠀⣠⠼⠷⠀⠀⠀⠀⠀⠉⣰⡶⠛⠉⠀⠻⠗⠀⠚⢿⣿\r\n"
					+ "⣿⣿⠀⠀⠈⠉⠁⠠⠤⣤⣤⣶⣶⣿⡏⣠⣤⣶⣶⠂⣠⡎⢠⣿⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠀⣠⠞⢹⣿⣆⢹⣿⡿⠟⠉⠉⠀⠈⢁⠀⢻⣿\r\n"
					+ "⣿⣿⠀⠀⠀⣤⣄⠀⢙⣤⠴⠿⠛⠋⠁⠀⠀⢀⣤⡆⠀⢿⠇⢸⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠙⠻⠀⣾⡿⣀⣀⡠⣴⣦⡄⠀⡼⠟⠁⠀⠀⠀⣾⣿\r\n"
					+ "⣿⣿⠀⠀⢀⣠⣠⠿⣀⠀⠀⠀⠀⣤⣄⠀⣸⡇⣠⣶⡄⠀⠀⣿⣿\r\n"
					+ "⣿⣿⠀⠀⠘⢻⡏⠀⢿⣷⠀⠀⢀⣈⡁⠀⠉⠀⣀⣤⡀⠀⠀⣿⣿\r\n"
					+ "⣿⣿⠀⢀⠀⠈⠀⠀⠀⠀⠀⠀⠈⠉⠉⠰⠟⠈⠉⠉⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣿⠀⠈⠁⡰⠀⠀⠀⠀⠀⠀⣶⣶⠄⢠⡄⠠⡾⠷⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⢰⠀⠀⠀⠀⢀⣤⡀⢀⡅⢀⣤⣤⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣿⠀⠀⢠⠂⠀⣸⠀⠀⠀⠀⠈⠉⠁⢠⣇⠀⠉⠁⠀⠀⠀⢿⣿\r\n"
					+ "⣿⣿⣧⣀⣀⣠⣄⣀⣀⣀⣀⣀⣀⣀⣀⣘⣟⣀⣀⣀⣀⣀⣴⣿⣿\r\n"
					+ "";
			break;
		case 8:
			temp += "\r\n"
					+ "⣿⣿⡿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠛⠛⠻⠿⠿⠿⠟⢿⣿\r\n"
					+ "⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣿⠄⠀⠀⠀⠀⠀⣿\r\n"
					+ "⣿⣿⡇⠀⣀⣠⣤⣶⣾⣷⡄⠀⠀⠀⠀⠀⠀⠉⠀⠀⣀⣤⡀⠀⣿\r\n"
					+ "⣿⣿⡟⢿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠸⠿⠛⠈⠃⠀⠙⠋⠁⠀⣿\r\n"
					+ "⣿⣿⡇⠀⠹⣿⣿⣿⣿⣿⣿⣿⣦⠀⠠⣶⡶⠀⠺⠀⠘⠿⠟⠀⣿\r\n"
					+ "⣿⣿⡇⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣧⠀⢠⣤⣄⢠⡄⠀⣤⣤⡄⣿\r\n"
					+ "⣿⣿⡇⠀⠸⣿⠋⢻⣿⣿⣿⣿⣿⣿⣧⠈⠉⠁⠀⡁⠀⢈⣉⠀⣿\r\n"
					+ "⣿⣿⣧⣤⣄⣀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣶⠾⠿⠀⠃⠀⠛⠿⠃⣿\r\n"
					+ "⣿⣿⡏⠉⠉⠀⠀⠈⠉⣻⣿⣿⣿⣿⣿⣿⣶⣦⠀⡦⠀⢶⡿⠆⣿\r\n"
					+ "⣿⣿⡿⠿⠗⠀⠷⠀⠿⠿⣿⣿⣿⣿⣿⣿⣿⣀⠀⡀⠀⣀⣀⠀⣿\r\n"
					+ "⣿⣿⡇⣤⣤⡄⢰⡄⠀⣤⣼⣿⣿⣿⣿⣿⣿⡟⠁⡋⠈⠛⠛⠀⣿\r\n"
					+ "⣿⣿⡇⢈⣁⡀⠀⣀⠀⠉⠛⢿⣿⣿⣿⣿⣿⣷⠀⣇⠀⣶⣶⠀⣿\r\n"
					+ "⣿⣿⡇⠙⠛⠋⠀⠈⡃⠰⣶⣾⣿⣿⣿⣿⣿⣿⡀⠁⠀⠀⣀⠀⣿\r\n"
					+ "⣿⣿⡇⢰⣶⠀⣀⡀⠹⣦⣤⣉⣿⣿⣿⣿⣿⣿⣿⠀⠀⢼⣿⠇⣿\r\n"
					+ "⣿⣿⡇⠈⠛⠀⡿⠃⠀⢱⡙⠛⠿⣿⠿⣿⡿⠿⣟⠀⠀⠈⠁⠀⣿\r\n"
					+ "⣿⣿⡿⣿⠆⣴⡀⢠⣶⡄⢻⣷⣄⠀⢀⠿⠃⠘⣿⠇⣠⠀⣶⣿⣿\r\n"
					+ "⣿⣿⡇⣀⣀⠈⠁⡸⠟⠀⣴⡌⢁⠀⠛⠀⣶⡆⠀⡄⠁⣠⣤⡀⣿\r\n"
					+ "⣿⣿⡇⠙⠛⠓⠘⠗⠀⣾⣟⠀⠿⠇⣀⡄⠈⢃⡀⠃⠀⣉⠉⠀⣿\r\n"
					+ "⣿⣿⣿⣶⣶⣿⣿⣶⣶⣿⣿⣦⣤⣴⣿⣿⣶⣾⣷⣴⣾⣿⣷⣾⣿\r\n"
					+ "";
			break;
		case 9:
			temp += "\r\n"
					+ "⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⡅⠈⠛⠛⠛⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠉⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⡇⠀⠀⠀⠹⣦⠀⠀⠻⢿⣿⣿⣿⣿⣿⣿⣧⠀⠙⣻⡿⢿⣿\r\n"
					+ "⣿⣿⣆⡀⠀⠰⣆⠹⣧⠀⠸⣧⠙⠉⠙⠛⠛⠉⣡⣶⠿⠋⠀⢸⣿\r\n"
					+ "⣿⣿⡄⠹⣦⠀⣿⣆⢻⣧⠀⣿⡆⠀⠀⠀⣠⣾⡿⠋⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⡇⠀⠹⣷⣾⣿⡞⠛⡄⣸⣿⠀⢀⣼⣿⡟⠁⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⡇⠀⣴⢬⡙⠏⢀⣾⣁⣼⠓⣶⢦⡙⠿⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⡇⠀⣿⢶⣹⠶⢾⣿⣥⣍⣻⡏⣧⢿⡄⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⡇⢠⣷⠟⢹⣶⢸⣿⡯⣿⢉⡛⢯⣭⣷⣤⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⠛⣶⣄⠀⠘⣿⡌⢿⡽⢃⣾⣿⡦⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⠷⣼⣿⣆⠀⣿⣿⣦⠃⣾⣿⣿⣧⣤⣄⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⡄⠹⣿⣿⡄⢻⣿⣿⡜⢿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣇⠀⢹⣿⣷⣾⣿⣿⠇⢸⣿⣿⣿⡄⢻⡇⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣧⣀⠘⠿⣿⣿⣿⣿⢸⡿⠿⣿⣿⠇⠀⢉⣀⣀⣀⣀⡀⣸⣿\r\n"
					+ "⣿⣿⣧⡈⠛⣦⣄⡙⠻⣿⣸⣇⣴⠟⠁⣠⡶⠛⠉⢻⣿⣿⣧⣿⣿\r\n"
					+ "⣿⣿⣿⣿⡿⠿⣿⡿⢶⣤⠝⠋⢀⣤⣾⣿⣦⣤⣾⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⡇⠀⣸⡿⠎⢁⣠⡾⠟⠁⣘⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣧⣔⣋⣀⣤⣟⣋⣀⣠⣾⣿⣀⣸⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "";
			break;
		case 10:
			temp += "\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⡏⠀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡏⠀⠀⣻⣿\r\n"
					+ "⣿⡇⠀⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⢀⣾⣿⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⢀⣾⣿⠇⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡇⠀⠘⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢀⣾⣿⡟⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡏⢳⣤⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⢀⣾⣿⣿⠁⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡇⠀⡷⢿⣿⣿⣿⣿⣿⣿⣿⡇⠀⣾⣿⣿⠇⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡇⢸⣷⠀⢿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣤⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡇⠸⣿⣤⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣸⡟⠀⠀⠀⣀⠀⢻⣿\r\n"
					+ "⣿⡇⠀⠙⣿⡄⠸⣿⣿⣿⣿⣿⣿⣿⣿⣅⣾⠃⠀⠀⣰⡟⠀⣾⣿\r\n"
					+ "⣿⡇⠀⠀⢸⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣏⠙⣄⣠⣾⣿⠁⠀⣿⣿\r\n"
					+ "⣿⣧⡀⣴⠿⣭⣷⣘⣿⣿⣿⣿⣿⣿⣿⣿⣶⣿⣿⡿⢁⣴⠁⣸⣿\r\n"
					+ "⣿⣿⣷⡌⢳⡟⠋⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢠⣾⠃⠀⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣄⣳⡤⣿⣿⣿⣿⡿⢻⣿⣿⣿⡿⠛⢻⣿⠃⠀⠀⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣧⡃⠘⣿⣿⣿⣿⣿⣿⣿⣿⠀⣰⣿⡏⠀⠀⣀⣾⣿\r\n"
					+ "⣿⡏⠻⣿⣿⣿⣇⠀⢹⣿⣿⣿⣿⣿⡟⠁⣾⣿⣿⣠⣶⡿⠉⣹⣿\r\n"
					+ "⣿⣿⣆⠙⣿⣿⣿⠀⠀⣿⣿⣿⣿⣿⠃⣼⣿⣿⣿⡿⠋⠀⠀⣿⣿\r\n"
					+ "⣿⣿⣿⣧⡘⣿⣿⣧⡀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣷⣼⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⣤⣶⣿⣿\r\n"
					+ "";
			
			break;
		case 11:
			temp += "\r\n"
					+ "⢸⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⠁⠀⠀⢀⣉⠉⠛⠻⡿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⣦⣴⣶⢿⡿⡗⣠⠀⠀⠀⠀⠀⠉⠛⠛⠛⢿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⣿⠟⠋⠀⠂⠀⡄⠘⠃⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿\r\n"
					+ "⢸⣿⣇⠀⡀⠰⠃⠀⠀⠀⠀⠀⠀⠀⢀⠲⣿⣿⣄⣀⠀⠈⠙⣿⣿\r\n"
					+ "⢸⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⣀⣉⡠⢈⠛⠻⣿⡆⠀⠀⣿⣿\r\n"
					+ "⢸⣿⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠬⠷⢾⡆⠂⠹⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣷⣤⣷⡀⠀⠰⣆⣀⣤⡤⠀⠀⠀⠀⠂⠑⠘⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣷⠀⢀⣿⣿⠋⠀⠀⣀⣠⡄⠀⠀⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣶⣿⣿⣿⣦⣀⣼⣿⣿⣷⣤⣄⡀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠃⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡦⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⠁⢠⣿⣿⣿⣿⣿⣿⠋⠉⠁⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣄⣾⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⠓⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⢸⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⡋⠉⣿⡿⠋⢹⡿⠋⠀⠀⠻⠁⠈⠙⠛⠻⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⢸⣿⣿⣶⣿⣷⣶⣾⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⣿\r\n"
					+ "";
			break;
		case 12:
			temp += "\r\n"
					+ "⣿⣿⡿⠿⠿⠿⠿⠿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢿⣿\r\n"
					+ "⣿⡏⠀⠀⠀⠀⠀⠀⣀⣤⣀⣀⣼⣿⣿⣿⣿⠿⠿⠟⠋⠀⠀⠈⣿\r\n"
					+ "⣿⣇⠀⠀⣀⣤⣤⣀⡀⠉⠉⠉⠉⢻⡿⠿⢿⣦⣄⡀⠀⠀⠀⠀⣿\r\n"
					+ "⣿⡇⠀⠀⠙⣿⣦⣙⣿⣷⣦⡀⠀⠀⣀⣠⣤⣀⡉⠛⠆⠀⠀⠀⣿\r\n"
					+ "⣿⡿⠶⣶⣤⣾⣿⡟⠛⡛⠛⣇⠀⢻⣿⡿⠛⠉⠙⠳⠄⠀⠀⠀⣿\r\n"
					+ "⣿⡧⠀⠀⠙⠿⣿⣿⢠⣿⣦⣹⡇⠸⠋⠀⠀⢀⠀⠀⠀⠀⠀⠀⣿\r\n"
					+ "⣿⣷⣀⠀⠀⠀⠀⠙⢂⣴⢿⣻⡇⠀⣤⣶⣿⣿⣿⣿⣶⡦⠄⠰⣿\r\n"
					+ "⣿⡿⣿⣷⣶⣶⣶⣦⡌⠁⢠⡿⢷⡄⢸⣿⣿⣿⣿⣿⣿⣦⡀⠀⣿\r\n"
					+ "⣿⣧⣬⣿⣿⣿⣿⣿⣿⡀⠘⢷⡾⠃⠀⢿⣿⣿⣿⣿⣿⣿⠿⢶⣿\r\n"
					+ "⣿⡏⠙⣿⣿⣿⣿⣿⣿⣇⠀⣾⠁⣰⣦⡘⠿⢿⣿⣿⣿⠿⠦⢀⣿\r\n"
					+ "⣿⡇⠀⣿⣿⣿⣿⣿⣿⣿⡄⢹⣿⢃⣿⣧⣀⠀⠀⠀⠀⠀⠀⠘⣿\r\n"
					+ "⣿⣷⣶⣿⣿⣿⣿⣿⡿⠛⢷⡈⠻⠿⠃⣹⡿⢃⠀⠀⠀⠀⠀⠀⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣧⣄⣴⣷⠀⠀⣼⡛⣧⣤⣧⠀⠀⠀⠀⠀⣿\r\n"
					+ "⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠈⠛⢻⠋⠀⠱⡄⠀⠀⠀⣿\r\n"
					+ "⣿⡟⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠺⠀⠀⠀⠘⢆⠀⠀⣿\r\n"
					+ "⣿⡇⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⡆⠈⠁⠀⣿\r\n"
					+ "⣿⡇⠀⢿⣿⣿⣿⣿⣿⠟⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⣿\r\n"
					+ "⣿⣇⠀⢸⡿⠟⠛⠉⠀⠀⠀⠈⠻⢿⣿⠛⠿⠿⠿⠿⠿⠆⠀⠀⣿\r\n"
					+ "⣿⣿⣶⣾⣤⣤⣶⣶⣶⣶⣶⣶⣤⣤⣿⣦⣤⣤⣤⣤⣤⣤⣴⣾⣿\r\n"
					+ "";
			break;
		case 13:
			temp += "\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⡿⠿⠿⠛⠛⠋⠁⠉⠉⠉⠁⣀⠀⢠⣀⣼⠏⠈⢻⣿\r\n"
					+ "⣿⡿⠋⠉⠘⣶⡄⠀⣦⡀⠀⠀⠀⠀⠀⠀⠙⠛⢬⡟⢉⡀⠀⢸⣿\r\n"
					+ "⣿⡇⠀⠿⠷⠉⢳⣄⠙⡃⠀⠀⠀⠀⠀⠀⢶⣦⣈⣠⠿⡃⠀⢸⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⢿⣷⡈⠛⠶⣿⡄⢠⣤⠀⣤⣄⠘⢋⠼⠏⣀⢸⣿\r\n"
					+ "⣿⡇⢀⣤⣤⣤⠀⠈⢡⣄⡀⠈⢣⠈⢿⡇⢠⣍⠀⢿⠀⣼⡟⢸⣿\r\n"
					+ "⣿⡇⠀⠉⠉⢡⣶⣶⠎⠉⣉⣱⡶⠦⣄⣀⠈⢿⡇⢸⣤⠉⣤⣾⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠘⠛⠋⣤⣶⡎⠛⠓⢦⣤⡀⢃⠸⠟⢻⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⡁⠰⠿⠿⠇⠉⠛⢾⣧⠀⢸⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣷⡄⠀⠀⣿⡇⢀⡈⠻⣿⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣉⣢⡀⠙⠁⢿⡷⠀⢸⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠙⢿⣄⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣧⠀⠀⢀⣀⡀⢀⣀⣠⣤⣤⣀⡀⠀⠀⠘⠿⣶⠌⣷⣄⠀⢸⣿\r\n"
					+ "⣿⣿⡿⢷⠛⣿⡍⢹⠆⢈⣅⠈⠙⠻⣶⣄⡀⠀⠀⠀⠀⠙⢦⣼⣿\r\n"
					+ "⣿⣿⢷⡾⣆⠉⠁⠀⣠⡿⠋⢠⣶⡇⢀⡈⠉⠓⠦⣤⣀⠀⠀⢹⣿\r\n"
					+ "⣿⡇⠀⠙⢧⠀⠀⠀⣿⠁⠀⣸⡿⠀⢸⡟⠀⣀⠀⠀⠉⠓⣾⣿⣿\r\n"
					+ "⣿⡇⢀⣤⣼⣧⣄⡈⠛⠀⠘⠟⠁⢠⣿⠀⢸⡿⠀⣶⡆⠀⣼⣿⣿\r\n"
					+ "⣿⣧⠸⣿⠟⣉⣙⣿⣷⣶⣶⣶⣶⣶⡷⣄⡙⠁⠠⡿⠀⣠⣿⣿⣿\r\n"
					+ "⣿⣇⢀⣤⡾⠿⣿⡾⢉⣴⡟⠉⣠⡟⢳⡾⢿⣷⣶⣤⣾⡿⢯⣽⣿\r\n"
					+ "⣿⣿⣿⣿⣷⣶⣿⣶⣿⣿⣶⣾⣿⣷⣿⣿⣿⣿⣿⣿⣿⣶⣾⣿⣿\r\n"
					+ "";
			break;
		case 14:
			temp += "\r\n"
					+ "⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⠷⠎⣿⠁⣀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣦⡀⢿⢇⡀⠀⠀⢹⣿\r\n"
					+ "⣿⣿⠠⣦⡌⣰⡿⢀⠀⢰⣶⣶⣶⣶⣶⣶⡙⢣⡾⢉⡁⠀⠀⢸⣿\r\n"
					+ "⣿⣿⠀⢠⣤⡙⢣⡿⠀⣼⣿⣿⣿⣿⣿⣿⠷⣨⡤⠛⠃⠀⠀⢸⣿\r\n"
					+ "⣿⣿⠀⠀⢀⣀⡙⢃⣼⣿⣿⣿⣿⣿⣿⣿⠧⣉⣠⡶⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠉⠉⠙⢿⣿⣿⣿⣿⣿⣿⣿⣄⠛⢠⡶⠂⠀⠀⢸⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣯⡈⠿⢡⡾⢃⠀⠀⢸⣿\r\n"
					+ "⣿⣿⡀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⠟⠿⣘⠃⣴⡿⠁⠀⢸⣿\r\n"
					+ "⣿⣿⠇⣰⠇⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣆⠀⠹⡶⠉⢀⣠⡀⢸⣿\r\n"
					+ "⣿⣿⣿⣿⡀⣾⠇⣾⣿⣿⣿⣿⣿⣿⠏⠙⠣⣀⣁⡰⠿⠟⠁⢸⣿\r\n"
					+ "⣿⣿⠩⣤⠹⣆⣼⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠈⢻⡀⢀⣤⡄⢸⣿\r\n"
					+ "⣿⣿⠀⠀⠀⣹⣿⣿⣿⣿⣿⣿⣿⠁⠀⠰⢿⣶⡄⢃⡘⠛⠀⢸⣿\r\n"
					+ "⣿⣿⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⡆⠰⣦⡀⠀⠈⠛⣧⠀⠀⢸⣿\r\n"
					+ "⣿⣿⠀⣼⣿⣿⣿⣿⣿⣿⣿⣁⡈⢳⡀⠙⢇⠀⠀⣷⣾⣆⠀⢸⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢁⡼⠿⢢⣸⣦⡀⠈⠉⠹⣦⣸⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠀⠀⠰⠿⠟⠁⠀⠀⠹⣿⡌⠙⠳⢦⣦⠘⢿⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠻⠗⠤⢼⣄⣾⡧⠈⠳⣾⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠶⢷⣦⣀⣘⣯⠁⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⣷⣿⣷⣶⣶⣿⣿\r\n"
					+ "";
			break;
		case 15:
			temp += "\r\n"
					+ "⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠉⠀⠀⠀⠈⠉⠛⢿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⡙⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠈⠁⢘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠆⡀⠼⠿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣷⣾⣿⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "";
			break;
		case 16:
			temp += "\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣤⣤⣤⣿⣿⣿⡿⠁⢹⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⣴⣾⠿⠿⣿⣿⣿⣿⡿⢿⣿⣧⠀⢸⣿\r\n"
					+ "⣿⣿⡀⠀⠀⠀⠀⠀⠀⣠⣤⣾⠆⢠⣾⡿⠋⠁⠀⠀⠙⣿⡆⠈⣿\r\n"
					+ "⣿⣿⠛⣿⣿⣿⣿⡿⣻⣿⣿⣿⣄⠿⠋⠀⠀⢀⣤⣶⣶⠈⠻⢶⣿\r\n"
					+ "⣿⣿⣤⣼⡿⠿⠿⠾⠟⠻⢿⣿⣿⣤⣤⣴⣶⣿⣿⣿⠿⠀⠀⢰⣿\r\n"
					+ "⣿⣿⠉⠉⠀⠀⠀⠀⠀⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⢸⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠿⠛⠛⠉⠀⠈⠻⣿⣿⣷⣄⢈⣿\r\n"
					+ "⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠻⣿\r\n"
					+ "⣿⣿⣤⣤⣤⣤⣤⣤⣤⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣤⣤⣤⣄⣀⡀⠀⠸⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "";
			break;
		case 17:
			temp += "\r\n"
					+ "⣿⣿⡿⠿⠿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⡏⠀⠀⠀⠀⢀⡀⠀⠀⢸⣯⠀⠙⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠈⠻⢿⡆⢸⡇⢠⡶⠂⣀⡀⠀⠉⢻⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣶⣶⡀⠘⠳⢦⣤⣴⣾⣧⣼⣧⡾⠟⠀⠀⠀⢸⣿⣿⡿⢿⣿\r\n"
					+ "⣿⣿⣿⣿⣷⣶⣦⠀⠀⠀⠙⡿⠛⠋⠓⠶⠶⢦⠄⠀⠉⠉⠀⢸⣿\r\n"
					+ "⣿⣿⣿⣿⠿⣿⣿⡆⢀⣤⣾⣿⣿⣷⣤⣄⠀⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣟⣛⡟⢀⣿⣿⣷⣼⣿⣿⣿⣿⣿⣿⣿⠆⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⡿⠻⣿⣿⣿⣅⣀⣻⣿⣿⣿⣿⣿⣏⠀⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣤⣾⣿⣿⡟⠙⢿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⡏⢉⣿⣿⣿⣶⣾⣿⣿⣿⣿⣿⣿⣤⡀⠀⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⡏⠀⣿⡟⠉⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣇⣸⡟⠳⣄⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣿⣷⣤⣽⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠙⢿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⠛⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠉⠛⠛⠿⠿⠿⠿⠀⠀⠀⣾⣿\r\n"
					+ "⣿⣿⠀⠈⠛⠛⢋⣤⣶⣶⣶⣶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⡟⢀⣤⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣤⣤⣤⣤⣤⣤⣾⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "";
			break;
		case 18:
			temp += "\r\n"
					+ "⣿⣿⡿⠿⠿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠿⢿⣿⣿\r\n"
					+ "⣿⡏⠀⠀⠀⠀⣤⠠⣾⣿⣿⣿⣡⣾⣿⠿⠁⡀⠀⠀⠀⠀⠀⢹⣿\r\n"
					+ "⣿⡇⠠⢄⠘⠻⣿⣧⣿⣿⣿⣿⠿⣿⣷⣶⣦⡁⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⡇⠰⠿⢿⣟⠈⠉⠉⠉⣋⣁⣀⣀⣀⣁⡈⠁⠀⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⡇⠀⠀⠈⠁⠀⠀⠀⢸⡏⠉⢉⣍⠉⡉⢽⣿⣿⣶⣄⣀⠀⢸⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⢸⡇⣘⣿⣿⡆⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿\r\n"
					+ "⣿⣿⣿⣿⣦⡀⠀⠀⠀⢸⠛⠿⣿⡿⣿⡿⣿⣿⣿⣿⣿⡿⠋⢸⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣦⡞⢠⣴⣿⣿⠟⢱⡿⠟⠉⠉⠁⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⣹⣿⣾⡟⠀⣯⣠⣶⣶⣦⡀⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⡟⣾⡟⣉⡉⠀⢠⣿⣿⣿⣿⣿⣧⡀⠀⢸⣿\r\n"
					+ "⣿⡇⠈⠛⠛⢻⣿⣿⣷⡿⢿⣿⣿⠀⣼⣿⣿⣿⣿⣿⣿⣿⠄⢸⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠹⡇⠻⠿⢿⣿⡇⢠⣿⣿⠿⣿⣿⣿⣿⠟⠀⢸⣿\r\n"
					+ "⣿⡇⠀⠀⠀⢀⡾⢁⣴⣶⣾⡿⢃⣿⣼⣿⣦⣿⡉⣿⣏⣀⠀⢸⣿\r\n"
					+ "⣿⡇⠀⠀⠀⣼⠁⠘⢿⣿⣿⣦⣾⣿⣿⡹⡿⠛⢿⣿⣿⣿⣷⣾⣿\r\n"
					+ "⣿⡇⠀⢀⡾⠁⠀⣠⣾⠟⢉⣿⣁⣿⣿⣷⣿⣶⣿⣧⣼⣿⣿⣿⣿\r\n"
					+ "⣿⡇⢀⣞⣁⣀⠀⠙⠁⣠⣟⢠⣿⡿⢿⣿⣿⣍⣿⣿⣿⣿⠿⢿⣿\r\n"
					+ "⣿⡏⠉⠉⠉⠉⣿⣿⣿⣿⣿⣤⣿⣿⣦⣛⣧⡌⠻⣿⣿⡿⠀⢸⣿\r\n"
					+ "⣿⡇⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣷⣀⣀⣀⣀⣀⣀⣸⣿⣿⣿⣿⣿⣿⣟⣻⣿⣁⣀⣀⣀⣀⣾⣿\r\n"
					+ "";
			break;
		case 19:
			temp += "\r\n"
					+ "⠀⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶\r\n"
					+ "⠀⣿⣿⣋⣽⣿⣿⣿⣿⣿⣿⢿⡟⠛⠛⠛⠛⠏⠋⠻⣿⣿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⢀⣷⣶⣦⣶⣾⠿⣿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⠀⠈⣿⣿⣿⢿⣿⣿⣿⣿⣷⡿⣿⣿⣿⣿⣿⣤⣿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⠀⠀⠘⠛⠁⠀⣹⣯⣿⣿⣿⣼⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⠀⠀⠀⠀⠀⠰⡿⠿⣾⣿⣷⣿⣿⣿⣿⣿⣿⣷⠞⣿⣿⣿\r\n"
					+ "⠀⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⢈⣿⣿⣿⣿⣿⣿⣿⣿⣁⣼⣿⣿⣿\r\n"
					+ "⠀⣿⣿⠀⣨⡀⠀⠀⠀⠀⠀⠘⠛⠛⢿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⠒⣩⠹⡿⠢⣤⠀⠀⠀⠀⠀⠈⠛⠃⠀⣹⣿⣿⣿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⡤⢃⡴⠊⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠠⣿⡿⢿⣿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⡇⠘⣦⡀⠀⠀⣀⣤⣤⣤⣤⣤⣄⠀⠀⡜⣹⢿⣿⡻⣿⣿\r\n"
					+ "⠀⣿⣿⡇⠀⢿⡿⣿⣿⣿⣹⣿⢻⣿⣿⢿⡗⠾⠞⠣⣼⣿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⡇⠀⠈⠛⠀⠻⠙⠋⠀⡈⠉⠀⠀⣧⠀⠀⢀⣿⡜⢿⣿⣿\r\n"
					+ "⠀⣿⣿⠁⣦⡀⠀⣦⣤⡤⠶⣾⣧⠀⠀⢠⡟⠀⢀⣾⣿⣿⡾⣿⣿\r\n"
					+ "⠀⣿⣿⠀⣿⣿⢠⡏⠀⠀⠀⠀⠹⣷⣄⢿⠀⠀⣾⣿⣿⡿⠀⣼⣿\r\n"
					+ "⠀⣿⣿⠀⣿⣿⣼⠁⠀⠀⠀⠀⠀⡼⠛⡞⠀⣼⣻⣿⣿⣇⣀⣿⣿\r\n"
					+ "⠀⣿⣿⠀⢸⠛⣇⠀⠀⠀⠀⠀⢰⡇⡜⠀⣼⣷⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⠀⣼⠀⢹⡀⠀⠀⠀⠀⠛⢻⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⠀⣿⣿⣿⣿⡿⢿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⣿⡿⣿\r\n"
					+ "";
			break;
		case 20:
			temp += "\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⠙⣿⣿⣿⣤⣿⣿⣿⣷⣾⣿⣿⡏⠀⢀⡀⠀⠀⠀⠀⢻⡍⣿⣿\r\n"
					+ "⣿⣄⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠈⠙⢿⣿⡿⠶⢿⣷⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⡟⠿⠿⠿⠿⠿⠿⠁⠀⠀⠀⠀⠀⠙⣿⣦⡀⠀⣿⣿\r\n"
					+ "⣿⠛⠻⣿⣿⡇⠀⣀⡀⣶⣄⢺⠀⠀⠀⠀⠀⣠⣴⡿⠟⠁⠀⣿⣿\r\n"
					+ "⣿⡄⢸⣿⣿⡇⢰⣿⣿⣾⣿⣬⡄⠀⠀⣀⣾⣿⣿⣶⡶⢾⣿⣿⣿\r\n"
					+ "⣿⣿⣿⠟⠁⢸⢠⣼⣿⡿⣿⡇⡇⠀⠈⠁⠀⠀⠀⠀⠀⢨⡇⣿⣿\r\n"
					+ "⣿⡏⢻⣦⣤⣿⠘⠋⢈⣿⣿⡁⢧⡀⠀⠀⠀⠀⢀⣤⡶⠈⣿⣿⣿\r\n"
					+ "⣿⣇⠀⠛⠋⣿⡆⠀⢿⣯⣿⡇⠘⣿⣶⣄⢀⣴⣿⣿⡇⠀⢹⣿⣿\r\n"
					+ "⣿⣿⠗⣠⣄⢹⡇⠀⢠⣿⢋⣀⠀⢿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢸⣿\r\n"
					+ "⣿⣇⣴⣿⠿⣿⣿⠀⠸⣷⣾⢿⣧⠸⣿⣿⣿⣿⣿⣿⣶⣦⣄⣸⣿\r\n"
					+ "⣿⣿⠟⠁⠀⠀⠙⣧⠘⣿⣷⡿⣿⣦⢹⣿⣿⣿⣿⣿⣿⠿⠛⢻⣿\r\n"
					+ "⣿⠁⠀⠀⠀⠀⠀⠸⣆⠈⢉⣤⣿⡟⠀⢿⣿⣿⣿⣧⠀⠀⠀⢸⣿\r\n"
					+ "⣿⡀⠀⠀⠀⠀⠀⠀⢻⡄⢸⣿⣽⣷⣶⡞⠛⠻⢿⣿⣧⠀⠀⢸⣿\r\n"
					+ "⣿⣿⣦⣄⡀⠀⠀⠀⠀⢷⡀⠙⢻⣟⠉⠀⢳⡄⠀⠈⣟⠓⠤⣼⣿\r\n"
					+ "⣿⠈⢿⣿⣿⣶⣄⠀⠀⢀⣷⠀⢿⡏⠀⠀⠀⠻⡄⠀⠹⣆⡀⢸⣿\r\n"
					+ "⣿⠀⠘⢿⣿⣿⣿⣷⣶⣿⣿⡗⠒⠒⠒⠒⠒⠒⢻⡶⠞⠉⠀⢸⣿\r\n"
					+ "⣿⣤⣤⣾⣿⣿⣿⣿⣿⣿⣯⣀⣀⣀⠀⠀⣠⡴⠦⢤⡄⣀⢠⣾⣿\r\n"
					+ "⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠟⠃⠀⠀⠀⠀⠀⠼⠀⣹⣿\r\n"
					+ "⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣤⣤⣤⣴⣿⣷⣾⣿⣿\r\n"
					+ "";
			break;
			

		// no default
		}
		
		return temp;
	}
	
	
	
}
