
public class BoxExam {

	public static void main(String[] args) {
		//object�� ��ü�� ����� ���� ��� ��ü�� �־ ����� �� �ִ�.
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		//������Ʈ Ÿ���� ����ȯ ���Ѽ� ����Ѵ�.
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
//		System.out.println(value);
		
		//���ʸ� ����� ������ ����ȯ�� ��ų �ʿ�� ����.
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");//��Ʈ���� ���� �� ����
		String str = box2.getObj();
		System.out.println(str);
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int value = box3.getObj();
		System.out.println(value);
		
		
	}

}
