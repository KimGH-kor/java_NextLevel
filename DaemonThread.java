
public class DaemonThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("데몬 쓰레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}

	}
	public static void main(String[] args) {
		Thread thread = new Thread(new DaemonThread());//인터페이스로 받아왔기때문에 설정
		thread.setDaemon(true);//데몬쓰레드로 설정됨
		thread.start();
		
		try {
			Thread.sleep(1000);//1초 뒤 종료
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료됩니다.");
	}
}

//데몬 쓰레드가 실행중입니다.
//데몬 쓰레드가 실행중입니다.
//메인 쓰레드가 종료됩니다.
