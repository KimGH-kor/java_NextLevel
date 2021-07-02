import java.text.SimpleDateFormat;
import java.util.Date;

public class dateExam {

	public static void main(String[] args) {
		Date date = new Date();//현재 시간과 날짜를 date가 가지게 된다.
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' a hh:mm:ss  zzz");//달만 대문자, 마지막 a는 오전오후표시, zzz는 표준시를 나타냄 한국은 KST
		System.out.println(ft.format(date));
		
		System.out.println(date.getTime()); //현재 시간
		
		long today = System.currentTimeMillis(); //long타입으로 현재 시간을 가져옴
		System.out.println(today);
		
		System.out.println(today - date.getTime());//처리 속도를 구할 수 있다.
	}

}
