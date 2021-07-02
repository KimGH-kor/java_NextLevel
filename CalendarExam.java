import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		//calendar은 추상 클래스 = new로 인스턴스를 생성할 수 없다.
		//추상클래스는 자기자신을 만들 수가 없다.
		//그래서 보이지는 않지만 GregorianCalendar이란 자식 클래스를 cal에 담아준다.
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,100);
        
        System.out.print(cal.get(Calendar.YEAR)+"년"+cal.get(Calendar.MONTH)+"월"+cal.get(Calendar.DATE)+"일");
	}

}
