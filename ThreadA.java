
public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();//이떄 모니터링 락을 흭득
		
		synchronized (b) {
			try {
				System.out.println("b가 완료될때까지 기다립니다.");
				b.wait();//여기서부터 깨워줄때 까지 대기한다.
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total : "+b.total);
		}
	}
}
