
public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();//�̋� ����͸� ���� ŉ��
		
		synchronized (b) {
			try {
				System.out.println("b�� �Ϸ�ɶ����� ��ٸ��ϴ�.");
				b.wait();//���⼭���� �����ٶ� ���� ����Ѵ�.
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total : "+b.total);
		}
	}
}
