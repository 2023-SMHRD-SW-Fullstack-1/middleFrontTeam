package warOfFlowers;

import java.util.HashMap;

import javazoom.jl.player.MP3Player;

public class SoundController {
	
	HashMap<String, Sound> soundMap = new HashMap<String, Sound>();
	
	MP3Player mp3 = new MP3Player();

	public SoundController() {
		soundMap.put("shuffle", new Sound("shuffle", "sound/shuffle.mp3"));
		soundMap.put("dealing", new Sound("dealing", "sound/dealing.mp3"));
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

	// 정지
	public void stop() {
		mp3.stop();
	}
	
	

}
