import java.lang.reflect.Method;

public class MyhelloExam {

	public static void main(String[] args) {
		//������ ����
		Myhello hello = new Myhello();
//		//���⼭ ����� �� �ִ� ���� �޼ҵ带 ����� �� �ִ� �ڵ� �ۼ�//Ŭ���� ������ ��� �� ������ ���� ��ζ�� �޼ҵ��� ������ ���ض�
//		Method method = hello.getClass().getDeclaredMethods("hello");//��ο� ���� ������ ������ �ִ�. getDeclaredMethods�� ���� ó���� ���־���Ѵ�.
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			if(method.isAnnotationPresent(count100.class)) {//�޼��尡 ī��Ʈ100�� ���� �ް� �ֳ���?
				for(int i = 0; i<100;i++) {
					hello.hello();
				}
			}else {
				hello.hello();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
