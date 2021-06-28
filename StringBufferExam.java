
public class StringBufferExam {

	public static void main(String[] args) {//스트링은 자기 자신이 변하지 않는 불변 타입
		StringBuffer sb = new StringBuffer();//스트링 버퍼 클래스는 변할 수 있다. 
		sb.append("hello");//append로 문자열을 추가 할 수 있다.
		sb.append(" ");
		sb.append("world");
		String str = sb.toString();//리턴 타입이 스트링인 toString();으로 반환 받을 수 있다.
		System.out.println(str);//hello world
		
		//스트링 버퍼가 자기자신을 반환하는 것인지 확인
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if(sb2 == sb3) {
		System.out.println("sb2 == sb3");
		}//sb2 == sb3 출력 됨 => 스트링 버퍼는 자기 자신(this)을 반환을 하기 때문이다. 
		//이렇게 자기 자신의 메소드를 호출하여 자기 자신의 값을 바꿔나가는 것을 메소드체이닝이라고 한다.
		
		
		//계속 .을 넣어서 추가해서 만들 수 있다.
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);

	}

}
