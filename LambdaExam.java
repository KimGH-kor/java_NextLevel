
public class LambdaExam {

	public static void main(String[] args) {
		//���ٽĿ����� ��ü�� ���� �����ʿ䰡 ����.
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//					for(int i = 0; i < 10; i++) {
//						System.out.println("hello");
//					}
//				
//			}
//		}).start();

		//���ٽ����� ���� �����Ͱ� ���� ����	(���ٽ� ->�͸�	�޼ҵ�)
		new Thread(()->{
			for(int i = 0; i < 10; i++) {
				System.out.println("hello");
			}
		
		}).start();
	}
}
