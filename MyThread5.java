
public class MyThread5 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("MyThreads : " + i);
			try {
				Thread.sleep(500);//0.5ÃÊ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
