import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timepoint = LocalDateTime.now();//현재 날짜, 시간을 구해준다.
		System.out.println(timepoint);//2021-07-01T19:07:29.186156400
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);//내가 원하는 날짜 만들기
		System.out.println(ld1);//2012-12-12
		
		LocalTime lt1 = LocalTime.of(17, 18);//내가 원하는 시간 만들기
		System.out.println(lt1);//17:18
		LocalTime lt2 = LocalTime.parse("10:15:30");//직접 적어서 만들기
		System.out.println(lt2);//10:15:30
		
		LocalDate thedate = timepoint.toLocalDate();//로컬의 날짜 가져오기
		System.out.println(thedate);//2021-07-01
		System.out.println(timepoint.getMonth());//JULY 출력  getMonthValue() = 1
//		System.out.println(timepoint.get);get적고 추천창에서 여러가지의 정보를 가져올 수 있다.
		
	    Month month = timepoint.getMonth();
	    int day = timepoint.getDayOfMonth();
	    int hour = timepoint.getHour();
	    int minute = timepoint.getMinute();
	    int second = timepoint.getSecond();
	    System.out.println(month.getValue() + "/" + day + "  " + hour + ":" + minute + ":" + second);
	}

}
