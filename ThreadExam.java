
public class ThreadExam {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		//�߿� ���� ȣ���ϴ� ���� �ƴ� ��ŸƮ�� �ҷ�����Ѵ�.
		//��ŸƮ -> �� 
		t1.start();//�帧�� 1�� �߰���
		t2.start();//�帧�� 1�� �߰��� �����帧�� 3��

		System.out.println("main end!!");//main end!!�� ���͵� ��� �����
	}

}
