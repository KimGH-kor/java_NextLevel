
public class MusicPlayer extends Thread {
	int type;
	MusicBox musicBox;
	
	public MusicPlayer(int type, MusicBox musicBox) {
		this.musicBox = musicBox;
		this.type = type;
	}
	@Override
	public void run() {
		switch (type) {
		case 1: {
			musicBox.playMusicA();
			break;
		}
		case 2: {
			musicBox.playMusicB();
			break;
		}
		case 3: {
			musicBox.playMusicC();
			break;
		}
		}
	}

}