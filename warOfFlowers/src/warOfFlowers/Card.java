package warOfFlowers;

public class Card {
	
	private int number;
	private String path;
	
	public Card(int number, String path) {
		this.number = number;
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Card() {
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
