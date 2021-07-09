
public class MusicBox {
	//싱크로나이즈를 붙여주면 된다. 먼저 사용되면 사용권을 얻게 된다. = 모니터링 락
	//단점 : 싱크로나이즈 순서대로 실행되기 때문에 마지막이 너무 오래 기다리게 될 수도 있다.
	public synchronized void playMusicA() {
		for(int i = 0; i<10; i++) {
			System.out.println("신나는 음악");
			
			try {
				Thread.sleep((int)(Math.random())*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i = 0; i<10; i++) {
			System.out.println("슬픈 음악");
			
			try {
				Thread.sleep((int)(Math.random())*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//필요한 부분만 동기화 시킬 수 있다.
	public void playMusicC() {
		for(int i = 0; i<10; i++) {
			synchronized(this) {
			System.out.println("카페 음악");
			}
			try {
				Thread.sleep((int)(Math.random())*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
