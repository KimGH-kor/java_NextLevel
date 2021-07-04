import java.lang.reflect.Method;

public class MyhelloExam {

	public static void main(String[] args) {
		//실제로 쓰기
		Myhello hello = new Myhello();
//		//여기서 사용할 수 있는 것은 메소드를 사용할 수 있는 코드 작성//클레스 정보를 얻고 그 정보로 부터 헬로라는 메소드의 정보를 구해라
//		Method method = hello.getClass().getDeclaredMethods("hello");//헬로에 대한 정보를 가지고 있다. getDeclaredMethods는 예외 처리를 해주어야한다.
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			if(method.isAnnotationPresent(count100.class)) {//메서드가 카운트100을 적용 받고 있나요?
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
