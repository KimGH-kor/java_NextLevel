
public class BoxExam {

	public static void main(String[] args) {
		//object로 객체를 만들면 거의 모든 객체를 넣어서 사용할 수 있다.
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		//오브젝트 타입을 형변환 시켜서 사용한다.
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
//		System.out.println(value);
		
		//제너릭 방법은 일일히 형변환을 시킬 필요는 없다.
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");//스트링만 받을 수 있음
		String str = box2.getObj();
		System.out.println(str);
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int value = box3.getObj();
		System.out.println(value);
		
		
	}

}
