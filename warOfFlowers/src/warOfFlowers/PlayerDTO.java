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
	
	// 점수 합산 (승패)
	public void calWinLose(boolean winlose) {
		if (winlose) {
			this.point += 200;
		} else {
			this.point -= 200;
		}
	}
	
	// 죽었을때
	public void calDie(boolean die) {
		this.point -= 100;
	}
	

	
	
	
}
