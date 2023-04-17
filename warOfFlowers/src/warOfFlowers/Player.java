package warOfFlowers;

public class Player {
	
	private String nickname;
	private int point;
	private String id;
	
	public Player(String nickname, int point, String id) {
		this.nickname = nickname;
		this.point = point;
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
