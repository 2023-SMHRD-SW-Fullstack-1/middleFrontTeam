package warOfFlowers;

import java.util.HashMap;

import javazoom.jl.player.MP3Player;

public class SoundController {
	
	HashMap<String, Sound> soundMap = new HashMap<String, Sound>();
	
	MP3Player mp3 = new MP3Player();

	public SoundController() {
		soundMap.put("shuffle", new Sound("shuffle", "sound/shuffle.mp3"));
		soundMap.put("dealing", new Sound("dealing", "sound/dealing.mp3"));
		soundMap.put("win", new Sound("win", "sound/win.mp3"));
		soundMap.put("lose", new Sound("lose", "sound/lose.mp3"));
	}
	
	// 셔플링 사운드
	public void playShuffle() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(soundMap.get("shuffle").getSoundPath());
	}
	
	// 딜링 사운드
	public void playDealing() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(soundMap.get("dealing").getSoundPath());
	}
	// 승리 사운드
	public void playWin() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(soundMap.get("win").getSoundPath());
	}
	// 패배 사운드
	public void playLose() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(soundMap.get("lose").getSoundPath());
	}

	// 정지
	public void stop() {
		mp3.stop();
	}
	
	

}
