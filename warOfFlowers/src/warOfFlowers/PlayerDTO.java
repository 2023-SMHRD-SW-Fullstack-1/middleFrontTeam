package warOfFlowers;

public class PlayerDTO {
	
	private String id;
	private String nickname;
	private int point;
	
	
	public PlayerDTO(String id, String nickname, int point) {
		this.id = id;
		this.nickname = nickname;
		this.point = point;
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
	
	
	public void calPoint(int point) {
		this.point += point;
	}
	
	
	
}
