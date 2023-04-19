package warOfFlowers;

import java.util.Random;

public class DieAlgorithm {
	private Random rd = new Random();
	private int random;

	// a가 죽을지말지 b,c와 비교하여 boolean 리턴하는 메소드
	public boolean die(int a, int b, int c) {
		random = rd.nextInt(10) + 1;
		switch (a) {
		case 1:
		case 2:
			return true;
		case 3:
			if (b == 4 || c == 4) {
				return random < 3;
			} else {
				return random < 8;
			}
		case 4:
			if (b == 3 || c == 3) {
				return random < 3;
			} else {
				return random < 8;
			}
		case 5:
			if (b == 1 || c == 1) {
				return random < 6;
			} else {
				return random < 8;
			}
		case 15:
			if (b == 1 || c == 1 || b == 5 || c == 5) {
				return random < 3;
			} else {
				return random < 7;
			}
		case 17:
		case 18:
			if (b == 1 || c == 1 || b == 2 || c == 2) {
				return random < 7;
			} else {
				return random < 8;
			}
		case 9:
		case 10:
		case 13:
		case 14:
		case 16:
			return random < 7;
		case 6:
		case 7:
		case 8:
		case 11:
		case 12:
			return random < 8;
		default:
			return random < 8;
		}

	}
}
