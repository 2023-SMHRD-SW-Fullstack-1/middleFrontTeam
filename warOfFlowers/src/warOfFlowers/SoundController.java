package warOfFlowers;

import java.util.HashMap;

import javazoom.jl.player.MP3Player;

public class SoundController {
	
	HashMap<String, String> soundMap = new HashMap<String, String>();
	
	MP3Player mp3 = new MP3Player();

	public SoundController() { // 해시맵<사운드명, 경로>을 생성 후 소리 사운드명, 경로 할당
		soundMap.put("shuffle", "sound/shuffle.mp3");
		soundMap.put("dealing", "sound/dealing.mp3");
		soundMap.put("win", "sound/win.mp3");
		soundMap.put("lose", "sound/lose.mp3");
	}
	
	// 셔플링 사운드
	public void playShuffle() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(soundMap.get("shuffle"));
	}
	
	// 딜링 사운드
	public void playDealing() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(soundMap.get("dealing"));
	}
	// 승리 사운드
	public void playWin() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(soundMap.get("win"));
	}
	// 패배 사운드
	public void playLose() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(soundMap.get("lose"));
	}

	// 정지
	public void stop() {
		mp3.stop();
	}
	
	

}
