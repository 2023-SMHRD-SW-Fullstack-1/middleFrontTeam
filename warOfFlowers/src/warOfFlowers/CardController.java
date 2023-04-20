package warOfFlowers;

import java.util.ArrayList;
import java.util.Random;

public class CardController {
	
	private ArrayList<Card> cardArray = new ArrayList<Card>();
	
	public CardController() {
		for(int i=1; i<=20; i++) {
			String path = i + "png";
			cardArray.add(new Card(i, path));
		}
	}
	
	
	public Card getSpecificCard(int number) {
		return cardArray.get(number);
	}
	
	public Card getRandomCard() {
		// 1~20 까지 랜덤카드 리턴
		Random rd = new Random();
		int num = rd.nextInt(20) + 1;
		Card card = new Card();
		card.setNumber(num);
		return card;
		
	}
}
