
public class MyThread1 extends Thread {
	String str;
	public MyThread1(String str) {
		this.str = str;
	}
	
	
	@Override
	public void run() {//�ٸ� �帧�� main�޼ҵ��� �����ϴ� ���� ����
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			
//			Thread.sleep((int)(Math.random()*1000)); �ʹ� ���İ��� �����ϱ�
												//   �ð��� ������Ű������ ��
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
