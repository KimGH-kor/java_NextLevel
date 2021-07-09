
public class ThreadExam {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		//중요 런을 호출하는 것이 아닌 스타트를 불러줘야한다.
		//스타트 -> 런 
		t1.start();//흐름이 1개 추가됨
		t2.start();//흐름이 1개 추가됨 수행흐름이 3개

		System.out.println("main end!!");//main end!!가 나와도 계속 진행됨
	}

}
