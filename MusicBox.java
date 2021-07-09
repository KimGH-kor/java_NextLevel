
public class MusicBox {
	//��ũ�γ���� �ٿ��ָ� �ȴ�. ���� ���Ǹ� ������ ��� �ȴ�. = ����͸� ��
	//���� : ��ũ�γ����� ������� ����Ǳ� ������ �������� �ʹ� ���� ��ٸ��� �� ���� �ִ�.
	public synchronized void playMusicA() {
		for(int i = 0; i<10; i++) {
			System.out.println("�ų��� ����");
			
			try {
				Thread.sleep((int)(Math.random())*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i = 0; i<10; i++) {
			System.out.println("���� ����");
			
			try {
				Thread.sleep((int)(Math.random())*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//�ʿ��� �κи� ����ȭ ��ų �� �ִ�.
	public void playMusicC() {
		for(int i = 0; i<10; i++) {
			synchronized(this) {
			System.out.println("ī�� ����");
			}
			try {
				Thread.sleep((int)(Math.random())*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
