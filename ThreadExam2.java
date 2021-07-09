
public class ThreadExam2 {

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("-");
//인터페이스로 상속 받은 것은 start메소드가 없다.
//직접 만들어 주어야 한다.
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end!");
	}

}
