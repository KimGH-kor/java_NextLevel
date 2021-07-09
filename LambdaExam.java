
public class LambdaExam {

	public static void main(String[] args) {
		//람다식에서는 객체를 새로 만들필요가 없다.
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//					for(int i = 0; i < 10; i++) {
//						System.out.println("hello");
//					}
//				
//			}
//		}).start();

		//람다식으로 만든 위에것과 같은 로직	(람다식 ->익명	메소드)
		new Thread(()->{
			for(int i = 0; i < 10; i++) {
				System.out.println("hello");
			}
		
		}).start();
	}
}
