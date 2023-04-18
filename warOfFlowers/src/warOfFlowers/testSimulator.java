package warOfFlowers;

public class testSimulator {

	public static void main(String[] args) {
		
		Card flower = new Card();
		Frame frame = new Frame();
		frame.makeFlower(2);
		frame.makeFlower(3);
		frame.makeFlower(1);

		frame.makeFlower(1);
		frame.makeFlower(1);
		frame.makeFlower(1);
		frame.deleteFlower();
		frame.makeFlower(1);
		
	}

}
