
public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		thread.start();
		
		System.out.println("����");
		
		try {
			thread.join();//�ش� �����尡 ������ ���� ��ٸ��ٰ� �����Ѵ�.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����!");
		
//		����
//		MyThreads : 0
//		MyThreads : 1
//		MyThreads : 2
//		MyThreads : 3
//		MyThreads : 4
//		����!

	}

}
