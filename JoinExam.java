
public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		thread.start();
		
		System.out.println("시작");
		
		try {
			thread.join();//해당 쓰레드가 끝날떄 까지 기다리다가 실행한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("종료!");
		
//		시작
//		MyThreads : 0
//		MyThreads : 1
//		MyThreads : 2
//		MyThreads : 3
//		MyThreads : 4
//		종료!

	}

}
