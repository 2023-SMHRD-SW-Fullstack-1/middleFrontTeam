package warOfFlowers;

import java.util.Random;

public class DieAlgorithm {
	private Random rd = new Random();
	private int random;
	private boolean c1 = false;
	private boolean c2 = false;
	int[] powerValue = { 0, 10, 10, 7, 7, 4, 4, 8, 8, 1, 1, 5, 5, 3, 3, 2, 2, 6, 6, 9, 9 };

	public boolean getC1() {
		return c1;
	}

	public void setC1(boolean c1) {
		this.c1 = c1;
	}

	public boolean getC2() {
		return c2;
	}

	public void setC2(boolean c2) {
		this.c2 = c2;
	}

	// a가 죽을지말지 b,c와 비교하여 boolean 리턴하는 메소드 (die : true)
	public boolean die(int a, int b, int c) {
		random = rd.nextInt(10) + 1;
		switch (a) {
		case 1:
		case 2:
			return false;
		case 3:
		case 4:
			if (b == 1 || b == 2) {
				if (c == 1 || c == 2 || c == 3 || c == 4) {
					return true;
				}
				return random > 3;
			} else if (powerValue[b] > powerValue[a]) {
				return random > 5;
			}
		case 5:
			if (b == 1) {
				return random > 6;
			} else {
				return false;
			}
		case 6:
			if (b == 5 || c == 5) {
				return true;
			} else if (powerValue[b] > powerValue[a]) {
				return random < powerValue[b] - powerValue[a] + 1;
			} else {
				return false;
			}
		case 7:
		case 8:
			if (powerValue[b] > powerValue[a]) {
				return random < powerValue[b] - powerValue[a];
			} else {
				return false;
			}
		case 9:
		case 10:
			if (powerValue[b] > powerValue[a]) {
				return random < powerValue[b] - powerValue[a];
			} else {
				return false;
			}
		case 11:
		case 12:
			if (b == 7 || b == 8) {
				if (c == 7 || c == 8 || c == 11 || c == 12) {
					return true;
				}
				return random > 3;
			} else if (powerValue[b] > powerValue[a]) {
				return random < powerValue[b] - powerValue[a] + 1;
			} else {
				return false;
			}
		case 13:
		case 14:
			if (powerValue[b] > powerValue[a]) {
				return random < powerValue[b] - powerValue[a] + 1;
			} else {
				return false;
			}
		case 15:
			if (b == 1 || b == 5) {
				return random > 5;
			} else {
				return false;
			}
		case 16:
			if (powerValue[b] > powerValue[a]) {
				return random < powerValue[b] - powerValue[a] + 1;
			} else {
				return false;
			}
		case 17:
		case 18:
			if (b == 1 || b == 2) {
				if (c == 1 || c == 2 || c == 17 || c == 18) {
					return true;
				}
				return random > 3;
			} else if (powerValue[b] > powerValue[a]) {
				return random < powerValue[b] - powerValue[a] + 1;
			} else {
				return false;
			}
		case 19:
		case 20:
		default:
			return false;
		}
	}
}
